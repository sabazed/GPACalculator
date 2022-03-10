public class Subject {

    private final String className;
    private final GPA FinalGPA;
    private final int credits;

    Subject(String className, int score, int credits) {
        this.className = className;
        this.FinalGPA = new GPA(score);
        this.credits = credits;
    }

    float getGPA() {
        return FinalGPA.getValue();
    }

    int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return className + ": " + FinalGPA;
    }

}