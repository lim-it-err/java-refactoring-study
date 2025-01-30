# IoT Device Management System - Refactoring Exercise

## Overview
This project simulates an **IoT Device Management System** that has become unmanageable due to conflicting optimizations, half-baked async logic, and missing documentation. Your goal is to refactor the system while preserving its core functionality, improving concurrency handling, and ensuring scalability.

## Issues to Address
- **Poor async handling**: Some parts of the system attempt async processing but remain incomplete.
- **Inefficient data storage**: Devices are stored in-memory with no proper validation.
- **Concurrency and scalability issues**: No proper thread safety; async operations may lead to race conditions.
- **Security flaws**: Missing access control; anyone can modify device states.
- **Design patterns applied inconsistently**: Repository pattern is partially implemented, async logic is scattered.

## Tasks
1. **Write JUnit test cases** for device initialization, modification, and repository operations.
2. **Refactor the code** to properly use **async operations**, optimize **data handling**, and ensure **thread safety**.
3. **Enhance security and scalability**: Implement **access control**, optimize **async handling**, and fix **soft deletion inconsistencies**.

## Bonus Challenge
- Implement **real-time event-driven device monitoring** (Kafka, RabbitMQ, etc.).
- Support **device authentication and authorization** for secure operations.
- Store **historical device status logs** for debugging and analytics.

Good luck! 🚀
