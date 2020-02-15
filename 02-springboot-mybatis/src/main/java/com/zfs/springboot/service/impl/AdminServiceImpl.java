package com.zfs.springboot.service.impl;

import com.zfs.springboot.mapper.admininfoMapper;
import com.zfs.springboot.model.admininfo;
import com.zfs.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired//所有的mapper都需要导入后才可以使用
    private admininfoMapper admininfoMapper;
    //注入redistemplate；
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    //synchronized字符串序列化器
    @Override
    public /*synchronized*/ List<admininfo> getAllAdmin() {
           //字符串序列化
        RedisSerializer redisSerializer =new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        //缺点：并发条件下，缓存穿透
        //查询缓存
        List<admininfo> adminList= (List<admininfo>) redisTemplate.opsForValue().get("allAdmins");
        if(null == adminList){
            System.out.println("查询的数据库-------");
            //在数据库中查询
            adminList = admininfoMapper.selectAllAdmin();
            //将查询的数据放到缓存中
            redisTemplate.opsForValue().set("allAdmins", adminList);
        }else{
            System.out.println("查询缓存------------------");
        }

        /**********************双重检测锁************************
        //双重检测锁，防止急速流量访问造成缓存穿透
        if(null==adminList) {
            synchronized (this) {
                //从redis上获取数据
                adminList = (List<admininfo>) redisTemplate.opsForValue().get("allAdmins");
                if (null == adminList) {
                    System.out.println("查询的数据库-------");
                    adminList = admininfoMapper.selectAllAdmin();
                    redisTemplate.opsForValue().set("allAdmins", adminList);
                }else{
                System.out.println("查询缓存------------")
            }
        } else{
            System.out.println("查询缓存---------");
        }
        ************************************************************/
        return adminList;
    }
    @Transactional//表示此方法已经开启事务的
    @Override
    public int update(){
        admininfo admininfo=new admininfo();
        admininfo.setAid(1001);
        admininfo.setAname("dd66");
        admininfo.setAlevel("ee");
        int update=admininfoMapper.updateByPrimaryKeySelective(admininfo);
        System.out.println("更新的结果为："+update);
        //测试异常，除数不能为零，所以抛出一个运行异常。上一步的更新就会回滚。
        int a=10/0;
        return update;
    }
}
