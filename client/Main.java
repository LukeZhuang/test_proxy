import java.io.*;
import java.util.*;

public class Main{
	public static void runCommand(int id){
		try
		{
			String idString=Integer.toString(id+1);
			String command="D:\\test\\AI\\run_proxy.bat";
			String windowsCommandPrefix = "CMD /C ";
			String completeCommand = windowsCommandPrefix + command;
			System.out.println("\n" + idString+ " "+ completeCommand);
			Process proc = Runtime.getRuntime().exec(windowsCommandPrefix + command);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		try{
			for(int i=0;i<100;i++){
				runCommand(i);
				runCommand(i);
				Thread.sleep(10000);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}