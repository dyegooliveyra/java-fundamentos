package objectOrientation.methodOverloading.domain;

public class Movie {
    String name;
    String genre;
    int rating;

    public void init (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void init (String name, String genre, int rating) {
        this.init(name, genre);
        this.rating = rating;
    }

    public void print () {
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
