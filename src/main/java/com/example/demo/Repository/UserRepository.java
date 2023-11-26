package com.example.demo.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.AppUser;
import com.example.demo.Entities.Flower;
public interface UserRepository extends CrudRepository<AppUser, Long> {
    List<AppUser> findAll();
    AppUser save(AppUser entity);
    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser> findUserByEmail(String email);

}
