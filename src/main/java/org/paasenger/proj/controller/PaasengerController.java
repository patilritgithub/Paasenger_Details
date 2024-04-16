package org.paasenger.proj.controller;

import java.util.List;
import org.paasenger.proj.model.PaasengerForm;
import org.paasenger.proj.service.PaasengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("Paasenger_Details")
@CrossOrigin("*")

public class PaasengerController {
	@Autowired
	private PaasengerService paasengerService;
	
	@GetMapping()
		public List<PaasengerForm> getPaasengerListCtrl(){
		System.out.println("Controller start");
		List<PaasengerForm> PaasengerList=paasengerService.getPaasengerListService();
		System.out.println("Controller end");
		return PaasengerList;
		}
	
	@GetMapping("/{booking_detail_id}")
	public PaasengerForm getPaasengerBybooking_detail_idCtrl(@PathVariable(value="booking_detail_id")int booking_detail_id)
	 {
			PaasengerForm pf= paasengerService.getPaasengerByBooking_detail_idService(booking_detail_id);
			return pf;
	  }
	
	@PostMapping
	public void insertPaasengerCtrl(@RequestBody PaasengerForm paasengerForm)
	{
		paasengerService.insertPaasengerService(paasengerForm);
	}
	
	@PutMapping
	public void updatePaasengerCtrl(@RequestBody PaasengerForm paasengerForm)
	{
		paasengerService.updatePaasengerService(paasengerForm);
	}
	
	@DeleteMapping("/{num}")
	public void deletePaasengerCtrl(@PathVariable(value="num") int booking_detail_id)
	{
		paasengerService.deletePaasengerService(booking_detail_id);
	}
  
}


	
	
	
