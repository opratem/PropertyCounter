import java.util.Collection;
import java.util.function.Predicate;

public class PropertyCounter {

    // Counting elements with a specific property using generic method
    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> propertyCheck) {
        int count = 0;
        for (T element : collection) {
            if (propertyCheck.test(element)) {
                count++;
            }
        }
        return count;
    }
}

  // Predicate to check if a number is prime
  public static Predicate<Integer> isPrime() {
    return number -> {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    };
}