public class Student {

    private String name;
    private char grade;
    private int group;
    private String secretNickName;

    private final int INCREMENTAMOUNT = 1;

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
        this.secretNickName = "MySecretNickName";
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void upgrade(){
        this.grade = (char) (grade -INCREMENTAMOUNT);
    }

    public void downgrade(){
        this.grade = (char) (grade +INCREMENTAMOUNT);
    }



}
