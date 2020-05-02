import java.util.Scanner;
import java.io.File;
import java.util.Iterator;

/**
* Main program for analyzing CA road network data from SNAP dataset.
*/
public class RoadGraph {

	/**
	* Driver code that reads a file name from args[1], opens the
	* file, and reads all edges in the file into a Graph structure.
	*
	* @param args[] is a list of command line arguments.
	*/
	public static void main(String args[]) {
		// The roads data structure.
		Graph roads = new Graph(1);
		// Check whether any command-line arguments were given.
		if (args.length < 1) {
			// If no arguments were given, display a message.
			System.out.println("No file given.");
			return;
		}
		else {
			// Create a pointer to the file at args[0].
			File fp = new File(args[0]);
			// Create a string for reading data.
			String edge;
			// Integers for storing edges and graph size.
			int n1, n2;
			int numRoads;
			// Try to execute the following block of code.
			try {
      		// Start a scanner at the beginning of the File.
      		Scanner input = new Scanner(fp);
				boolean first = true;
      		// For each line in the file...
      		while (input.hasNextLine()) {
					// Read the next edge into a String.
					edge = input.nextLine();
					// Filter out comments.
					if (!(Character.compare(edge.charAt(0), '%') == 0)) {
						if(first) {
							// Read the size of the road network.
							numRoads = Integer.parseInt(edge.split("\\s+")[0]);
							// Initialize a new road network.
							roads = new Graph(numRoads);
							first = false;
						}
						else {
							// Read in each edge.
							n1 = Integer.parseInt(edge.split("\\s+")[0]) - 1;
							n2 = Integer.parseInt(edge.split("\\s+")[1]) - 1;
							roads.addEdge(n1, n2);
						}
					}
				}
				// Close the Scanner object.
				input.close();
			}
			// If an error occurs, raise the following exception.
			catch (Exception e) {
      		e.printStackTrace();
				return;
			}
			
			//Execute a specific exam question method, or exercise them all at once. 
			String[] questions = new String[] {"1A", "1B", "2A", "2B", "3A", "3B"};
			if(args.length > 1 && args[1] != null) {
	            runTest(args[1], roads);
			}else {
			    for (int i=0; i<6; i++) {
		            runTest(questions[i], roads);
		        }
			}
			
		}
		
		// Execution completed.
		return;
	}
	
	private static void runTest(String questionToRun, Graph roads) {
	    
	    switch (questionToRun) {
            case "1A":
            case "1a":
	            outputQuestion1a(roads);
	            break;
            case "1B":
            case "1b":
                outputQuestion1b(roads);
                break;
            case "2A":
            case "2a":
                outputQuestion2a(roads);
                break;
            case "2B":
            case "2b":
                outputQuestion2b(roads);
                break;
            case "3A":
            case "3a":
                outputQuestion3a(roads);
                break;
            case "3B":
            case "3b":
                outputQuestion3b(roads);
                break;
            default:
                System.out.println("Error: This test is not implemented");
                break;
	    }
	}
	
	private static void outputQuestion1a(Graph roads) {
	 // Tests for Q1A
        System.out.println("Question 1 A Solution");
        Iterator<Node> output;
        for (int i=0; i<roads.getNumNodes(); i++) {
            try {
                output = Exam2.question1a(roads, i).iterator();
                System.out.println("Node " + Integer.toString(i+1) + ": ");
                System.out.print("\t");
                while (output.hasNext())
                    System.out.print(output.next() + " ");
                System.out.println("");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("");
	}
	
	private static void outputQuestion1b(Graph roads) {
	     // Tests for Q1B
	        System.out.println("Question 1 B Solution");
	        Iterator<Node> output;
	        for (int i=0; i<roads.getNumNodes(); i++) {
	            try {
    	            output = Exam2.question1b(roads, i).iterator();
    	            System.out.println("Node " + Integer.toString(i+1) + ": ");
    	            System.out.print("\t");
    	            while (output.hasNext())
    	                System.out.print(output.next() + " ");
    	            System.out.println("");
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	        System.out.println("");
	    }	

	private static void outputQuestion2a(Graph roads) {
	    // Tests for Q2A
	    System.out.println("Question 2 A Solution");
        for (int i=0; i<roads.getNumNodes(); i++) {
            System.out.println("Distances from " + Integer.toString(i+1) + ": ");
            System.out.print("\t");
            for (int j=0; j<roads.getNumNodes(); j++) {
                System.out.print(Exam2.question2a(roads, i, j));
                if (j < roads.getNumNodes() - 1)
                    System.out.print(" ");
                else
                    System.out.println("");
            }
        }
        System.out.println("");
	}
    private static void outputQuestion2b(Graph roads) {
        // Tests for Q2B
        System.out.println("Question 2 B Solution");
        System.out.println("MaxDist: ");
        System.out.print("\t");
        for (int i=0; i<roads.getNumNodes(); i++) {
            System.out.print(Exam2.question2b(roads, i));
            System.out.print(" ");
        }
        System.out.println("");
   }

    private static void outputQuestion3a(Graph roads) {
        // Tests for Q3A
        System.out.println("Question 3 A Solution");
        Iterator<Node> output;
        for (int i=0; i<roads.getNumNodes(); i++) {
            System.out.println("From Node " + Integer.toString(i+1) + ":");
            for (int j=0; j<roads.getNumNodes(); j++) {
                try {
                    output = Exam2.question3a(roads, i, j).iterator();
                    System.out.print("\t To Node " + Integer.toString(j+1) + ": ");
                    while (output.hasNext())
                        System.out.print(output.next() + " ");
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("");        
    }
    
    private static void outputQuestion3b(Graph roads) {
        // Tests for Q3B
        System.out.println("Question 3 B Solution");
        Iterator<Node> output;
        int[] nodeList1 = new int[roads.getNumNodes()];
        int[] nodeList2 = new int[(roads.getNumNodes() + 1)/2];
        int[] nodeList10 = new int[(roads.getNumNodes() + 9)/10];
        int[] lastNode = new int[1];
        for (int i=0; i<roads.getNumNodes(); i++) { // Generate all nodes.
            nodeList1[i] = i;
            if (i % 2 == 0)
                nodeList2[i/2] = i;
            if (i % 10 == 0)
                nodeList10[i/10] = i;
        }
        lastNode[0] = roads.getNumNodes() - 1;
        // Now check on the 4 node sets above
        for (int i=0; i<roads.getNumNodes(); i++) {
            try {
                output = Exam2.question3b(roads, nodeList1, i).iterator();
                System.out.println("Shortest path to " + Integer.toString(i+1)
                    + " from:");
                System.out.print("\t All nodes: ");
                while (output.hasNext())
                    System.out.print(output.next() + " ");
                System.out.println("");
                output = Exam2.question3b(roads, nodeList2, i).iterator();
                System.out.print("\t Odd nodes: ");
                while (output.hasNext())
                    System.out.print(output.next() + " ");
                System.out.println("");
                output = Exam2.question3b(roads, nodeList10, i).iterator();
                System.out.print("\t Every 10th node: ");
                while (output.hasNext())
                    System.out.print(output.next() + " ");
                System.out.println("");
                output = Exam2.question3b(roads, lastNode, i).iterator();
                System.out.print("\t Last node: ");
                while (output.hasNext())
                    System.out.print(output.next() + " ");
                System.out.println("");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
