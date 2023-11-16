package j1116;

import java.util.Scanner;

class StudyWarningException extends Exception {
    public StudyWarningException(String message) {
        super(message);
    }
}

public class Main {
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        int[] scores = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int score : scores) {
            score=scanner.nextInt();
        }

        try {
            double averageScore = calculateAverage(scores);
            if (averageScore < 70) {
                throw new StudyWarningException("学业预警了？不会吧！我不能允许这种情况发生在这么优秀的我身上......");
            }
        } catch (StudyWarningException e) {
            System.out.println(e.getMessage());
        }
    }
}
