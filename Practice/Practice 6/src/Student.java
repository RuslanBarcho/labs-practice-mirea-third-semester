/**
 * Модель данных студента
 */
public class Student {

    Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String name;

    public int age;

    public int id;

    public String ToString() {
        return name + " " + age + " " + id;
    }
}