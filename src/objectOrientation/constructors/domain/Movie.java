package objectOrientation.constructors.domain;

public class Movie {
    String name;
    String genre;
    int rating;
    int year;

    public Movie(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String name, String genre, int rating, int year) {
        this(name, genre, rating);
        this.year = year;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.rating);
        System.out.println(this.year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

