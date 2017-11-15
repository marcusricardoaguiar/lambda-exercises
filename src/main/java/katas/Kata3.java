package katas;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import model.MovieList;
import util.DataUtil;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video 
    ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        List<Integer> videoIds = movieLists.stream()
        	.flatMap(movieList -> movieList.getVideos().stream())
        	.map(video -> video.getId())
        	.collect(Collectors.toList());
        return ImmutableList.copyOf(videoIds);
    }
}
