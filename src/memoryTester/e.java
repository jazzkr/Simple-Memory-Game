package memoryTester;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public final class e extends JFrame
{
  public e()
  {
    super(TMT.f());
    setLayout(new FlowLayout());
    JButton localJButton1 = new JButton("Play!");
    add(localJButton1);
    JButton localJButton2 = new JButton("how to play");
    add(localJButton2);
    JButton localJButton3 = new JButton("High Scores");
    add(localJButton3);
    JButton localJButton4 = new JButton("Exit");
    add(localJButton4);
    JLabel localJLabel = new JLabel("CodeEx.co.cc");
    add(localJLabel);
    localJLabel.setForeground(Color.red);
    localJButton1.setForeground(Color.blue);
    localJButton2.setForeground(Color.blue);
    localJButton3.setForeground(Color.blue);
    localJButton4.setForeground(Color.blue);
    getContentPane().setBackground(Color.lightGray);
    localJButton1.addActionListener(new f(this));
    localJButton2.addActionListener(new g(this));
    localJButton4.addActionListener(new h(this));
    localJButton3.addActionListener(new i(this));
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.e
 * JD-Core Version:    0.6.2
 */