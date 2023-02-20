package com.exis.banking.ibwise.core.servicecollector.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exis.banking.ibwise.core.servicecollector.dao.IBatchCollectionDao;
import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;
import com.exis.banking.ibwise.core.servicecollector.services.IBatchCollectionDbService;

@Service
public class BatchCollectionDbServiceImpl implements IBatchCollectionDbService {

	@Autowired
	IBatchCollectionDao _daoBatchCollection;
	
	@Override
	public BatchCollection findBatchCollectionByHashid(String hashid) {
		// TODO Auto-generated method stub
		return _daoBatchCollection.findBatchCollectionByHashid(hashid);
	}

	@Override
	public List<BatchCollection> getAllBatches() {
		// TODO Auto-generated method stub
		return _daoBatchCollection.findAll();
	}

	@Override
	public BatchCollection save(BatchCollection batch) {
		// TODO Auto-generated method stub
		 return _daoBatchCollection.save(batch);
	}

}
