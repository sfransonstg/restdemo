package com.stgconsulting.sfranson.restdemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.stgconsulting.sfranson.restdemo.domain.Course;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
