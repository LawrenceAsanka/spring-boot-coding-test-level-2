package com.accenture.codingtest.springbootcodingtest.repository;

import com.accenture.codingtest.springbootcodingtest.entity.Project;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProjectRepository extends JpaRepository<Project, UUID> {
    List<Project> findByNameIgnoreCase(String name, Pageable pageable);

}
