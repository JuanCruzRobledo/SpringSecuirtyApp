package org.juanrobledo.springsecurityapp.persistence.repository;

import org.juanrobledo.springsecurityapp.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
