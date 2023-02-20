package com.exis.banking.ibwise.core.servicecollector.services;

//import java.util.Date;
import java.util.List;

import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;

public interface IBatchCollectionDbService {

	public BatchCollection findBatchCollectionByHashid(String hashid);
	public List<BatchCollection> getAllBatches();
	public BatchCollection save(BatchCollection batch);
	
	//public List<BatchCollection> getBatchesBetweenDates(Date date1,Date date2);
	
}
