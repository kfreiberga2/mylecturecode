package lv.kristine.module;

import java.util.ArrayList;

public class League {


	
	private String nameOfleague;
	public ArrayList <Team> nameOfTeams;
	
	public League (String leagueName){
		this.nameOfleague =leagueName;
		this.nameOfTeams= new ArrayList<>();
		
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
	
	public void recordWinAndLoss(Team winner, Team loser){
	
		winner.setWins(1);
		loser.setLosses(1);
		
		
	}
	
	
	@Override
	public String toString() {
		return "League [nameOfleague=" + nameOfleague + ", nameOfTeams="
				+ nameOfTeams + "]";
	}
	
	
	
	
	
	
}
