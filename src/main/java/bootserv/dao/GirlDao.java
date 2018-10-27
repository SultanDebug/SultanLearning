package bootserv.dao;

import bootserv.entity.Girl;

import java.util.List;

/**
 * Created by sultan on 2018/4/3.
 */
public interface GirlDao /*extends JpaRepository<Girl, Integer>*/{
    //@Query(value="select * from girl where cup_size=?1",nativeQuery=true)
    public List<Girl> findByCupSize(Integer size);
    public Girl updateEntity(Girl girl);
    public Girl findById(Long id);
}
