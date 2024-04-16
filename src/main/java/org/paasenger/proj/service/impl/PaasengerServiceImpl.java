package org.paasenger.proj.service.impl;

import java.util.List;

import org.paasenger.proj.dao.PaasengerDao;
import org.paasenger.proj.model.PaasengerForm;
import org.paasenger.proj.service.PaasengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class PaasengerServiceImpl implements PaasengerService {
    @Autowired
    private PaasengerDao paasengerdao;
    
	@Override
	public List<PaasengerForm> getPaasengerListService() {
		System.out.println("Service start");
	   List<PaasengerForm> paasengerList=paasengerdao.getPaasengerList();
	   System.out.println("Service end");
		return paasengerList;
	}

	@Override
	public PaasengerForm getPaasengerByBooking_detail_idService(int booking_detail_id) {
		PaasengerForm pf= paasengerdao.getPaasengerByPaasengerBOOKING_DETAIL_ID(booking_detail_id);
		return pf;
	}

	@Override
	public void insertPaasengerService(PaasengerForm paasengerForm) {
		paasengerdao.insertPaasenger(paasengerForm);
	}

	@Override
	public void updatePaasengerService(PaasengerForm paasengerForm) {
		paasengerdao.updatePaasenger(paasengerForm);
	}

	@Override
	public void deletePaasengerService(int BOOKING_DETAIL_ID) {
		paasengerdao.deletePaasenger(BOOKING_DETAIL_ID);
	}
}

	