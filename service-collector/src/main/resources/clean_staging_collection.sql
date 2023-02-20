DELIMITER //  
CREATE procedure clean_staging_collection (  )  
DETERMINISTIC  
BEGIN  
    SET FOREIGN_KEY_CHECKS=0;
	truncate batch_collection;
	truncate file_collection;
	SET FOREIGN_KEY_CHECKS=1;
END; //  
DELIMITER ; 