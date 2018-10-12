package com.sultan.up.service.impl;


import com.sultan.up.dao.DaoTest;
import com.sultan.up.dao.GirlDao;
import com.sultan.up.entity.Girl;
import com.sultan.up.service.GirlService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sultan on 2018/4/3.
 */
@Service("girlServiceImpl")
//@Transactional
public class GirlServiceImpl implements GirlService {
    @Resource(name="girlDaoImpl")
    private GirlDao girlDao;

    @Resource(name = "daoImplTest")
    private DaoTest daoTest;

    @Override
    public List<Girl> findByCupSize(Integer size) {
        // TODO Auto-generated method stub
        return girlDao.findByCupSize(size);
    }
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Girl updateById(){
        System.out.println("进入service");
        Girl girl = girlDao.findById(3L);
        girl.setName("God Bless You");
        Girl g = girlDao.updateEntity(girl);
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("修改完成："+g.getName());
        return g;
    }
    @Transactional
    public Girl findById(Long id){
        System.out.println("查找service开始");
        Girl g = girlDao.findById(id);
        System.out.println("第一次查找："+g.getName());
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Girl g2 = girlDao.findById(id);
        System.out.println("第二次查找："+g.getName());
        return g;
    }

    public Girl daoTest (){
        return daoTest.testFunc(1L);
    }

}
