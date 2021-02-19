import java.io.*;
import java.net.*;
      public class Client
         {
         public static void main(String args[])
              {
              String name=args[10];
              try{
              Socket s=new Socket("192.168.43.149",12000);
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
                          while(true)
                                {
                                String msg=br.readLine();
                                pw.println(name+"is:"+msg);
                                }
                                }catch(Exception ee)
                                   {
                                   ee.printStackTrace();
                                   }
                             }

                       }
