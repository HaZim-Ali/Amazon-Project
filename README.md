# Amazon-Project

This project is an automated testing framework for the Amazon website, implemented using Selenium WebDriver and Cucumber in a Page Object Model (POM) structure.
It automates critical workflows such as user login, Select category, cart validation, Add products.



# Table of Contents
1- Overview

2- Project Structure

3- Test Scenarios

4- Setup Instructions

5- Technologies Used

6- Execution

7- Reporting

8- Contributing

9- Author


# Overview
This automation project is designed to validate the functionality of the Amazon website.
The framework leverages Cucumber for behavior-driven testing and Selenium for browser automation.
The code is structured following the Page Object Model (POM) for improved readability, maintainability, and reusability.


# Project Structure
The following is the directory structure of the project:

```

_**Amazon-Project/
│
├── resources/
│   └── Features/
│       ├── AddProduct2.feature
│       ├── AddProducts.feature
│       ├── Cart.feature
│       ├── Login.feature
│       └── SelectCategory.feature
│
└── test/
└── java/
├── Locators/
│   ├── AddProduct2_Locate.java
│   ├── AddProducts_Locate.java
│   ├── Cart_Locate.java
│   ├── Login_Locate.java
│   └── SelectCategory_Locate.java
│
│
├── StepDefinitions/
│   ├── AddProduct2_Steps.java
│   ├── AddProducts_Steps.java
│   ├── Cart_Steps.java
│   ├── Hooks.java
│   ├── Login_Steps.java
│   └── SelectCategory_Steps.java
│
└── TestRunners/
└── Runner.java
├── Resources/
│   ├── extent.properties
│   ├── pdf-config.yaml
│   └── spark-config.xml

```

# Key Components
* Features: Contains Cucumber .feature files describing test scenarios in Gherkin syntax.
* Locators: Contains classes for element locators implementing the Page Object Model.
* StepDefinitions: Houses step definitions linked to feature files.
* TestRunners: Contains the runnerClass.java file to execute tests.
* Resources: Includes configuration files for reporting (ExtentReports, YAML, XML).


# Test Scenarios
The following scenarios are covered in this project:

* AddProducts2 Functionality
  Verify the user add new scooter to the cart.

* AddProducts Functionality
  Validate that products can be added to the cart.

* Cart Functionality
  Ensure the cart displays the correct items and prices added to cart.

* Login Calculation
  Verify the login process when finished added to cart.

* Select Category Process
  Verify that users can select category to add products.



# Setup Instructions
**Prerequisites**

Ensure you have the following tools installed on your machine:

* **Java Development Kit (JDK):** Version 8 or higher.
* **Maven:** For dependency management.
* **IDE:** IntelliJ IDEA (recommended) or Eclipse.
* **Browser Drivers:** ChromeDriver (configured in system PATH).




# Technologies Used
* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **Test Framework:** Cucumber
* **Build Tool:** Maven
* **Reporting:** ExtentReports (HTML & PDF)
* **IDE:** IntelliJ IDEA



# Execution

## **Run Tests Using Maven**

Execute the tests using the following Maven command:

`mvn test

**Run Tests from IDE**

1. Navigate to the runnerClass.java file in the TestRunners package.
2. Right-click and select Run.



# Reporting
Test execution reports are generated using **ExtentReports**.
The following report formats are supported:

1. **HTML Reports:** Detailed visual reports.
2. **PDF Reports:** Configurable via pdf-config.yaml.
   Reports will be saved in the target directory after test execution.



# Contributing
Contributions are welcome! If you would like to improve this project:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description of the changes.



# Author
Developed by **Eng.HaZim Aly**.

For inquiries or collaboration, feel free to reach out:

**Email:** hazimaly5@gmail.com

**LinkedIn:** www.linkedin.com/in/hazim-aly-161476325






# Future Enhancements
* **Parallel Execution:** Implement parallel test execution using TestNG or Cucumber.
* **CI/CD Integration:** Integrate with Jenkins or GitHub Actions for automated test runs.
* **Data-Driven Testing:** Use external data sources (Excel, JSON).
* **Cross-Browser Testing:** Add support for Firefox and Edge browsers.








