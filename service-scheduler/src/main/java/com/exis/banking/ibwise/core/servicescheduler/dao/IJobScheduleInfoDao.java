package com.exis.banking.ibwise.core.servicescheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exis.banking.ibwise.core.servicescheduler.model.SchedulerJobInfo;



public interface IJobScheduleInfoDao  extends JpaRepository<SchedulerJobInfo, Long> {

	SchedulerJobInfo findByJobName(String jobName);
}
