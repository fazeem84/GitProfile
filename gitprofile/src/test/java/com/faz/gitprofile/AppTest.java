package com.faz.gitprofile;

import com.faz.gitprofile.restservice.GitRequestHandler;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    public void testcreateProfile(){
    	try {
			Object jsonArr=new GitRequestHandler().createProfile("fazeem84");
			System.out.println("Profiles Details"+jsonArr.toString());
			assertNotNull(jsonArr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
   
    public void testGetRepos(){
    	try {
			Object jsonArr=new GitRequestHandler().getRepoDetails("fazeem84");
			System.out.println("RepoDetails"+jsonArr.toString());
			assertNotNull(jsonArr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public void testGetUserDetails(){
    	try {
			Object jsonArr=new GitRequestHandler().getUserDetails("fazeem84");
			System.out.println("UserDetails "+jsonArr.toString());
			assertNotNull(jsonArr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
