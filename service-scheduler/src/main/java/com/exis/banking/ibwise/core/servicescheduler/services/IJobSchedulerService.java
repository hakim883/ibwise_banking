package com.exis.banking.ibwise.core.servicescheduler.services;

import java.util.List;

import org.quartz.SchedulerException;
import org.quartz.SchedulerMetaData;

import com.exis.banking.ibwise.core.servicescheduler.model.SchedulerJobInfo;



public interface IJobSchedulerService {

	public List<SchedulerJobInfo> getAllJobList();
	public boolean deleteJob(SchedulerJobInfo jobInfo);
	public boolean pauseJob(SchedulerJobInfo jobInfo);
	public boolean resumeJob(SchedulerJobInfo jobInfo);
	public boolean runJob(SchedulerJobInfo jobInfo);
	public void saveJob(SchedulerJobInfo scheduleJob);
	public SchedulerMetaData getMetaData() throws SchedulerException ;
	 
	 
}
