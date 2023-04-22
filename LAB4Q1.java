import java.applet.*;
import java.awt.*;
import java.util.Scanner;
public class inputA extends Applet
{

public void paint(Graphics g)
{ Scanner d=new Scanner(System.in);
    String name=d.nextLine();
System.out.println("Enter Your Nmae: ");
g.drawString("Hello "+name,100,200);
}
}