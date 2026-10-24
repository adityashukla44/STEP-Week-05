# STEP Week 05: Arrays and Methods

My solutions to the Week 5 practice problems and coding assignment of the **STEP Java Programming** track.

## Topics covered

- Modifying arrays inside methods
- Ranking with `Comparable` and `Arrays.sort`
- Nested loops and 2D arrays
- Helper methods
- Binary search
- Array rotation
- Streak and frequency tracking

## Practice

| Program | What it does | Input |
|---------|--------------|-------|
| [`DuplicateTeamNameFinder`](Practice/DuplicateTeamNameFinder.java) | Finds the first team name that appears twice | Built-in example |
| [`HackathonScoreCurveBooster`](Practice/HackathonScoreCurveBooster.java) | Adds a bonus to every score in the array | Built-in example |
| [`HackathonSeatingGridOptimizer`](Practice/HackathonSeatingGridOptimizer.java) | Labels each row of a 2D seating grid as a quiet or buzzing zone | Built-in example |
| [`PlacementDriveShortlistingRankingEngine`](Practice/PlacementDriveShortlistingRankingEngine.java) | Ranks candidates by their computed score using `Comparable` | Built-in example |
| [`TopThreePodiumFinder`](Practice/TopThreePodiumFinder.java) | Finds the top three scores in a single pass | Built-in example |

## Assignment

| Program | What it does | Input |
|---------|--------------|-------|
| [`BusiestBusRow`](Assignment/BusiestBusRow.java) | Finds the bus row with the most passengers in a 2D grid | Built-in example |
| [`ClassAttendanceTracker`](Assignment/ClassAttendanceTracker.java) | Counts days present and the longest attendance streak | Built-in example |
| [`DuplicatePlayerPickChecker`](Assignment/DuplicatePlayerPickChecker.java) | Detects a player who has been picked more than once | Built-in example |
| [`DutyRosterRotation`](Assignment/DutyRosterRotation.java) | Rotates a duty roster by k positions | Built-in example |
| [`ExamScoreBandCounter`](Assignment/ExamScoreBandCounter.java) | Counts scores inside a range using binary search on sorted scores | Built-in example |
| [`FantasyLeagueAutoDraftRankingEngine`](Assignment/FantasyLeagueAutoDraftRankingEngine.java) | Ranks players for an auto-draft using `Comparable` | Built-in example |
| [`FantasyTeamScoreMultiplier`](Assignment/FantasyTeamScoreMultiplier.java) | Applies captain (2x) and vice-captain (1.5x) multipliers to scores | Built-in example |
| [`MatchDayGridAnalyzer`](Assignment/MatchDayGridAnalyzer.java) | Labels each match as Power Surge or Normal from its average runs per over | Built-in example |
| [`SecondBestScore`](Assignment/SecondBestScore.java) | Finds the second-highest distinct score | Built-in example |
| [`TopPerformerTracker`](Assignment/TopPerformerTracker.java) | Finds the minimum, maximum and spread of a set of scores | Built-in example |

## Project structure

```
.
├── Practice/
│   ├── DuplicateTeamNameFinder.java
│   ├── HackathonScoreCurveBooster.java
│   ├── HackathonSeatingGridOptimizer.java
│   ├── PlacementDriveShortlistingRankingEngine.java
│   ├── TopThreePodiumFinder.java
│   └── README.md
├── Assignment/
│   ├── BusiestBusRow.java
│   ├── ClassAttendanceTracker.java
│   ├── DuplicatePlayerPickChecker.java
│   ├── DutyRosterRotation.java
│   ├── ExamScoreBandCounter.java
│   ├── FantasyLeagueAutoDraftRankingEngine.java
│   ├── FantasyTeamScoreMultiplier.java
│   ├── MatchDayGridAnalyzer.java
│   ├── SecondBestScore.java
│   ├── TopPerformerTracker.java
│   └── README.md
└── README.md
```

## How to run

You need JDK 8 or later.

```bash
cd Practice      # or: cd Assignment
javac FileName.java
java FileName
```

Replace `FileName` with the program name. Programs marked **Interactive** read input from the terminal; the rest run a built-in example straight away. Each file is self-contained, so you can also open it in VS Code or IntelliJ and press **Run**.

## All STEP weeks

| Week | Topic |
|------|-------|
| [Week 1](https://github.com/adityashukla44/STEP-Week-01) | Java Basics: Strings, Loops and Arrays |
| [Week 2](https://github.com/adityashukla44/STEP-Week-02) | String Processing and Validation |
| [Week 3](https://github.com/adityashukla44/STEP-Week-03) | Classes, Objects and Constructors |
| [Week 4](https://github.com/adityashukla44/STEP-Week-04) | Array Algorithms |
| **Week 5** | **Arrays and Methods** (this repo) |
| [Week 6](https://github.com/adityashukla44/STEP-Week-06) | Object-Oriented Programming Revision |
| [Week 7](https://github.com/adityashukla44/STEP-Week-07) | Encapsulation |
| [Week 8](https://github.com/adityashukla44/STEP-Week-08) | Inheritance and Polymorphism |
| [Week 9](https://github.com/adityashukla44/STEP-Week-09) | Abstraction and Interfaces |
| [Week 10](https://github.com/adityashukla44/STEP-Week-10) | Coding Practice Set |

## Author

**Aditya Shukla** · [@adityashukla44](https://github.com/adityashukla44)
