package com.nttdata.spring.persistence;

/**
 * Clase NttDataSpringProduct
 * 
 * @author jramlope
 *
 */
public class NttDataSpringProduct {

	/** NttDataSpringProduct identifier **/
	private int identifier;

	/** NttDataSpringProduct name **/
	private String productName;

	/** NttDataSpringProduct price **/
	private double productPrice;

	/** NttDataSpringProduct price without taxes **/
	private double productPriceWithoutTaxes;

	/** Atributo de la clase NttDataSpringOrder **/
	private NttDataSpringOrder order;

	/**
	 * @return the identifier
	 */
	public int getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the productPriceWithoutTaxes
	 */
	public double getProductPriceWithoutTaxes() {
		return productPriceWithoutTaxes;
	}

	/**
	 * @param productPriceWithoutTaxes the productPriceWithoutTaxes to set
	 */
	public void setProductPriceWithoutTaxes(double productPriceWithoutTaxes) {
		this.productPriceWithoutTaxes = productPriceWithoutTaxes;
	}

	/**
	 * @return the order
	 */
	public NttDataSpringOrder getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(NttDataSpringOrder order) {
		this.order = order;
	}

}
