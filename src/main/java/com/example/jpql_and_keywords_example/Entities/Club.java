package com.example.jpql_and_keywords_example.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Club {
    @jakarta.persistence.Id
    private Long id;
    //name is the only field that is not nullable and unique
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    private String country;
    private String city;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFounded;
    //relationship between Stadium and Club
    //a Stadium can have many Clubs
    //a Club can have only one Stadium
    //the relationship is mapped by the stadium field in the Club class
    //the relationship is mapped by the club field in the Stadium class
    //the relationship is a bidirectional relationship
    //the relationship is a one-to-many relationship from the Stadium side
    @ManyToOne(targetEntity = Stadium.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id", nullable = false)
    private Stadium stadium;
    //relationship between Club and Player
    //a Club can have many Players
    //a Player can have only one Club
    //the relationship is mapped by the club field in the Player class
    //the relationship is mapped by the player field in the Club class
    //the relationship is a bidirectional relationship
    //the relationship is a one-to-many relationship from the Club side
    @OneToMany(targetEntity = Player.class, mappedBy = "club", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Player> players=new HashSet<Player>();
}
