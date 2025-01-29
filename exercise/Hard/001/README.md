# Bank Transaction Processor - Refactoring Exercise (Hard)

## Overview
This exercise involves refactoring a **bank transaction processing system** that contains multiple critical issues, including **multithreading concerns, security vulnerabilities, and performance bottlenecks**. Your task is to refactor the system to make it safe, scalable, and maintainable.

## Issues to Address
1. **Raw Type Usage**:
    - The `Map` and `List` should use generics for type safety.
2. **Weak Error Handling**:
    - Depositing negative amounts should throw an exception.
    - Withdrawing from an insufficient balance should properly handle errors.
3. **Concurrency Issues**:
    - No synchronization is used, leading to race conditions when multiple transactions occur simultaneously.
4. **Potential Security Vulnerabilities**:
    - Transactions are stored as raw strings, which can be easily manipulated.
    - Input validation is weak, leading to potential data corruption.
5. **Performance Bottlenecks**:
    - `processBatchTransactions` uses inefficient string parsing and does not handle exceptions properly.
6. **Design Pattern Improvements**:
    - Use a **Command Pattern** for transaction processing.
    - Introduce a **Factory Pattern** to create secure transaction objects.
    - Implement **Thread-Safe Transaction Handling**.

## Tasks
1. **Write JUnit test cases** to validate transaction behavior.
2. **Refactor the code** to:
    - Introduce synchronization for thread-safe execution.
    - Apply appropriate exception handling and logging.
    - Implement design patterns for better transaction management.
3. **Ensure Performance & Security**:
    - Optimize batch processing for better scalability.
    - Prevent unauthorized transaction modifications.

## Bonus Challenge
- Implement **real-time transaction processing** using multithreading.
- Introduce a **database layer** for persistent transaction storage.

Good luck! 🚀

