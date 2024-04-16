package org.paasenger.proj.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaasengerForm {
	private int BOOKING_DETAIL_ID;
	private String PAASENGER_TYPE;
	private String TITLE;
	private String FNAME;
	private String LNAME;
	private String DOB;
}
