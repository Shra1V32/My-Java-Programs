import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="AdapterClassDemo" width=300 height=100>
 </applet>
 */

public class AdapterClassDemo extends Applet {
    public void init() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterClassDemo adapterDemo;

    public MyMouseAdapter(AdapterClassDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    public void mouseClicked(MouseEvent me) {
        adapterDemo.showStatus("Mouse clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterClassDemo adapterClassDemo;

    public MyMouseMotionAdapter(AdapterClassDemo adapterClassDemo) {
        this.adapterClassDemo = adapterClassDemo;
    }

    // Handle Mouse dragged
    public void mouseDragged(MouseEvent me) {
        adapterClassDemo.showStatus("Mouse Dragged");
    }
}