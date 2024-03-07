import java.io.*;
class fstr
{
	public static void main(String args[]) throws IOException
	{
		if(args.length!=2)
		{
			System.out.println("Enter the file names in command line argument\n");
		}
		String file1=args[0];
		String file2=args[1];
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file1));
			BufferedWriter w = new BufferedWriter(new FileWriter(file2, true));
			 String line;
			 while ((line = br.readLine()) != null)
			 {
				 String[] words = line.split("[,]+");
				 for (String word : words) 
				{
					 if (word.length() > 3) 
					{
						 w.write(word);
						 w.write(" ");
					 }
				 }
 			} 
			w.close();
			System.out.println("Successfully written to file");
		}
		catch(IOException e)
		{
			System.out.println("error in writing file\n");
		}
	}
}