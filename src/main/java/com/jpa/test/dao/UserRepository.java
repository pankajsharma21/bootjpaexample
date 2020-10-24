package com.jpa.test.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User,Integer> {

	//custom methods
	public List<User> findByName(String name);
	public List<User> findByCity(String city);
	public List<User> findByNameAndCity(String name,String city);
	
	//Query jpql and native like sql
	
	@Query("select u FROM User u ")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n")String name);
// this @param("n") bind the query n variable with parameter name variable so value in name get to n and query complete
//in below we bind c with city using param
	
	@Query("select u FROM User u WHERE u.name =:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n")String name,@Param("c")String city);
	
	
	// using native Query 
	
    @Query(value="select * from user", nativeQuery = true)
	public List<User> getUsers();
	
	
	
	
}


// THIS BELOW LINK CONTAIN SPRING CUSTOM METHOD SUPPORTING KEYWORDS
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation

