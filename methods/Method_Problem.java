public class Method_Problem{
    public static void main(String[] args){
        // int finalScore = calcScore(10,100,5,true);
        // System.out.println("Final score: " + finalScore);

        // finalScore = calcScore(20,200,10,true);
        // System.out.println("Final score: " + finalScore);

        int highscorePosition = calcHighScorePosition(1500);
        displayHighScorePosition("a", highscorePosition);

        highscorePosition = calcHighScorePosition(900);
        displayHighScorePosition("b", highscorePosition);

        highscorePosition = calcHighScorePosition(400);
        displayHighScorePosition("c", highscorePosition);

        highscorePosition = calcHighScorePosition(50);
        displayHighScorePosition("d", highscorePosition);
    }

    public static int calcScore(int score, int bonus, int levelCompleted, boolean gameOver){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus) + 1000;
            return finalScore;    
        }
        return -1;
    }

    public static int calcHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        else if(score >= 500)
            return 2;
        else if(score >= 100)
            return 3;
        return 4;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the highscore table");
    }
}