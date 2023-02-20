package com.exis.banking.ibwise.core.servicecollector;

import java.io.File;

public class Test {
	 public void walk( String path ) {

	        File root = new File( path );
	        File[] list = root.listFiles();

	        if (list == null) return;

	        for ( File f : list ) {
	            if ( f.isDirectory() ) {
	                walk( f.getAbsolutePath() );
	                System.out.println( "Dir:" + f.getAbsoluteFile() );
	            }
	            else {
	                System.out.println( "File:" + f.getAbsoluteFile() );
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	Test fw = new Test();
	        fw.walk("d:\\tmp\\covibed" );
	    }
}
