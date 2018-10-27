package bootserv.service;


import bootserv.entity.Girl;

import java.util.List;

/**
 * Created by sultan on 2018/4/3.
 */
public interface GirlService {
    public List<Girl> findByCupSize(Integer size);
    public Girl updateById();
    public Girl findById(Long id);
    public Girl daoTest();
}
