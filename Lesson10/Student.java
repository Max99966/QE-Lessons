package Lesson10;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (name.matches("[A-Z][a-z]"))
            this.name = name;
        else
            throw new NameException();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            throw new AgeException();
    }
}
