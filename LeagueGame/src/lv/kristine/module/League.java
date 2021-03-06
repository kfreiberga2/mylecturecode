package lv.kristine.module;

import java.util.ArrayList;

public class League {

	private String nameOfleague;
	public ArrayList<Team> nameOfTeams;

	public League(String leagueName) {
		this.nameOfleague = leagueName;
		this.nameOfTeams = new ArrayList<>();

	}

	public Team teamWithName(String nameToLookFor) {
		Team teamCreated = null;
		for (Team team : this.nameOfTeams) {
			if (team.name.equals(nameToLookFor)) {
				teamCreated = team;
			}
		}
		return teamCreated;

	}

	public String getNameOfleague() {
		return nameOfleague;
	}

	public void setNameOfleague(String nameOfleague) {
		this.nameOfleague = nameOfleague;
	}

	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}

	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}

	public void recordWinAndLoss(Team winnerName, Team loserName) {
		int i = 0;

		Team winner = this.teamWithName(winnerName);
		Team loser = this.teamWithName(loserName);
		winner.wins++;
		loser.losses++;

	}

	public void recordTie(Team teamA, Team teamB) {
		teamA.ties++;
		teamB.ties++;

	}

	@Override
	public String toString() {
		return "League [nameOfleague=" + nameOfleague + ", nameOfTeams="
				+ nameOfTeams + "]";
	}

}
