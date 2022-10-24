package org.example;

import org.testng.annotations.Test;

public class TestAnnotationEnable {

    @Test
    public void c_language()
    {
        System.out.println("C language");
    }
    @Test(enabled=false)
    public void jira()
    {
        System.out.println("JIRA is a testing tool");
    }
    @Test
    public void java()
    {
        System.out.println("JAVA language");
    }
}
