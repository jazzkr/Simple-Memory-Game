package memoryTester;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class k
{
  private static Connection k = null;
  static String a = "default1";
  static String b = "default2";
  static String c = "default3";
  static String d = "default4";
  static String e = "default5";
  static int f = 0;
  static int g = 0;
  static int h = 0;
  static int i = 0;
  static int j = 0;

  private static void b()
  {
    try
    {
      String str1 = "codeex";
      String str2 = "amirsays";
      String str3 = "jdbc:mysql://SQL09.FREEMYSQL.NET/memorygame";
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      k = DriverManager.getConnection(str3, str1, str2);
      return;
    }
    catch (Exception localException)
    {
      System.out.println("Cannot connect!");
      System.exit(0);
    }
  }

  private static void c()
  {
    if (k != null)
      try
      {
        k.close();
        return;
      }
      catch (Exception localException)
      {
      }
  }

  public static void a(String paramString, int paramInt)
  {
    b();
    if (k != null)
      try
      {
        Statement localStatement;
        (localStatement = k.createStatement()).executeUpdate("INSERT INTO scores (name, score) VALUES ('" + paramString + "','" + paramInt + "')");
        localStatement.close();
      }
      catch (SQLException localSQLException)
      {
        System.err.println("Error in populate statement.");
      }
    c();
  }

  public static void a()
  {
    b();
    try
    {
      Statement localStatement;
      (localStatement = k.createStatement()).executeQuery("SELECT * FROM scores ORDER BY score DESC LIMIT 5");
      ResultSet localResultSet = localStatement.getResultSet();
      for (int m = 1; localResultSet.next(); m++)
      {
        String str = localResultSet.getString("name");
        int n = localResultSet.getInt("score");
        if (m == 1)
        {
          a = str;
          f = n;
        }
        else if (m == 2)
        {
          b = str;
          g = n;
        }
        else if (m == 3)
        {
          c = str;
          h = n;
        }
        else if (m == 4)
        {
          d = str;
          i = n;
        }
        else if (m == 5)
        {
          e = str;
          j = n;
        }
      }
      localResultSet.close();
      localStatement.close();
    }
    catch (SQLException localSQLException)
    {
      System.err.println("Error in readhighscores statement!");
    }
    c();
  }
}

/* Location:           /Users/krisztiankurucz/Google Drive/Misc Java Projects/TMTbetav3.0O/
 * Qualified Name:     memoryTester.k
 * JD-Core Version:    0.6.2
 */