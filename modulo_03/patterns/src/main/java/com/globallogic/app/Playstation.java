package com.globallogic.app;

public class Playstation {
	 Game videogame;
	
	public Playstation(Game videogame) {
		
		this.videogame=videogame;
	}
	
	public String askMyGame() {
		
		if(videogame!=null) {
			return "El videojuego que estoy corriendo es:"+ videogame.getTitle() ;
		}else {
			return "Estoy vacío! ";
		}
	}

	public Game getVideogame() {
		return videogame;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}
}
