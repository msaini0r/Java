

		import java.io.File;
		import java.util.Scanner;
		import java.util.regex.Matcher;
		import java.util.regex.Pattern;
		/*
		Create a java program to search through the home directory and look for files that match a regular expression.
		The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
		 */
		public class Assignment1 {
		    public void findMatchFileAndPrint(String path, String pattern) {
		        File folder = new File(path);
		        File[] listOfFiles = folder.listFiles();
		        for (int i = 0; i < listOfFiles.length; i++) {
		            if (listOfFiles[i].isFile()) {
		                //System.out.println("File " + listOfFiles[i].getName());
		                try{
		                    Pattern patternobj = Pattern.compile(pattern);//. represents single character
		                    Matcher matcher = patternobj.matcher(listOfFiles[i].getName());
		                    boolean check = matcher.matches();
		                    if (check) {
		                        System.out.println(listOfFiles[i].getAbsolutePath());

		                    }}
		                catch (Exception exception){
		                    System.out.println(exception.getMessage());
		                    return;
		                }
		            }
		        }
		    }
		    public void firstAssignment(){
		        Scanner scanner=new Scanner(System.in);
		        while(true){
		            System.out.println("Enter your choice");
		            System.out.println("press 1 for continue");
		            System.out.println("press 2 for exit");
		            int choice=Integer.parseInt(scanner.nextLine());
		            switch (choice){
		                case 1:
		                    String path=scanner.nextLine();
		                    String pattern=scanner.nextLine();
		                    //   .*\.txt
		                    findMatchFileAndPrint(path,pattern);
		                    break;
		                case 2:return;
		                default:
		                    System.out.println("invalid choice try again");
		            }

		        }

		    }
		}
	