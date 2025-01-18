package com.svtsygankov.spring.database.repository;

import com.svtsygankov.spring.database.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

// Можно использовать Optional Entity или Future
   Optional<Company> findByName(String name);

//   Можно использовать Collection или Stream
   List<Company> findByNameContainingIgnoreCase(String fragment);
}
