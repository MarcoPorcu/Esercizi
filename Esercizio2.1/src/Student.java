public class Student {
    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getId(){
        return id;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSurname(String newSurname){
        this.surname = newSurname;
    }

    public void setId(int newId){
        this. id = newId;
    }
}
