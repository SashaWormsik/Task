package lesson3.additionalTask;

public class Main {
    public static void main(String[] args) {
        Cars bys = new Cars("Volkswagen", 50, 12, 2, 2, 199);
        Cars golf = new Cars("Honda", 40, 8, 5, 6, 1988);
        Cars.comparisonCarByYear(bys, golf);
        Cars.tripDistanceDetermination(bys, golf);
    }
}
