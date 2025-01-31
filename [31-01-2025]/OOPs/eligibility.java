class Student {
    public String name;
    public int score;
    public int age;

    public void eligible() {
        if (score > 10 && age > 20) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Tom";
        obj.score = 15;
        obj.age = 21;
        obj.eligible();
    }
}
