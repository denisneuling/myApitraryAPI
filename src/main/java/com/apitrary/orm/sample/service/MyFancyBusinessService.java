package com.apitrary.orm.sample.service;

import com.apitrary.orm.sample.dao.MyDao;

/**
 * <p>
 * MyFancyBusinessService class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class MyFancyBusinessService {

	private MyDao myDao;

	/**
	 * <p>
	 * Getter for the field <code>myDao</code>.
	 * </p>
	 * 
	 * @return a {@link com.apitrary.orm.sample.dao.MyDao} object.
	 */
	public MyDao getMyDao() {
		return myDao;
	}

	/**
	 * <p>
	 * Setter for the field <code>myDao</code>.
	 * </p>
	 * 
	 * @param myDao
	 *            a {@link com.apitrary.orm.sample.dao.MyDao} object.
	 */
	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	/**
	 * <p>
	 * serveInitialDataSet.
	 * </p>
	 */
	public void serveInitialDataSet() {

//		Employer employer = new Employer();
//		employer.setName("We Hire!");
//
//		employer = myDao.save(employer);
//
//		Occupation occupation = new Occupation();
//		occupation.setName("Java Developer");
//		Person person = new Person();
//
//		person.setOccupation(occupation);
//		person.setPreName("Denis");
//		person.setSurName("Neuling");
//
//		myDao.save(person);
//
//		employer = myDao.update(employer);
	}
}
