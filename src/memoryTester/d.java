package memoryTester;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class d
  implements KeyListener
{
  public final void keyPressed(KeyEvent paramKeyEvent)
  {
    if (KeyEvent.getKeyText(paramKeyEvent.getKeyCode()) == "Enter")
    {
      paramKeyEvent = c.a();
      String str;
      if ((str = c.b()).equals(paramKeyEvent))
        c.a(true);
      else
        c.a(false);
      c.a(TMT.a(TMT.a(), TMT.b()));
    }
  }

  public final void keyReleased(KeyEvent paramKeyEvent)
  {
  }

  public final void keyTyped(KeyEvent paramKeyEvent)
  {
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.d
 * JD-Core Version:    0.6.2
 */