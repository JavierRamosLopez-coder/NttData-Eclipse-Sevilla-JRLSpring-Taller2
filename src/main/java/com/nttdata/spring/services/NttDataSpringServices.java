package com.nttdata.spring.services;

/**
 * Interfaz NttDataSpringService - Service
 * 
 * @author jramlope
 *
 */
public interface NttDataSpringServices {

	/**
	 * Cálculo del precio dependiendo la zona
	 * 
	 * @param price
	 */
	public double finalPvpOfProudct(double price);

}
