import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Iterator;

/**
* CS 3114 Data Structures and Algorithms Midterm 2 Exam.
*
* Please sign your name and PID in the author block below. By placing
* your PID here, you agree to the following.
*
* On my honor:
*
* - I have not used source code obtained from another student,
* or any other unauthorized source, either modified or
* unmodified.
*
* - All source code and documentation used in my program is
* either my original work, or was derived by me from the
* source code published in the textbook for this course.
*
* - I have not discussed coding details about this exam with
* anyone other than my instructor, ACM/UPE tutors, or the TAs
* assigned to this course. I have violated neither the spirit
* nor letter of this restriction.
*
* @author <montano7>
* @version <5/1/2020>
*
*/
public class Exam2 {
	
	/**
	* Question 1 Part A
	*
	* Implement a BFS traversal.
	*
	* @param G is a Graph object to traverse
	*
	* @param start is the index of the starting Node for the traversal
	*
	* @return a List<Node> of all Nodes in the order they were visited.
	* The node with index start is visited first.
	*/
	public static List<Node> question1a(Graph G, int start) {
		
        // initialize the output list
        List<Node> output = new LinkedList<Node>();
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	    
	}
	
	/**
	* Question 1 Part B
	*
	* Implement a DFS traversal.
	*
	* @param G is a Graph object to traverse
	*
	* @param start is the index of the starting Node for the traversal
	*
	* @return a List<Node> of all Nodes in the order they were visited.
	* The node with index start is visited first.
	*/
	public static List<Node> question1b(Graph G, int start) {
        // initialize the output list
        List<Node> output = new LinkedList<Node>();
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	}

	/**
	* Question 2 Part A
	*
	* Find the length of the shortest path between two nodes in the graph.
	*
	* @param G is a Graph object
	*
	* @param start is the index of the starting Node
	*
	* @param end is the index of target Node
	*
	* @return an int specifying the length of the shortest path between
	* the Nodes at start and end. If start = end, return 0.
	*/
	public static int question2a(Graph G, int start, int end) {
        // initialize the output int
        int output = 0;
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	}

	/**
	* Question 2 Part B
	*
	* Find the longest shortest path from start to any other Node in the graph
	*
	* @param G is a Graph object
	*
	* @param start is an int array of starting indices
	*
	* @return an int value specifying the length of the longest shortest path
	*/
	public static int question2b(Graph G, int start) {
        // initialize the output int
        int output = 0;
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	}

	/**
	* Question 3 Part A
	*
	* Find the shortest path between two nodes in the graph.
	*
	* @param G is a Graph object
	*
	* @param start is the index of the starting Node
	*
	* @param end is the index of target Node
	*
	* @return a List<Node> of all Nodes visited on the shortest path between
	* start and end, in the order that they were visited.
	*/
	public static List<Node> question3a(Graph G, int start, int end) {
        // initialize the output list
        List<Node> output = new LinkedList<Node>();
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	}

	/**
	* Question 3 Part B
	*
	* Determine whether there exists a path meeting the goal.
	*
	* @param G is a Graph object
	*
	* @param start is an int array of starting indices
	*
	* @param end is the index of target Node
	*
	* @return a List<Node> specifying the shortest path from ANY start
	* Node to the target Node
	*/
	public static List<Node> question3b(Graph G, int[] start, int end) {
        // initialize the output list
        List<Node> output = new LinkedList<Node>();
        // fill in in your code here
        // ...
        // ...
        // ...
        // return your solution
        return output;
	}
}
