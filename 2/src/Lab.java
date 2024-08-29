public class Lab {
    private Student[] students ;
    private String teacherName ;
    private String dayOfWeek ;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize] ;
    }
    public void setavgGrade(Student[] students){
        double sum = 0 , num = 0 ;
        int n = students.length;
        for (int i = 0; i < n ; i++) {
            if(Double.valueOf(students[i].getStdGrade()) >= 0) {
            sum += Double.valueOf(students[i].getStdGrade());
            num++ ;
            }
        }
        this.avgGrade = sum / num ;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

        public void printLabInfo(){
        System.out.println("teacherName:" + teacherName + "\ndayOfWeek:" + dayOfWeek
                + "\naverageGrade:" + avgGrade);
        System.out.println("--------------------");
    }
}
