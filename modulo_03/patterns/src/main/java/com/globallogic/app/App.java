package com.globallogic.app;

public class App 
{
    public static void main( String[] args )
    {
    	Playstation playstation = new Playstation(new Game("Resident evil"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation.setVideogame(new Game("Brawlhalla"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation.setVideogame(new Game(null));
    	
    	System.out.println(playstation.askMyGame());
    	
    	
    }
}
