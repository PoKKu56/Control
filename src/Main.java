import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text_params = in.nextLine();
        ArrayList<Double> list_params = new ArrayList<>();
        for (String number : text_params.split(" ")){
            list_params.add(Double.parseDouble(number));
        }
        try {
            System.out.println(power(list_params.get(0), list_params.get(1)));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static Double power(Double number, Double power_number) throws Exception{
        if (power_number < 0){
            throw new Exception("Степень числа меньше нуля");
        }
        if (power_number == 0){
            return 1.0;
        }
        if (power_number % 2 == 0){
            return power(number * number, power_number / 2);
        }
        return number * power(number * number, (power_number - 1) / 2);
    }
}