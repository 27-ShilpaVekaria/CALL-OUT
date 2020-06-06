public class Maths//created class
{

  int a = 10;//global instance method
  int b = 20;// global instance method
  int ans = a + b;//the addition of a and b is ans
    public void add()// local instance method
    {
   System.out.println("Addition is " + ans); //output printed

   }
   public static void main(String[]args)// main method
    {
        Maths maths = new Maths();// created object
       maths.add();//call the local method using object
    }
}
