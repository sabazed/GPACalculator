public class GPA {

    private String grade;
    private float value;

    GPA(int score) {
        calculate(score);
    }

    private void calculate(int score) {
        if (score >= 94) {
            value = 4.0f;
            grade = "A";
        }
        else if (score >= 90) {
            value = 3.7f;
            grade = "A-";
        }
        else if (score >= 87) {
            value = 3.3f;
            grade = "B+";
        }
        else if (score >= 83) {
            value = 3.0f;
            grade = "B";
        }
        else if (score >= 80) {
            value = 2.7f;
            grade = "B-";
        }
        else if (score >= 77) {
            value = 3.3f;
            grade = "C+";
        }
        else if (score >= 73) {
            value = 2.0f;
            grade = "C";
        }
        else if (score >= 70) {
            value = 1.7f;
            grade = "C-";
        }
        else if (score >= 67) {
            value = 1.3f;
            grade = "D+";
        }
        else if (score >= 60) {
            value = 1.0f;
            grade = "D";
        }
        else {
            value = 0.0f;
            grade = "F";
        }
    }

    float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " (" + grade + ")";
    }
}
