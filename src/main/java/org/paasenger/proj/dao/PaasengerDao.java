package org.paasenger.proj.dao;

import java.util.List;
import org.paasenger.proj.model.PaasengerForm;

public interface PaasengerDao {
	List<PaasengerForm> getPaasengerList();
	
	PaasengerForm getPaasengerByPaasengerBOOKING_DETAIL_ID(int BOOKING_DETAIL_ID);
	
	void insertPaasenger(PaasengerForm paasengerForm);
	void updatePaasenger(PaasengerForm paasengerForm);
	void deletePaasenger (int BOOKING_DETAIL_ID); 
  }

