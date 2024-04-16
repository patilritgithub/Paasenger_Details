package org.paasenger.proj.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.paasenger.proj.model.PaasengerForm;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class PaasengerListExtractor implements ResultSetExtractor<List<PaasengerForm>> {

	
	@Override
	public List<PaasengerForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<PaasengerForm> paasengerList=new ArrayList();
		 PaasengerForm pf=null;
		 
		 while(rs.next()) {
			 pf = new PaasengerForm();
			 pf.setBOOKING_DETAIL_ID(rs.getInt("BOOKING_DETAIL_ID"));
			 pf.setPAASENGER_TYPE(rs.getString("PAASENGER_TYPE"));
			 pf.setTITLE(rs.getString("TITLE"));
			 pf.setFNAME(rs.getString("FNAME"));
			 pf.setLNAME(rs.getString("LNAME"));
			 pf.setDOB(rs.getString("DOB"));
			 paasengerList.add(pf);
		 }
		return paasengerList;
	}

}
