class Screening {
    Movie movie;
    String time;

    public Screening(Movie movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    public void showScreening() {
        movie.showMovieInfo();
        System.out.println("Godzina seansu: " + time);
    }
}