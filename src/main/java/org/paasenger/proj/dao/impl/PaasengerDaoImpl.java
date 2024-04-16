package org.paasenger.proj.dao.impl;

import java.util.List;

import org.paasenger.proj.dao.PaasengerDao;
import org.paasenger.proj.dao.extractor.PaasengerExtractor;
import org.paasenger.proj.dao.extractor.PaasengerListExtractor;
import org.paasenger.proj.model.PaasengerForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import lombok.AllArgsConstructor;
@AllArgsConstructor
@Repository
public class PaasengerDaoImpl implements PaasengerDao {
    @Autowired
	 private JdbcTemplate jdbcTemplate;
	@Autowired
	private PaasengerListExtractor paasengerListExtractor;
	@Autowired
	private PaasengerExtractor paasengerExtractor;
	
	@Override
	public List<PaasengerForm> getPaasengerList() {
		System.out.println("Dao start");
		
	List<PaasengerForm> PaasengerList=jdbcTemplate.query("Select * from Paasenger_Details order by BOOKING_DETAIL_ID", paasengerListExtractor::extractData);
	
		System.out.println("Dao end");
		return PaasengerList;
	}

	@Override
	public PaasengerForm getPaasengerByPaasengerBOOKING_DETAIL_ID(int BOOKING_DETAIL_ID) {
       PaasengerForm pf=jdbcTemplate.query("Select * from  Paasenger_Details where booking_detail_id="+BOOKING_DETAIL_ID,paasengerExtractor::extractData);
		return pf;
	}

	@Override
	public void insertPaasenger(PaasengerForm paasengerForm) {
		String query= "insert into Paasenger_Details values("+paasengerForm.getBOOKING_DETAIL_ID()+",'"+paasengerForm.getPAASENGER_TYPE()+"','"+paasengerForm.getTITLE()+"','"+paasengerForm.getFNAME()+"','"+paasengerForm.getLNAME()+"','"+paasengerForm.getDOB()+"')";
	    jdbcTemplate.execute(query);
	}

	@Override
	public void updatePaasenger(PaasengerForm paasengerForm) {
		String query="update Paasenger_Details set paasenger_type='"+paasengerForm.getPAASENGER_TYPE()+"', title='"+paasengerForm.getTITLE()+"', fname='"+paasengerForm.getFNAME()+"', lname='"+paasengerForm.getLNAME()+"', dob='"+paasengerForm.getDOB()+"'where booking_detail_id="+paasengerForm.getBOOKING_DETAIL_ID();
		jdbcTemplate.update(query);
	}

	@Override
	public void deletePaasenger(int BOOKING_DETAIL_ID) {
		String query="delete from Paasenger_Details where BOOKING_DETAIL_ID="+BOOKING_DETAIL_ID;
		jdbcTemplate.execute(query);
	  }
   }


