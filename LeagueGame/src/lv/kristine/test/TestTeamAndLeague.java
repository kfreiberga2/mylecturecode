package lv.kristine.test;

import java.util.ArrayList;

import lv.kristine.module.League;
import lv.kristine.module.Team;

public class TestTeamAndLeague {

	public static void main(String[] args) {

		ArrayList<Team> khlTeam = new ArrayList<>();

		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		Team dinamo = new Team("DINAMO");
		Team spartak = new Team("Spartak");
		Team torpedo = new Team("Torpedo");
		Team jokerit = new Team("JOKERIT");

		khlTeam.add(ska);
		khlTeam.add(cska);
		khlTeam.add(dinamo);
		khlTeam.add(spartak);
		khlTeam.add(torpedo);
		khlTeam.add(jokerit);

		for (Team t : khlTeam) {
			System.out.println(t.getName());
		}

		
		// arr.add(cska);

		League khl = new League("KHL");

		// khl.nameOfTeam.add(cska);

		khl.recordWinAndLoss(ska, dinamo);
		khl.recordWinAndLoss(ska, cska);
		khl.recordWinAndLoss(jokerit, torpedo);
		khl.setNameOfTeams(khlTeam);
		khl.recordTie(cska, ska);

		System.out.println("Total points:" + ska.totalPoints());
		System.out.println(khl.toString());
	}

}
