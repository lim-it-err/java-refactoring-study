# Healthcare Appointment Scheduling System - Refactoring Exercise (Hard)

## Overview
This project simulates a **Healthcare Appointment Scheduling System** that has accumulated issues over time. It lacks proper conflict resolution, fails to validate overlapping appointments, and has no proper async handling for fetching schedules.

## Issues to Address
- **Overlapping appointments**: No validation for scheduling conflicts.
- **Threading issues**: Async retrieval exists but is not consistently applied.
- **Scalability flaws**: The appointment repository uses an inefficient in-memory list.
- **Security concerns**: No authentication mechanism for patient/doctor access.
- **Incomplete design patterns**: No proper use of Factory or Observer patterns.

## Tasks
1. **Write JUnit test cases** for appointment scheduling, retrieval, and validation.
2. **Refactor the code** to implement **overlap detection**, **efficient scheduling**, and **security enhancements**.
3. **Enhance scalability and concurrency**: Implement **better async handling**, optimize **data storage**, and **prevent conflicting bookings**.

## Bonus Challenge
- Implement **database-backed appointment persistence**.
- Introduce **notification alerts** for appointment confirmations.
- Add **role-based authentication** for doctors and patients.

Good luck! 🚀
