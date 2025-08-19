package objectOrientedProgramming;

class Bowler{
	String name;
	int wickets;
	int matches;
	int balls_bowled;
	int runs_conceded;
	
	public Bowler() {
		name=null;
		wickets=0;
		matches=0;
		balls_bowled=0;
		runs_conceded=0;
	}

	public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
		super();
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}
	public void computeBowlingAverage(int runs_conceded,int wickets,int matches,int balls_bowled) {
		if(runs_conceded==0||wickets==0||balls_bowled==0) {
			System.out.println("Error");
		}
		else if(matches==0) {
			if(runs_conceded!=0||balls_bowled!=0) {
				System.out.println("Error");
			}
		}
		else {
		System.out.println(runs_conceded/wickets);
		}
	}
	public void showStatistics(int runs_conceded,int wickets,int matches,int balls_bowled,String name) {
		if(runs_conceded==0||wickets==0||balls_bowled==0) {
			System.out.println("Error");
		}
		else if(matches==0) {
			if(runs_conceded!=0||balls_bowled!=0) {
				System.out.println("Error");
			}
		}
		else {
			System.out.println("Name= "+name+"\n Runs Conceded= "+runs_conceded);
		}
	}
	public void computeStrikeRate(int runs_conceded,int wickets,int matches,int balls_bowled) {
		if(runs_conceded==0||wickets==0||balls_bowled==0) {
			System.out.println("Error");
		}
		else if(matches==0) {
			if(runs_conceded!=0||balls_bowled!=0) {
				System.out.println("Error");
			}
		}
		else {
			System.out.println(runs_conceded/balls_bowled);
		}
	}
}
public class BowlerTesting {

	public static void main(String[] args) {
		

	}

}
