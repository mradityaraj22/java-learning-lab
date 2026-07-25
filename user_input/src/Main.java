import javax.xml.namespace.QName;
import java.util.Scanner;
//TIP T;o <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    Scanner sc = new Scanner(System.in);


    System.out.println("enter number 1");
    int a = sc.nextInt();
    System.out.println("number 2: ");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("summ is: ");
    System.out.println(sum);
    boolean nume= sc.hasNextInt();
    System.out.println(nume);

    String str_only_one_word = sc.next();
    System.out.println(str_only_one_word);
    String str_fubll_line = sc.nextLine();
    System.out.println(str_fubll_line);
}
