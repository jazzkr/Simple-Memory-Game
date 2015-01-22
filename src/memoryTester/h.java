package memoryTester;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

final class h
  implements ActionListener
{
  h(e parame)
  {
  }

  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    if ((paramActionEvent = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "User Confirmation", 0)) == 0)
      System.exit(0);
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.h
 * JD-Core Version:    0.6.2
 */