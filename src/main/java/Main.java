import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wprowadz wielkosc trojkata: ");
    int size = scanner.nextInt();
    for (int i = 0; i < size; i++) 
    {
        for (int j = 0; j < size; j++) 
        {
          if (j == size-1 || j == (size-1) - i || i == (size-1))
            {
              System.out.print("*");
            } 
          else 
            {
              System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}