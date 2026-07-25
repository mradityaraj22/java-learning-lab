//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    byte x=5;
    int y = 6;
    short z = 8;
    int a = y+z;
    float b = 6.5f + x;
    System.out.println(b);

//    increment and decrement operaot

    int i = 56;
//    pehle print phir incement
    System.out.println(i++);
    System.out.println(i);
    System.out.println(++i);
//    pehle increment phir print
    int k =83;
//    first incerement then print
//    int j = ++k;
//    print then incrmeent
    int j = k++;
    System.out.println(j);
}
