# Massive Logistics Event System - Refactoring Exercise (Comprehensive Expansion)

## Overview
This project **expands** on the existing Logistics Event System with **more flawed components**, including a broken warehouse system, security vulnerabilities, and missing validations.

## New Issues to Address
- **Delivery service does not validate orders before dispatching**, leading to errors.
- **Warehouse storage is inefficient**, leading to incorrect allocations and stockouts.
- **Orders can be duplicated**, as there’s no validation before placing them.
- **Canceling an order does not trigger refunds**, leading to financial inconsistencies.
- **Security issues**: Tokens are stored **in memory** and never expire.
- **Event-driven architecture is mismanaged**: Orders are processed without checking stock.

## New Tasks
1. **Write additional JUnit tests** for warehouse allocation, security validation, and order placement.
2. **Refactor the event system** to ensure events are handled **in the correct sequence**.
3. **Fix security vulnerabilities** by implementing **secure token management**.
4. **Implement proper rollback mechanisms** for warehouse and order cancellations.

## Bonus Challenge
- Implement **rate-limiting** in authentication to prevent brute-force attacks.
- Introduce **automatic reallocation of warehouse storage** for inventory optimization.
- Ensure **orders are processed atomically**, preventing duplicates.

Good luck! 🚀
