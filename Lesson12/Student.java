package Lesson12;

public class Student implements Comparable<Student>{
    private String name;
    private int mark;

    public Student(String data) {
        String[] split = data.split("-");
        this.name = split[0];
        this.mark = Integer.parseInt(split[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + "," + mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark - o.mark;
    }
}
