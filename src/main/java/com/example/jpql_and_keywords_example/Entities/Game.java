package com.example.jpql_and_keywords_example.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Game {
//@jakarta.persistence.Id is used instead of @Id because of the following:
// 1. The project is configured to use lombok.config instead of lombok.config
// 2. lombok.config is configured to use lombok.accessors.prefix += f
// 3. lombok.accessors.prefix += f is configured to use f as the prefix for all fields
// 4. lombok.config is configured to use lombok.anyConstructor.suppressConstructorProperties = true
// 5. lombok.anyConstructor.suppressConstructorProperties = true is configured to suppress the generation of @ConstructorProperties
// 6. lombok.config is configured to use lombok.noArgsConstructor.suppressConstructorProperties = true
// 7. lombok.noArgsConstructor.suppressConstructorProperties = true is configured to suppress the generation of @ConstructorProperties
// 8. lombok.config is configured to use lombok.AllArgsConstructor.suppressConstructorProperties = true
// 9. lombok.AllArgsConstructor.suppressConstructorProperties = true is configured to suppress the generation of @ConstructorProperties
// 10. lombok.config is configured to use lombok.Data.noArgsConstructor = false
// 11. lombok.Data.noArgsConstructor = false is configured to suppress the generation of @NoArgsConstructor
// 12. lombok.config is configured to use lombok.Data.allArgsConstructor = false
    @jakarta.persistence.Id
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String time;
    private String location;
    private String homeTeam;
    private String awayTeam;
    private String homeTeamScore;
    private String awayTeamScore;
    private String homeTeamFormation;
    private String awayTeamFormation;
    private String homeTeamStartingEleven;
    private String awayTeamStartingEleven;
    private String homeTeamSubstitutes;
    private String awayTeamSubstitutes;
    private String homeTeamCoach;
    private String awayTeamCoach;
    private String homeTeamYellowCards;
    private String awayTeamYellowCards;
    private String homeTeamRedCards;
    private String awayTeamRedCards;
    private String homeTeamPenalties;
    private String awayTeamPenalties;
    private String homeTeamGoals;
    private String awayTeamGoals;
    private String homeTeamAssists;
    private String awayTeamAssists;
    private String homeTeamOwnGoals;
    private String awayTeamOwnGoals;
    private String homeTeamPenaltyGoals;
    private String awayTeamPenaltyGoals;
    private String homeTeamPenaltyMisses;
    private String awayTeamPenaltyMisses;
    private String homeTeamPenaltySaves;
    private String awayTeamPenaltySaves;
    private String homeTeamGoalsConceded;
    private String awayTeamGoalsConceded;
    private String homeTeamSaves;
    private String awayTeamSaves;
    private String homeTeamPenaltiesSaved;
    private String awayTeamPenaltiesSaved;
    private String homeTeamPenaltiesConceded;
    private String awayTeamPenaltiesConceded;
    private String homeTeamGoalsFromInsideBox;
    private String awayTeamGoalsFromInsideBox;
    private String homeTeamGoalsFromOutsideBox;
    private String awayTeamGoalsFromOutsideBox;
    private String homeTeamHeadedGoals;
    private String awayTeamHeadedGoals;
    private String homeTeamGoalsWithRightFoot;
    private String awayTeamGoalsWithRightFoot;
    private String homeTeamGoalsWithLeftFoot;
    private String awayTeamGoalsWithLeftFoot;
    private String homeTeamHitWoodwork;
    private String awayTeamHitWoodwork;
    private String homeTeamBigChancesMissed;
    private String awayTeamBigChancesMissed;
    private String homeTeamCleanSheets;
    private String awayTeamCleanSheets;

    //relationship between Game and Club
    //a Game is between two Clubs
    //a Club can have many Games
    //a Game can have only two Clubs
    //the relationship is mapped by the homeGames field in the Club class
    //the relationship is mapped by the awayGames field in the Club class
    //the relationship is a bidirectional relationship
    //the relationship is a many-to-one relationship from the Game side
    //the relationship is a one-to-many relationship from the Club side
    @SuppressWarnings("unchecked")
    @ManyToOne(targetEntity = Club.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "home_club_id", nullable = false)
    private Club homeClub;
    @SuppressWarnings("unchecked")
    @ManyToOne(targetEntity = Club.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "away_club_id", nullable = false)
    private Club awayClub;

}
