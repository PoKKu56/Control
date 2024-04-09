import java.util.ArrayList;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Введите число X: ");
        Integer X = in.nextInt();
        System.out.print("Введите длину массива: ");
        Integer lenght = in.nextInt();
        for (int i = 0; i < lenght; i++){
            System.out.print("Введите элемент массива: ");
            arrayList.add(in.nextInt());
        }

    }
}
