/*
 * Matej Crnkoviæ
 * 
 * Date: April 11-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca3;

/**
 * Class Team, that represents one football team, contains color of the team's uniform (type String), 
 * offensive stats of the team and defensive stats,
 * methods checkTheStatistics, numberOfScoredGoals and numberOfMadeFouls
 * @author MatejC
 *
 */
public class Team {
	
	String uniformColor;
	int offensiveStats;
	int defensiveStats;
	
	/**
	 * Constructor for Team
	 * @param uniformColor
	 * @param offensiveStats
	 * @param defensiveStats
	 */
	Team (String uniformColor, int offensiveStats, int defensiveStats ) {
		this.uniformColor = uniformColor;
		this.offensiveStats = offensiveStats;
		this.defensiveStats = defensiveStats;
	}
	
	/**
	 * Method that checks if the atributes are in the right range
	 * @param offense
	 * @param defense
	 * @return
	 */
	boolean checkTheStatistics(int offense, int defense) {
		if ( (offense < 0) || (offense > 100) || (defense < 0) || (defense > 100) ) return false;
		else {return true;}
	}
	
	/**
	 * Method that calculates number of team's scored goals
	 * @param offense
	 * @return
	 */
	int numberOfScoredGoals(int offense) {
		//it is not clear in the given task what should the method return
		return offense/10;
	}
	
	/**
	 * Method that calculates number of team's made fouls
	 * @param defense
	 * @return
	 */
	int numberOfMadeFouls (int defense) {
		//it is not clear in the given task what should the method return
		return ((100-defense)/10);
	}

}
