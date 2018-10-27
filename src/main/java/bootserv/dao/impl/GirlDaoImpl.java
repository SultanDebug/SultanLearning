package bootserv.dao.impl;


import bootserv.dao.GirlDao;
import bootserv.entity.Girl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sultan on 2018/4/3.
 */
@Repository("girlDaoImpl")
public class GirlDaoImpl implements GirlDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Girl> findByCupSize(Integer size) {
        // TODO Auto-generated method stub
        return this.entityManager
                .createQuery("select t from Girl t where cup_size = '36'", Girl.class)
                //.setParameter(0, size)
                .getResultList();
    }
    @Override
    public Girl updateEntity(Girl girl) {
        return entityManager.merge(girl);
    }
    @Override
    public Girl findById(Long id){
        return entityManager.find(Girl.class, id);
    }
	/*@Override
	public List<Girl> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Girl> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Girl> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}
	@Override
	public <S extends Girl> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteInBatch(Iterable<Girl> entities) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}
	@Override
	public Girl getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<Girl> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Girl> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}
	@Override
	public void delete(Girl entity) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAll(Iterable<? extends Girl> entities) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}
	@Override
	public <S extends Girl> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> Page<S> findAll(Example<S> example,
			Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Girl> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Girl> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}*/


//	@Autowired
//	private DataSourceConfig dataSourceConfig;
//
//	@PersistenceContext
//	private EntityManager entityManager ;
//	/*=dataSourceConfig.getFactoryBean().getNativeEntityManagerFactory().createEntityManager()*/
//	@Override
//	public void deleteAllInBatch() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteInBatch(Iterable<Girl> arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<Girl> findAll() {
//		// TODO Auto-generated method stub
//		String sql = "select * from girl";
//		Query query = entityManager.createNativeQuery(sql);
//		List<Girl> list = query.getResultList();
//
//
//
//		return list;
//	}
//
//	@Override
//	public List<Girl> findAll(Sort arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> List<S> findAll(Example<S> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> List<S> findAll(Example<S> arg0, Sort arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Girl> findAllById(Iterable<Integer> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void flush() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Girl getOne(Integer arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> List<S> saveAll(Iterable<S> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> S saveAndFlush(S arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Page<Girl> findAll(Pageable arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void delete(Girl arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends Girl> arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteById(Integer arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public boolean existsById(Integer arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Optional<Girl> findById(Integer arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> S save(S arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> long count(Example<S> arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public <S extends Girl> boolean exists(Example<S> arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public <S extends Girl> Page<S> findAll(Example<S> arg0, Pageable arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Girl> Optional<S> findOne(Example<S> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
