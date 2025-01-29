# Inventory Management - Refactoring Exercise (Medium)

## Overview
This exercise involves refactoring an **inventory management system**. The provided implementation has structural issues, lacks proper validation, and does not follow best practices. Your task is to refactor the system to improve **scalability, maintainability, and efficiency**.

## Issues to Address
1. **Raw Type Usage**:
   - The `Map` should use generics to ensure type safety.
2. **Weak Error Handling**:
   - Adding a product with a negative quantity should throw an exception.
   - Removing more stock than available should be properly handled.
3. **Poor Data Validation**:
   - The system does not check for null or invalid product IDs.
4. **Inefficient Data Handling**:
   - Uses `Object` in loops instead of properly typed variables.
   - Uses inefficient string concatenation in `generateReport` (should use `StringBuilder`).
5. **Design Pattern Improvements**:
   - Introduce a **Factory Pattern** for product creation.
   - Use a **Strategy Pattern** for different stock management strategies.
6. **Separation of Concerns**:
   - Move inventory logic into a dedicated service class.
   - Create a `Product` class instead of using raw strings for product IDs.

## Tasks
1. **Write JUnit test cases** to verify inventory management operations.
2. **Refactor the code** to:
   - Use proper data structures and type safety.
   - Improve error handling and validation.
   - Introduce design patterns where applicable.
3. **Optimize Performance**:
   - Use `StringBuilder` for report generation.
   - Improve iteration logic for scalability.

## Bonus Challenge
- Implement **database persistence** for inventory storage.
- Add support for **different product categories** using inheritance or composition.

Good luck! 🚀

