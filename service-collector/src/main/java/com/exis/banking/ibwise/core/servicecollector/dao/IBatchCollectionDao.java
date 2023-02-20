package com.exis.banking.ibwise.core.servicecollector.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;



public interface IBatchCollectionDao extends JpaRepository<BatchCollection, Long>{

	@Query("select batchcol from BatchCollection batchcol where batchcol.hashid like :hashid")
	BatchCollection findBatchCollectionByHashid(@Param("hashid") String hashid);
}
