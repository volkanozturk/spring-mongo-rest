package com.volkanozturk.repository;

import com.volkanozturk.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author volkanozturk
 */
public interface UserRepository extends MongoRepository<User, String> {

}
