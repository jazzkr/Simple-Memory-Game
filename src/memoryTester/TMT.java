package memoryTester;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JFrame;

public class TMT extends JFrame
{
  private static int d = 1;
  static int a = 1;
  private static int e = 3;
  private static int f = 0;
  static String b = "TMT Beta v3.0";
  static int c = 3;
  private static e g = new e();
  private static Toolkit h = Toolkit.getDefaultToolkit();
  private static Random i = new Random();
  private static int j = h.getScreenSize().width;
  private static int k = h.getScreenSize().height;
  private static String[] l = { "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+" };

  public static void main(String[] paramArrayOfString)
  {
    g.setDefaultCloseOperation(3);
    g.setSize(400, 90);
    g.setLocation(j / 2 - 170, k / 3);
    g.setVisible(true);
  }

  public static String a(int paramInt1, int paramInt2)
  {
    String str = "";
    if (paramInt2 % 10 == 0)
    {
      paramInt1 = 1;
      d = m = 1;
      c += 1;
    }
    for (int m = 1; m <= paramInt1; m++)
    {
      if (paramInt2 <= 10)
        f = 26;
      else if ((paramInt2 > 10) || (paramInt2 <= 20))
        f = 36;
      else if (paramInt2 >= 21)
        f = 50;
      int n = i.nextInt(f);
      str = str + l[(n + 1)];
    }
    return str;
  }

  public static int a()
  {
    return d;
  }

  public static void a(int paramInt)
  {
    d = paramInt;
  }

  public static int b()
  {
    return a;
  }

  public static void b(int paramInt)
  {
    a = paramInt;
  }

  public static int c()
  {
    return e;
  }

  public static void c(int paramInt)
  {
    e = paramInt;
  }

  public static int d()
  {
    return 1;
  }

  public static int e()
  {
    return 1;
  }

  public static String f()
  {
    return b;
  }

  public static void g()
  {
    c localc;
    (localc = new c()).setDefaultCloseOperation(3);
    localc.setSize(300, 200);
    localc.setLocation(j / 2 - 170, k / 3);
    localc.setVisible(true);
    g.dispose();
  }

  public static void h()
  {
    j localj;
    (localj = new j()).setSize(300, 280);
    localj.setLocation(j / 2 - 170, k / 3);
    localj.setVisible(true);
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.TMT
 * JD-Core Version:    0.6.2
 */