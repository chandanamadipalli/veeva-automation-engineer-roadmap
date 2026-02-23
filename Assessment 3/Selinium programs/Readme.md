# Selenium Java Automation Framework (Maven + TestNG)

This repository contains Selenium automation test scripts developed using:

- Java
- Selenium WebDriver
- Maven
- TestNG
- WebDriverManager

This guide explains the complete setup process from project creation to execution.

---

# 1️⃣ Prerequisites

Ensure the following software is installed:

## Java (JDK 11 or higher)

Verify installation:
```bash
java -version
```

## Eclipse IDE

Install:
Eclipse IDE for Enterprise Java and Web Developers

Make sure Maven support is included.

## Google Chrome

Latest version recommended.

---

# 2️⃣ Create Maven Project in Eclipse

1. Open Eclipse
2. File → New → Maven Project
3. Select "Create a simple project"
4. Click Next
5. Enter:

Group Id:
```
com.yourname
```

Artifact Id:
```
selenium-automation
```

Packaging:
```
jar
```

6. Click Finish

---

# 3️⃣ Replace pom.xml With This

Open `pom.xml` and replace everything with:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.yourname</groupId>
    <artifactId>selenium-automation</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>

        <!-- Selenium -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.18.1</version>
        </dependency>

        <!-- WebDriverManager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.7.0</version>
        </dependency>

        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.9.0</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>

            <!-- Runs TestNG tests -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.2.5</version>
            </plugin>

        </plugins>
    </build>

</project>
```

Right-click project → Maven → Update Project

---

# 4️⃣ Project Folder Structure

```
selenium-automation
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       └── java
│           └── tests
│               └── GoogleTest.java
│
├── pom.xml
└── testng.xml
```

---

# 5️⃣ Create Test Class

Go to:

src/test/java

Create package:
```
tests
```

Create file:
```
GoogleTest.java
```

Paste:

```java
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
```

---

# 6️⃣ Create testng.xml

Create a file in project root:

```
testng.xml
```

Paste:

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="TestSuite">
    <test name="Google Test">
        <classes>
            <class name="tests.GoogleTest"/>
        </classes>
    </test>
</suite>
```

---

# 7️⃣ How To Execute

## Option 1: Run From Eclipse

Right-click `testng.xml`  
Run As → TestNG Suite

---

## Option 2: Run From Command Line (Recommended)

Open terminal in project folder:

```bash
mvn clean test
```

---

# 8️⃣ Reports Location

After execution, reports are generated inside:

```
target/surefire-reports
```

---

# 9️⃣ Files To Upload To GitHub

Upload:
- pom.xml
- src folder
- testng.xml
- README.md

Do NOT upload:
- target folder
- .settings
- .classpath
- .project

---

# 10️⃣ Add .gitignore

Create `.gitignore` file:

```
target/
.settings/
.classpath
.project
```

---

# Execution Flow

1. Maven reads pom.xml
2. Downloads Selenium, TestNG, WebDriverManager
3. Surefire plugin runs TestNG
4. TestNG reads testng.xml
5. WebDriverManager downloads correct ChromeDriver
6. Test executes
7. Reports generated

---

# Author

Selenium Automation Framework built using Java, Maven, and TestNG.
