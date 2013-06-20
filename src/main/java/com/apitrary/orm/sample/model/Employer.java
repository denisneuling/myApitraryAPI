package com.apitrary.orm.sample.model;

import com.apitrary.orm.core.annotations.Column;
import com.apitrary.orm.core.annotations.Entity;
import com.apitrary.orm.core.annotations.Id;

/**
 * <p>
 * Employer class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Entity
public class Employer {

	@Id
	private String id;

	@Column
	private String name;

	/**
	 * <p>
	 * Constructor for Employer.
	 * </p>
	 */
	public Employer() {
	}

	/**
	 * <p>
	 * Getter for the field <code>id</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return id;
	}

	/**
	 * <p>
	 * Setter for the field <code>id</code>.
	 * </p>
	 * 
	 * @param id
	 *            a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 * 
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
