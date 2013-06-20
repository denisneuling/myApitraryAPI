package com.apitrary.orm.sample.dao;

import com.apitrary.api.client.ApitraryClient;
import com.apitrary.orm.core.ApitraryDaoSupport;

/**
 * <p>
 * MyDao class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class MyDao extends ApitraryDaoSupport {

	/**
	 * <p>
	 * Constructor for MyDao.
	 * </p>
	 * 
	 * @param apitraryClient
	 *            a {@link com.apitrary.api.client.ApitraryClient} object.
	 */
	public MyDao(ApitraryClient apitraryClient) {
		this.setApitraryClient(apitraryClient);
	}
}
