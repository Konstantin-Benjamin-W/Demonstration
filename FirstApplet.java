import java.awt.Graphics;
import java.util.Calendar;

public class FirstApplet extends javax.swing.JApplet {
    private Calendar calendar;

    public void init(){
        calendar = Calendar.getInstance();
        setSize(200, 100);
    }

    public void paint(Graphics g) {
        g.drawString("First applet is running: ", 30, 20);
        g.drawString(calendar.getTime().toString(), 50, 30);
    }
}
