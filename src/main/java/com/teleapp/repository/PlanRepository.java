package com.teleapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.teleapp.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
	


}
