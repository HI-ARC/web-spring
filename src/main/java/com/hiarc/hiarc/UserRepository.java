package com.hiarc.hiarc;
import org.springframework.data.repository.CrudRepository;
import com.hiarc.hiarc.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}