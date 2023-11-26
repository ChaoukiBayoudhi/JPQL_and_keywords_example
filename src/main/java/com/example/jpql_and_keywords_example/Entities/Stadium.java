package com.example.jpql_and_keywords_example.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Stadium {
    @jakarta.persistence.Id
    private Long id;
    private String name;
    private String country;
    private String city;
    private String capacity;
    private String address;
    private String imageUrl;
    private String latitude;
    private String longitude;
    private String description;
    private String descriptionImageUrl;
    private String descriptionImageAltText;
    private String descriptionImageCaption;
    private String descriptionImageCredit;
    private String descriptionImageCreditLink;
    private String descriptionImageCreditLinkText;
    private String descriptionImageCreditLinkTitle;
    private String descriptionImageCreditLinkTarget;
    private String descriptionImageCreditLinkRel;
    private String descriptionImageCreditLinkType;
    private String descriptionImageCreditLinkMedia;
    private String descriptionImageCreditLinkHreflang;
    private String descriptionImageCreditLinkReferrerpolicy;
    private String descriptionImageCreditLinkDownload;
    private String descriptionImageCreditLinkPing;
    private String descriptionImageCreditLinkRelList;
    private String descriptionImageCreditLinkSizes;
    private String descriptionImageCreditLinkRev;
    private String descriptionImageCreditLinkShape;
    private String descriptionImageCreditLinkTextLink;
    private String descriptionImageCreditLinkTextLinkTarget;
    private String descriptionImageCreditLinkTextLinkRel;
    private String descriptionImageCreditLinkTextLinkType;
    private String descriptionImageCreditLinkTextLinkMedia;
    private String descriptionImageCreditLinkTextLinkHreflang;
    private String descriptionImageCreditLinkTextLinkReferrerpolicy;
    private String descriptionImageCreditLinkTextLinkDownload;
    private String descriptionImageCreditLinkTextLinkPing;
    private String descriptionImageCreditLinkTextLinkRelList;
    private String descriptionImageCreditLinkTextLinkSizes;
    private String descriptionImageCreditLinkTextLinkRev;
    private String descriptionImageCreditLinkTextLinkShape;
    private String descriptionImageCreditLinkTextLinkText;
    private String descriptionImageCreditLinkTextLinkTextLink;
    private String descriptionImageCreditLinkTextLinkTextLinkTarget;
    private String descriptionImageCreditLinkTextLinkTextLinkRel;
    private String descriptionImageCreditLinkTextLinkTextLinkType;
    private String descriptionImageCreditLinkTextLinkTextLinkMedia;
    private String descriptionImageCreditLinkTextLinkTextLinkHreflang;
    private String descriptionImageCreditLinkTextLinkTextLinkReferrerpolicy;
    private String descriptionImageCreditLinkTextLinkTextLinkDownload;

    //relationship between Stadium and Club
    //a Stadium can have many Clubs
    //a Club can have only one Stadium
    //the relationship is mapped by the stadium field in the Club class
    //the relationship is a bidirectional relationship
    //the relationship is a one-to-many relationship from the Stadium side
    //the relationship is a many-to-one relationship from the Club side
    //@SuppressWarnings("unchecked")
    @OneToMany(mappedBy = "stadium", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Club> clubs= new HashSet<>();
}
