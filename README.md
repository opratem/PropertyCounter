# PropertyCounter for Prime Numbers

This project implements a generic method in Java to count the number of elements in a collection that satisfy a specific property. For this version, the focus is on counting **prime numbers** in a collection.

## Features

- A generic method that accepts a collection and a predicate to evaluate elements.
- Flexible design to work with any collection of integers.

## How It Works

### Generic Method
The `countElementsWithProperty` method iterates over a collection, applies a predicate to each element, and counts how many elements satisfy the condition.

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // A collection of numbers to check
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Count the prime numbers in the collection
        int primeCount = PropertyCounter.countElementsWithProperty(numbers, PropertyCounter.isPrime());

        // Output the result
        System.out.println("Count of prime numbers: " + primeCount);
    }
}
```
