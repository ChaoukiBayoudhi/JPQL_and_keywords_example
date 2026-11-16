# JPQL and keywords example

A REST API built with Spring Boot around 4 JPA entities.

## Tech stack

- Java 17, built with Maven
- Spring Boot 3.2.0
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Spring Data REST
- Spring Boot Actuator
- Lombok
- PostgreSQL driver

## Concepts covered

JPA relationships, collections, interfaces.

## Data model

| Entity | Fields |
|---|---|
| `Game` | id, name, date, time, location, homeTeam, awayTeam, homeTeamScore, awayTeamScore, homeTeamFormation … |
| `Stadium` | id, name, country, city, capacity, address, imageUrl, latitude, longitude, description … |
| `Player` | id, name, age, number, position, salary, contractYears, goals, assists, yellowCards … |
| `Club` | id, name, country, city, dateFounded, stadium, players |

## Project structure

- `com.example.jpql_and_keywords_example`: JpqlAndKeywordsExampleApplication
- `com.example.jpql_and_keywords_example.Entities`: Club, Game, Player, Stadium
- `com.example.jpql_and_keywords_example.Repositories`: ClubRepository, GameRepository, PlayerRepository, StadiumRepository
- Tests: 1 test class

## How to run

Requirements: a JDK 17+ and Maven (or the included Maven wrapper).

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:8080`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
