package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
	public String registerJobSeekerASGroup(List<JobSeeker>list);
	public Iterable<JobSeeker> showAllJobSeekers();
	public JobSeeker findJsById(int id);
	

}
