# User Profile Management - Refactoring Exercise (Easy)

## Overview
This exercise involves refactoring a **user profile management system**. The provided implementation has structural issues, lacks proper validation, and does not follow best practices. Your task is to refactor the system to improve **robustness, maintainability, and security**.

## Issues to Address
1. **Raw Type Usage**:
    - The `List` should use generics for type safety.
2. **Weak Error Handling**:
    - Removing a hobby that does not exist should be properly handled.
3. **Security Risks**:
    - `getProfile` exposes all user data in an unsafe manner.
4. **Data Validation Issues**:
    - No validation for unrealistic ages (e.g., `>150` years old).

## Tasks
1. **Write JUnit test cases** to verify profile management operations.
2. **Refactor the code** to:
    - Use proper data structures and type safety.
    - Improve error handling and validation.
    - Secure user data while exposing only necessary information.
3. **Enhance Maintainability**:
    - Improve method readability and structure.
    - Add proper input validation and exception handling.

## Bonus Challenge
- Add a method to update the username with proper validation.
- Implement an **immutable user profile** using the Builder pattern.

Good luck! 🚀

