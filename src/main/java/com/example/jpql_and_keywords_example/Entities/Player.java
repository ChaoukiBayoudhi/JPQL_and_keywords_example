package com.example.jpql_and_keywords_example.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private int number;
    private String position;
    private int salary;
    private int contractYears;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
    private int cleanSheets;
    private int appearances;
    private int minutesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;
    private int gamesPlayed;
    private int gamesStarted;
    private int gamesSubbedOn;
    private int gamesSubbedOff;
    private int gamesManOfTheMatch;
    private int gamesYellowCard;
    private int gamesRedCard;
    private int gamesGoalsConceded;
    private int gamesGoalsScored;
    private int gamesAssists;
    private int gamesPenaltyGoals;
    private int gamesPenaltyMisses;
    private int gamesPenaltySaves;
    private int gamesGoalsFromInsideBox;
    private int gamesGoalsFromOutsideBox;
    private int gamesHeadedGoals;
    private int gamesGoalsWithRightFoot;
    private int gamesGoalsWithLeftFoot;
    private int gamesHitWoodwork;
    private int gamesBigChancesMissed;
    private int gamesCleanSheetsOverall;
    private int gamesCleanSheetsHome;
    private int gamesCleanSheetsAway;
    private int gamesGoalsConcededOverall;
    private int gamesGoalsConcededHome;
    private int gamesGoalsConcededAway;
    private int gamesSaves;
    private int gamesPenaltiesSaved;
    private int gamesPunches;
    private int gamesHighClaims;
    private int gamesCatches;
    private int gamesSweeperClearances;
    private int gamesThrowouts;
    private int gamesGoalKicks;
    private int gamesGoalAssistOpenPlay;
    private int gamesGoalAssistSetPlay;
    private int gamesGoalAssistCounterAttack;
    private int gamesOwnGoals;
    private int gamesLastManTackle;
    private int gamesBlockedScoringAtt;
    private int gamesInterceptions;
    private int gamesRecoveries;
    private int gamesTackles;
    private int gamesTackleSuccess;
    private int gamesLastManTackleWon;
    private int gamesBlockedScoringAttWon;

    //relationship between Club and Player
    //a Club can have many Players
    //a Player can have only one Club
    //the relationship is mapped by the club field in the Player class
    //the relationship is mapped by the players field in the Club class
    //the relationship is a bidirectional relationship
    //the relationship is a many-to-one relationship from the Player side
    //the relationship is a one-to-many relationship from the Club side
    @ManyToOne(targetEntity = Club.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;
}
