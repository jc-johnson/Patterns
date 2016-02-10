package main.java.DependencyInjection;

/**
 * Created by jjohnson on 2/5/2016.
 */
public class ColonMovieFinder {

    String filename;


    public ColonMovieFinder(String filename) {
        this.filename = filename;
    } // Constructor injection

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
