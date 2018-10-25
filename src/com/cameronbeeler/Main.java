package com.cameronbeeler;

public class Main {

    public static void main(String[] args)
    {
//        new Thread(new codeToRun()).start();
        new Thread(()-> System.out.println("Printing from within the lambda expression")).start();
	// write your code here
    }
}

class codeToRun
implements Runnable
{
    @Override
    public
    void run()
    {
        System.out.println("Printing codeToRun class");
    }
}