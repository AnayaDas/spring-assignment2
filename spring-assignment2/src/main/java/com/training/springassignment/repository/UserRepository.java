package com.training.springassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springassignment.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
