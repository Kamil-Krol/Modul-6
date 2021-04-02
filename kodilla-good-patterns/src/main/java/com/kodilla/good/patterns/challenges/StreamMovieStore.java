package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class StreamMovieStore {
    public static void main(String[] args) {
   MovieStore movieStore = new MovieStore();
   String movieList = movieStore.getMovies().entrySet().stream().map(entry -> entry.getKey() + " - " + entry.getValue()).collect(Collectors.joining("  !!!  "));
        System.out.println(movieList);
    }
}
