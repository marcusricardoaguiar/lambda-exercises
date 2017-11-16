package katas;

import java.util.List;
import java.util.Optional;

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
        Optional<Double> result = movies.stream()
            	.map(Movie::getRating)
            	.reduce(Double::max);
        
        if(result.isPresent()) return result.get();
        else return 0.0;
    }
}
