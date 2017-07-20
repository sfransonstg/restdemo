package com.stgconsulting.sfranson.restdemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.stgconsulting.sfranson.restdemo.domain.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
