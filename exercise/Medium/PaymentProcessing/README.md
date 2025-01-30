# Payment Processing - Refactoring Exercise (Medium)

## Overview
This exercise involves refactoring a **payment processing system**. The provided implementation has multiple structural and logical issues, lacks proper validation, and does not follow best practices. Your task is to refactor the system to improve **robustness, maintainability, and efficiency**.

## Issues to Address
1. **Raw Type Usage**:
    - The `List` should use generics to ensure type safety.
2. **Weak Error Handling**:
    - Processing a payment with a negative amount should throw an exception.
    - Attempting to refund a transaction that does not exist should be properly handled.
3. **Poor Data Validation**:
    - No validation for duplicate transactions.
    - No validation to prevent negative total revenue.
4. **Inefficient Data Handling**:
    - Uses `Object` in loops instead of properly typed variables.
    - Uses inefficient string concatenation in `generateReport` (should use `StringBuilder`).
5. **Design Pattern Improvements**:
    - Introduce a **Factory Pattern** for transaction creation.
    - Use a **Strategy Pattern** for handling different payment methods.
6. **Separation of Concerns**:
    - Move payment processing logic into a dedicated service class.
    - Introduce a `Transaction` class instead of using raw strings for transaction IDs.

## Tasks
1. **Write JUnit test cases** to verify payment processing operations.
2. **Refactor the code** to:
    - Use proper data structures and type safety.
    - Improve error handling and validation.
    - Introduce design patterns where applicable.
3. **Enhance Maintainability & Performance**:
    - Use `StringBuilder` for report generation.
    - Improve transaction lookup efficiency.

## Bonus Challenge
- Implement **database persistence** for transaction storage.
- Add support for **multiple payment methods** using polymorphism.

Good luck! 🚀