
public class soccerTester {
	public static void main (String args[]) {
		SoccerTeam team1 = new SoccerTeam(0, 0, 0);
		SoccerTeam team2 = new SoccerTeam(0, 0, 0);
		SoccerTeam team3 = new SoccerTeam(0, 0, 0);
		SoccerTeam team4 = new SoccerTeam(0, 0, 0);

		team1.played(team2, 3, 7);
		team2.played(team3, 6, 1);
		team3.played(team4, 4, 4);
		team4.played(team1, 6, 2);
		team1.played(team3, 5, 2);
		team2.played(team4, 8, 3);
		team3.played(team1, 3, 4);
		team4.played(team2, 2, 2);
		
		System.out.println("Team 1 points: "+team1.tourPoints());
		System.out.println("Team 2 points: "+team2.tourPoints());
		System.out.println("Team 3 points: "+team3.tourPoints());
		System.out.println("Team 4 points: "+team4.tourPoints());
		
		System.out.println("Total games played: "+team1.tourGames());
		System.out.println("Total Goals made: "+team1.tourGoals());
	}
}
