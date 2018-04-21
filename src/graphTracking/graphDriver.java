package graphTracking;

import java.util.Set;

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.alg.shortestpath.BellmanFordShortestPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.shortestpath.ALTAdmissibleHeuristic;
import org.jgrapht.alg.shortestpath.AStarShortestPath;

public class graphDriver 
{

	public static void main(String[] args) 
	{
		//Timing variables
		long start;
		long end;
		long aTime = 0;
		long bellmanTime = 0;
		long dijkstraTime = 0;
		SimpleDirectedWeightedGraph<String, DefaultEdge>[] aStarArray = new SimpleDirectedWeightedGraph[100];
		SimpleDirectedWeightedGraph<String, DefaultEdge>[] bellmanArray = new SimpleDirectedWeightedGraph[100];
		SimpleDirectedWeightedGraph<String, DefaultEdge>[] dijkstraArray = new SimpleDirectedWeightedGraph[100];
		
		//Create graph and set of vertices
		SimpleDirectedWeightedGraph<String, DefaultEdge> marioGraph = createGraph();
		SimpleDirectedWeightedGraph<String, DefaultEdge> marioGraph2 = createGraph();
		SimpleDirectedWeightedGraph<String, DefaultEdge> marioGraph3 = createGraph();
		Set<String> marioGraphVerts = marioGraph.vertexSet();
		System.out.println("Graph vertices and edges: " + marioGraph.toString() +"\n");
		
		//A* Algorithm output
		ALTAdmissibleHeuristic<String, DefaultEdge> aStarHeuristic = new ALTAdmissibleHeuristic<String, DefaultEdge>(marioGraph, marioGraphVerts);
		AStarShortestPath<String, DefaultEdge> aStarAlg = new AStarShortestPath<String, DefaultEdge>(marioGraph, aStarHeuristic);
		System.out.println("A* Heuristic Weight: " + aStarHeuristic.getCostEstimate("11Start", "84End"));
		System.out.println("A* Shortest Path:" + aStarAlg.getPath("11Start", "84End").getVertexList() + "\n");
		
		//Bellman Ford Algorithm output
		BellmanFordShortestPath<String, DefaultEdge> bellmanAlg = new BellmanFordShortestPath<String, DefaultEdge>(marioGraph2);
		System.out.println("Bellman Ford Shortest Path: " + bellmanAlg.getPath("11Start", "84End").getVertexList() + "\n");
		
		//Dijkstra Algorithm output
		DijkstraShortestPath<String, DefaultEdge> dijkstraAlg = new DijkstraShortestPath<>(marioGraph3);
		System.out.println("Dijkstra Shortest Path: " + dijkstraAlg.getPath("11Start", "84End").getVertexList() + "\n");
		
		//Ensure all graphs being manipulated are previously untouched
		for(int x=0; x<100; x++)
		{
			aStarArray[x] = createGraph();
			bellmanArray[x] = createGraph();
			dijkstraArray[x] = createGraph();
		}
		
		//100 time trials
		for(int y=0; y<100; y++)
		{
			//A* timing
			start = System.nanoTime();
			ALTAdmissibleHeuristic<String, DefaultEdge> aStarHeuristicTiming = new ALTAdmissibleHeuristic<String, DefaultEdge>(aStarArray[y], marioGraphVerts);
			AStarShortestPath<String, DefaultEdge> aStarAlgTiming = new AStarShortestPath<String, DefaultEdge>(aStarArray[y], aStarHeuristic);
			end = System.nanoTime();
			aTime += end-start;
			
			//Bellman Ford timing
			start = System.nanoTime();
			BellmanFordShortestPath<String, DefaultEdge> bellmanAlgTiming = new BellmanFordShortestPath<String, DefaultEdge>(bellmanArray[y]);
			end = System.nanoTime();
			bellmanTime += end-start;
			
			//Dijkstra timing
			start = System.nanoTime();
			DijkstraShortestPath<String, DefaultEdge> dijkstraAlgTiming = new DijkstraShortestPath<>(dijkstraArray[y]);
			end = System.nanoTime();
			dijkstraTime += end-start;
		}
		
		//Print average times
		System.out.println("A* Time: " + (double)aTime/100);
		System.out.println("Bellman Ford Time: " + (double)bellmanTime/100);
		System.out.println("Dijkstra Time: " + (double)dijkstraTime/100);
	}
	
