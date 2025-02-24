package objectOrientation.methodOverloading.test;

import objectOrientation.methodOverloading.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie grandFather = new Movie();
        grandFather.init("Grand Father", "Drama", 10);
        grandFather.print();
    }
}
