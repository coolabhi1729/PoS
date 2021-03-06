//package com.increff.employee.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.increff.employee.pojo.ProductPojo;
//
//@Repository
//public class ProductDao extends AbstractDao {
//	private static String delete_id = "delete from ProductPojo p where id=:id";
//	private static String select_id = "select p from ProductPojo p where id=:id";
//	private static String select_all = "select p from ProductPojo p";
//	private static String select_barcode = "select p from ProductPojo p where barcode=:barcode";
//	@PersistenceContext
//	private EntityManager em;
//
//	@Transactional
//	public void insert(ProductPojo p) {
//		em.persist(p);
//	}
//
//	public int delete(int id) {
//		Query query = em.createQuery(delete_id);
//		query.setParameter("id", id);
//		return query.executeUpdate();
//	}
//
//	public ProductPojo select(int id) {
//		TypedQuery<ProductPojo> query = getQuery(select_id, ProductPojo.class);
//		query.setParameter("id", id);
//		return getSingle(query);
//	}
//
//	public List<ProductPojo> selectAll() {
//		TypedQuery<ProductPojo> query = getQuery(select_all, ProductPojo.class);
//		return query.getResultList();
//	}
//
////	public ProductPojo select(String name, String category) {
////		TypedQuery<ProductPojo> query = getQuery(get_barcode, ProductPojo.class);
////
////		return getSingle(query);
////	}
//
//	public void update(ProductPojo p) {
//
//	}
//}
