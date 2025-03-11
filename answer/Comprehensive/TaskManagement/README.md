# Comprehensive Task Management System - Refactoring Exercise

## Overview
This project is a **task management system** that has evolved over time but has become increasingly unmaintainable due to poor architectural decisions, inconsistent practices, and missing documentation. Your goal is to refactor the system while preserving its core functionality, improving scalability, and ensuring maintainability.

## Issues to Address
- **Poor code structure and design decisions**: responsibilities are mixed, soft deletion is inconsistently applied.
- **Inefficient data handling**: missing generics, inefficient indexing, and raw string storage.
- **Concurrency and scalability issues**: no thread-safety, unfinished event-driven processing, and poor workload balancing.
- **Security flaws**: excessive data exposure, missing validation, and inconsistent permission checks.
- **Incomplete design pattern implementations**: Repository, Observer, and Factory patterns are half-implemented.

## Tasks
1. **Write JUnit test cases** for task creation, assignment, and user management.
2. **Refactor the code** to implement proper design patterns, improve maintainability, and optimize performance.
3. **Enhance security and scalability**: optimize task lookup, secure API methods, and implement soft deletion.

## Bonus Challenge
- Implement **real-time event-driven processing** (Kafka, RabbitMQ, etc.).
- Support **multi-user task collaboration** with role-based permissions.
- Store **historical changes** to track task updates.

Good luck! 🚀
