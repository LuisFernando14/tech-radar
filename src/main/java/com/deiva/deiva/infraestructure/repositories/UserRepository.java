package com.deiva.deiva.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;
import com.deiva.deiva.model.entities.User;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}