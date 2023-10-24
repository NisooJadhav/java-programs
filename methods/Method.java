public class Method{
    public static void main(String[] args){
        int levelCompleted = 5;
        int bonus = 100;
        calcScore(true, 800, levelCompleted, bonus);
    }

    public static void calcScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your finalscore is: " + finalScore);
        }
    }
}