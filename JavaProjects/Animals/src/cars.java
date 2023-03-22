import java.util.Scanner;
import java.util.HashMap;

public class cars {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> cars = new HashMap<String, String>();

        cars.put("chevy", "volt");
        cars.put("ford", "f150");
        cars.put("fiat", "500l");
        cars.put("honda", "civic");

        System.out.println("Enter make of car");
        String userinput = input.nextLine();
        System.out.println(userinput);

        String varname = cars.get(userinput);
        System.out.println(varname);
        input.close();
    }
}
