# Satincorp-Tech-Challenge

Project Description:
I have implemented this project using Java as the programing language, TestNG as the testing framework and Maven as the dependency management tool. I have followed the Page Object Model design pattern to maintain a class for each web page in the application. This approach helps in creating a clear separation between the page elements and the testcases making the code more maintainable and readable. 

Packages:
To organize the code effectively, I have utilized separate packages for Pages and Tests. This structure helps maintain a clear distinction between the page actions and the test scenarios.

The src/main/java folder contains two packages:
1. "com.PageObjects" package holds the scripts of PageObjects along with the Action methods.
2. "com.baseFile" package holds the scripts of Driver initialisation, browser setup, closing the driver etc.

The src/test/java folder contains one package "com.Testcases" which holds the testScripts.

Maven:
I have integrated Maven as dependency management tool. It helped in managing project dependencies, handle libraries. Maven ensures that all necessary dependencies are resolved and enables efficient project compilation and execution.

TestNG:
I have used TestNG as the testing framework to execute the tests.

Steps to run the Project:
1. Import this project into any IDE.
2. Simply right click on the "testng.xml" file -> Run As -> TestNG Suite.
3. Browser would be initialised and test execution will start.
