package MyOOP;
import java.util.Scanner;

public class use_class {
    public static void main(String[] args) {
        person p1 = new person(19 , "poopy");
        person p2 = new person( 21, "mercedes");
        System.out.println("**********give an age and the name and the job for creating your own person please!*************");
        Scanner Scanner = new Scanner(System.in);
        person p3 = new person(Scanner.nextInt(), Scanner.next(), Scanner.next());
         if (p1.isAdoult()) {
            System.out.println("person1 is adult");
            }else{
            System.out.println("person1 is not adult");
         }
         if (p2.isAdoult()) {
            System.out.println("person2 is adult");
         }else{
            System.out.println("person2 is not adult");
         }
         if (p3.isAdoult()) {
            System.out.println("person3 is adult");
            }else{
            System.out.println("person3 is not adult");
         }
         //do you think has it changed and commited and I cant see in git ?


    }
}
