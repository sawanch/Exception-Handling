# Exception-Handling

# Java Interview Questions and Answers

## Table of Contents
1. [Specific Exceptions vs. Generic Exception](#specific-exceptions-vs-generic-exception)
2. [Closing the Scanner Class in Java](#closing-the-scanner-class-in-java)
3. [Difference Between throw and throws in Java](#difference-between-throw-and-throws-in-java)
4. [What is Throwable in Java?](#what-is-throwable-in-java)

---

### Specific Exceptions vs. Generic Exception
**Question:** Why use specific exceptions like `NullPointerException`, `NumberFormatException` instead of a generic `catch(Exception e)`?

**Answer:** Specific exceptions allow for more precise and meaningful error handling, improve code readability and maintenance, prevent catching unintended exceptions, and are considered best practice in exception handling.

---

### Closing the Scanner Class in Java
**Question:** Why is it necessary to close the Scanner class in Java?

**Answer:** Closing a `Scanner` is important for resource management, especially when it's connected to external resources (like files). It prevents resource leaks and file locking issues. However, be cautious with Scanner objects that wrap `System.in`, as closing them will also close `System.in`.

---

### Difference Between throw and throws in Java
**Question:** What is the difference between `throw` and `throws` in Java?

**Answer:** `throw` is used to explicitly throw an exception, while `throws` is used in a method declaration to indicate that the method might throw certain exceptions. `throw` interrupts the program flow, whereas `throws` passes the responsibility of exception handling to the method's caller.

---

### What is Throwable in Java?
**Question:** Explanation of what `Throwable` is in Java.

**Answer:** `Throwable` is the superclass of all errors and exceptions in Java. It's used for error and exception handling, with two main subclasses: `Error` (used for serious system-level problems) and `Exception` (used for conditions that a program might want to catch).
