import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
  public MyFrame (){
    this.setTitle("Janggi Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(540,600);




    

    JLabel label = new JLabel();
    ImageIcon board = new ImageIcon("Janggi Board.png");
    label.setIcon(new ImageIcon(board.getImage().getScaledInstance(540, 600, Image.SCALE_DEFAULT)));
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.LEFT);
    this.add(label);
    


    ImageIcon image = new ImageIcon("remy2.jpg");
    this.setIconImage(image.getImage());
    this.setVisible(true);

  }

}