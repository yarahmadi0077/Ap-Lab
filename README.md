Here’s a detailed **README** file for your project on **Advanced Programming Lab Workshops** in the Computer Engineering Department at **Amirkabir University of Technology**. This README includes information about your focus on multithreading, JavaFX, socket programming, exception handling, and other advanced programming concepts:

---

# Advanced Programming Lab Workshops

This repository contains the **Advanced Programming Lab Workshops** for the Computer Engineering Department at **Amirkabir University of Technology (AUT)**. The workshops are designed to provide hands-on experience with various advanced programming concepts including **multithreading**, **JavaFX**, **socket programming**, **exception handling**, and more.

---

## Project Description
The project involves implementing several key concepts in modern software development, with a focus on **Java** programming. The workshops provide practice in creating robust, efficient, and scalable applications by applying advanced techniques in various domains.

### Key Features
- **Multithreading**: Implementing multi-threaded applications to manage concurrent tasks.
- **JavaFX GUI**: Building user interfaces using **JavaFX** and **FXML**, providing rich graphical user interfaces (GUIs).
- **Socket Programming**: Developing applications that communicate over networks using **sockets**.
- **Exception Handling**: Implementing proper error handling to ensure robust software that can handle unexpected situations gracefully.
- **File I/O**: Reading and writing data to files for persistent storage.
- **Data Structures**: Implementing and using common data structures like lists, queues, and maps for efficient data management.
- **Networked Applications**: Building distributed applications that run on multiple machines, handling communication and synchronization.

---

## How to Run

### Prerequisites:
- **JDK 19** (or above)
- **Maven** (for dependency management)
- **JavaFX SDK** (if not already bundled with your JDK)
- **IDE**: Use an IDE like **IntelliJ IDEA** or **Eclipse** for development.

### Setup:
1. Clone the repository:
   ```bash
   git clone https://github.com/yarahmadi0077/Advanced-Programming-Lab-Workshops.git
   cd Advanced-Programming-Lab-Workshops
   ```

2. **Install Dependencies**:
   Use Maven to install the required dependencies:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   To run the JavaFX application, use the following Maven command:
   ```bash
   mvn javafx:run
   ```

   Alternatively, you can run the Java program manually if you prefer:
   ```bash
   javac -d out src/com/yarahmadi/AdvancedProgrammingLab/*.java
   java -cp out com.yarahmadi.AdvancedProgrammingLab.Main
   ```

---

## Requirements:
- **Programming Language**: Java
- **JDK Version**: OpenJDK 19 or above
- **Maven**: For managing dependencies
- **JavaFX**: For GUI development using FXML
- **Socket Programming**: For building network-based applications

---

## Key Concepts and Implementation

### 1. **Multithreading**
   - Implemented using **Thread** and **ExecutorService** to run tasks concurrently, such as managing background tasks or handling multiple user interactions at once.

### 2. **JavaFX**
   - **FXML** is used for defining the UI structure, and **Scene Builder** is used for visual designing of the user interface.
   - Handles user interactions and updates the UI in response to user actions (e.g., button clicks, form submissions).

### 3. **Socket Programming**
   - Network communication is implemented using **Java Sockets** (TCP/IP) to allow multiple clients to communicate with a server over a network.
   - The server listens for incoming connections, while clients send and receive messages.

### 4. **Exception Handling**
   - Proper exception handling is implemented using **try-catch** blocks to ensure that errors are managed gracefully without crashing the program.
   - Custom exception classes are used to handle specific errors within the application.

### 5. **File I/O**
   - The project demonstrates reading and writing data to files to persist information such as user profiles or chat messages.

### 6. **Data Structures**
   - Various data structures like **ArrayLists**, **HashMaps**, and **Queues** are used to manage data in the application.

---

## Contribution
Contributions are welcome! If you'd like to improve the project, fix bugs, or add new features, please fork the repository and open a pull request.

---

## Contact
- **Developer**: Mohammad Yarahmadi  
  GitHub: [yarahmadi0077](https://github.com/yarahmadi0077)

- **Professors**:  
  Dr. Hossein Zeinali  
  Email: [hzeinali@aut.ac.ir](mailto:hzeinali@aut.ac.ir)  
  Dr. Amir Kalbasi  
  Email: [kalbasi@aut.ac.ir](mailto:kalbasi@aut.ac.ir)

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

---

Let me know if you need further details or any changes!
