
package constructors;
public class Rectangle{
int length;
int breadth;
Rectangle(){
System.out.println("length:"+length);
System.out.println("breadth:"+breadth);

}
public Rectangle(int leng,int bread){
length=leng;
breadth=bread;
}
public int area(int length,int breadth)
{
return length*breadth;
}
public static void main(String args[]){
Rectangle r=new Rectangle();
System.out.println(r.area(25,35));
}}

