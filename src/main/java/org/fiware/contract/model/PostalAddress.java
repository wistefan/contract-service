package org.fiware.contract.model;

import lombok.Data;

@Data
public class PostalAddress extends Thing {

	private String addressCountry;
	private String addressLocality;
	private String addressRegion;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;
}