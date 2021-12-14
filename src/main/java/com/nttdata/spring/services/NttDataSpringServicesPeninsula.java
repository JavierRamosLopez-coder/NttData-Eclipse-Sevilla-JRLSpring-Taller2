package com.nttdata.spring.services;

import org.springframework.stereotype.Component;

/**
 * Clase NttDataSpringServicePeninsula - Service
 * 
 * @author jramlope
 *
 */
@Component("Peninsula")
public class NttDataSpringServicesPeninsula implements NttDataSpringServices {

	@Override
	public double finalPvpOfProudct(double price) {

		return price - (price * 0.21);
	}

}
