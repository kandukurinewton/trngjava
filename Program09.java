//java program to convert primitive into objects
//Autoboxing example of int to integer
public class WrapperExample1{
public static void main(String args[]){
//Converting int into integer
int a=20;
integer i=integer.valueOf(a);//converting int into integer explicitly
integer j=a;//autoboxing,now complier will write integer.valueOf(a)internally
System.out.println(a+" "+i+" "j);
}
}