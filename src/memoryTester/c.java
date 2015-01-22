package memoryTester;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public final class c extends JFrame
{
  private static String e = TMT.a(TMT.a(), TMT.b());
  private static JLabel f;
  private static JLabel g;
  static JTextField a;
  private static JLabel h;
  private static JLabel i;
  private static JLabel j;
  static JLabel b;
  static String c;
  private static a k = new a();
  private static b l = new b();
  private static Timer m = new Timer(1000, k);
  private static d n = new d();
  static JButton d = new JButton("Hint");

  public c()
  {
    super(TMT.f());
    setLayout(new FlowLayout());
    f = new JLabel(e);
    b = new JLabel("You have " + TMT.c + " lives left.");
    g = new JLabel("You have " + TMT.c() + " seconds to memorize this:");
    h = new JLabel("Incorrect! The text did not match. You lose.");
    i = new JLabel("Correct! You are now moving on to level " + TMT.b() + ".");
    j = new JLabel("Incorrect! The text did not match. You have lost a life.");
    a = new JTextField(20);
    add(g);
    add(f);
    add(a);
    add(d);
    add(b);
    g.setForeground(Color.blue);
    f.setForeground(Color.RED);
    d.setForeground(Color.blue);
    b.setForeground(Color.red);
    getContentPane().setBackground(Color.LIGHT_GRAY);
    a(TMT.a(TMT.a(), TMT.b()));
    a.setEditable(false);
    m.start();
  }

  public static void a(String paramString)
  {
    f.setText(paramString);
    c = paramString;
  }

  public static String a()
  {
    String str;
    if (a.getText() != null)
      str = a.getText();
    else
      str = "empty";
    return str;
  }

  public static String b()
  {
    return c;
  }

  public static void a(boolean paramBoolean)
  {
    a.setText("");
    if (paramBoolean)
    {
      i.setText("Correct! You are now moving on to level " + (TMT.b() + 1) + ".");
      JOptionPane.showMessageDialog(a, i);
      TMT.b(TMT.b() + 1);
      TMT.a(TMT.a() + 1);
    }
    else if (!paramBoolean)
    {
      h.setText("Incorrect! The text did not match. You lose. The answer was: " + c);
      if (TMT.c <= 0)
      {
        JOptionPane.showMessageDialog(a, h);
        if (((paramBoolean = JOptionPane.showConfirmDialog(null, "Would you like to submit your score to the online database?", "Submit Score", 0)) == 0) && ((paramBoolean = JOptionPane.showInputDialog(null, "Please enter your name:\n(Your name can only be 10 characters long!)", "Submit Score", -1)) != null) && (paramBoolean.length() > 0))
          try
          {
            k.a(paramBoolean, TMT.a);
          }
          catch (Exception localException)
          {
            JOptionPane.showMessageDialog(null, "There is a problem reaching the server right now. Please notify a Codeex team member if this problem persists.");
          }
        TMT.a(TMT.d());
        TMT.b(TMT.e());
        TMT.c = 3;
      }
      else
      {
        TMT.c -= 1;
        JOptionPane.showMessageDialog(a, j);
      }
    }
    TMT.c(3);
    g.setText("You have " + TMT.c() + " seconds to memorize this:");
    b.setText("You have " + TMT.c + " lives left.");
    a.setEditable(false);
    a.removeKeyListener(n);
    d.removeActionListener(l);
    m.start();
  }

  public static void c()
  {
    TMT.c(TMT.c() - 1);
    g.setText("You have " + TMT.c() + " seconds to memorize this:");
    if (TMT.c() <= 0)
    {
      f.setText("");
      g.setText("Now write it!");
      a.setEditable(true);
      if (TMT.c == 0)
        d.setEnabled(false);
      else
        d.setEnabled(true);
      a.addKeyListener(n);
      m.stop();
      d.addActionListener(l);
    }
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.c
 * JD-Core Version:    0.6.2
 */