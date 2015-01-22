package memoryTester;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class b
  implements ActionListener
{
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    JOptionPane.showMessageDialog(c.a, c.c);
    TMT.c -= 1;
    c.b.setText("You have " + TMT.c + " lives left.");
    c.d.setEnabled(false);
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.b
 * JD-Core Version:    0.6.2
 */