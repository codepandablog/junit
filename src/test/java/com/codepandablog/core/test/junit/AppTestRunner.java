package com.codepandablog.core.test.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class AppTestRunner {
    public static void main( String[] args ){
    	Result result=JUnitCore.runClasses(TestJunit.class);
        for (Failure failure:result.getFailures()){
        	System.out.println(failure.toString());
        }
    }
}
