package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	//getAlltopics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id) These are all available in CrudRepository
	
	//getCoursebyTopicId
	
	public List<Course>  findByDescription(String description);
	public List<Course> findByName(String name);
	public List<Course> findByTopicId(String topicId);
	
	
	
}
