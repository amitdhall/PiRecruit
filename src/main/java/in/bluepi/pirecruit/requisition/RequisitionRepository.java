package in.bluepi.pirecruit.requisition;

import in.bluepi.pirecruit.enums.UtilEnum;
import in.bluepi.pirecruit.user.employee.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RequisitionRepository {
	
	Map<Integer, Requisition> requisitions = new HashMap<Integer, Requisition>();
//	int i=1;
	public Requisition createReq(int ID, Date closingDate, Date openingDate, Employee createdByEmp, String projectName, UtilEnum.reqStatus reqStatus){
		Requisition req = new Requisition();
		req.initReq(ID,closingDate,openingDate,createdByEmp,projectName,reqStatus);
		
		requisitions.put(req.id, req);
//		i++;
		return req;
	}
	
	Requisition getRequisition(Requisition ID){
		return requisitions.get(ID);
	}

}
