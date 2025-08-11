Got it ✅ — you want a beginner-friendly, SDET-aligned Java training README.md covering:

Class & Object
OOPs Concepts
Encapsulation
Polymorphism
with 3 quizzes and an assessment section, using SDET-relevant examples (test automation / QA context).
I’ll make it structured so it works as both a teaching guide and a practice reference for your trainees.

📄 README.md — Java OOPs for SDET Trainees
Java OOPs for SDET Trainees
Level: Beginner (Fresh Graduates)
Domain: Software Development Engineer in Test (SDET)

📚 1. Introduction
As an SDET, understanding Java OOP concepts is crucial — not just for building applications, but also for designing test frameworks in tools like Selenium, RestAssured, and Appium.

This guide will help you master:

Creating classes & objects
Understanding OOP pillars (Encapsulation, Polymorphism, etc.)
Writing clean, maintainable automation code
🧱 2. Java Class & Object
Class
A class is a blueprint or template for creating objects.
In automation, a class might represent a Page Object, API Request, or Test Data Model.

// Example: Class for a TestCase in automation
public class TestCase {
    String name;
    String status;

    void runTest() {
        System.out.println("Running test: " + name);
    }
}
Object
An object is an instance of a class.
It holds actual data and can call the class methods.

public class Main {
    public static void main(String[] args) {
        TestCase tc = new TestCase(); // creating object
        tc.name = "Login Test";
        tc.status = "Not Executed";
        tc.runTest();
    }
}
🏛 3. OOP Concepts Overview
Four Pillars of OOP:

Encapsulation — Hiding internal details and exposing only required functionality.
Inheritance — Reusing code by inheriting from other classes.
Polymorphism — Ability to perform a single action in different ways.
Abstraction — Hiding implementation details, showing only essentials.
For this lesson, we’ll focus more on Encapsulation & Polymorphism (heavily used in SDET frameworks).

🔒 4. Encapsulation
Definition
Encapsulation is wrapping data (variables) and code (methods) into a single unit and restricting direct access to them.

Example in SDET Context
public class LoginPage {
    private String username;
    private String password;

    // public getter and setter
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void performLogin() {
        System.out.println("Logging in with: " + username + " / " + password);
        // Selenium code here...
    }
}

public class TestLogin {
    public static void main(String[] args) {
        LoginPage login = new LoginPage();
        login.setUsername("admin");
        login.setPassword("pass123");
        login.performLogin();
    }
}
Why SDETs care?
Encapsulation ensures test scripts don’t access web elements or data directly, making the framework maintainable.

🔄 5. Polymorphism
Definition
Polymorphism means "many forms" — same method name behaving differently depending on the context.

Types
Compile-time Polymorphism (Method Overloading)
Runtime Polymorphism (Method Overriding)
1. Method Overloading — Example
public class TestLogger {
    public void log(String message) {
        System.out.println("INFO: " + message);
    }
    public void log(String message, String level) {
        System.out.println(level.toUpperCase() + ": " + message);
    }
}

public class TestMain {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger();
        logger.log("Test Started");
        logger.log("Test Failed", "error");
    }
}
2. Method Overriding — Example in Automation
class BaseTest {
    public void executeTest() {
        System.out.println("Executing base test logic");
    }
}

class UITest extends BaseTest {
    @Override
    public void executeTest() {
        System.out.println("Executing UI test logic");
        // Selenium code here...
    }
}

public class TestRunner {
    public static void main(String[] args) {
        BaseTest test = new UITest(); // Runtime polymorphism
        test.executeTest();
    }
}
📝 6. Quiz Section
Quiz 1 — Class & Object
What is the difference between a class and an object?
In the code below, what will be printed?
TestCase tc = new TestCase();
tc.name = "API Test";
tc.status = "Passed";
System.out.println(tc.name);
True or False: One class can create multiple objects.
Quiz 2 — Encapsulation
Why do we use private variables in encapsulation?
How do getters and setters help in encapsulation?
Identify the problem in this code:
class Page {
    String url;
}
Quiz 3 — Polymorphism
What is method overloading?
What is method overriding?
Give a real-time automation example where polymorphism is useful.
💡 7. Assessment Task
Scenario:
You are building a mini automation framework for a login test.

Requirements:

Create a BaseTest class with a method executeTest().
Create WebTest and ApiTest classes that override executeTest() with their own logic.
Create a LoginPage class using encapsulation:
Private variables for username & password
Setters & a method performLogin()
In the TestRunner class:
Create objects for both WebTest and ApiTest
Call executeTest() for each
Create a LoginPage object, set credentials, and perform login