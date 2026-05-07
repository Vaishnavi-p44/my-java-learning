
class Solution {

    public boolean rotateString(String s, String goal) {

        // length must be same
        if (s.length() != goal.length()) {
            return false;
        }

        // check if goal is substring of s+s
        String combined = s + s;

        return combined.contains(goal);
    }
}