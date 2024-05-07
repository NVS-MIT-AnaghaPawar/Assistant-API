package com.example.api.hirademyassistantapi.repository;

import com.example.api.hirademyassistantapi.Assistant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistantRepository extends JpaRepository<Assistant, Long> {

}
