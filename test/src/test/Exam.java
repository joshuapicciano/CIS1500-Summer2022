package question18;

public class Exam {

    private String className;
    private String semester;
    private String professor;
    private int score;
    private int maxScore;

    public Exam(String className, String semester, String professor, int maxScore) {
        this.className = className;
        this.semester = semester;
        this.professor = professor;
        this.maxScore = maxScore;
        this.score = 0;
    }

    public String getClassName() {
        return className;
    }

    public String getSemester() {
        return semester;
    }

    public String getProfessor() {
        return professor;
    }

    public int getScore() {
        return score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= maxScore) {
            this.score = score;
        } else {
            System.out.println("Your score must be between 0 and " + maxScore);
        }
    }
}
