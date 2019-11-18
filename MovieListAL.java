import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
        for (Movie m : movies)
        {
            pool.add(m);
        }
    }

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> studioMovies = new ArrayList<Movie>();
        for (Movie m : pool)
        {
            if (m.getStudio().equals(studio)) studioMovies.add(m);
        }
        return studioMovies;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestRating(ArrayList<Movie> movies)
    {
        Movie highestMovie = movies.get(0);
        for (Movie m : movies)
        {
            if (m.getRating()>highestMovie.getRating()) highestMovie = m;
        }
        return highestMovie;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        // Your code goes here
        highestRated.add(getHighestRating(getByStudio("Disney")));
        highestRated.add(getHighestRating(getByStudio("Ghibli")));
        highestRated.add(getHighestRating(getByStudio("Indy")));
        // return highestRated;
        
        return highestRated;
    }

}