	//Create a weighted graph containing Mario levels, weighted by blocks traveled
	private static SimpleDirectedWeightedGraph<String, DefaultEdge> createGraph()
	{
		SimpleDirectedWeightedGraph<String, DefaultEdge> graph = new SimpleDirectedWeightedGraph<String, DefaultEdge>(DefaultEdge.class);
		
		//Level 1-1 vertices
		graph.addVertex("11Start");
		graph.addVertex("11PipeEnt");
		graph.addVertex("11PipeExit");
		graph.addVertex("11End");
		
		//Level 1-1 edges
		DefaultEdge e1 = graph.addEdge("11Start", "11End");
		DefaultEdge e2 = graph.addEdge("11Start", "11PipeEnt");
		DefaultEdge e3 = graph.addEdge("11PipeEnt", "11PipeExit");
		DefaultEdge e4 = graph.addEdge("11PipeExit", "11End");
		
		//Level 1-1 weights
		graph.setEdgeWeight(e1, 196);
		graph.setEdgeWeight(e2, 55);
		graph.setEdgeWeight(e3, 11);
		graph.setEdgeWeight(e4, 35);
		
		//Level 1-2 vertices
		graph.addVertex("12Start");
		graph.addVertex("12PipeEnt");
		graph.addVertex("12PipeExit");
		graph.addVertex("12Warp2");
		graph.addVertex("12Warp3");
		graph.addVertex("12Warp4");
		graph.addVertex("12End");
		
		//Level 1-2 edges
		DefaultEdge e5 = graph.addEdge("12Start", "12End");
		DefaultEdge e6 = graph.addEdge("12Start", "12Warp2");
		DefaultEdge e7 = graph.addEdge("12Start", "12Warp3");
		DefaultEdge e8 = graph.addEdge("12Start", "12Warp4");
		DefaultEdge e9 = graph.addEdge("12Start", "12PipeEnt");
		DefaultEdge e10 = graph.addEdge("12PipeEnt", "12PipeExit");
		DefaultEdge e11 = graph.addEdge("12PipeExit", "12End");
		DefaultEdge e12 = graph.addEdge("12PipeExit", "12Warp2");
		DefaultEdge e13 = graph.addEdge("12PipeExit", "12Warp3");
		DefaultEdge e14 = graph.addEdge("12PipeExit", "12Warp4");
		
		//Level 1-2 weights
		graph.setEdgeWeight(e5, 170);
		graph.setEdgeWeight(e6, 185);
		graph.setEdgeWeight(e7, 189);
		graph.setEdgeWeight(e8, 193);
		graph.setEdgeWeight(e9, 101);
		graph.setEdgeWeight(e10, 12);
		graph.setEdgeWeight(e11, 57);
		graph.setEdgeWeight(e12, 72);
		graph.setEdgeWeight(e13, 77);
		graph.setEdgeWeight(e14, 81);
		
		//Level 1-3 vertices
		graph.addVertex("13Start");
		graph.addVertex("13End");
		
		//Level 1-3 edges
		DefaultEdge e15 = graph.addEdge("13Start", "13End");
		
		//Level 1-3 weights
		graph.setEdgeWeight(e15, 151);
		
		//Level 1-4 vertices
		graph.addVertex("14Start");
		graph.addVertex("14End");
		
		//Level 1-4 edges
		DefaultEdge e16 = graph.addEdge("14Start", "14End");
		
		//Level 1-4 weights
		graph.setEdgeWeight(e16, 140);
		
		//Level 2-1 vertices
		graph.addVertex("21Start");
		graph.addVertex("21PipeEnt");
		graph.addVertex("21PipeExit");
		graph.addVertex("21BeanEnt");
		graph.addVertex("21BeanExit");
		graph.addVertex("21End");
		
		//Level 2-1 edges
		DefaultEdge e17 = graph.addEdge("21Start", "21End");
		DefaultEdge e18 = graph.addEdge("21Start", "21PipeEnt");
		DefaultEdge e19 = graph.addEdge("21Start", "21BeanEnt");
		DefaultEdge e20 = graph.addEdge("21PipeEnt", "21PipeExit");
		DefaultEdge e21 = graph.addEdge("21PipeExit", "21End");
		DefaultEdge e22 = graph.addEdge("21BeanEnt", "21BeanExit");
		DefaultEdge e23 = graph.addEdge("21BeanExit", "21End");
		
		//Level 2-1 weights
		graph.setEdgeWeight(e17, 199);
		graph.setEdgeWeight(e18, 102);
		graph.setEdgeWeight(e19, 82);
		graph.setEdgeWeight(e20, 11);
		graph.setEdgeWeight(e21, 85);
		graph.setEdgeWeight(e22, 57);
		graph.setEdgeWeight(e23, 39);
		
		//Level 2-2 vertices
		graph.addVertex("22Start");
		graph.addVertex("22End");
		
		//Level 2-2 edges
		DefaultEdge e24 = graph.addEdge("22Start", "22End");
		
		//Level 2-2 weights
		graph.setEdgeWeight(e24, 205);
		
		//Level 2-3 vertices
		graph.addVertex("23Start");
		graph.addVertex("23End");
		
		//Level 2-3 edges
		DefaultEdge e25 = graph.addEdge("23Start", "23End");
		
		//Level 2-3 weights
		graph.setEdgeWeight(e25, 224);
		
		//Level 2-4 vertices
		graph.addVertex("24Start");
		graph.addVertex("24End");
		
		//Level 2-4 edges
		DefaultEdge e26 = graph.addEdge("24Start", "24End");
		
		//Level 2-4 weights
		graph.setEdgeWeight(e26, 140);
		
		//Level 3-1 vertices
		graph.addVertex("31Start");
		graph.addVertex("31PipeEnt");
		graph.addVertex("31PipeExit");
		graph.addVertex("31BeanEnt");
		graph.addVertex("31BeanExit");
		graph.addVertex("31End");
		
		//Level 3-1 edges
		DefaultEdge e27 = graph.addEdge("31Start", "31End");
		DefaultEdge e28 = graph.addEdge("31Start", "31PipeEnt");
		DefaultEdge e29 = graph.addEdge("31Start", "31BeanEnt");
		DefaultEdge e30 = graph.addEdge("31PipeEnt", "31PipeExit");
		DefaultEdge e31 = graph.addEdge("31PipeExit", "31End");
		DefaultEdge e32 = graph.addEdge("31BeanEnt", "31BeanExit");
		DefaultEdge e33 = graph.addEdge("31BeanExit", "31End");
		
		//Level 3-1 weights
		graph.setEdgeWeight(e27, 199);
		graph.setEdgeWeight(e28, 37);
		graph.setEdgeWeight(e29, 130);
		graph.setEdgeWeight(e30, 11);
		graph.setEdgeWeight(e31, 133);
		graph.setEdgeWeight(e32, 78);
		graph.setEdgeWeight(e33, 38);
		
		//Level 3-2 vertices
		graph.addVertex("32Start");
		graph.addVertex("32End");
		
		//Level 3-2 edges
		DefaultEdge e34 = graph.addEdge("32Start", "32End");
		
		//Level 3-2 weights
		graph.setEdgeWeight(e34, 208);
		
		//Level 3-3 vertices
		graph.addVertex("33Start");
		graph.addVertex("33End");
		
		//Level 3-3 edges
		DefaultEdge e35 = graph.addEdge("33Start", "33End");
		
		//Level 3-3 weights
		graph.setEdgeWeight(e35, 150);
		
		//Level 3-4 vertices
		graph.addVertex("34Start");
		graph.addVertex("34End");
		
		//Level 3-4 edges
		DefaultEdge e36 = graph.addEdge("34Start", "34End");
		
		//Level 3-4 weights
		graph.setEdgeWeight(e36, 140);
		
		//Level 4-1 vertices
		graph.addVertex("41Start");
		graph.addVertex("41PipeEnt");
		graph.addVertex("41PipeExit");
		graph.addVertex("41End");
		
		//Level 4-1 edges
		DefaultEdge e37 = graph.addEdge("41Start", "41End");
		DefaultEdge e38 = graph.addEdge("41Start", "41PipeEnt");
		DefaultEdge e39 = graph.addEdge("41PipeEnt", "41PipeExit");
		DefaultEdge e40 = graph.addEdge("41PipeExit", "41End");
		
		//Level 4-1 weights
		graph.setEdgeWeight(e37, 224);
		graph.setEdgeWeight(e38, 131);
		graph.setEdgeWeight(e39, 11);
		graph.setEdgeWeight(e40, 62);
		
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
		DefaultEdge e41 = graph.addEdge("42Start", "42End");
		DefaultEdge e42 = graph.addEdge("42Start", "42PipeEnt");
		DefaultEdge e43 = graph.addEdge("42Start", "42BeanEnt");
		DefaultEdge e44 = graph.addEdge("42Start", "42Warp5");
		DefaultEdge e45 = graph.addEdge("42PipeEnt", "42PipeExit");
		DefaultEdge e46 = graph.addEdge("42PipeExit", "42End");
		DefaultEdge e47 = graph.addEdge("42PipeExit", "42Warp5");
		DefaultEdge e48 = graph.addEdge("42BeanEnt", "42Warp6");
		DefaultEdge e49 = graph.addEdge("42BeanEnt", "42Warp7");
		DefaultEdge e50 = graph.addEdge("42BeanEnt", "42Warp8");
		
		//Level 4-2 weights
		graph.setEdgeWeight(e41, 206);
		graph.setEdgeWeight(e42, 82);
		graph.setEdgeWeight(e43, 62);
		graph.setEdgeWeight(e44, 120);
		graph.setEdgeWeight(e45, 11);
		graph.setEdgeWeight(e46, 74);
		graph.setEdgeWeight(e47, 91);
		graph.setEdgeWeight(e48, 55);
		graph.setEdgeWeight(e49, 60);
		graph.setEdgeWeight(e50, 64);
		
		//Level 4-3 vertices
		graph.addVertex("43Start");
		graph.addVertex("43End");
		
		//Level 4-3 edges
		DefaultEdge e51 = graph.addEdge("43Start", "43End");
		
		//Level 4-3 weights
		graph.setEdgeWeight(e51, 146);
		
		//Level 4-4 vertices
		graph.addVertex("44Start");
		graph.addVertex("44End");
		
		//Level 4-4 edges
		DefaultEdge e52 = graph.addEdge("44Start", "44End");
		
		//Level 4-4 weights
		graph.setEdgeWeight(e52, 172);
		
		//Level 5-1 vertices
		graph.addVertex("51Start");
		graph.addVertex("51End");
		graph.addVertex("51PipeEnt");
		graph.addVertex("51PipeExit");
		
		//Level 5-1 edges
		DefaultEdge e53 = graph.addEdge("51Start", "51End");
		DefaultEdge e54 = graph.addEdge("51Start", "51PipeEnt");
		DefaultEdge e55 = graph.addEdge("51PipeEnt", "51PipeExit");
		DefaultEdge e56 = graph.addEdge("51PipeExit", "51End");
		
		//Level 5-1 weights
		graph.setEdgeWeight(e53, 198);
		graph.setEdgeWeight(e54, 155);
		graph.setEdgeWeight(e55, 11);
		graph.setEdgeWeight(e56, 36);
		
		//Level 5-2 vertices
		graph.addVertex("52Start");
		graph.addVertex("52PipeEnt");
		graph.addVertex("52PipeExit");
		graph.addVertex("52BeanEnt");
		graph.addVertex("52BeanExit");
		graph.addVertex("52End");
		
		//Level 5-2 edges
		DefaultEdge e57 = graph.addEdge("52Start", "52End");
		DefaultEdge e58 = graph.addEdge("52Start", "52PipeEnt");
		DefaultEdge e59 = graph.addEdge("52Start", "52BeanEnt");
		DefaultEdge e60 = graph.addEdge("52PipeEnt", "52PipeExit");
		DefaultEdge e61 = graph.addEdge("52PipeExit", "52End");
		DefaultEdge e62 = graph.addEdge("52BeanEnt", "52BeanExit");
		DefaultEdge e63 = graph.addEdge("52BeanExit", "52End");
				
		//Level 5-2 weights
		graph.setEdgeWeight(e57, 199);
		graph.setEdgeWeight(e58, 54);
		graph.setEdgeWeight(e59, 84);
		graph.setEdgeWeight(e60, 60);
		graph.setEdgeWeight(e61, 85);
		graph.setEdgeWeight(e62, 57);
		graph.setEdgeWeight(e63, 70);
		
		//Level 5-3 vertices
		graph.addVertex("53Start");
		graph.addVertex("53End");
		
		//Level 5-3 edges
		DefaultEdge e64 = graph.addEdge("53Start", "53End");
				
		//Level 5-3 weights
		graph.setEdgeWeight(e64, 151);
		
		//Level 5-4 vertices
		graph.addVertex("54Start");
		graph.addVertex("54End");
		
		//Level 5-4 edges
		DefaultEdge e65 = graph.addEdge("54Start", "54End");
				
		//Level 5-4 weights
		graph.setEdgeWeight(e65, 140);
		
		//Level 6-1 vertices
		graph.addVertex("61Start");
		graph.addVertex("61End");
		
		//Level 6-1 edges
		DefaultEdge e66 = graph.addEdge("61Start", "61End");
			
		//Level 6-1 weights
		graph.setEdgeWeight(e66, 185);
				
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
		DefaultEdge e67 = graph.addEdge("62Start", "62End");
		DefaultEdge e68 = graph.addEdge("62Start", "62Pipe1Ent");
		DefaultEdge e69 = graph.addEdge("62Start", "62Pipe2Ent");
		DefaultEdge e70 = graph.addEdge("62Start", "62Pipe3Ent");
		DefaultEdge e71 = graph.addEdge("62Start", "62BeanEnt");
		
		DefaultEdge e72 = graph.addEdge("62Pipe1Ent", "62Pipe1Exit");
		DefaultEdge e73 = graph.addEdge("62Pipe1Exit", "62End");
		DefaultEdge e74 = graph.addEdge("62Pipe1Exit", "62BeanEnt");
		DefaultEdge e75 = graph.addEdge("62Pipe1Exit", "62Pipe2Ent");
		DefaultEdge e76 = graph.addEdge("62Pipe1Exit", "62Pipe3Ent");
		
		DefaultEdge e77 = graph.addEdge("62Pipe2Ent", "62Pipe2Exit");
		DefaultEdge e78 = graph.addEdge("62Pipe2Exit", "62End");
		DefaultEdge e79 = graph.addEdge("62Pipe2Exit", "62Pipe3Ent");

		DefaultEdge e80 = graph.addEdge("62Pipe3Ent", "62Pipe3Exit");
		DefaultEdge e81 = graph.addEdge("62Pipe3Exit", "62End");
		
		DefaultEdge e82 = graph.addEdge("62BeanEnt", "62BeanExit");
		DefaultEdge e83 = graph.addEdge("62BeanExit", "62End");
		
		//Level 6-2 weights
		graph.setEdgeWeight(e67, 215);
		graph.setEdgeWeight(e68, 18);
		graph.setEdgeWeight(e69, 55);
		graph.setEdgeWeight(e70, 152);
		graph.setEdgeWeight(e71, 80);
		
		graph.setEdgeWeight(e72, 11);
		graph.setEdgeWeight(e73, 181);
		graph.setEdgeWeight(e74, 46);
		graph.setEdgeWeight(e75, 21);
		graph.setEdgeWeight(e76, 118);
		
		graph.setEdgeWeight(e77, 61);
		graph.setEdgeWeight(e78, 101);
		graph.setEdgeWeight(e79, 38);
		
		graph.setEdgeWeight(e80, 11);
		graph.setEdgeWeight(e81, 37);
		
		graph.setEdgeWeight(e82, 78);
		graph.setEdgeWeight(e83, 54);
				
		//Level 6-3 vertices
		graph.addVertex("63Start");
		graph.addVertex("63End");
				
		//Level 6-3 edges
		DefaultEdge e84 = graph.addEdge("63Start", "63End");
						
		//Level 6-3 weights
		graph.setEdgeWeight(e84, 166);
				
		//Level 6-4 vertices
		graph.addVertex("64Start");
		graph.addVertex("64End");
				
		//Level 6-4 edges
		DefaultEdge e85 = graph.addEdge("64Start", "64End");
						
		//Level 6-4 weights
		graph.setEdgeWeight(e85, 140);
		
		//Level 7-1 vertices
		graph.addVertex("71Start");
		graph.addVertex("71PipeEnt");
		graph.addVertex("71PipeExit");
		graph.addVertex("71End");
		
		//Level 7-1 edges
		DefaultEdge e86 = graph.addEdge("71Start", "71End");
		DefaultEdge e87 = graph.addEdge("71Start", "71PipeEnt");
		DefaultEdge e88 = graph.addEdge("71PipeEnt", "71PipeExit");
		DefaultEdge e89 = graph.addEdge("71PipeExit", "71End");
			
		//Level 7-1 weights
		graph.setEdgeWeight(e86, 178);
		graph.setEdgeWeight(e87, 92);
		graph.setEdgeWeight(e88, 11);
		graph.setEdgeWeight(e89, 64);
				
		//Level 7-2 vertices
		graph.addVertex("72Start");
		graph.addVertex("72End");
				
		//Level 7-2 edges
		DefaultEdge e90 = graph.addEdge("72Start", "72End");
						
		//Level 7-2 weights
		graph.setEdgeWeight(e90, 205);
				
		//Level 7-3 vertices
		graph.addVertex("73Start");
		graph.addVertex("73End");
				
		//Level 7-3 edges
		DefaultEdge e91 = graph.addEdge("73Start", "73End");
						
		//Level 7-3 weights
		graph.setEdgeWeight(e91, 224);
				
		//Level 7-4 vertices
		graph.addVertex("74Start");
		graph.addVertex("74End");
				
		//Level 7-4 edges
		DefaultEdge e92 = graph.addEdge("74Start", "74End");
						
		//Level 7-4 weights
		graph.setEdgeWeight(e92, 204);
		
		//Level 8-1 vertices
		graph.addVertex("81Start");
		graph.addVertex("81PipeEnt");
		graph.addVertex("81PipeExit");
		graph.addVertex("81End");
		
		//Level 8-1 edges
		DefaultEdge e93 = graph.addEdge("81Start", "81End");
		DefaultEdge e94 = graph.addEdge("81Start", "81PipeEnt");
		DefaultEdge e95 = graph.addEdge("81PipeEnt", "81PipeExit");
		DefaultEdge e96 = graph.addEdge("81PipeExit", "81End");
			
		//Level 8-1 weights
		graph.setEdgeWeight(e93, 375);
		graph.setEdgeWeight(e94, 103);
		graph.setEdgeWeight(e95, 11);
		graph.setEdgeWeight(e96, 261);
				
		//Level 8-2 vertices
		graph.addVertex("82Start");
		graph.addVertex("82PipeEnt");
		graph.addVertex("82PipeExit");
		graph.addVertex("82End");
				
		//Level 8-2 edges
		DefaultEdge e97 = graph.addEdge("82Start", "82End");
		DefaultEdge e98 = graph.addEdge("82Start", "82PipeEnt");
		DefaultEdge e99 = graph.addEdge("82PipeEnt", "82PipeExit");
		DefaultEdge e100 = graph.addEdge("82PipeExit", "82End");
						
		//Level 8-2 weights
		graph.setEdgeWeight(e97, 215);
		graph.setEdgeWeight(e98, 155);
		graph.setEdgeWeight(e99, 11);
		graph.setEdgeWeight(e100, 53);
				
		//Level 8-3 vertices
		graph.addVertex("83Start");
		graph.addVertex("83End");
				
		//Level 8-3 edges
		DefaultEdge e101 = graph.addEdge("83Start", "83End");
						
		//Level 8-3 weights
		graph.setEdgeWeight(e101, 213);
				
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
		DefaultEdge e102 = graph.addEdge("84Start", "84Pipe1Ent");
		DefaultEdge e103 = graph.addEdge("84Start", "84FakePipe1");
		DefaultEdge e104 = graph.addEdge("84Start", "84B");
		
		DefaultEdge e105 = graph.addEdge("84FakePipe1", "84FakePipeExit");
		DefaultEdge e106 = graph.addEdge("84FakePipe2", "84FakePipeExit");
		DefaultEdge e107 = graph.addEdge("84FakePipe3", "84FakePipeExit");
		DefaultEdge e108 = graph.addEdge("84FakePipe4", "84FakePipeExit");
		
		DefaultEdge e109 = graph.addEdge("84FakePipeExit", "84FakePipe1");
		DefaultEdge e110 = graph.addEdge("84FakePipeExit", "84B");
		DefaultEdge e111 = graph.addEdge("84FakePipeExit", "84Pipe1Ent");
		
		DefaultEdge e112 = graph.addEdge("84A", "84B");
		DefaultEdge e113 = graph.addEdge("84A", "84Pipe1Ent");
		DefaultEdge e114 = graph.addEdge("84A", "84FakePipe1");
		
		DefaultEdge e115 = graph.addEdge("84B", "84A");
		
		DefaultEdge e116 = graph.addEdge("84Pipe1Ent", "84Pipe1Exit");
		
		DefaultEdge e117 = graph.addEdge("84Pipe1Exit", "84FakePipe2");
		DefaultEdge e118 = graph.addEdge("84Pipe1Exit", "84Pipe2Ent");
		DefaultEdge e119 = graph.addEdge("84Pipe1Exit", "84C");
		
		DefaultEdge e120 = graph.addEdge("84C", "84B1");
		
		DefaultEdge e121 = graph.addEdge("84B1", "84Pipe2Ent");
		DefaultEdge e122 = graph.addEdge("84B1", "84C");
		
		DefaultEdge e123 = graph.addEdge("84Pipe2Ent", "84Pipe2Exit");
		
		DefaultEdge e124 = graph.addEdge("84Pipe2Exit", "84Pipe3Ent");
		DefaultEdge e125 = graph.addEdge("84Pipe2Exit", "84E");
		
		DefaultEdge e126 = graph.addEdge("84E", "84D");
		
		DefaultEdge e127 = graph.addEdge("84D", "84E");
		DefaultEdge e128 = graph.addEdge("84D", "84Pipe3Ent");
		DefaultEdge e129 = graph.addEdge("84D", "84FakePipe3");
		
		DefaultEdge e130 = graph.addEdge("84Pipe3Ent", "84Pipe3Exit");
						
		DefaultEdge e131 = graph.addEdge("84Pipe3Exit", "84FakePipe4");
		DefaultEdge e132 = graph.addEdge("84Pipe3Exit", "84End");
		
		//Level 8-4 weights
		graph.setEdgeWeight(e102, 80);
		graph.setEdgeWeight(e103, 50);
		graph.setEdgeWeight(e104, 95);
		
		graph.setEdgeWeight(e105, 32);
		graph.setEdgeWeight(e106, 113);
		graph.setEdgeWeight(e107, 193);
		graph.setEdgeWeight(e108, 247);
		
		graph.setEdgeWeight(e109, 32);
		graph.setEdgeWeight(e110, 77);
		graph.setEdgeWeight(e111, 62);
		
		graph.setEdgeWeight(e112, 65);
		graph.setEdgeWeight(e113, 50);
		graph.setEdgeWeight(e114, 20);
		
		graph.setEdgeWeight(e115, 65);
		
		graph.setEdgeWeight(e116, 34);
		
		graph.setEdgeWeight(e117, 17);
		graph.setEdgeWeight(e118, 37);
		graph.setEdgeWeight(e119, 45);
		
		graph.setEdgeWeight(e120, 65);
		
		graph.setEdgeWeight(e121, 57);
		graph.setEdgeWeight(e122, 65);
		
		graph.setEdgeWeight(e123, 43);
		
		graph.setEdgeWeight(e124, 33);
		graph.setEdgeWeight(e125, 60);
		
		graph.setEdgeWeight(e126, 64);
		
		graph.setEdgeWeight(e127, 64);
		graph.setEdgeWeight(e128, 37);
		graph.setEdgeWeight(e129, 21);
		
		graph.setEdgeWeight(e130, 64);
		
		graph.setEdgeWeight(e131, 7);
		graph.setEdgeWeight(e132, 42);
		
		// Warp zone edges
		 DefaultEdge e133 = graph.addEdge("12Warp2", "21Start");
		 DefaultEdge e134 = graph.addEdge("12Warp3", "31Start");
		 DefaultEdge e135 = graph.addEdge("12Warp4", "41Start");
		 
		 DefaultEdge e136 = graph.addEdge("42Warp5", "51Start");
		 DefaultEdge e137 = graph.addEdge("42Warp6", "61Start");
		 DefaultEdge e138 = graph.addEdge("42Warp7", "71Start");
		 DefaultEdge e139 = graph.addEdge("42Warp8", "81Start");
		 
		 
		 //Warp zone weights
		 graph.setEdgeWeight(e133, 0);
		 graph.setEdgeWeight(e134, 0);
		 graph.setEdgeWeight(e135, 0);
		 
		 graph.setEdgeWeight(e136, 0);
		 graph.setEdgeWeight(e137, 0);
		 graph.setEdgeWeight(e138, 0);
		 graph.setEdgeWeight(e139, 0);
		 
		 //Level transition edges
		 DefaultEdge e140 = graph.addEdge("11End", "12Start");
		 DefaultEdge e141 = graph.addEdge("12End", "13Start");
		 DefaultEdge e142 = graph.addEdge("13End", "14Start");
		 DefaultEdge e143 = graph.addEdge("14End", "21Start");
		 
		 DefaultEdge e144 = graph.addEdge("21End", "22Start");
		 DefaultEdge e145 = graph.addEdge("22End", "23Start");
		 DefaultEdge e146 = graph.addEdge("23End", "24Start");
		 DefaultEdge e147 = graph.addEdge("24End", "31Start");
		 
		 DefaultEdge e148 = graph.addEdge("31End", "32Start");
		 DefaultEdge e149 = graph.addEdge("32End", "33Start");
		 DefaultEdge e150 = graph.addEdge("33End", "34Start");
		 DefaultEdge e151 = graph.addEdge("34End", "41Start");
		 
		 DefaultEdge e152 = graph.addEdge("41End", "42Start");
		 DefaultEdge e153 = graph.addEdge("42End", "43Start");
		 DefaultEdge e154 = graph.addEdge("43End", "44Start");
		 DefaultEdge e155 = graph.addEdge("44End", "51Start");
		 
		 DefaultEdge e156 = graph.addEdge("51End", "52Start");
		 DefaultEdge e157 = graph.addEdge("52End", "53Start");
		 DefaultEdge e158 = graph.addEdge("53End", "54Start");
		 DefaultEdge e159 = graph.addEdge("54End", "61Start");
		 
		 DefaultEdge e160 = graph.addEdge("61End", "62Start");
		 DefaultEdge e161 = graph.addEdge("62End", "63Start");
		 DefaultEdge e162 = graph.addEdge("63End", "64Start");
		 DefaultEdge e163 = graph.addEdge("64End", "71Start");
		
		 DefaultEdge e164 = graph.addEdge("71End", "72Start");
		 DefaultEdge e165 = graph.addEdge("72End", "73Start");
		 DefaultEdge e166 = graph.addEdge("73End", "74Start");
		 DefaultEdge e167 = graph.addEdge("74End", "81Start");
		 
		 DefaultEdge e168 = graph.addEdge("81End", "82Start");
		 DefaultEdge e169 = graph.addEdge("82End", "83Start");
		 DefaultEdge e170 = graph.addEdge("83End", "84Start");
		 
		 //Level transition weights
		 graph.setEdgeWeight(e140, 0);
		 graph.setEdgeWeight(e141, 0);
		 graph.setEdgeWeight(e142, 0);
		 graph.setEdgeWeight(e143, 0);

		 graph.setEdgeWeight(e144, 0);
		 graph.setEdgeWeight(e145, 0);
		 graph.setEdgeWeight(e146, 0);
		 graph.setEdgeWeight(e147, 0);
		 
		 graph.setEdgeWeight(e148, 0);
		 graph.setEdgeWeight(e149, 0);
		 graph.setEdgeWeight(e150, 0);
		 graph.setEdgeWeight(e151, 0);
		 
		 graph.setEdgeWeight(e152, 0);
		 graph.setEdgeWeight(e153, 0);
		 graph.setEdgeWeight(e154, 0);
		 graph.setEdgeWeight(e155, 0);
		 
		 graph.setEdgeWeight(e156, 0);
		 graph.setEdgeWeight(e157, 0);
		 graph.setEdgeWeight(e158, 0);
		 graph.setEdgeWeight(e159, 0);
		 
		 graph.setEdgeWeight(e160, 0);
		 graph.setEdgeWeight(e161, 0);
		 graph.setEdgeWeight(e162, 0);
		 graph.setEdgeWeight(e163, 0);
		 
		 graph.setEdgeWeight(e164, 0);
		 graph.setEdgeWeight(e165, 0);
		 graph.setEdgeWeight(e166, 0);
		 graph.setEdgeWeight(e167, 0);
		 
		 graph.setEdgeWeight(e168, 0);
		 graph.setEdgeWeight(e169, 0);
		 graph.setEdgeWeight(e170, 0);
		 
		return graph;
	}

}
