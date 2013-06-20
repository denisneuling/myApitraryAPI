package com.apitrary.orm.sample.model;

import com.apitrary.orm.core.annotations.Column;
import com.apitrary.orm.core.annotations.Entity;
import com.apitrary.orm.core.annotations.Id;
import com.apitrary.orm.core.annotations.Reference;
import com.apitrary.orm.core.annotations.cascade.Cascade;

/**
 * <p>
 * Person class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Entity
public class Person {

	@Id
	private String id;

	@Column
	private String preName;

	@Column
	private String surName;

	@Reference(cascade={Cascade.SAVE, Cascade.DELETE})
	private Occupation occupation;

	/**
	 * <p>
	 * Constructor for Person.
	 * </p>
	 */
	public Person() {
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
	 * Getter for the field <code>preName</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getPreName() {
		return preName;
	}

	/**
	 * <p>
	 * Setter for the field <code>preName</code>.
	 * </p>
	 * 
	 * @param preName
	 *            a {@link java.lang.String} object.
	 */
	public void setPreName(String preName) {
		this.preName = preName;
	}

	/**
	 * <p>
	 * Getter for the field <code>surName</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * <p>
	 * Setter for the field <code>surName</code>.
	 * </p>
	 * 
	 * @param surName
	 *            a {@link java.lang.String} object.
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * <p>
	 * Getter for the field <code>occupation</code>.
	 * </p>
	 * 
	 * @return a {@link com.apitrary.orm.sample.model.Occupation} object.
	 */
	public Occupation getOccupation() {
		return occupation;
	}

	/**
	 * <p>
	 * Setter for the field <code>occupation</code>.
	 * </p>
	 * 
	 * @param occupation
	 *            a {@link com.apitrary.orm.sample.model.Occupation} object.
	 */
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", preName=" + preName + ", surName=" + surName + ", occupation=" + (occupation==null?null:occupation.toString()) + "]";
	}
}
