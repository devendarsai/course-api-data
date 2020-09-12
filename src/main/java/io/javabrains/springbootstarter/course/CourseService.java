package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {

		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(String id) {

		return courseRepository.findById(id);
	}

	public String addCourse(Course course) {

		courseRepository.save(course);
		return "Added Course successfully";
	}

	public String updateCourse(Course course) {
		courseRepository.save(course);
		return "Updated Course successfully";
	}

	public String deleteCourse(String id) {

		courseRepository.deleteById(id);
		return null;
	}
}
