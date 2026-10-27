package app;

public class Student {

    public static final int MIN_ALBUM_LENGTH = 5;

    private String name;
    private final String albumNumber;

    public Student(String name, String albumNumber) {
        setName(name);
        if (albumNumber == null || albumNumber.trim().length() < MIN_ALBUM_LENGTH) {
            throw new IllegalArgumentException("Numer albumu musi mieć co najmniej " + MIN_ALBUM_LENGTH + " znaków!");
        }
        this.albumNumber = albumNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste!");
        }
        this.name = name;
    }
    public String getAlbumNumber() {
        return albumNumber;
    }
    public void updateName(String newName) {
        setName(newName);
    }
    public void updateName(String firstName, String lastName) {
        setName(firstName + " " + lastName);
    }
}