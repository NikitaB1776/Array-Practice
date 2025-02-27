//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
//
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
//
//


public class HighestAltitude {
    public static int highestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int result = highestAltitude(gain);
        System.out.println("The highest altitude is: " + result);
    }
}
