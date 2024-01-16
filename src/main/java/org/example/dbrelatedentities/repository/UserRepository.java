package org.example.dbrelatedentities.repository;
import org.example.dbrelatedentities.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String>{
}
