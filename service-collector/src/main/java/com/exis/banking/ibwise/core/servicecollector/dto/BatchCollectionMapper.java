package com.exis.banking.ibwise.core.servicecollector.dto;

 

import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;
 

public class BatchCollectionMapper {

	
	
	public static BatchCollectionDto dtoMapper(BatchCollection dao) {
		BatchCollectionDto dto=null;
		dto= new BatchCollectionDto(dao.getName(),dao.getDate(),dao.getDescription());
		return dto;
	}
	
	public static BatchCollection daoMapper(BatchCollectionDto dto) {
		BatchCollection dao=null;
		
		dao=new BatchCollection(dto.getName(),dto.getDate(),dto.getDescription());
		
		return dao;
	}
}
