package com.IO;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
File file=new File("//Users//mns//Desktop//Innovapath//");
File[] files=file.listFiles();
for(File s:files)
{
	System.out.println(s.getName());
}
	}

}
