//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
     Scanner sc = new Scanner(System.in);
    System.out.println("WHAT IS THE TOTAL MARKS: ");
     float total_marks = sc.nextInt();
     float full_marks = total_marks*5;
    System.out.println("makrs of subject 1 : ");
    float sub1 = sc.nextInt();
    System.out.println("makrs of subject 2 : ");
    float sub2 = sc.nextInt();
    System.out.println("makrs of subject 3 : ");
    float sub3 = sc.nextInt();
    System.out.println("makrs of subject 4 : ");
    float sub4 = sc.nextInt();
    System.out.println("makrs of subject 5 : ");
    float sub5 = sc.nextInt();

    float percentage = ((sub1+sub2+sub3+sub4+sub5)/full_marks)*100;
    System.out.println("the percentgae is : ");
    System.out.println(percentage);
}
