import java.awt.Graphics;
import java.util.Calendar;

public class DemoCalendar extends javax.swing.JApplet{
    private java.util.Calendar calendar;

    public void init(){
        calendar = java.util.Calendar.getInstance();
        setSize(240, 80);
    }

    public void paint(Graphics g) {
        g.drawString("Applet is running:", 30, 15);
        g.drawString(calendar.getTime().toString(), 30, 25);
    }
}
