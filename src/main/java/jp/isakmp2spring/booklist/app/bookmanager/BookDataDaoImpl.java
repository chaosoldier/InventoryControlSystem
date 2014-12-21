package jp.isakmp2spring.booklist.app.bookmanager;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.isakmp2spring.booklist.domain.model.DataDao;

public class BookDataDaoImpl implements DataDao<Book> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("persistenceUnit");
	

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;


	}

	@Override
	public Book findById(long id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		return (Book)manager.createQuery("from BOOK where id ="+id).getSingleResult();
	}

	@Override
	public List<Book> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Book data) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(data);
		transaction.commit();
		manager.close();
		
	}

	@Override
	public void update(Book data) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(data);//引数のエンティティをJPAの管理下に統合する。指示をだしただけ。
		transaction.commit();//ここでコミット
		manager.close();
		
	}

	@Override
	public void delete(Book data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> find(String fstr) {
		// TODO Auto-generated method stub
		return null;
	}

}
