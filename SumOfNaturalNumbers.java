import java.io.*;
class SumOfNaturalNumbers
{
 public static void main(String args[]) throws IOException
 {
 BufferedReader br = new BufferedReader(new
 InputStreamReader(System.in));
 SumOfNaturalNumbers call = new SumOfNaturalNumbers();
 System.out.print("Enter a number : ");
 int n = Integer.parseInt(br.readLine());
 System.out.println("\nSum of Natural Numbers till " +n +" = "+call.sum(n));
 }
 int sum(int n)
 {
  if(n==1)
  return 1;
 else
  return n+sum(n-1);
 }
}
