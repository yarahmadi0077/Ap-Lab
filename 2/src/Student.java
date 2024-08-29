public class Student {

    private String stdFirstName;
    private String stdLastName;
    private String stdId;
    private String stdGrade;

    public Student(String stdFirstName, String stdLastName, String stdId, String stdGrade) {
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdId = stdId;
        if (stdId.length() != 7) {
            this.stdId = "invalid idCode!!!! The id code must have 7 digits.";
        }
        this.stdGrade = stdGrade;
        if (Double.valueOf(stdGrade) > 20 || Double.valueOf(stdGrade) < 0) {
            this.stdGrade = "-1";
        }
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
        if (stdId.length() != 7) {
            this.stdId = "invalid idCode!!!! The id code must have 7 digits.";
        }
    }

    public String getStdGrade() {
        return stdGrade;
    }

    public void setStdGrade(String stdGrade) {
        this.stdGrade = stdGrade;
        if (Double.valueOf(stdGrade) > 20 || Double.valueOf(stdGrade) < 0) {
            this.stdGrade = "-1";
        }
    }

    public void printInfo() {
        System.out.println(stdFirstName + " " + stdLastName + "\nId : " + stdId);
        System.out.print("Grade : ");
        if (Integer.valueOf(stdGrade) == -1) {
            System.out.println("invalid Grade!!");
        }
        else {
            System.out.println(this.stdGrade);
        }

        System.out.println("--------------------");
    }
}
