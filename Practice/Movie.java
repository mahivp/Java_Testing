package Practice;

public class Movie {

    String name;
    String director;
    int releaseYear;
    String hero;
    double rating;

    public void getName() {
        System.out.println("Title of the Movie is: " + name);
    }

    public void getDirector() {
        System.out.println("Director of the Movie is: " + director);
    }

    public void getReleaseYear() {
        System.out.println("Release Year: " + releaseYear);
    }

    public void gethero() {
        System.out.println("Genre: " + hero);
    }

    public void getRating() {
        System.out.println("Rating: " + rating + "/10");
    }

    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.name = "Eega";
        myMovie.director = "S. S. Rajamouli";
        myMovie.releaseYear = 2012;
        myMovie.hero = "Mahesh Babu";
        myMovie.rating = 7.7;

        myMovie.getName();
        myMovie.getDirector();
        myMovie.getReleaseYear();
        myMovie.gethero();
        myMovie.getRating();
    }
}
