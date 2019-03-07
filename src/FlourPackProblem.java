public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0 || smallCount < 0 || goal < 0) ||
                (bigCount * 5 + smallCount < goal)) {
            return false;
        }
        while (goal > 0) {
            if (goal > smallCount && goal >= 5) {
                bigCount -= 1;
                goal -= 5;
            } else {
                smallCount -= 1;
                goal -= 1;
            }
        }
        if (smallCount < 0 || bigCount < 0) {
            return false;
        }
        return true;
    }
}