 
import com.ssaurel.swingpaint.DrawArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
 
public class SwingPaint {
  int status=0, pos=0;
  JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn,pencilBtn,brushBtn,eraserBtn;
  DrawArea drawArea;
  
  ActionListener actionListener = new ActionListener() {
 
 
      public void actionPerformed(ActionEvent e) {
          
         if(e.getSource()== pencilBtn)
          {
                status=1;
             // JOptionPane.showMessageDialog(null,"Clicked");
               pos = 1;  
          }
        
        if(status == 1)
        {
            if (e.getSource() == blackBtn) {
                drawArea.black();
            } else if (e.getSource() == blueBtn) {
                drawArea.blue();
            } else if (e.getSource() == greenBtn) {
                drawArea.green();
            } else if (e.getSource() == redBtn) {
                drawArea.red();
            } else if (e.getSource() == magentaBtn) {
                drawArea.magenta();
            }
            drawArea.position(pos);
        }
        if (e.getSource() == clearBtn) {
                drawArea.clear();
        }
         if(e.getSource()== brushBtn)
        {
            status=2;
            pos=2;
             // JOptionPane.showMessageDialog(null,"Clicked");
        }
        //code for brush
        
        
        if(status == 2)
        {
            if (e.getSource() == blackBtn) {
                drawArea.black();
            } else if (e.getSource() == blueBtn) {
                drawArea.blue();
            } else if (e.getSource() == greenBtn) {
                drawArea.green();
            } else if (e.getSource() == redBtn) {
                drawArea.red();
            } else if (e.getSource() == magentaBtn) {
                drawArea.magenta();
            }
        drawArea.position(pos);
        }
        
        //code for eraser
       if(e.getSource() == eraserBtn)
       {
           status=3;
           pos=3;
             //JOptionPane.showMessageDialog(null," eraser Clicked");
       }
        
        if(status ==3)
        {
            
                
                drawArea.eraser();
                drawArea.position(pos);
            
        }
        
    }
  };
 
  public static void main(String[] args) {
    new SwingPaint().show();
   
  }
  

 
  public void show() {
    // create main frame
    JFrame frame = new JFrame("Paint Application ");
    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    // create draw area
    drawArea = new DrawArea();
 
    // add to content pane
    content.add(drawArea, BorderLayout.CENTER);
 
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
 
    clearBtn = new JButton("Clear All");
    clearBtn.addActionListener(actionListener);
    blackBtn = new JButton("Black");
    blackBtn.addActionListener(actionListener);
    blueBtn = new JButton("Blue");
    blueBtn.addActionListener(actionListener);
    greenBtn = new JButton("Green");
    greenBtn.addActionListener(actionListener);
    redBtn = new JButton("Red");
    redBtn.addActionListener(actionListener);
    magentaBtn = new JButton("Magenta");
    magentaBtn.addActionListener(actionListener);
    pencilBtn=new JButton("Pencil");
    pencilBtn.addActionListener(actionListener);
    brushBtn=new JButton("Brush");
    brushBtn.addActionListener(actionListener);
    eraserBtn=new JButton("Eraser");
    eraserBtn.addActionListener(actionListener);
    // add to panel
    controls.add(pencilBtn);
    controls.add(brushBtn);
    controls.add(greenBtn);
    controls.add(blueBtn);
    controls.add(blackBtn);
    controls.add(redBtn);
    controls.add(magentaBtn);
    controls.add(eraserBtn);
    controls.add(clearBtn);
 
    greenBtn.setBackground(Color.GREEN);
    blueBtn.setBackground(Color.BLUE);
    redBtn.setBackground(Color.RED);
    magentaBtn.setBackground(Color.MAGENTA);
    greenBtn.setBackground(Color.GREEN);
    blackBtn.setBackground(Color.GRAY);
    // add to content pane
    content.add(controls, BorderLayout.NORTH);
 
    frame.setSize(2000, 1200);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // show the swing paint result
    frame.setVisible(true);
 
 //ImageIcon i=new ImageIcon("C:\\Users\\rbsal\\Desktop\\paintimage\\p1.jpg");
   //brushBtn.setIcon(i);
  }
 
}
