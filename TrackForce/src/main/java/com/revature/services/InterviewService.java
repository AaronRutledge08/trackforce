package com.revature.services;

import java.io.IOException;
import java.util.Set;


import org.hibernate.HibernateException;

import com.revature.dao.InterviewDao;
import com.revature.dao.InterviewDaoHibernate;
import com.revature.model.InterviewInfo;
import com.revature.request.model.InterviewFromClient;
import com.revature.utils.PersistentStorage;

public class InterviewService implements Service {

    private InterviewDao interviewDao;

    public InterviewService() {
        this.interviewDao = new InterviewDaoHibernate();
        //this.associateDao = new AssociateDaoHibernate();
    }

    /**
     * injectable dao for easier testing
     *
     * @param TechDao
     */
    public InterviewService(InterviewDao interviewDao) {
        this.interviewDao = interviewDao;
    }

    public Set<InterviewInfo> getAllInterviews() throws HibernateException, IOException{
  	
    	//Set<InterviewInfo> interviews = PersistentStorage.getStorage().getInterviews();
    	Set<InterviewInfo> interviews = interviewDao.getInterviewFromCache();
        if (interviews == null || interviews.isEmpty()) {
            execute();
            return interviewDao.getInterviewFromCache();
        }

        return interviews;
	}

    
    public void addInterviewByAssociate(int associateId, InterviewFromClient ifc) {
    	interviewDao.addInterviewForAssociate(associateId, ifc);
    }

	@Override
	public synchronized void execute() throws IOException {
		Set<InterviewInfo> ti = interviewDao.getInterviewFromCache();
		if(ti == null || ti.isEmpty()) {
			PersistentStorage.getStorage().setInterviews(new InterviewDaoHibernate().getAllInterviews());
			//InterviewDaoHibernate.cacheAllInterviews();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Set<T> read(String...args) throws IOException {
		return (Set<T>) getAllInterviews();
	}
}