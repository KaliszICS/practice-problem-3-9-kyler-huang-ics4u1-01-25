import java.util.ArrayList;

public class PracticeProblem {

    // Tower of Hanoi
    public static String[] towerOfHanoi(int n) {
        ArrayList<String> movesList = new ArrayList<>();
        solveHanoi(n, 'L', 'R', 'M', movesList);
        return movesList.toArray(new String[0]);
    }

    // Recursive helper
    // n = number of disks
    // from = source peg
    // to = target peg
    // aux = auxiliary peg
    // moves = list to store moves
    private static void solveHanoi(int n, char from, char to, char aux, ArrayList<String> moves) {
        if (n == 0) return; // base case: no disk to move

        // Move n-1 disks from 'from' to 'aux' using 'to' as auxiliary
        solveHanoi(n - 1, from, aux, to, moves);

        // Move the nth disk from 'from' to 'to'
        moves.add("" + from + to);

        // Move the n-1 disks from 'aux' to 'to' using 'from' as auxiliary
        solveHanoi(n - 1, aux, to, from, moves);
    }

    // Optional main for testing
    public static void main(String[] args) {
        String[] moves = towerOfHanoi(3);
        for (String move : moves) {
            System.out.println(move);
        }
    }
}
