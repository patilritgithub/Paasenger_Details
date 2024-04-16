package org.paasenger.proj.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.paasenger.proj.model.PaasengerForm;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class PaasengerExtractor implements ResultSetExtractor <PaasengerForm>{

	@Override
	public PaasengerForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		  PaasengerForm pf=null;
		  
		  if(rs.next()) {
			  pf=new PaasengerForm();
			  pf.setBOOKING_DETAIL_ID(rs.getInt("booking_detail_id"));
			  pf.setPAASENGER_TYPE(rs.getString("paasenger_type"));
			  pf.setTITLE(rs.getString("title"));
			  pf.setFNAME(rs.getString("fname"));
			  pf.setLNAME(rs.getString("lname"));
			  pf.setDOB(rs.getString("dob"));
		     }
			     return pf;
		  }
      }

