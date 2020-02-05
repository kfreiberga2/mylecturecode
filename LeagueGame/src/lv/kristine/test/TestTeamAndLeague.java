package lv.kristine.test;

import java.util.ArrayList;

import lv.kristine.module.League;
import lv.kristine.module.Team;

public class TestTeamAndLeague {

	
	public static void main(String[] args) {
		
		ArrayList <Team> arrTeam = new ArrayList<>();
		Team ska = new Team("SKA");
		Team cska = new Team ("CSKA");
		
		arrTeam.add(ska);
		
		
		//arr.add(cska);
		
		League khl = new League ("KHL");
		//khl.nameOfTeams.add(cska);
		
		
		
		khl.setNameOfTeams(arrTeam);

		System.out.println(khl.toString());
	}

}
