package com.ahl.springbootpostgrescrudexample.repository;

import com.ahl.springbootpostgrescrudexample.datamodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
