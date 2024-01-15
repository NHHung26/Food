package com.example.FastFood.Reponsetory;

import com.example.FastFood.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<Users, Integer> {

}
