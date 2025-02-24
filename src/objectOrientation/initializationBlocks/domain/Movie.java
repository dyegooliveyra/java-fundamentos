package objectOrientation.initializationBlocks.domain;

public class Movie {
    private String name;
    private String[] actors;

    {
        if(this.actors == null) this.actors = new String[0];
        for (String actor : this.actors) {
            System.out.print(actor + ", ");
        }


    }

    public Movie(String name, String[] actors) {
        this.name = name;
        this.actors = actors;
    }

    public void print() {
        System.out.println(this.name);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
}
