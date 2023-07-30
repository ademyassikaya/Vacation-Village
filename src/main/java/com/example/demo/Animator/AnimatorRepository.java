package com.example.demo.Animator;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimatorRepository 
extends JpaRepository<Animator, Long>
{
	@Query("SELECT C FROM Animator C WHERE C.PhoneNumber = ?1 AND C.AniUserPassword = ?2")
    Optional<Animator> find(String PhoneNumber,String AniUserPassword);
}
