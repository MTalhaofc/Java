import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class App {
 /*METHODS AND FUNCTIONS */
    public static void printjava(){
        System.out.println("Hello Java");
    }
    public static void printname
(String name){
    System.out.println(name);
}
public static void printsum(int a, int b){System.out.println(a+b);}
    


printname("Talha");        
printname("2Nd attempt");
printsum(10, 15);

    public static void main(String[] args) throws Exception {



printname("Talha");        
printname("2Nd attempt");
printsum(10, 15);

     byte age7 = 30; //primitives 
    int phone = 1234567890;
    long phone2 = 123345678900L;
    float pi = 3.14F ;
    char letter = '@';    
//non-primitives
String name = new String("Talha");
System.out.println(name.length());
String fname = "Muhammad";
String lname = "Talha";
String oname = fname+lname;
System.out.println(oname);
System.out.println(oname.length());
System.out.println(oname.charAt(5));
System.out.println(oname.charAt(0));
String name2 = oname.replace('T', 'B');
System.out.println(name2);
String name3 = "Muhammad Talha";
// System.out.println(name3.substring(0,9));
/*ARRAYS */
int [] marks = new int[3];
marks[0]= 97;
marks[1]=96;
marks[2]=95;
System.out.println(marks[0]);
System.out.println(marks.length);
Arrays.sort(marks);
System.out.println(marks[0]);
/*2D ARRAYS  */
int[] marks2 = {95,97,98};
int[][] finalmarks ={{97,96,95},{96,97,98}};
System.out.println(finalmarks[1][1]);
double price =100.9999;
double finalprice = price +18;
System.out.println(finalprice);
int p = 100;
int fp = p + (int) 18.9999;
System.out.println(fp);
int age1;
age1 =30;
age1 =31;
final int age4 =34;
// age4 = 35; //Cannot be done duw to final keyword
// /*DAY2 */
          double a =1;
          double b = 2;
          double mod = a%b;
          System.out.println(mod);      

 b++;
System.out.println(b);
++b;
System.out.println(b);
b--;
System.out.println(b);
--b;
System.out.println(b);

System.out.println(Math.max(9,7));
System.out.println(Math.min(9, 7));
System.out.println((int)(Math.random()*100));
Scanner input = new Scanner(System.in);
System.out.println("age?");
float age3 = input.nextFloat();
System.out.println(age3);

Scanner sc = new Scanner(System.in);
String namenew = sc.nextLine();
System.out.println(namenew);


boolean issunup = false;
if (issunup == true ) {
    System.out.println("Day");
}
else
{
    System.out.println("Night");
}

int age5 = 3;
if (age5 >= 18) 
{
System.out.println("vote");    
}
else{
    System.out.println("not");
}

int ab =60;
int bc= 40;
if(ab< 50 && bc<50)
{System.out.println("wow");}

if(ab<50 || bc<50)
{System.out.println("nahh");}

boolean isadult= false;
if (isadult) {
    System.out.println("adult");
}
else{
    System.out.println("not");
}
/*First logic */
Scanner sc1 = new Scanner(System.in);
System.out.println("Your total amount");
// Pen = 50
// pencil = 15
int userprice = sc1.nextInt();
if(userprice>=65){ //both
System.out.println("Pencil and pen both");
}
if (userprice <= 64 && userprice >=50) {
System.out.println("pen or pencil");    //pen or pencil
}
if (userprice >=15 && userprice<=49) {
    System.out.println("pencil");  //only pencil
    
Scanner sc2 = new Scanner(System.in);
System.out.println("Your total amount");
// Pen = 10
// book = 40
int userprice1 = sc2.nextInt();
if(userprice1<65){ //both
System.out.println("Pencil and pen both");
}

int day = 2;
switch (day) {
    case 1:
        System.out.println("MonDay");        break;

        case 2:
        System.out.println("tuesday");        break;

        case 3:
        System.out.println("wednesday");        break;

        default:
        System.out.println("thursday to sunday");
DAY 3 */
    //LOOPS
    
    for(int i = 100;i >=1;i--){
        System.out.println(i);
    }
    int i=100;
    while (i>=1) {
        System.out.println(i);
        i=i-1;
    }
    int k= 100;
    do{
        System.out.println(k);
        k--;}
                 
  
 /*DAY 4 */
    Scanner numberinput = new Scanner(System.in);
    int number1;
    do{
        System.out.println("Enter Number");
     number1 = numberinput.nextInt();   
    System.out.println(number1);

    }    

    while(number1>=0);
    /*Break and continue */
int i =0;
while (true) {

    
    if (i==3) {
       i++;
continue;
    }  

 System.out.println(i);
 i++;
 if (i>5) {
    break;
 }   
 
}

int[] marks7= {95,96,97};
try{
    System.out.println(marks7[5]);

}catch(Exception exception){System.out.println("Lenght array is at 3");}
System.out.println("Name is Talha");

    
    
}





}
    }
}
    
