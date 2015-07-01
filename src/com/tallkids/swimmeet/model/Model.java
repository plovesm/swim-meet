/**
 * 
 */
package com.tallkids.swimmeet.model;

import javax.jdo.PersistenceManager;

/**
 * @author Paul
 *
 */
public class Model {
	
	protected PersistenceManager getPM()
	{
		return PMF.get().getPersistenceManager();
	}
	
	
}
