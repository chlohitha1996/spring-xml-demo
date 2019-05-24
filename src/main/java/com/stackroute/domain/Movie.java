package com.stackroute.domain;


public class Movie
{
    String movieName;
    String movieId;
    Actor actor;


    public Movie() {
        System.out.println("Object Created");
    }
    public Movie(String movieName, String movieId, Actor actor) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.actor = actor;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieId='" + movieId + '\'' +
                ", actor=" + actor +
                '}';
    }
}
