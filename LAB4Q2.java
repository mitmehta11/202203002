import java.applet.*;
import java.awt.*;

public class color extends Applet{
Choice d=new Choice();
public void init()
{
d.addItem("Red");
d.addItem("Yellow");
d.addItem("Blue");
d.addItem("Green");
add(d);
}
public void paint(Graphics g)
{
String m=d.getSelectedItem();
 if(m=="Red")
setBackground(Color.red);

else if(m=="Yellow")
setBackground(Color.yellow);

else if(m=="Green")
setBackground(Color.green);


else if(m=="Blue")
setBackground(Color.blue);


}
}