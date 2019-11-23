package com.iris.userDaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.model.BugDetails;
import com.iris.userDao.BugDetailsDao;

@Repository("bugDetailsDao")
public class bugDetailsDaoImpl implements BugDetailsDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean saveBugAllocationByTeater(BugDetails bugDetailObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(bugDetailObj);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
