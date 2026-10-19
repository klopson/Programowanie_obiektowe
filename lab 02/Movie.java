class Movie {
    String title;
    int durationMinutes;

    public Movie(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public void showMovieInfo() {
        System.out.println("Film: " + title + " (" + durationMinutes + " min)");
    }
}