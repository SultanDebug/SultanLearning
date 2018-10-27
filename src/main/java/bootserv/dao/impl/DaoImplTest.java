package bootserv.dao.impl;


import bootserv.dao.DaoTest;
import bootserv.dao.GirlDao;
import bootserv.entity.Girl;
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
