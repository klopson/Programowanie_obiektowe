package app;

public class ExamResults {
    private final int[] points;


    public ExamResults(int[] points) {
        if (points == null) {
            this.points = new int[0];
        } else {
            this.points = points.clone(); // robimy kopię tablicy bez klasy Arrays
        }
    }


    public int[] getPoints() {
        return this.points.clone(); // zwracamy kopię, a nie oryginał
    }
}