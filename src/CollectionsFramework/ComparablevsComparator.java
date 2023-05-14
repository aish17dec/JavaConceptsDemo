package CollectionsFramework;

import java.util.*;
import java.util.function.Function;

public class ComparablevsComparator {

    public static void main(String[] args) {

        Movie m1 = new Movie(1995, "DDLJ", 5);
        Movie m2 = new Movie(2012, "SOTY", 2);
        Movie m3 = new Movie(2002, "K3G", 3);

        List<Movie> movieList = Arrays.asList(m1,m2,m3);

        Collections.sort(movieList);
        movieList.stream().forEach(m-> System.out.println(m.name));

        System.out.println("-------------------------------------------------");

        Collections.sort(movieList,new RatingComparator());
        movieList.stream().forEach(m-> System.out.println(m.name));

        System.out.println("-------------------------------------------------");

        Collections.sort(movieList,new NameComparator());
        movieList.stream().forEach(m-> System.out.println(m.name));

        ListIterator listIterator = movieList.listIterator();
    }

}


class Movie implements Comparable<Movie>{
    int year;
    String name;
    int rating;

    @Override
    public int compareTo(Movie o) {
        return this.year-o.year;
    }

    public Movie(int year, String name, int rating) {
        this.year = year;
        this.name = name;
        this.rating = rating;
    }
}

class RatingComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        return m1.rating-m2.rating;
    }
}

class NameComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        return m1.name.compareTo(m2.name);
    }
}