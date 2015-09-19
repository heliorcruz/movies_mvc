package br.com.app.client;

public class Movie {

	private int idMovie;
	private double duration;
	private String title;
	private int year;
	private Rating rating;
	private Espec esp;

	
	public Movie(int int1, double double1, String string, int int2,
			Espec espec, Rating rating2) {
		idMovie = int1;
		duration = double1;
		title = string;
		year = int2;
		rating = rating2;
		esp = espec;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Espec getEsp() {
		return esp;
	}

	public void setEsp(Espec esp) {
		this.esp = esp;
	}

	public String toString(){
		return idMovie+" | "+title+" | "+year+" | "+rating+" | "+duration+" | "+esp;
	}

	public int getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	//metodo de comparação para busca
	public boolean contains(String palavra){

		if(title.contains(palavra)) return true;
		if(rating.getRate().contains(palavra))  return true;		
		if(esp.getGender().toString().contains(palavra)) return true;
		if(esp.getStudio().contains(palavra)) return true;	        

		return false;
	}
	
}
