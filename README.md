# Spring Inventory & Order Demo (2025)

> Original repository name: **Rpg-Manager**. The actual code is a **Spring Core / Dependency Injection example**, not an RPG game. The original loose Java files remain in repository history and at the root; a standard Maven project was added in November 2026.

## Implemented
- Product inventory in an in-memory map
- Add, check and remove products
- Create a simple order message based on product availability
- Spring DI: `@ComponentScan`, `@Primary`, `@Qualifier`, lazy and eager singletons

## Run
Requirements: JDK 17 or newer; Maven 3.9+.
```bash
git clone https://github.com/Zhenis455/Rpg-Manager.git
cd Rpg-Manager
mvn -B test
mvn -q exec:java
```

There is **no web interface or database**. Output is printed in the terminal. CI runs tests and Maven verification on each commit.

## Source structure
- `src/main/java/org/example` — Spring Core application
- `src/test/java/org/example` — JUnit 5 integration test

Educational project; not a production order processing system.
