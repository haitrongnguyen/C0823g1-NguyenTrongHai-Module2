package ss08_Clean_code.bai_tap.tennis_game;

public class TennisGame {

    private static final int ZERO = 0;
    private static final int FIRST_SCORE = 1;
    private static final int SECOND_SCORE = 2;
    private static final int THIRD_SCORE = 3;
    private static final String ALL = " - All";
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";


    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score;
        boolean isEquals = (mScore1 == mScore2);
        boolean isFinal = mScore1 >= 4 || mScore2 >= 4;
        if (isEquals) {
            if (mScore1 > 0 && mScore1 <= 3) {
                score = returnScore(mScore1) + ALL;
            } else {
                score = "Deuce";
            }
        } else if (isFinal) {
            score = commentResult(player1Name, player2Name, mScore1, mScore2);
        } else {
            score = returnScore(mScore1) + "-" + returnScore(mScore2);
        }
        return score;
    }

    public static String returnScore(int score) {
        String result = "";
        switch (score) {
            case ZERO:
                result = LOVE;
                break;
            case FIRST_SCORE:
                result = FIFTEEN;
                break;
            case SECOND_SCORE:
                result = THIRTY;
                break;
            case THIRD_SCORE:
                result = FORTY;
                break;
        }
        return result;
    }

    public static String commentResult(String player1Name, String player2Name, int mScore1, int mScore2) {
        int minusResult = mScore1 - mScore2;
        String comment;
        if (minusResult == 1) {
            comment = "Advantage " + player1Name;
        } else if (minusResult == -1) {
            comment = "Advantage " + player2Name;
        } else if (minusResult >= 2) {
            comment = "Win for " + player1Name;
        } else {
            comment = "Win for " + player2Name;
        }
        return comment;
    }
}