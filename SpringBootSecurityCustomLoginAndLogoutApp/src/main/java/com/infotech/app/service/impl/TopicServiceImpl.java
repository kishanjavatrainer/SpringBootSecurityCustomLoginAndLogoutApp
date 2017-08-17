package com.infotech.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.app.dao.TopicDAO;
import com.infotech.app.entities.Topic;
import com.infotech.app.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicDAO topicDAO;
	
	@Override
	public List<Topic> getAllTopics(){
		return topicDAO.getAllTopics();
	}
}
