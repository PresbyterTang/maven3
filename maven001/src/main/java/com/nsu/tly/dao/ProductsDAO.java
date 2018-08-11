package com.nsu.tly.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nsu.tly.entity.Products;

/**
 * A data access object (DAO) providing persistence and search support for
 * Products entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.nsu.tly.entity.Products
 * @author MyEclipse Persistence Tools
 */
@Transactional
@Repository
public class ProductsDAO {
	private static final Logger log = LoggerFactory.getLogger(ProductsDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String PRODUCT_ID = "productId";
	public static final String PRICE = "price";
	public static final String UNIT = "unit";
	public static final String BRAND = "brand";
	public static final String CATEGORY = "category";
	public static final String PNUM = "pnum";
	public static final String IMGURL = "imgurl";
	public static final String DESCRIPTION = "description";
	public static final String IS_HOT = "isHot";
	public static final String IS_NEW = "isNew";
	public static final String IS_COMPETITIVE = "isCompetitive";

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Products transientInstance) {
		log.debug("saving Products instance");
		System.out.println("执行ProductsDAO.save方法");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Products persistentInstance) {
		log.debug("deleting Products instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Products findById(java.lang.Integer id) {
		log.debug("getting Products instance with id: " + id);
		try {
			Products instance = (Products) getCurrentSession().get("com.nsu.tly.entity.Products", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Products instance) {
		log.debug("finding Products instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.nsu.tly.entity.Products")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Products instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Products as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByProductId(Object productId) {
		return findByProperty(PRODUCT_ID, productId);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByUnit(Object unit) {
		return findByProperty(UNIT, unit);
	}

	public List findByBrand(Object brand) {
		return findByProperty(BRAND, brand);
	}

	public List findByCategory(Object category) {
		return findByProperty(CATEGORY, category);
	}

	public List findByPnum(Object pnum) {
		return findByProperty(PNUM, pnum);
	}

	public List findByImgurl(Object imgurl) {
		return findByProperty(IMGURL, imgurl);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByIsHot(Object isHot) {
		return findByProperty(IS_HOT, isHot);
	}

	public List findByIsNew(Object isNew) {
		return findByProperty(IS_NEW, isNew);
	}

	public List findByIsCompetitive(Object isCompetitive) {
		return findByProperty(IS_COMPETITIVE, isCompetitive);
	}

	public List findAll() {
		log.debug("finding all Products instances");
		try {
			String queryString = "from Products";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Products merge(Products detachedInstance) {
		log.debug("merging Products instance");
		try {
			Products result = (Products) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Products instance) {
		log.debug("attaching dirty Products instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Products instance) {
		log.debug("attaching clean Products instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProductsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ProductsDAO) ctx.getBean("ProductsDAO");
	}
}