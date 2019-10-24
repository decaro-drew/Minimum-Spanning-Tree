package app;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import structures.Graph;

public class THEEEMSTdriver
{
   public static void main(String[] args) throws IOException
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter file name:");
       String file = sc.nextLine();
       Graph graph = new Graph(file);
       PartialTreeList ptl = PartialTreeList.initialize(graph);
       PartialTreeList.execute(ptl);
       graph.print();
       ptl.remove();
      
   }

}