import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String miau;
        float x;
        Scanner meow = new Scanner (System.in);
        String lol = "exit";
        System.out.println("Enter units to convert!");
        miau = meow.nextLine();
        while(true){
        if(miau.equalsIgnoreCase(lol)){break;}

        System.out.println("Enter a value! if you would like to exit, please type '-1'");

        x = meow.nextFloat(); 
        if (x == -1)
        break;
        switch(miau){
          case "kWh = J":
          x = 3600000*x;
          System.out.println(x + " J");
          break; 

          case "km = yards":
          x = (int) (1093.61 * x);
          System.out.println (x + " yards");
          break;

          case "bar = Pascal":
          x= 100000 * x;
          System.out.println(x + " Pascal");
          break;

          case "degrees = Radians":
          x= (int) (.0174533 * x);
          System.out.println(x + "Radians");
          break;

          default:
          System.out.println("Please enter a valid input, try again!");
          break;

        } 
    }
    meow.close();
}
}
