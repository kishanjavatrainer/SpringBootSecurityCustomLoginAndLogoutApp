package com.infotech.app.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.infotech.app.entities.Topic;

public interface TopicService {
	 @Secured ({"ROLE_ADMIN"})
	 public abstract List<Topic> getAllTopics();
}
