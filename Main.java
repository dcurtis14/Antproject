import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  int ants = 5;

  if(ants == 4)
  {
    System.out.println("There are 4 ants.");
  }else{
      System.out.println("There are not 4 ants.");
      Scanner scan = new Scanner (System.in);

      System.out.println("My question about ant hill");
      String question = scan.next();
          question += scan.nextLine();

          System.out.println("Hey"+ question);
          
for(int count = 1; count <= 4; count++)
     {
        System.out.println(count);
      
        }
      }
  }
}