package com.nttdata.spring.persistence;

import java.util.List;

/**
 * 
 * Clase NttDataSpringOrder
 * 
 * @author jramlope
 *
 */
public class NttDataSpringOrder {

	/** NttDataSpringOrder identifier **/
	private int identifierNumber;

	/** NttDataSpringOrder addresse **/
	private String addresse;

	/** NttDataSpringOrder deliveryAddress **/
	private String deliveryAddress;

	/** NttDataSpringOrder deliveryIdentifier **/
	private int deliveryIdentifier;

	/** Lista de productos **/
	private List<NttDataSpringProduct> listOfProducts;

	/**
	 * @return the identifierNumber
	 */
	public int getIdentifierNumber() {
		return identifierNumber;
	}

	/**
	 * @param identifierNumber the identifierNumber to set
	 */
	public void setIdentifierNumber(int identifierNumber) {
		this.identifierNumber = identifierNumber;
	}

	/**
	 * @return the addresse
	 */
	public String getAddresse() {
		return addresse;
	}

	/**
	 * @param addresse the addresse to set
	 */
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the deliveryIdentifier
	 */
	public int getDeliveryIdentifier() {
		return deliveryIdentifier;
	}

	/**
	 * @param deliveryIdentifier the deliveryIdentifier to set
	 */
	public void setDeliveryIdentifier(int deliveryIdentifier) {
		this.deliveryIdentifier = deliveryIdentifier;
	}

	/**
	 * @return the listOfProducts
	 */
	public List<NttDataSpringProduct> getListOfProducts() {
		return listOfProducts;
	}

	/**
	 * @param listOfProducts the listOfProducts to set
	 */
	public void setListOfProducts(List<NttDataSpringProduct> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

}
