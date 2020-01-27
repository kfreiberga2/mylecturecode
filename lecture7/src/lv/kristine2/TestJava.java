package lv.kristine2;

import lv.kristine2.geometricfigures.Circle;
import lv.kristine2.player.FootballPlayer;

public class TestJava {


	 
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo","Forward",7,true,184,76 );
		Circle figure = new Circle ();
		System.out.println(figure.getColor()+" "+figure.getRadius());
		
		
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight()+"cm");
		System.out.println(player.getWeight()+"kg");
		
		
		player.setShirtNumber(10);
		
		
		System.out.println("-------------------------");
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight()+"cm");
		System.out.println(player.getWeight()+"kg");
		
		
	}

}