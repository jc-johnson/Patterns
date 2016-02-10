package main.java.DependencyInjection;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jjohnson on 1/29/2016.
 */
public class MovieLister implements MovieFinder, InjectFinder{

    private MovieFinder finder;
    public MovieLister() {
            finder = new ColonDelimitedMovieFinder("movies1.txt");
    }


    public MovieLister(MovieFinder finder) { // Constructor Injection. Passing an Interface as argument
        this.finder = finder;
    }

    public void setFinder(MovieFinder finder) { // Setter injection
        this.finder = finder;
    }

    public void injectFinder(MovieFinder finder) { // Interface injection
        this.finder = finder;
    }



    public Movie[] moviesDirectedBy(String arg) {
        List allMovies = finder.findAll();
        for (Iterator it = allMovies.iterator(); it.hasNext();) {
            Movie movie = (Movie) it.next();
            if (!movie.getDirector().equals(arg))
                it.remove();
        }
        return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]);
    }

    @Override
    public List findAll() {
        return null;
    }
}
