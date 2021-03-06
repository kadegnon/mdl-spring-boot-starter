package be.unamur.info.mdl.groggy.dal;


import org.springframework.data.repository.CrudRepository;

import be.unamur.info.mdl.groggy.dal.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
