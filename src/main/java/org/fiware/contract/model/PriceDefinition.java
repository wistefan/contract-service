package org.fiware.contract.model;

import lombok.Data;

@Data
public class PriceDefinition extends Thing{

	private String unitCode;
	private Number quantity;
	private Number price;
	private String priceCurrency;
	private MeasurementPoint measurementPoint;
}
