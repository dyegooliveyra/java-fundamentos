package objectOrientation.initializationBlocks.test;

import objectOrientation.initializationBlocks.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie grandFather = new Movie("Grand Father", new String[]{"Al Pacino", "Robert De Niro"});

        grandFather.print();

    }
}
