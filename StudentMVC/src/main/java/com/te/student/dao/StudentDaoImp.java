package com.te.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.student.bean.StudentDetails;

@Repository
public class StudentDaoImp implements StudentDao {

	@Override
	public StudentDetails authenticate(int rollno, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		StudentDetails detail = manager.find(StudentDetails.class, rollno);
		if (detail != null) {
			if (detail.getPassword().equals(password)) {
				return detail;
			}
		}
		return null;
	}

	@Override
	public boolean adddata(StudentDetails details) {
		EntityTransaction transaction = null;
		boolean result = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(details);
			result = true;
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public boolean deletedata(int rollno) {
		EntityTransaction transaction = null;

		boolean result = false;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			StudentDetails find = manager.find(StudentDetails.class, rollno);
			manager.remove(find);
			result = true;
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public StudentDetails showData(int rollno) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		StudentDetails details = manager.find(StudentDetails.class, rollno);
		if (details != null) {
			return details;
		}
		return null;
	}

	@Override
	public StudentDetails updatedata(StudentDetails details, StudentDetails details2) {
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			StudentDetails details3 = manager.find(StudentDetails.class, details2.getRollno());
			if (details3 != null) {

				details3.setName(details.getName());
				details3.setAddress(details.getAddress());
				details3.setPassword(details.getPassword());
				details3.setPhoneno(details.getPhoneno());
				transaction.begin();
				manager.persist(details3);

				transaction.commit();
				return details3;
			}else {
				return null;
			}

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<StudentDetails> showDataAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager manager = factory.createEntityManager();
		String query = "from StudentDetails";
		Query alldata = manager.createQuery(query);
	    List<StudentDetails> data = alldata.getResultList();
		if (data != null) {
			return data;
		}

		return null;
	}

}
