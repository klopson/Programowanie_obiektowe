package app;

public class Course {

    public static final int DEFAULT_MAX_STUDENTS = 30;

    private String name;
    private int maxStudents;
    private static int numberOfCreatedCourses = 0;

    public Course(String name) {
        this(name, DEFAULT_MAX_STUDENTS);
    }
    public Course(String name, int maxStudents) {
        setName(name);
        setMaxStudents(maxStudents);
        numberOfCreatedCourses++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa kursu nie może być pusta!");
        }
        this.name = name;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public void setMaxStudents(int maxStudents) {
        if (maxStudents <= 0) {
            throw new IllegalArgumentException("Maksymalna liczba studentów musi być większa od 0!");
        }
        this.maxStudents = maxStudents;
    }
    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }
}