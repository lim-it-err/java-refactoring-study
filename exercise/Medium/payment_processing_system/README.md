# Payment Processing System - Refactoring Exercise (Medium)

## Overview
This project simulates a **Payment Processing System** that has accumulated issues over time, including missing transaction handling, incomplete batch processing, and security concerns. Your task is to refactor the system while ensuring **data integrity, concurrency control, and robustness**.

## Issues to Address
- **Lack of transaction management**: Payments and refunds can cause inconsistencies.
- **No duplicate transaction checks**: Payments can be duplicated without validation.
- **Concurrency issues**: No proper thread safety in payment processing.
- **Security flaws**: Missing authentication for transactions.
- **Incomplete batch processing**: The async batch processor is not fully implemented.

## Tasks
1. **Write JUnit test cases** for payment processing and refund handling.
2. **Refactor the code** to implement **transaction rollback**, **duplicate validation**, and **security checks**.
3. **Enhance concurrency and scalability**: Implement **thread safety**, optimize **batch processing**, and ensure **safe concurrent execution**.

## Bonus Challenge
- Implement **distributed payment processing** with database persistence.
- Introduce **transaction history logging** for auditing and analytics.
- Add **real-time fraud detection** mechanisms.

Good luck! 🚀
