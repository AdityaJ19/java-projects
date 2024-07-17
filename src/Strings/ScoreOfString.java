package Strings;
// https://leetcode.com/problems/score-of-a-string/description/?envType=daily-question&envId=2024-06-01
class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
    static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length()-1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return score;
    }
}
