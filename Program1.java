class Student
{
int rollno;
String name;
static String college="ITS";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
 class TestStaticVariable1
{
public static void main(String args[])
{
Student s1=new Student(515,"Aswini");
Student s2=new Student(548,"Chandrika");
Student.college="A.M.Reddy";
s1.display();
s2.display();
}
}
 