package GraphPackage;

/* Bart Graph */

public class Main // Undirected, weighted
{
   private static UndirectedGraph<String> myGraph = new UndirectedGraph<String>();
   private static StackInterface<String> path = new LinkedStack<String>();
   private static final String A = "Millbrae";
   private static final String B = "Balboa";
   private static final String C = "24th St";
   private static final String D = "Embarcadero";
   private static final String E = "12th St";
   private static final String F = "19th St";
   private static final String G = "MacArthur";
   private static final String H = "Pittsburg";
   private static final String I = "Richmond";
   private static final String J = "Dublin";
   private static final String K = "Coliseum";
   private static final String L = "Oakland Airport";
   private static final String M = "Bay Fair";
   private static final String N = "Fremont";

   public static void main(String[] args)
   {
      setBartGraph();
      showPath(A, H);
      showPath(I, J);
      showPath(N, L);
   }

   public static void testBFS(String v)
   {
      System.out.println("\n\nBreadth-First Traversal beginning at vertex " + v + ": ");
      QueueInterface<String> bfs = myGraph.getBreadthFirstTraversal(v);

      displayQueue(bfs);
      System.out.println(" Actual");
   } // end testBFS

   public static void testDFS(String v)
   {
      System.out.println("\n\nDepth-First Traversal beginning at vertex " + v + ": ");
      QueueInterface<String> dfs = myGraph.getDepthFirstTraversal(v);

      displayQueue(dfs);
      System.out.println(" Actual");
   } // end testDFS

   private static void showPath(String vertex1, String vertex2)
   {
      System.out.print("\nThe cheapest path from " + vertex1 + " to " + vertex2 + " is ");
      double cost = myGraph.getCheapestPath(vertex1, vertex2, path);
      displayStack(path);
      System.out.println("and has a cost of " + cost + ".");
   } // end showPath

   private static void setBartGraph()
   {
      myGraph.clear();

      myGraph.addVertex(A);
      myGraph.addVertex(B);
      myGraph.addVertex(C);
      myGraph.addVertex(D);
      myGraph.addVertex(E);
      myGraph.addVertex(F);
      myGraph.addVertex(G);
      myGraph.addVertex(H);
      myGraph.addVertex(I);
      myGraph.addVertex(J);
      myGraph.addVertex(K);
      myGraph.addVertex(L);
      myGraph.addVertex(M);
      myGraph.addVertex(N);
   }

   private static void setEdgesFig28_18aUndirected()
   {
      myGraph.addEdge(A,B,1);
      myGraph.addEdge(B,C,1);
      myGraph.addEdge(C,D,1);
      myGraph.addEdge(D,K,1);
      myGraph.addEdge(D,E,1);
      myGraph.addEdge(K,L,1);
      myGraph.addEdge(K,M,1);
      myGraph.addEdge(M,N,1);
      myGraph.addEdge(M,J,1);
      myGraph.addEdge(E,F,1);
      myGraph.addEdge(F,G,1);
      myGraph.addEdge(G,H,1);
      myGraph.addEdge(G,I,1);

      myGraph.addEdge(B,A,1);
      myGraph.addEdge(C,B,1);
      myGraph.addEdge(D,C,1);
      myGraph.addEdge(K,D,1);
      myGraph.addEdge(E,D,1);
      myGraph.addEdge(L,K,1);
      myGraph.addEdge(M,K,1);
      myGraph.addEdge(N,M,1);
      myGraph.addEdge(J,M,1);
      myGraph.addEdge(F,E,1);
      myGraph.addEdge(G,F,1);
      myGraph.addEdge(H,G,1);
      myGraph.addEdge(I,G,1);

   } 

   public static void displayStack(StackInterface<String> s)
   {
      while (!s.isEmpty())
         System.out.print(s.pop() + " ");

      assert(s.isEmpty());
   } // end displayStack

   public static void displayQueue(QueueInterface<String> q)
   {
      while (!q.isEmpty())
         System.out.print(q.dequeue() + " ");
   } // end displayQueue
}  // end DriverUW

