
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class virtualKey {
	//create File
	public static void genaretFile(String fileName) throws IOException 
	{
		String filePath="D:\\Java Simplilearn\\Project sample\\";
		ArrayList<String> aList=new ArrayList<String>();
		
		System.out.println("Enter the file name to be created");
		String finalname=filePath+fileName;
		
		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) 
		{
			System.out.println("The file not created");
		}
		else 
		{
			aList.add(fileName);
			System.out.println("File created");
		}
		
		System.out.println("Your list is ... "+aList);
	}
	
	//Delete file
	
	public static void deleteFile(String fileName) {
		String path="D:\\Java Simplilearn\\Project sample\\";
		System.out.println("Enter the file name to be deleted");

		String finalfile=path+fileName;
		File file=new File(finalfile);
		file.delete();
		System.out.println("File deleted");
		
	}
	//Searching file
	
	public static void serchFile(String serchingFileName) {
		String path="D:\\Java Simplilearn\\Project sample\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		int count=0;
		for(File ff:filename) {
			
			if(ff.getName().equals(serchingFileName))
			{
				count++;
				break;
			}else {
				count=0;
			}
		}
		if (count!=0) {
			System.out.println("You have "+serchingFileName+" File");
			
		}else {
			System.out.println("File  not found");
		}
	}
	
	//Display list
	
	public  static void displayFile() {
		String path="D:\\Java Simplilearn\\Project sample\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		System.out.println("Your File List.......");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner =new Scanner(System.in);
		boolean c=true;
		
		
		
		while(c) {
			System.out.println("*******Welcome to LockedMe.com*******");
			System.out.println("Project Name : Virtual key for your repositories");
			System.out.println("Developer Name : Pradyumna Mangave");
			System.out.println("Enter 1 : For Retrieving File");
			System.out.println("Enter 2 : For Business Operations");
			System.out.println("Enter 3 : For Closing System");
			System.out.println();
			boolean b=true;
			int x=scanner.nextInt();
			switch (x) {
			case 1:{
				displayFile();
				System.out.println();
				break;
			}
			case 2: 
			{	while(true) {
				System.out.println("Business Level Operations");
				System.out.println();
				System.out.println("Enter 1 :For Creating File");
				System.out.println("Enter 2 :For Deleting File");
				System.out.println("Enter 3 :For Searching File");
				System.out.println("Enter 4 :For Main Menu");
				System.out.println();
				int i=scanner.nextInt();
				
				if(i<=0 || i>=5) {									
					
					System.out.println("Enter valid number");
					System.out.println();
			
				}else{
					
							
							
						
								if(i==1){
									System.out.println("Enter the File Name to be Created");
									
									String  FileForCreate=scanner.next();
									genaretFile(FileForCreate);
									System.out.println();
									
								}
								else if(i==2) {
									System.out.println("Enter the File Name to be deleted");
									String FileForDelete=scanner.next();
									deleteFile(FileForDelete);
									System.out.println();
								}
								else if(i== 3) {
									System.out.println("Enter the File Name for Serching");
									
								
								String FileForSerching=scanner.next();
								serchFile(FileForSerching);
								System.out.println();
								}
								else if(i==4) {
									System.out.println("Main menu");
									System.out.println();
									break;
								}
					
						}
						
						
			}
			break;
				}
			
			case 3:{
				System.out.println("System close");
				c=false;
				break;
				
			}
			}
			
			
			
			
		}
		
	}

}
