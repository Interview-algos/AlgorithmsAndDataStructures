package others;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class ComparatorDemoMovie implements Comparable<ComparatorDemoMovie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(ComparatorDemoMovie m) {
		return this.year - m.year;
	}

	// Constructor
	public ComparatorDemoMovie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<ComparatorDemoMovie> {
	public int compare(ComparatorDemoMovie m1, ComparatorDemoMovie m2) {
		if (m1.getRating() > m2.getRating())
			return -1;
		if (m1.getRating() < m2.getRating())
			return 1;
		else
			return 0;
	}
}

// Class to compare Movies by name
class NameCompare implements Comparator<ComparatorDemoMovie> {
	public int compare(ComparatorDemoMovie m1, ComparatorDemoMovie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

// Driver class
class Main1 {
	public static void main(String[] args) {
		ArrayList<ComparatorDemoMovie> list = new ArrayList<ComparatorDemoMovie>();
		list.add(new ComparatorDemoMovie("Force Awakens", 8.3, 2015));
		list.add(new ComparatorDemoMovie("Star Wars", 8.7, 1977));
		list.add(new ComparatorDemoMovie("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparatorDemoMovie("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		// (2) Call Collections.sort
		// (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (ComparatorDemoMovie movie : list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (ComparatorDemoMovie movie : list)
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (ComparatorDemoMovie movie : list)
			System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");
	}
}
