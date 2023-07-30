package com.example.demo.EquipPerson;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface EquipPersonRepository 
extends JpaRepository<EquipPerson, Long>
{
	@Query("SELECT C FROM EquipPerson C WHERE C.EquPhoneNumber = ?1 AND C.EquUserPassword = ?2")
    Optional<EquipPerson> find(String EquPhoneNumber,String EquUserPassword);
}
