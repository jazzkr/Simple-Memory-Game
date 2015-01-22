package memoryTester;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class j extends JFrame
{
  private Font a = new Font("Helvetica", 1, 15);

  public j()
  {
    super(TMT.b);
    setLayout(new FlowLayout());
    JPanel localJPanel = new JPanel(new GridLayout(6, 2, 15, 20));
    add(localJPanel, "Center");
    try
    {
      k.a();
    }
    catch (Exception localException)
    {
      JOptionPane.showMessageDialog(null, "There is a problem reaching the server right now. Please notify a Codeex team member if this problem persists.");
    }
    JLabel localJLabel1;
    (localJLabel1 = new JLabel("Name")).setFont(this.a);
    JLabel localJLabel2 = new JLabel(k.a);
    JLabel localJLabel3 = new JLabel(k.b);
    JLabel localJLabel4 = new JLabel(k.c);
    JLabel localJLabel5 = new JLabel(k.d);
    JLabel localJLabel6 = new JLabel(k.e);
    JLabel localJLabel7;
    (localJLabel7 = new JLabel("Score")).setFont(this.a);
    JLabel localJLabel8 = new JLabel(Integer.toString(k.f));
    JLabel localJLabel9 = new JLabel(Integer.toString(k.g));
    JLabel localJLabel10 = new JLabel(Integer.toString(k.h));
    JLabel localJLabel11 = new JLabel(Integer.toString(k.i));
    JLabel localJLabel12 = new JLabel(Integer.toString(k.j));
    localJPanel.add(localJLabel1);
    localJPanel.add(localJLabel7);
    localJPanel.add(localJLabel2);
    localJPanel.add(localJLabel8);
    localJPanel.add(localJLabel3);
    localJPanel.add(localJLabel9);
    localJPanel.add(localJLabel4);
    localJPanel.add(localJLabel10);
    localJPanel.add(localJLabel5);
    localJPanel.add(localJLabel11);
    localJPanel.add(localJLabel6);
    localJPanel.add(localJLabel12);
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.j
 * JD-Core Version:    0.6.2
 */