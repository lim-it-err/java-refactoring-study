# Refactoring Exercise Rules

## Difficulty Levels
This document outlines the structure and expectations for refactoring exercises at different difficulty levels.

### **Easy**
- **Scope**: Basic refactoring tasks with common code smells and minor logical issues.
- **Issues Included**:
    - Code style and convention violations.
    - Simple logic errors (e.g., incorrect calculations, missing validations).
    - Inefficient data structures (e.g., using raw types instead of generics).
    - Small-scale redundancy (e.g., duplicate code in a single class).
- **Goals**:
    - Improve readability and maintainability.
    - Apply basic refactoring techniques (e.g., method extraction, renaming).
    - Introduce unit testing.
- **Files Provided**: `Easy.ShoppingCartQuestion.java`, `README.md`

### **Medium**
- **Scope**: Introduces structural changes and design patterns while addressing business logic complexity.
- **Issues Included**:
    - Separation of concerns (splitting responsibilities into multiple classes).
    - Introduction of **design patterns** (e.g., Factory, Strategy, Singleton).
    - More complex logic errors (e.g., incorrect state handling, precision issues in financial calculations).
    - Scalability concerns (e.g., inefficient looping, incorrect use of collections).
- **Goals**:
    - Improve architecture by applying relevant design patterns.
    - Enhance validation and security (e.g., preventing invalid states, enforcing data constraints).
    - Introduce integration testing (beyond unit tests).
- **Files Provided**: `OrderProcessingQuestion.java`, `README.md`

### **Hard**
- **Scope**: Advanced refactoring involving concurrency, scalability, and system design.
- **Issues Included**:
    - **Multithreading concerns** (e.g., race conditions, synchronization issues).
    - **Performance bottlenecks** (e.g., inefficient database queries, excessive memory usage).
    - **Security vulnerabilities** (e.g., injection risks, lack of authentication/authorization mechanisms).
    - **Advanced design patterns** (e.g., Observer, Dependency Injection, CQRS).
    - **Domain-driven design principles** (introducing aggregates, repositories, services).
- **Goals**:
    - Implement thread-safe and efficient code.
    - Apply best practices for large-scale applications.
    - Address security and performance optimization.
- **Files Provided**: `HardProblemQuestion.java`, `README.md`, and possibly multiple class files for a more complete system.

## General Guidelines
- Each exercise will include **deliberate flaws** to be identified and fixed.
- Instructions (`README.md`) will **outline issues and suggested improvements**.
- Refactored solutions and test cases are expected to follow **best practices**.
- SQL queries (if any) will be provided in English within the code comments.

Happy Refactoring! 🚀

