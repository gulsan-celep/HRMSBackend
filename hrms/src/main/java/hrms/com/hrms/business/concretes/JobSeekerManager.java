package hrms.com.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.com.hrms.business.abstracts.JobSeekerService;
import hrms.com.hrms.dataAccess.abstracts.JobSeekerDao;
import hrms.com.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public List<JobSeeker> getAll() {
		// TODO Auto-generated method stub
		return this.jobSeekerDao.findAll();
	}

}
