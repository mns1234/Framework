package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFromOneFileToAnother {
	static FileOutputStream out;
	static FileInputStream in;
	static void copyfile(){
		try {
			
			in= new FileInputStream("//Users//mns//Desktop//Innovapath//programlist1.txt");
		
			out= new FileOutputStream("//Users//mns//Desktop//Innovapath//programlist.txt");
			int i;
			try {
				while((i=in.read())!=-1){
				out.write(i);	}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
				out.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
	

	public static void main(String[] args) {
CopyContentFromOneFileToAnother.copyfile();
	}

}
