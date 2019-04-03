package com.kitri.test6;

public class Drama extends TVProgram{


	private String director;
	private String actor;
	private String actress;
	
	
	
	
	public Drama(String title, String broadcast) {
		super(title, broadcast);
	}
	
	
	public Drama(String title, String broString, String director, String actor, String actress) {
		super(title, broString);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}
	
	@Override
	public String toString() {
		
		return "\n" + super.toString() + "\n"
			+ "\t - 감독 : " + director
			+ "\t - 남자배우 : " + actor
			+ "\t - 여자배우 : " + actress;
		
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getActor() {
		return actor;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}


	public String getActress() {
		return actress;
	}


	public void setActress(String actress) {
		this.actress = actress;
	}
	
	
}
