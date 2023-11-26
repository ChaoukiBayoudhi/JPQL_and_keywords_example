package com.example.jpql_and_keywords_example.Repositories;

import com.example.jpql_and_keywords_example.Entities.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium,Long> {
}
