package com.exis.banking.ibwise.core.servicecollector.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.banking.ibwise.core.servicecollector.model.FileCollection;

public interface IFileCollectionDao extends JpaRepository<FileCollection, Long>{

	@Query("select filecol from FileCollection filecol where filecol.hashid like :hashid")
	FileCollection findFileCollectionByHashid(@Param("hashid") String hashid);
}
