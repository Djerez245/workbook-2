public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {

        int grade = 0;

        for (int i = 0; i < grade; i++) {
            if (grade <= 90) {
                return 'A';
            } else if (grade >= 80) {
                return 'B';
            } else if (grade >= 70) {
                return 'C';
            } else if (grade >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }

        return 0;
    }
    
}



