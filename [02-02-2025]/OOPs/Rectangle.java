import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void area() {
        System.out.println(length * breadth);
    }

    void perimeter() {
        System.out.println(2 * (length + breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        
        r.length = sc.nextInt();
        r.breadth = sc.nextInt();

        r.area();
        r.perimeter();
        
        sc.close();
    }
}
