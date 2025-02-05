public class Person {
   private String firstName;
   private String lastName;

   public Person(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }

   @Override
   public String toString() {
       return firstName + " " + lastName;
   }

   public static void main(String[] args) {
     
       Person p = new Person("P", "K");

       System.out.println("Full Name: " + p.toString());
   }
}
