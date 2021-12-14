package com.nttdata.spring.services;

import org.springframework.stereotype.Component;

/**
 * Clase NttDataSpringServicesOtherPlaces - Service
 * 
 * @author jramlope
 *
 */
@Component("Others")
public class NttDataSpringServicesOtherPlaces implements NttDataSpringServices {

	@Override
	public double finalPvpOfProudct(double price) {

		return price - (price * 0.04);
	}

}
