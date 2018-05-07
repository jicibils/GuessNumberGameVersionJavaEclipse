package GuessNumberGame;

public class HumanBeing{


  public int guess(){
    int numberRandom;
    int response = 0;
    AskNumber askNumber = new AskNumber();
    System.out.println();
    //a random number is generated
    numberRandom = (int) (Math.random() * 100) + 1;

    do {
        do {
            System.out.println();
            System.out.print("Choose a number from 1 to 100: ");
            response = askNumber.askNumber();
            if (response == 0) {
              System.out.print("Invalid Input, Only numbers from 1 to 100");
            }
          } while (!((response > 0)&&(response<=100)));
    	
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
