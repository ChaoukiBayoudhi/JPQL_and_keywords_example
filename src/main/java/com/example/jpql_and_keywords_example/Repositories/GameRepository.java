package com.example.jpql_and_keywords_example.Repositories;

import com.example.jpql_and_keywords_example.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
    //add custom queries here using JPQL or keywords
    //get all games by club name
    List<Game> findAllByClubName(String clubName);
    //get all games by club name and stadium name
    List<Game> findAllByClubNameAndStadiumName(String clubName,String stadiumName);
    //get all games by club name and stadium name and date
    List<Game> findAllByClubNameAndStadiumNameAndDate(String clubName,String stadiumName,String date);
    //get all games played in a stadium with a capacity greater than or equal to a given capacity
    List<Game> findAllByStadiumCapacityGreaterThanEqual(Integer capacity);

}
