import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";

    MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    public void mouseEntered(MouseEvent m) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent m) {
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent m) {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent m) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseMoved(MouseEvent m) {
        msg = "Mouse moved";
        repaint();
    }

    public void mouseDragged(MouseEvent m) {
        msg = "Mouse dragged";
        repaint();
    }

    public void mouseClicked(MouseEvent m) {
        msg = "Mouse clicked";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 120);
    }

    public static void main(String[] args) {
        MouseEventsDemo m = new MouseEventsDemo();
    }
}
