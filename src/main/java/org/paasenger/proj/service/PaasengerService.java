package org.paasenger.proj.service;

import java.util.List;
import org.paasenger.proj.model.PaasengerForm;


public interface PaasengerService{
	List<PaasengerForm> getPaasengerListService();
	 PaasengerForm getPaasengerByBooking_detail_idService(int booking_detail_id);
	 
	 void insertPaasengerService(PaasengerForm paasengerForm);
	 void updatePaasengerService(PaasengerForm paasengerForm);
	 void deletePaasengerService(int BOOKING_DETAIL_ID);
}

