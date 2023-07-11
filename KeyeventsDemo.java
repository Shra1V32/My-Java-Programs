import java.awt.event.*;
import java.awt.*;

public class KeyeventsDemo extends Frame implements KeyListener, WindowListener {
    String msg="";
    KeyeventsDemo() {
        addKeyListener(this);
        addWindowListener(this);
        setSize(300, 350);
        setVisible(true);
    }

    public void keyPressed(KeyEvent k) {
        msg="Key pressed";
        repaint();
    }

    public void keyReleased(KeyEvent k) {
        msg="key released";
        repaint();
    }

    public void keyTyped(KeyEvent k) {
        msg="Key typed";
        repaint();
    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 150);
    }

    public static void main(String x[]) {
        KeyeventsDemo k = new KeyeventsDemo();
    }
}
