# Real-Time Messaging - Refactoring Exercise (Hard)

## Overview
This exercise involves refactoring a **real-time messaging system**. The provided implementation has significant structural, performance, and security issues. Your task is to refactor the system to ensure **scalability, security, and maintainability**.

## Issues to Address
1. **Raw Type Usage**:
    - The `List` and `Map` should use generics for type safety.
2. **Weak Error Handling**:
    - Sending a message to a non-existent user should throw an exception.
    - Registering an existing user should be properly handled.
3. **Inefficient Data Handling**:
    - Messages are stored as concatenated strings rather than structured objects.
    - Message retrieval involves inefficient filtering.
4. **Poor System Scalability**:
    - Searching messages using string operations is not scalable.
    - User management is inefficient and not thread-safe.
5. **Security Vulnerabilities**:
    - No authentication or authorization mechanisms.
    - Messages can be accessed by any user.
6. **Concurrency Issues**:
    - No synchronization, leading to potential race conditions.
7. **Design Pattern Improvements**:
    - Introduce a **Repository Pattern** for message storage.
    - Use a **Singleton Pattern** for user management.
    - Implement **Observer Pattern** for real-time message notifications.

## Tasks
1. **Write JUnit test cases** to verify real-time messaging operations.
2. **Refactor the code** to:
    - Use appropriate data structures and type safety.
    - Improve message storage and retrieval efficiency.
    - Apply design patterns where necessary.
3. **Enhance Security & Performance**:
    - Introduce authentication mechanisms.
    - Optimize message retrieval and user lookup.

## Bonus Challenge
- Implement **WebSockets** for real-time communication.
- Introduce a **database layer** for persistent message storage.

Good luck! 🚀

