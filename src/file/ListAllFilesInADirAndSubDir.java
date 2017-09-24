package file;

import java.io.File;
import java.nio.file.Files;

public class ListAllFilesInADirAndSubDir {

	public static void main(String[] args) {

		File mainDir = new File("/Users/rkumar1/Downloads/my-temp/l1");

		if (mainDir.exists() && mainDir.isDirectory()) {

			File[] arr = mainDir.listFiles();
			System.out.println("**********************************************");
			System.out.println("Files from main directory : " + mainDir);
			System.out.println("**********************************************");

			recursivePrint(arr, 0);

		}
	}

	public static void recursivePrint(File[] arr, int level) {
		
		for(File a: arr){
			
			for(int i=0; i<level; i++){
				System.out.println("\t");
			}
			
			if(a.isFile()){
				System.out.println(a.getName());
			}
			
			else if(a.isDirectory()){
				 System.out.println("[" + a.getName() + "]");
				 recursivePrint(a.listFiles(), level+1);
				 
			}
		}

	}

}
