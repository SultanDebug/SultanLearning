package com.sultan.up.dao.impl;


import com.sultan.up.dao.DaoTest;
import com.sultan.up.dao.GirlDao;
import com.sultan.up.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sultan on 2018/4/8.
 */
@Component("daoImplTest")
public class DaoImplTest implements DaoTest {
    @Autowired
    private GirlDao girlDao;

    public Girl testFunc(Long id){
        return girlDao.findById(id);
    }
}
