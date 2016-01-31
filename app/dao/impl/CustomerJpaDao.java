package dao.impl;

import dao.CustomerDao;
import models.Customer;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class CustomerJpaDao implements CustomerDao {

	@Override
	public List<Customer> getAll() {
		EntityManager em = JPA.em();
		Query q = em.createQuery("FROM Customer");
		return q.getResultList();
	}
}
