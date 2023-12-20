public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marco", "Porcu", 15);

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getId());
        student.setName("Piero");
        student.setSurname("Cossu");
        student.setId(33);
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getId());
    }
}