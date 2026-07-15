---

## 📄 Ride Sharing Booking Manager

### 🚀 Project Overview
This Java console application simulates a ride-sharing booking system. It allows users to manage ride requests using object-oriented programming, linked lists, sorting algorithms, and recursion. The system is menu-driven and supports dynamic ride management.

---

### 🧱 Technologies Used
- Java (OOP, Collections, Recursion)
- Console-based UI
- Custom singly linked list

---

### 📦 File Structure
| File | Description |
|------|-------------|
| `RideRequest.java` | Defines the ride request object with attributes and display method |
| `RideNode.java` | Node class for singly linked list containing a `RideRequest` |
| `RideList.java` | Manages linked list operations, sorting, and recursion |
| `RideSharingBookingManager.java` | Main class with menu-driven interface for user interaction |

---

### 🧩 Features
- **Add Ride Request**: Create and store a new ride
- **Delete Ride Request**: Remove a ride by ID
- **Search Ride Request**: Find and display a ride by ID
- **Display All Rides**: Show all stored rides
- **Sort by Fare**: Sort rides using insertion sort
- **Reverse Print**: Recursively display rides in reverse order
- **Total Fare Calculation**: Recursively sum all fares
- **Exit**: Cleanly terminate the program

---

### 🛠️ How to Run
1. Compile all `.java` files:
   ```bash
   javac RideRequest.java RideNode.java RideList.java RideSharingBookingManager.java
   ```
2. Run the main program:
   ```bash
   java RideSharingBookingManager
   ```

---

### 📌 Sample Input
```
Enter Ride ID: 101
Enter Passenger Name: Vele
Enter Pickup Location: Univen Main Gate
Enter Dropoff Location: Thavhani
Enter Fare: 30.00
```

---

### 📚 Concepts Demonstrated
- **Encapsulation**: Private fields with public getters/setters
- **Linked List**: Custom implementation for dynamic ride storage
- **Sorting**: Insertion sort applied to ride fares
- **Recursion**: Used for reverse printing and total fare calculation
- **Modular Design**: Clean separation of logic across classes

---

### 👨‍💻 Author
**Vele Phophi**  
Computer Science student  
Focused on modular design, usability, and professional documentation

---

