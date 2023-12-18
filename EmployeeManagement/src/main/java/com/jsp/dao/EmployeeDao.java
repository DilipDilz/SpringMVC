package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	
	@Autowired
	private EntityManager entityManager ;
	/*
	 * Step - 1 save operation 
	 */
	public EmployeeDao saveEmployee(EmployeeDao employee) {
		
		EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		return employee ;
	}
	/*
	 * step - 2 findOpration 
	 */
	public EmployeeDao findEmployeeById(int eid) {
		
		return entityManager.find(EmployeeDao.class, eid) ;
	}
	
	/*
	 * step - 3 update 
	 */
	public EmployeeDao updateEmployee(EmployeeDao employee) {
		
		EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
	    entityManager.merge(employee) ;
	    transaction.commit();
	    
	    return employee ;
	}
	
	public boolean deleteEmployee (EmployeeDao employee) {
		
        EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
	    entityManager.remove(employee) ;
	    transaction.commit();
	    
	    return true ;
	}
}


