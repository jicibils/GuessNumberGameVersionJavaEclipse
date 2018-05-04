import java.util.Scanner;

public class HumanBeing{


  public int guess(){
    //FALTA HACER LOS CONTROLES NECESARIOS PARA QUE NO HAYA ERRORES EN TIEMPO DE EJECUCION
    int numberRandom;
    int response = 0;
    System.out.println();
    numberRandom = (int) (Math.random() * 100) + 1;
    System.out.println(numberRandom);
    do {
      System.out.println();
      System.out.print("Choose a number from 1 to 100: ");
      Scanner input = new Scanner(System.in);
      response = input.nextInt();
      if (numberRandom > response  ) {
        System.out.println();
        System.out.println("My number is bigger..");

      }
      if (numberRandom < response ) {
        System.out.println();
        System.out.println("My number is smaller..");

      }
    } while (response != numberRandom);

    if (response == numberRandom) {
      System.out.println();
      System.out.println("You Win!!!!");
      System.out.println();
    }




    return 0;
  }
}
