package com.itSolution.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itSolution.entity.Passport;
@Repository
public interface PassportRepo extends JpaRepository<Passport,Integer> {

}
