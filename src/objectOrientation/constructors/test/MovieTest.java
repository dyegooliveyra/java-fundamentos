package objectOrientation.constructors.test;


import objectOrientation.constructors.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie grandFather = new Movie("Grand Father", "Drama", 10);
        Movie theGreatGatsby = new Movie("The Great Gatsby", "Drama", 10, 1925);
        grandFather.print();
        theGreatGatsby.print();
    }
}
