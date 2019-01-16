package csi311;

// Import some standard Java libraries.
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world example.  Shows passing in command line arguments, in this case a filename. 
 * If the filename is given, read in the file and echo it to stdout.
 */
public class HelloCsi311 {

    /**
     * Class construtor.
     */
    public HelloCsi311() {
    }
    

    /**
     * @param filename the name of a file to read in 
     * @throws Exception on anything bad happening 
     */
    public void run(String filename) throws Exception {
    	System.out.println("Hello world");
    	if (filename != null) {
    		dumpFile(filename); 
    	}
    }
    
    
    /**
     * @param filename the name of a file to read in 
     * @throws Exception on anything bad happening 
     */
    private void dumpFile(String filename) throws Exception {
    	System.out.println("Dumping file " + filename); 
    	// Open the file and connect it to a buffered reader.
    	BufferedReader br = new BufferedReader(new FileReader(filename));  
    	String line = null;  
    	// Get lines from the file one at a time until there are no more.
    	while ((line = br.readLine()) != null) {
    		System.out.println(line); 
    	} 
    	// Close the buffer and the underlying file.
    	br.close();
    }

    
    /**
     * @param args filename
     */
    public static void main(String[] args) {
    	// Make an instance of the class.
    	HelloCsi311 theApp = new HelloCsi311();
    	String filename = null; 
    	// If a command line argument was given, use it as the filename.
    	if (args.length > 0) {
    		filename = args[0]; 
    	}
    	try { 
    		// Run the run(), passing in the filename, null if not specified.
    		theApp.run(filename);
    	}
    	catch (Exception e) {
    		// If anything bad happens, report it.
    		System.out.println("Something bad happened!");
    		e.printStackTrace();
    	}
    }
}
