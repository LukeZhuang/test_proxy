# test_proxy

Use Java Runtime to run "AI/run_proxy.bat" for 200 times(sleep the thread fo 10 seconds after each two times). Run "run.bat" and check the number of lines in "output.txt" to see how many times that "AI/run_proxy.bat" was executed.

1. "run.bat" runs "Main.jar"  
2. "Main.jar" execute "AI/run_proxy.bat" for 200 times and wait for 10 seconds after each 2 times.  
3. In "AI/run_proxy.bat", we echo the current time to "output.txt" and run a simple python model  
4. The number of lines in "output.txt" shows the times that "AI/run_proxy.bat" was executed.  

The default directory is "D:/test". Before running, you may modify it in "AI/run_proxy.bat","run.bat" and "client/Main.java"  
To make "Main.jar, run "client/clean.bat" first and then "client/make.bat"  

# Potential Solution
After adding
```
Thread.sleep(5);
```
We found that "AI/run_proxy.bat" was executed for 133 times, while it was executed for only 100 times before adding that. So, we think that it is caused by too frequent commands.
