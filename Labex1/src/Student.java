// Student class implements both interfaces
class Student implements TotalCalculator, AverageCalculator {

    // Method to calculate total of two marks
    public int calculateTotal(int m1, int m2) {
        return m1 + m2;
    }

    // Method to calculate average of two marks
    public double calculateAverage(int m1, int m2) {
        // Using 2.0 to ensure floating-point division for accurate average
        return (m1 + m2) / 2.0;
    }
}