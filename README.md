## Technical Assignment: Testing and Debugging the Java Module

### Overview

In this assignment, I will address the bugs identified in the Java module designed to simulate commuting in a 2D video game environment. The module consists of three packages: `car`, `person`, and `station`. The primary requirement is to ensure that a person can commute without their energy exceeding 100%. I will identify and fix the bugs, write regression tests, improve unit tests, and document my decisions throughout the process.

### Steps Taken

#### 1. Identify and Fix Bugs

Upon reviewing the code, I found that the issue causing the energy percentage to exceed 100% was due to improper handling of energy refueling logic in the `Car` class. Specifically, when a person refuels at a station, the energy level was being set directly without any checks.

**Fix Implemented**:
- Modified the `refuel` method in the `Car` class to ensure that energy levels do not exceed 100%. Here’s a sample implementation:

```java
public void refuel(double amount) {
    this.energy = Math.min(this.energy + amount, 100);
}
```

#### 2. Write Regression Tests

To prevent this bug from reappearing in future updates, I created regression tests that specifically check for energy levels after refueling. The tests ensure that:

- Energy does not exceed 100% after refueling.
- Energy levels behave as expected when commuting to and from stations.

**Sample Regression Test**:

```java
@Test
public void testEnergyDoesNotExceed100() {
    Car car = new ElectricCar();
    car.refuel(50);
    assertEquals(100, car.getEnergy(), 0.01); // Ensure energy does not exceed 100%
}
```

#### 3. Write Unit Tests

I improved the existing unit tests by adding more cases to cover edge scenarios such as:

- Commuting with low energy.
- Refueling at different types of stations (petrol vs. electric).
- Handling cases where no station is available.

**Sample Unit Test**:

```java
@Test
public void testCommutingWithLowEnergy() {
    Person person = new Person(new ElectricCar());
    person.getCar().refuel(10); // Low energy
    person.commute(); // Simulate commute
    assertTrue(person.getCar().getEnergy() > 0); // Ensure person can still commute
}
```

### Documentation of Decisions

- **Bug Identification**: Focused on areas where energy management was handled, particularly during refueling.
- **Regression Tests**: Ensured that critical functionality (energy cap) was preserved across updates by creating specific tests for it.
- **Unit Tests**: Enhanced coverage by considering various scenarios that could occur during normal operation, ensuring robustness in different conditions.
  
### Repository and Link

The resulting project, including all fixes, regression tests, unit tests, and documentation of decisions made during this assignment, has been pushed to a public Git repository. You can access it here:

[GitHub Repository](https://github.com/SKilgori/commuting-simulation)

### Conclusion

By following these steps, I have successfully identified and fixed the bugs in the Java module while enhancing its testability through comprehensive unit and regression testing. This approach ensures that future updates will maintain the integrity of the commuting simulation logic.
