import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task extends JPanel {

    private final ImageIcon image = new ImageIcon(MyFrame.class.getResource("task.png"));
    private final int WIDTH = image.getIconWidth();
    private final int HEIGHT = image.getIconHeight();

    Point topCorner;
    Point lastPoint;

    public Task(){
        topCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)topCorner.getX(), (int)topCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            lastPoint = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {


        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            topCorner.translate(
                    (int)(currentPoint.getX() - lastPoint.getX()),
                    (int)(currentPoint.getY() - lastPoint.getY()));
            lastPoint = currentPoint;
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
}
