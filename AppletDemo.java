import java.awt.*;
import java.applet.*;
/* <applet code="AppletDemo" width="400" height="500">
</applet>
 */
public class AppletDemo extends Applet {
        public void paint(Graphics g) {
            setBackground(Color.LIGHT_GRAY);

            g.setColor(Color.BLACK);
            g.fillRect(10, 30, 100, 50);

            g.setColor(Color.RED);
            g.fillOval(20, 70, 20, 20);
            g.fillOval(80, 70, 20, 20);

            g.setColor(Color.CYAN);
            g.fillRect(80,40,30,20);
        }
}
