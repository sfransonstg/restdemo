package com.stgconsulting.sfranson.restdemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.stgconsulting.sfranson.restdemo.domain.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}
