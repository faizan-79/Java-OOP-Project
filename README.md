# 🚗 Vehicle Management System - Java OOP Demo

This is a simple Java project built in **IntelliJ IDEA** to demonstrate key **Object-Oriented Programming (OOP)** concepts:

- ✅ Encapsulation
- ✅ Inheritance
- ✅ Polymorphism  

## 📁 Project Structure
```VehicleManagementSystem/
├── src/
│ └── oop/
│ ├── Vehicle.java
│ ├── Car.java
│ ├── Bike.java
│ └── Main.java

---

## 🔍 Description of Each File

### `Vehicle.java`
- **Type**: Base (Parent) class
- **Concept**: **Encapsulation**
- Fields `brand` and `year` are private with public getters.
- Contains common methods: `start()` and `displayInfo()`.

### `Car.java`
- **Type**: Child class (extends `Vehicle`)
- **Concepts**: **Inheritance** and **Polymorphism**
- Adds a `numberOfDoors` field.
- Overrides `start()` and `displayInfo()`.

### `Bike.java`
- **Type**: Child class (extends `Vehicle`)
- **Concepts**: **Inheritance** and **Polymorphism**
- Adds a `hasCarrier` field.
- Overrides `start()` and `displayInfo()`.

### `Main.java`
- **Type**: Entry point of the program.
- **Usage**:
  - Creates `Car` and `Bike` objects using `Vehicle` reference.
  - Demonstrates polymorphism by calling overridden methods.
  - Demonstrates encapsulation by avoiding direct field access.

---

## ▶️ How to Run

1. **Open IntelliJ IDEA**.
2. Go to `File > Open` and open the folder:  
   `D:\Selenium WebDriver Java E2E Project\VehicleManagementSystem`
3. Locate `Main.java` inside `src/oop/`.
4. Right-click on `Main.java` → Click **Run 'Main.main()'**

---

## 💡 Output (Sample)
```
Car is starting with key ignition...
Brand: Toyota, Year: 2022
Doors: 4

Bike is starting with a kick...
Brand: Honda, Year: 2021
Has Carrier: true