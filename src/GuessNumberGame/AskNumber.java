package GuessNumberGame;
import java.util.Scanner;
public class AskNumber {

  public int askNumber(){
	    int response = 0;
	    try {
	      Scanner input = new Scanner(System.in);
	      response = input.nextInt();
	      return checkNumber(response);
	    }catch (Exception e) {
	      response = -1;
	      return checkNumber(response);
	    }
	  }

	  public int checkNumber(int response) {
	    if (!((response > 0)&&(response<=100))) {
	      return 0;
	    }else{
	      return response;
	    }
	  }
	
}
