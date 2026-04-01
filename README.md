# Selenium Automation Framework

## 🚀 Overview

This is a scalable and maintainable Selenium automation framework built using Java, TestNG, and Maven. The framework
follows best practices like Page Object Model (POM), ThreadLocal WebDriver, and CI/CD integration.

---

## 🧱 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Allure Reports
- Jenkins
- GitHub Actions

---

## 🏗️ Framework Design

- **ThreadLocal WebDriver** → Supports parallel execution
- **Page Object Model (POM)** → Separation of UI and test logic
- **Config-driven** → No hardcoded values
- **Utility Layer** → Reusable waits and screenshots
- **Listeners** → Screenshot on failure
- **Data-driven testing** → TestNG DataProvider
- **Retry mechanism** → Handles flaky tests

---

## 🔄 CI/CD

- GitHub Actions for automated test execution
- Jenkins pipeline for continuous integration
- Allure reports for detailed test reporting

---

## ▶️ How to Run

```bash
mvn clean test