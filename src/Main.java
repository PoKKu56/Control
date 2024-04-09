import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 5
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Stack<Character> elements = new Stack<>();
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) != ']' && line.charAt(i) != ')' && line.charAt(i) != '}'){
                elements.push(line.charAt(i));
            } else if ((line.charAt(i) == ']' && elements.peek() == '[') || (line.charAt(i) == ')' && elements.peek() == '(')
            || (line.charAt(i) == '}' && elements.peek() == '{')){
                elements.pop();
            }
        }
        if (elements.size() == 0){
            System.out.println("Все скобки закрыты");
        }
        else{
            System.out.println("Не все скобки закрыты");
        }
    }
}