package graphTracking;

import java.net.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;

public class graphDriver 
{

	public static void main(String[] args) 
	{
		SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> graph = createGraph();
		
		System.out.println(graph.toString());
	}
	
	//Create a weighted graph containing Mario levels, weighted by time needed to progress
	private static SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> createGraph()
	{
		SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
		
		//Level 1-1 vertices
		graph.addVertex("11Start");
		graph.addVertex("11PipeEnt");
		graph.addVertex("11PipeExit");
		graph.addVertex("11End");
		
		//Level 1-1 edges
		DefaultWeightedEdge e1 = graph.addEdge("11Start", "11End");
		DefaultWeightedEdge e2 = graph.addEdge("11Start", "11PipeEnt");
		DefaultWeightedEdge e3 = graph.addEdge("11PipeEnt", "11PipeExit");
		DefaultWeightedEdge e4 = graph.addEdge("11PipeEnt", "11End");
		
		//Level 1-1 weights
		
		
		//Level 1-2 vertices
		graph.addVertex("12Start");
		graph.addVertex("12PipeEnt");
		graph.addVertex("12PipeExit");
		graph.addVertex("12Warp2");
		graph.addVertex("12Warp3");
		graph.addVertex("12Warp4");
		graph.addVertex("12End");
		
		//Level 1-2 edges
		DefaultWeightedEdge e5 = graph.addEdge("12Start", "12End");
		DefaultWeightedEdge e6 = graph.addEdge("12Start", "12Warp2");
		DefaultWeightedEdge e7 = graph.addEdge("12Start", "12Warp3");
		DefaultWeightedEdge e8 = graph.addEdge("12Start", "12Warp4");
		DefaultWeightedEdge e9 = graph.addEdge("12Start", "12PipeEnt");
		DefaultWeightedEdge e10 = graph.addEdge("12PipeEnt", "12PipeExit");
		DefaultWeightedEdge e11 = graph.addEdge("12PipeExit", "12End");
		DefaultWeightedEdge e12 = graph.addEdge("12PipeExit", "12Warp2");
		DefaultWeightedEdge e13 = graph.addEdge("12PipeExit", "12Warp3");
		DefaultWeightedEdge e14 = graph.addEdge("12PipeExit", "12Warp4");
		
		//Level 1-2 weights
		
		
		//Level 1-3 vertices
		graph.addVertex("13Start");
		graph.addVertex("13End");
		
		//Level 1-3 edges
		DefaultWeightedEdge e15 = graph.addEdge("13Start", "13End");
		
		//Level 1-3 weights
		
		
		//Level 1-4 vertices
		graph.addVertex("14Start");
		graph.addVertex("14End");
		
		//Level 1-4 edges
		DefaultWeightedEdge e16 = graph.addEdge("14Start", "14End");
		
		//Level 1-4 weights
		
		//Level 2-1 vertices
		graph.addVertex("21Start");
		graph.addVertex("21PipeEnt");
		graph.addVertex("21PipeExit");
		graph.addVertex("21BeanEnt");
		graph.addVertex("21BeanExit");
		graph.addVertex("21End");
		
		//Level 2-1 edges
		DefaultWeightedEdge e17 = graph.addEdge("21Start", "21End");
		DefaultWeightedEdge e18 = graph.addEdge("21Start", "21PipeEnt");
		DefaultWeightedEdge e19 = graph.addEdge("21Start", "21BeanEnt");
		DefaultWeightedEdge e20 = graph.addEdge("21PipeEnt", "21PipeExit");
		DefaultWeightedEdge e21 = graph.addEdge("21PipeExit", "21End");
		DefaultWeightedEdge e22 = graph.addEdge("21BeanEnt", "21BeanExit");
		DefaultWeightedEdge e23 = graph.addEdge("21BeanExit", "21End");
		
		//Level 2-1 weights
		
		
		//Level 2-2 vertices
		graph.addVertex("22Start");
		graph.addVertex("22End");
		
		//Level 2-2 edges
		DefaultWeightedEdge e24 = graph.addEdge("22Start", "22End");
		
		//Level 2-2 weights
		
		
		//Level 2-3 vertices
		graph.addVertex("23Start");
		graph.addVertex("23End");
		
		//Level 2-3 edges
		DefaultWeightedEdge e25 = graph.addEdge("23Start", "23End");
		
		//Level 2-3 weights
		
		
		//Level 2-4 vertices
		graph.addVertex("24Start");
		graph.addVertex("24End");
		
		//Level 2-4 edges
		DefaultWeightedEdge e26 = graph.addEdge("24Start", "24End");
		
		//Level 2-4 weights
		
		
		//Level 3-1 vertices
		graph.addVertex("31Start");
		graph.addVertex("31PipeEnt");
		graph.addVertex("31PipeExit");
		graph.addVertex("31BeanEnt");
		graph.addVertex("31BeanExit");
		graph.addVertex("31End");
		
		//Level 3-1 edges
		DefaultWeightedEdge e27 = graph.addEdge("31Start", "31End");
		DefaultWeightedEdge e28 = graph.addEdge("31Start", "31PipeEnt");
		DefaultWeightedEdge e29 = graph.addEdge("31Start", "31BeanEnt");
		DefaultWeightedEdge e30 = graph.addEdge("31PipeEnt", "31PipeExit");
		DefaultWeightedEdge e31 = graph.addEdge("31PipeExit", "31End");
		DefaultWeightedEdge e32 = graph.addEdge("31BeanEnt", "31BeanExit");
		DefaultWeightedEdge e33 = graph.addEdge("31BeanExit", "31End");
		
		//Level 3-1 weights
		
		
		//Level 3-2 vertices
		graph.addVertex("32Start");
		graph.addVertex("32End");
		
		//Level 3-2 edges
		DefaultWeightedEdge e34 = graph.addEdge("32Start", "32End");
		
		//Level 3-2 weights
		
		
		//Level 3-3 vertices
		graph.addVertex("33Start");
		graph.addVertex("33End");
		
		//Level 3-3 edges
		DefaultWeightedEdge e35 = graph.addEdge("33Start", "33End");
		
		//Level 3-3 weights
		
		
		//Level 3-4 vertices
		graph.addVertex("34Start");
		graph.addVertex("34End");
		
		//Level 3-4 edges
		DefaultWeightedEdge e36 = graph.addEdge("34Start", "34End");
		
		//Level 3-4 weights
		
		
		//Level 4-1 vertices
		graph.addVertex("41Start");
		graph.addVertex("41PipeEnt");
		graph.addVertex("41PipeExit");
		graph.addVertex("41End");
		
		//Level 4-1 edges
		DefaultWeightedEdge e37 = graph.addEdge("41Start", "41End");
		DefaultWeightedEdge e38 = graph.addEdge("41Start", "41PipeEnt");
		DefaultWeightedEdge e40 = graph.addEdge("41PipeEnt", "41PipeExit");
		DefaultWeightedEdge e41 = graph.addEdge("41PipeExit", "41End");
		
		//Level 4-1 weights
		
		
		//Level 4-2 vertices
		graph.addVertex("42Start");
		graph.addVertex("42PipeEnt");
		graph.addVertex("42PipeExit");
		graph.addVertex("42BeanEnt");
		graph.addVertex("42Warp6");
		graph.addVertex("42Warp7");
		graph.addVertex("42Warp8");
		graph.addVertex("42End");
		graph.addVertex("42Warp5");
		
		//Level 4-2 edges
		DefaultWeightedEdge e42 = graph.addEdge("42Start", "42End");
		DefaultWeightedEdge e43 = graph.addEdge("42Start", "42PipeEnt");
		DefaultWeightedEdge e44 = graph.addEdge("42Start", "42BeanEnt");
		DefaultWeightedEdge e45 = graph.addEdge("42Start", "42Warp5");
		DefaultWeightedEdge e46 = graph.addEdge("42PipeEnt", "42PipeExit");
		DefaultWeightedEdge e47 = graph.addEdge("42PipeExit", "42End");
		DefaultWeightedEdge e48 = graph.addEdge("42PipeExit", "42Warp5");
		DefaultWeightedEdge e49 = graph.addEdge("42BeanEnt", "42Warp6");
		DefaultWeightedEdge e50 = graph.addEdge("42BeanEnt", "42Warp7");
		DefaultWeightedEdge e51 = graph.addEdge("42BeanEnt", "42Warp8");
		
		//Level 4-2 weights
		
		
		//Level 4-3 vertices
		graph.addVertex("43Start");
		graph.addVertex("43End");
		
		//Level 4-3 edges
		DefaultWeightedEdge e52 = graph.addEdge("43Start", "43End");
		
		//Level 4-3 weights
		
		
		//Level 4-4 vertices
		graph.addVertex("44Start");
		graph.addVertex("44End");
		
		//Level 4-4 edges
		DefaultWeightedEdge e53 = graph.addEdge("43Start", "43End");
		
		//Level 4-4 weights
		
		
		//Level 5-1 vertices
		graph.addVertex("51Start");
		graph.addVertex("51End");
		graph.addVertex("51PipeEnt");
		graph.addVertex("51PipeExit");
		
		//Level 5-1 edges
		DefaultWeightedEdge e54 = graph.addEdge("51Start", "51End");
		DefaultWeightedEdge e55 = graph.addEdge("51Start", "51PipeEnt");
		DefaultWeightedEdge e56 = graph.addEdge("51PipeEnt", "51PipeExit");
		DefaultWeightedEdge e57 = graph.addEdge("51PipeExit", "51End");
		
		//Level 5-1 weights
		
		
		//Level 5-2 vertices
		graph.addVertex("52Start");
		graph.addVertex("52PipeEnt");
		graph.addVertex("52PipeExit");
		graph.addVertex("52BeanEnt");
		graph.addVertex("52BeanExit");
		graph.addVertex("52End");
		
		//Level 5-2 edges
		DefaultWeightedEdge e58 = graph.addEdge("52Start", "52End");
		DefaultWeightedEdge e59 = graph.addEdge("52Start", "52PipeEnt");
		DefaultWeightedEdge e60 = graph.addEdge("52Start", "52BeanEnt");
		DefaultWeightedEdge e61 = graph.addEdge("52PipeEnt", "52PipeExit");
		DefaultWeightedEdge e62 = graph.addEdge("52PipeExit", "52End");
		DefaultWeightedEdge e63 = graph.addEdge("52BeanEnt", "52BeanExit");
		DefaultWeightedEdge e64 = graph.addEdge("52BeanExit", "52End");
				
		//Level 5-2 weights
		
		
		//Level 5-3 vertices
		graph.addVertex("53Start");
		graph.addVertex("53End");
		
		//Level 5-3 edges
		DefaultWeightedEdge e65 = graph.addEdge("53Start", "53End");
				
		//Level 5-3 weights
		
		
		//Level 5-4 vertices
		graph.addVertex("54Start");
		graph.addVertex("54End");
		
		//Level 5-4 edges
		DefaultWeightedEdge e66 = graph.addEdge("54Start", "54End");
				
		//Level 5-4 weights
		
		
		//Level 6-1 vertices
		graph.addVertex("61Start");
		graph.addVertex("61End");
		
		//Level 6-1 edges
		DefaultWeightedEdge e67 = graph.addEdge("61Start", "61End");
			
		//Level 6-1 weights
				
				
		//Level 6-2 vertices
		graph.addVertex("62Start");
		graph.addVertex("62Pipe1Ent");
		graph.addVertex("62Pipe1Exit");
		graph.addVertex("62Pipe2Ent");
		graph.addVertex("62Pipe2Exit");
		graph.addVertex("62Pipe3Ent");
		graph.addVertex("62Pipe4Exit");
		graph.addVertex("62BeanEnt");
		graph.addVertex("62BeanExit");
		graph.addVertex("62End");
				
		//Level 6-2 edges
		DefaultWeightedEdge e68 = graph.addEdge("62Start", "62End");
		DefaultWeightedEdge e69 = graph.addEdge("62Start", "62Pipe1Ent");
		DefaultWeightedEdge e70 = graph.addEdge("62Start", "62Pipe2Ent");
		DefaultWeightedEdge e71 = graph.addEdge("62Start", "62Pipe3Ent");
		DefaultWeightedEdge e72 = graph.addEdge("62Start", "62BeanEnt");
		
						
		//Level 6-2 weights
				
				
		//Level 6-3 vertices
				
				
		//Level 6-3 edges
					
						
		//Level 6-3 weights
				
				
		//Level 6-4 vertices
				
				
		//Level 6-4 edges
						
						
		//Level 6-4 weights
		
		
		//Level 7-1 vertices
		
		
		//Level 7-1 edges
			
			
		//Level 7-1 weights
				
				
		//Level 7-2 vertices
				
				
		//Level 7-2 edges
						
						
		//Level 7-2 weights
				
				
		//Level 7-3 vertices
				
				
		//Level 7-3 edges
					
						
		//Level 7-3 weights
				
				
		//Level 7-4 vertices
				
				
		//Level 7-4 edges
						
						
		//Level 7-4 weights
		
		
		//Level 8-1 vertices
		
		
		//Level 8-1 edges
			
			
		//Level 8-1 weights
				
				
		//Level 8-2 vertices
				
				
		//Level 8-2 edges
						
						
		//Level 8-2 weights
				
				
		//Level 8-3 vertices
				
				
		//Level 8-3 edges
					
						
		//Level 8-3 weights
				
				
		//Level 8-4 vertices
				
				
		//Level 8-4 edges
						
						
		//Level 8-4 weights
		
		
		/*
		 WARP EDGES AND WEIGHTS
		 DefaultWeightedEdge e15 = graph.addEdge("12Warp2", "21Start");
		 DefaultWeightedEdge e16 = graph.addEdge("12Warp3", "31Start");
		 DefaultWeightedEdge e17 = graph.addEdge("12Warp4", "41Start");
		 
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp5", "51Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp6", "61Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp7", "71Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp8", "81Start");
		 */
		return graph;
	}

}
