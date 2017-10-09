public class SoccerTeam {
	private int wins;
	private int losses;
	private int ties;
	private static int games;
	private int g2;
	private static int goals;
	private int tPoints;
	
	public SoccerTeam(int win, int loss, int tie) {
		wins = win;
		losses = loss;
		ties = tie;
	}
	
	public void played (SoccerTeam opponent, int myScore, int opponentScore) {
		games = games + 1;
		goals = goals + (myScore+opponentScore);
		if (myScore > opponentScore) {
			wins = wins + 1;
		} else if (myScore < opponentScore) {
			losses = losses + 1;

		} else if (myScore == opponentScore) {
			ties = ties + 1;

		}
	}
	
	public int tourPoints() {
		tPoints = tPoints + (wins*3);
		tPoints = tPoints+ties;
		return tPoints;
		
	}
	
	public void reset() {
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public int tourGames() {
		return games;
	}
	
	public int tourGoals() {
		return goals;
	}
	
	public void printev() {
		System.out.print(wins+" "+losses+" " +ties);

	}
}



