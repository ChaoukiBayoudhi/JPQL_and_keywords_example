package com.example.jpql_and_keywords_example.Repositories;

import com.example.jpql_and_keywords_example.Entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long> {
    //add custom queries here using JPQL or keywords
    //get clubs that have played a game in a stadium with a capacity greater than a given number
    List<Club> getClubsByGamesStadiumCapacityGreaterThan(Integer capacity);
    //or using JPQL
    //@Query("SELECT c FROM Club c JOIN c.games g WHERE g.stadium.capacity>:capacity")
    //List<Club> getClubsByGamesStadiumCapacityGreaterThan(@Param("capacity") Integer capacity);
    //gets clubs that have players that have scored more than a given number of goals
    List<Club> getClubsByPlayersGoalsGreaterThan(Integer goals);
    //or using JPQL
    //@Query("SELECT c FROM Club c JOIN c.players p WHERE p.goals>:goals")
    //List<Club> getClubsByPlayersGoalsGreaterThan(@Param("goals") Integer goals);
    //gets clubs that have players that have scored more than a given number of goals and have a given position
    List<Club> getClubsByPlayersGoalsGreaterThanAndPlayersPosition(Integer goals,String position);
    //or using JPQL
    //@Query("SELECT c FROM Club c JOIN c.players p WHERE p.goals>:goals AND p.position=:position")
    //List<Club> getClubsByPlayersGoalsGreaterThanAndPlayersPosition(@Param("goals") Integer goals,@Param("position") String position);
     //more hard coded queries
    //gets clubs that have players that have scored more than 10 goals and have a position of Forward
    List<Club> getClubsByPlayersGoalsGreaterThanAndPlayersPositionEquals(Integer goals,String position);
    //gets clubs that have played a game between 2020-01-01 and 2020-12-31 in a stadium with a capacity greater than 50000
    List<Club> getClubsByGamesDateBetweenAndGamesStadiumCapacityGreaterThan(String date1,String date2,Integer capacity);
    //or using JPQL
    //@Query("SELECT c FROM Club c JOIN c.games g WHERE g.date BETWEEN :date1 AND :date2 AND g.stadium.capacity>:capacity")
    //List<Club> getClubsByGamesDateBetweenAndGamesStadiumCapacityGreaterThan(@Param("date1") String date1,@Param("date2") String date2,@Param("capacity") Integer capacity);
    //gets clubs that have at least 2 players that have scored more than 10 goals
    List<Club> findByPlayersGoalsGreaterThanAndAndPlayersCount(
            int goals, int playerCount);
    //or using JPQL
//    @Query("SELECT DISTINCT c FROM Club c " +
//            "JOIN c.players p " +
//            "WHERE p.goals > 10" +
//            "GROUP BY c HAVING COUNT(p) >= 2")
//    List<Club> findClubsWithPlayersHavingMoreThan10Goals();

    //gets clubs that have at least 2 players that have scored more than 10 goals and have a position of Forward
    List<Club> findByPlayersGoalsGreaterThanAndPlayersPositionAndPlayersCount(
            int goals, String position, int playerCount);    //or using JPQL
//    @Query("SELECT DISTINCT c FROM Club c " +
//            "JOIN c.players p " +
//            "WHERE p.goals > 10 AND p.position = 'Forward' " +
//            "GROUP BY c HAVING COUNT(p) >= 2")
//    List<Club> findClubsWithPlayersHavingMoreThan10GoalsAndForwardPosition();

}
