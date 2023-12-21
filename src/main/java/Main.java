public class Main {
    public static void main(String[] args) {
        Lecture lecture = new Lecture();
        lecture.setNumber(6);
        lecture.setTitle("Test");
        System.out.println(lecture);

        Lecture lecture1 = new Lecture( "New",7);
        System.out.println(lecture1);
    }
}
