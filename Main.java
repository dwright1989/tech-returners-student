public class Main {
    public static void main(String[] args) {
        Student s = new Student("Debbie", 'B', 2);
        System.out.println("Grade is: " + s.getGrade());
        System.out.println("Name is: " + s.getName());

        s.upgrade();
        System.out.println("Grade is now: " + s.getGrade());
        s.downgrade();
        s.downgrade();
        System.out.println("Grade is now: " + s.getGrade());
    }
}
