📘 School Management System – Java

A simple Java-based console application that demonstrates Object-Oriented Programming (OOP) concepts through a School Management System.
The system allows users to manage Students, Teachers, and School-level information like total money earned and spent.

🧠 Concepts Demonstrated in This Project
✅ 1. Object-Oriented Programming (OOP)

This project strongly demonstrates all the core OOP concepts:

• Classes & Objects

Student, Teacher, and School classes represent real-world entities.

Objects are created dynamically based on user input.

• Encapsulation

All properties (id, name, salary, grade, etc.) are private.

Access is controlled using getters and setters.

• Abstraction

Complex logic is hidden inside methods like:

Student.payFees()

teacher.setSalary()

School.updatedTotalMoneyEarned()

Main program interacts with simple method calls.

• Polymorphism (Basic form)

Overloading / using different methods with same name for updating money flows.

Can be extended for showcasing runtime polymorphism.

• Static Members

totalMoneyEarned and totalMoneySpent are static, meaning they belong to the school, not individual objects.

students list is static to represent the school-wide student registry.

✅ 2. Collections Framework

Uses List, ArrayList to store multiple Teachers and Students dynamically.

Demonstrates adding and iterating over collection elements.

Examples:

List<Teacher> teachersList = new ArrayList<>();
List<Student> students = new ArrayList<>();

✅ 3. User Input Handling (Scanner Class)

Interactive console-based input using:

Scanner s = new Scanner(System.in);


Reads data such as ID, Name, Grade, Salary, Fees, etc.

✅ 4. Control Flow & Looping Constructs

switch-case used for menu-based navigation.

do-while loop to continuously show menu until user exits.

Demonstrates branching using conditional logic.

✅ 5. Package Management

All classes are grouped inside package:

package school.management.system;


Shows real-world project structuring.

✅ 6. Separation of Concerns

Main class handles user interaction only

Student, Teacher, School classes handle data and logic

This follows a clean modular architecture.

✅ 7. Basic Financial Tracking

Tracks:

Money earned (fees paid by students)

Money spent (teacher salaries)

Demonstrates use of static variables for centralized financial management.

📁 Project Structure
school.management.system/
│
├── Main.java         // Entry point, menu-driven program
├── School.java       // Handles money flow and school-wide data
├── Student.java      // Student properties & fee management
└── Teacher.java      // Teacher properties & salary management

📌 Features Implemented

✔ Add multiple Students
✔ Add multiple Teachers
✔ Track student fee payments
✔ Track teacher salaries
✔ Calculate remaining fees
✔ Track school’s total money earned
✔ Display school financial status
✔ Menu-driven console interaction

🎉 Conclusion

This project is an excellent example of how to use OOP principles, collections, static variables, abstraction, and console-based user interaction to build a functioning School Management System in Java.
