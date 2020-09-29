/*
 * Matej Crnkoviæ
 * 
 * Date: April 11-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca3;

/**
 * Class FootballGame that represents one game of football. It contains constant number of players in the game, 
 * instantiate two objects type Team and contains static method for calculating the winner of the game.
 * @author MatejC
 *
 */
public class FootballGame {
	
	static int numberOfPlayers = 22;
	
	
	/**
	 * Static method for calculating the winner of a football game.
	 * First it checks are the stats for both team valid and if not prints message and ends the method.
	 * Then it checks which team has more goal and prints name of the winning team with side note that prints 
	 * which team had more fouls.
	 * In the end it prints winner's color of the uniform, number of scored goals and number of made fouls.
	 * If the game is tied method prints message of the game result. 
	 * @param A first team
	 * @param B second team
	 */
	static void winner (Team A, Team B) {
		if ((A.checkTheStatistics(A.offensiveStats, A.defensiveStats)==false) || 
				(B.checkTheStatistics(B.offensiveStats, B.defensiveStats)==false)) {
			System.out.println("Invalid data eror");
			return ;	
		}
		//Team A is the winner
		if (A.numberOfScoredGoals(A.offensiveStats) > B.numberOfScoredGoals(B.offensiveStats)) {
			System.out.println("Team "+ A.uniformColor +" won!");
			if(A.numberOfMadeFouls(A.defensiveStats) > B.numberOfMadeFouls(B.defensiveStats)) {
				System.out.println("Winning team made more fouls.");
			}
			else if (A.numberOfMadeFouls(A.defensiveStats) < B.numberOfMadeFouls(B.defensiveStats)) {
				System.out.println("Winning team made less fouls.");
			}
			else System.out.println("Teams made equal number of fouls.");
			System.out.println("Color of the uniforms of winners is " + A.uniformColor.toLowerCase() + ", they scored " + 
			A.numberOfScoredGoals(A.offensiveStats) + " goal" +  (A.numberOfScoredGoals(A.offensiveStats)>1?"s ":" ")+
			"and made " + A.numberOfMadeFouls(A.defensiveStats) + " foul" + (A.numberOfMadeFouls(A.defensiveStats)>1?"s.":"."));
			
		}
		//Team B is the winner
		else if (B.numberOfScoredGoals(B.offensiveStats) > A.numberOfScoredGoals(A.offensiveStats)) {
			System.out.println("Team "+ B.uniformColor +" won!");
			if(B.numberOfMadeFouls(B.defensiveStats) > A.numberOfMadeFouls(A.defensiveStats)) {
				System.out.println("Winning team made more fouls.");
			}
			else if (B.numberOfMadeFouls(B.defensiveStats) < A.numberOfMadeFouls(A.defensiveStats)) {
				System.out.println("Winning team made less fouls.");
			}
			else System.out.println("Teams made equal number of fouls.");
			System.out.println("Color of the uniforms of winners is " + B.uniformColor.toLowerCase() + ", they scored " + 
			B.numberOfScoredGoals(B.offensiveStats) + " goal"+(B.numberOfScoredGoals(B.offensiveStats)>1?"s ":" ") +
			"and made " + B.numberOfMadeFouls(B.defensiveStats) + " foul" + (B.numberOfMadeFouls(B.defensiveStats)>1?"s.":"."));
		
		}
		//Tied game
		else { 
			System.out.println("Tie!!");
			if(B.numberOfMadeFouls(B.defensiveStats) > A.numberOfMadeFouls(A.defensiveStats)) {
				System.out.println("Team "+ B.uniformColor +" made more fouls.");
			}
			else if (B.numberOfMadeFouls(B.defensiveStats) < A.numberOfMadeFouls(A.defensiveStats)) {
				System.out.println("Team "+ A.uniformColor +" made more fouls.");
			}
			else System.out.println("Teams made equal number of fouls.");
			System.out.println("Both teams scored "+ A.numberOfScoredGoals(A.offensiveStats) +" goal" + 
			(A.numberOfScoredGoals(A.offensiveStats)>1?"s.":"."));
		}

	}
	
	/**
	 * Main method called upon execution
	 * @param args
	 */
	public static void main(String[] args) {
		
	Team blue = new Team("Blue", 55, 77);
	Team white = new Team("White", 56, 89);
	FootballGame.winner(blue, white);
	
	}
}
