package katas;

import java.util.List;

import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream()
            	.map(movie -> movie.getRating())
            	.reduce(Double::max)
            	.get();
    }
}
