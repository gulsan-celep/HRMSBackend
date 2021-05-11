package hrms.com.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.com.hrms.business.abstracts.JobSeekerService;
import hrms.com.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

	private JobSeekerService jobSeeker;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeeker) {
		super();
		this.jobSeeker = jobSeeker;
	}
	
	@GetMapping("getall")
	public List<JobSeeker> GetAll() {
		return this.jobSeeker.getAll();
	}
}
