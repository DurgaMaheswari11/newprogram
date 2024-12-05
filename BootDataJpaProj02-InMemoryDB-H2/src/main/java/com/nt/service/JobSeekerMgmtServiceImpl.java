package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;
@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
@Autowired
private IJobSeekerRepository jsRepo;

	@Override
	public String registerJobSeekerASGroup(List<JobSeeker> list) {
	 System.out.println("JobSeekerMgmtServiceImpl.registerJobSeekerAsGroup()");
	 		Iterable<JobSeeker> savedJs=jsRepo.saveAll(list);
	 return list.size()+" JobSeeker are saved";
	 
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeekers() {
		System.out.println("JobSeekerMgmtServiceImpl.showAllJobSeekers()");
				return jsRepo.findAll();
	}

	

	@Override
	public JobSeeker findJsById( int id) {
		System.out.println("JobSeekerMgmtServiceImpl.findJsById()");
		Optional<JobSeeker> opt=jsRepo.findById(id);
		if(opt.isPresent())
		return opt.get();
		else
			throw new IllegalArgumentException("Invalid Id");
	}

	}


