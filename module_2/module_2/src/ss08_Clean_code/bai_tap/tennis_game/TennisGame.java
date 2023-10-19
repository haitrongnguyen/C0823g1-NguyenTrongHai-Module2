package ss08_Clean_code.bai_tap.tennis_game;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score;
        boolean isEquals = (mScore1 == mScore2);
        if (isEquals) {
            if (mScore1 > 0 && mScore1 <= 3) {
                score = returnScore(mScore1) + " - All";
            } else {
                score = "Deuce";
            }
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            score = commentResult(player1Name, player2Name, mScore1, mScore2);
        } else {
            score = returnScore(mScore1) + "-" + returnScore(mScore2);
        }
        return score;
    }

    public static String returnScore(int score) {
        String result = "";
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
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