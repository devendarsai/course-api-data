package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	//getAlltopics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
}
