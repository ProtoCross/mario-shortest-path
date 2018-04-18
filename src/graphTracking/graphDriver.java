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
		DefaultWeightedEdge e39 = graph.addEdge("41PipeEnt", "41PipeExit");
		DefaultWeightedEdge e40 = graph.addEdge("41PipeExit", "41End");
		
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
		DefaultWeightedEdge e41 = graph.addEdge("42Start", "42End");
		DefaultWeightedEdge e42 = graph.addEdge("42Start", "42PipeEnt");
		DefaultWeightedEdge e43 = graph.addEdge("42Start", "42BeanEnt");
		DefaultWeightedEdge e44 = graph.addEdge("42Start", "42Warp5");
		DefaultWeightedEdge e45 = graph.addEdge("42PipeEnt", "42PipeExit");
		DefaultWeightedEdge e46 = graph.addEdge("42PipeExit", "42End");
		DefaultWeightedEdge e47 = graph.addEdge("42PipeExit", "42Warp5");
		DefaultWeightedEdge e48 = graph.addEdge("42BeanEnt", "42Warp6");
		DefaultWeightedEdge e49 = graph.addEdge("42BeanEnt", "42Warp7");
		DefaultWeightedEdge e50 = graph.addEdge("42BeanEnt", "42Warp8");
		
		//Level 4-2 weights
		
		
		//Level 4-3 vertices
		graph.addVertex("43Start");
		graph.addVertex("43End");
		
		//Level 4-3 edges
		DefaultWeightedEdge e51 = graph.addEdge("43Start", "43End");
		
		//Level 4-3 weights
		
		
		//Level 4-4 vertices
		graph.addVertex("44Start");
		graph.addVertex("44End");
		
		//Level 4-4 edges
		DefaultWeightedEdge e52 = graph.addEdge("43Start", "43End");
		
		//Level 4-4 weights
		
		
		//Level 5-1 vertices
		graph.addVertex("51Start");
		graph.addVertex("51End");
		graph.addVertex("51PipeEnt");
		graph.addVertex("51PipeExit");
		
		//Level 5-1 edges
		DefaultWeightedEdge e53 = graph.addEdge("51Start", "51End");
		DefaultWeightedEdge e54 = graph.addEdge("51Start", "51PipeEnt");
		DefaultWeightedEdge e55 = graph.addEdge("51PipeEnt", "51PipeExit");
		DefaultWeightedEdge e56 = graph.addEdge("51PipeExit", "51End");
		
		//Level 5-1 weights
		
		
		//Level 5-2 vertices
		graph.addVertex("52Start");
		graph.addVertex("52PipeEnt");
		graph.addVertex("52PipeExit");
		graph.addVertex("52BeanEnt");
		graph.addVertex("52BeanExit");
		graph.addVertex("52End");
		
		//Level 5-2 edges
		DefaultWeightedEdge e57 = graph.addEdge("52Start", "52End");
		DefaultWeightedEdge e58 = graph.addEdge("52Start", "52PipeEnt");
		DefaultWeightedEdge e59 = graph.addEdge("52Start", "52BeanEnt");
		DefaultWeightedEdge e60 = graph.addEdge("52PipeEnt", "52PipeExit");
		DefaultWeightedEdge e61 = graph.addEdge("52PipeExit", "52End");
		DefaultWeightedEdge e62 = graph.addEdge("52BeanEnt", "52BeanExit");
		DefaultWeightedEdge e63 = graph.addEdge("52BeanExit", "52End");
				
		//Level 5-2 weights
		
		
		//Level 5-3 vertices
		graph.addVertex("53Start");
		graph.addVertex("53End");
		
		//Level 5-3 edges
		DefaultWeightedEdge e64 = graph.addEdge("53Start", "53End");
				
		//Level 5-3 weights
		
		
		//Level 5-4 vertices
		graph.addVertex("54Start");
		graph.addVertex("54End");
		
		//Level 5-4 edges
		DefaultWeightedEdge e65 = graph.addEdge("54Start", "54End");
				
		//Level 5-4 weights
		
		
		//Level 6-1 vertices
		graph.addVertex("61Start");
		graph.addVertex("61End");
		
		//Level 6-1 edges
		DefaultWeightedEdge e66 = graph.addEdge("61Start", "61End");
			
		//Level 6-1 weights
				
				
		//Level 6-2 vertices
		graph.addVertex("62Start");
		graph.addVertex("62Pipe1Ent");
		graph.addVertex("62Pipe1Exit");
		graph.addVertex("62Pipe2Ent");
		graph.addVertex("62Pipe2Exit");
		graph.addVertex("62Pipe3Ent");
		graph.addVertex("62Pipe3Exit");
		graph.addVertex("62BeanEnt");
		graph.addVertex("62BeanExit");
		graph.addVertex("62End");
				
		//Level 6-2 edges
		DefaultWeightedEdge e67 = graph.addEdge("62Start", "62End");
		DefaultWeightedEdge e68 = graph.addEdge("62Start", "62Pipe1Ent");
		DefaultWeightedEdge e69 = graph.addEdge("62Start", "62Pipe2Ent");
		DefaultWeightedEdge e70 = graph.addEdge("62Start", "62Pipe3Ent");
		DefaultWeightedEdge e71 = graph.addEdge("62Start", "62BeanEnt");
		
		DefaultWeightedEdge e72 = graph.addEdge("62Pipe1Ent", "62Pipe1Exit");
		DefaultWeightedEdge e73 = graph.addEdge("62Pipe1Exit", "62End");
		DefaultWeightedEdge e74 = graph.addEdge("62Pipe1Exit", "62BeanEnt");
		DefaultWeightedEdge e75 = graph.addEdge("62Pipe1Exit", "62Pipe2Ent");
		DefaultWeightedEdge e76 = graph.addEdge("62Pipe1Exit", "62Pipe3Ent");
		
		DefaultWeightedEdge e77 = graph.addEdge("62Pipe2Ent", "62Pipe2Exit");
		DefaultWeightedEdge e78 = graph.addEdge("62Pipe2Exit", "62End");
		DefaultWeightedEdge e79 = graph.addEdge("62Pipe2Exit", "62BeanEnt");

		DefaultWeightedEdge e80 = graph.addEdge("62Pipe3Ent", "62Pipe3Exit");
		DefaultWeightedEdge e81 = graph.addEdge("62Pipe3Exit", "62End");
		
		DefaultWeightedEdge e82 = graph.addEdge("62BeanEnt", "62BeanExit");
		DefaultWeightedEdge e83 = graph.addEdge("62BeanExit", "62End");
		
		//Level 6-2 weights
				
				
		//Level 6-3 vertices
		graph.addVertex("63Start");
		graph.addVertex("63End");
				
		//Level 6-3 edges
		DefaultWeightedEdge e84 = graph.addEdge("63Start", "63End");
						
		//Level 6-3 weights
				
				
		//Level 6-4 vertices
		graph.addVertex("64Start");
		graph.addVertex("64End");
				
		//Level 6-4 edges
		DefaultWeightedEdge e85 = graph.addEdge("64Start", "64End");
						
		//Level 6-4 weights
		
		
		//Level 7-1 vertices
		graph.addVertex("71Start");
		graph.addVertex("71PipeEnt");
		graph.addVertex("71PipeExit");
		graph.addVertex("71End");
		
		//Level 7-1 edges
		DefaultWeightedEdge e86 = graph.addEdge("71Start", "71End");
		DefaultWeightedEdge e87 = graph.addEdge("71Start", "71PipeEnt");
		DefaultWeightedEdge e88 = graph.addEdge("71PipeEnt", "71PipeExit");
		DefaultWeightedEdge e89 = graph.addEdge("71PipeExit", "71End");
			
		//Level 7-1 weights
				
				
		//Level 7-2 vertices
		graph.addVertex("72Start");
		graph.addVertex("72End");
				
		//Level 7-2 edges
		DefaultWeightedEdge e90 = graph.addEdge("72Start", "72End");
						
		//Level 7-2 weights
				
				
		//Level 7-3 vertices
		graph.addVertex("73Start");
		graph.addVertex("73End");
				
		//Level 7-3 edges
		DefaultWeightedEdge e91 = graph.addEdge("73Start", "73End");
						
		//Level 7-3 weights
				
				
		//Level 7-4 vertices
		graph.addVertex("74Start");
		graph.addVertex("74End");
				
		//Level 7-4 edges
		DefaultWeightedEdge e92 = graph.addEdge("74Start", "74End");
						
		//Level 7-4 weights
		
		
		//Level 8-1 vertices
		graph.addVertex("81Start");
		graph.addVertex("81PipeEnt");
		graph.addVertex("81PipeExit");
		graph.addVertex("81End");
		
		//Level 8-1 edges
		DefaultWeightedEdge e93 = graph.addEdge("81Start", "81End");
		DefaultWeightedEdge e94 = graph.addEdge("81Start", "81PipeEnt");
		DefaultWeightedEdge e95 = graph.addEdge("81PipeEnt", "81PipeExit");
		DefaultWeightedEdge e96 = graph.addEdge("81PipeExit", "81End");
			
		//Level 8-1 weights
				
				
		//Level 8-2 vertices
		graph.addVertex("82Start");
		graph.addVertex("82PipeEnt");
		graph.addVertex("82PipeExit");
		graph.addVertex("82End");
				
		//Level 8-2 edges
		DefaultWeightedEdge e97 = graph.addEdge("82Start", "82End");
		DefaultWeightedEdge e98 = graph.addEdge("82Start", "82PipeEnt");
		DefaultWeightedEdge e99 = graph.addEdge("82PipeEnt", "82PipeExit");
		DefaultWeightedEdge e100 = graph.addEdge("82PipeExit", "82End");
						
		//Level 8-2 weights
				
				
		//Level 8-3 vertices
		graph.addVertex("83Start");
		graph.addVertex("83End");
				
		//Level 8-3 edges
		DefaultWeightedEdge e101 = graph.addEdge("83Start", "83End");
						
		//Level 8-3 weights
				
				
		//Level 8-4 vertices
		graph.addVertex("84Start");
		graph.addVertex("84End");
		
		graph.addVertex("84FakePipeExit");
		graph.addVertex("84FakePipe1");
		graph.addVertex("84FakePipe2");
		graph.addVertex("84FakePipe3");
		graph.addVertex("84FakePipe4");
		
		graph.addVertex("84A");
		graph.addVertex("84B");
		graph.addVertex("84B1");
		graph.addVertex("84C");
		graph.addVertex("84D");
		graph.addVertex("84E");
		
		graph.addVertex("84Pipe1Ent");
		graph.addVertex("84Pipe1Exit");
		graph.addVertex("84Pipe2Ent");
		graph.addVertex("84Pipe2Exit");
		graph.addVertex("84Pipe3Ent");
		graph.addVertex("84Pipe3Exit");
				
		//Level 8-4 edges
		DefaultWeightedEdge e102 = graph.addEdge("84Start", "84Pipe1Ent");
		DefaultWeightedEdge e103 = graph.addEdge("84Start", "84FakePipe1");
		DefaultWeightedEdge e104 = graph.addEdge("84Start", "84B");
		
		DefaultWeightedEdge e105 = graph.addEdge("84FakePipe1", "84FakePipeExit");
		DefaultWeightedEdge e106 = graph.addEdge("84FakePipe2", "84FakePipeExit");
		DefaultWeightedEdge e107 = graph.addEdge("84FakePipe3", "84FakePipeExit");
		DefaultWeightedEdge e108 = graph.addEdge("84FakePipe4", "84FakePipeExit");
		
		DefaultWeightedEdge e109 = graph.addEdge("84FakePipeExit", "84FakePipe1");
		DefaultWeightedEdge e110 = graph.addEdge("84FakePipeExit", "84B");
		DefaultWeightedEdge e111 = graph.addEdge("84FakePipeExit", "84Pipe1Ent");
						
		//Level 8-4 weights
		
		
		/*
		 WARP EDGES
		 DefaultWeightedEdge e15 = graph.addEdge("12Warp2", "21Start");
		 DefaultWeightedEdge e16 = graph.addEdge("12Warp3", "31Start");
		 DefaultWeightedEdge e17 = graph.addEdge("12Warp4", "41Start");
		 
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp5", "51Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp6", "61Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp7", "71Start");
		 DefaultWeightedEdge e17 = graph.addEdge("42Warp8", "81Start");
		 
		 WARP WEIGHTS
		 
		 LEVEL TRANSITION EDGES
		 DefaultWeightedEdge e15 = graph.addEdge("11End", "12Start");
		 DefaultWeightedEdge e15 = graph.addEdge("12End", "13Start");
		 DefaultWeightedEdge e15 = graph.addEdge("13End", "14Start");
		 DefaultWeightedEdge e15 = graph.addEdge("14End", "21Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("21End", "22Start");
		 DefaultWeightedEdge e15 = graph.addEdge("22End", "23Start");
		 DefaultWeightedEdge e15 = graph.addEdge("23End", "24Start");
		 DefaultWeightedEdge e15 = graph.addEdge("24End", "31Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("31End", "32Start");
		 DefaultWeightedEdge e15 = graph.addEdge("32End", "33Start");
		 DefaultWeightedEdge e15 = graph.addEdge("33End", "34Start");
		 DefaultWeightedEdge e15 = graph.addEdge("34End", "41Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("41End", "42Start");
		 DefaultWeightedEdge e15 = graph.addEdge("42End", "43Start");
		 DefaultWeightedEdge e15 = graph.addEdge("43End", "44Start");
		 DefaultWeightedEdge e15 = graph.addEdge("44End", "51Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("51End", "52Start");
		 DefaultWeightedEdge e15 = graph.addEdge("52End", "53Start");
		 DefaultWeightedEdge e15 = graph.addEdge("53End", "54Start");
		 DefaultWeightedEdge e15 = graph.addEdge("54End", "61Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("61End", "62Start");
		 DefaultWeightedEdge e15 = graph.addEdge("62End", "63Start");
		 DefaultWeightedEdge e15 = graph.addEdge("63End", "64Start");
		 DefaultWeightedEdge e15 = graph.addEdge("64End", "71Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("71End", "72Start");
		 DefaultWeightedEdge e15 = graph.addEdge("72End", "73Start");
		 DefaultWeightedEdge e15 = graph.addEdge("73End", "74Start");
		 DefaultWeightedEdge e15 = graph.addEdge("74End", "81Start");
		 
		 DefaultWeightedEdge e15 = graph.addEdge("81End", "82Start");
		 DefaultWeightedEdge e15 = graph.addEdge("82End", "83Start");
		 DefaultWeightedEdge e15 = graph.addEdge("83End", "84Start");
		 
		 LEVEL TRANSITION WEIGHTS
		 
		 
		 */
		return graph;
	}

}
