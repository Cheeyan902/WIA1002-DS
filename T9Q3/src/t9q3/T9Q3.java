package t9q3;

public class T9Q3 {

    public static void main(String[] args) {
       
        Graph <Character> graph = new Graph<>();
        
        // Adjacency List
        for(char ys = 'A'; ys <= 'I'; ys++){
            graph.addVertex(ys);
            graph.addEdge('A', 'C');
            graph.addEdge('A', 'D');
            graph.addEdge('B', 'D');
            graph.addEdge('C', 'E');
            graph.addEdge('C', 'F');
            graph.addEdge('D', 'E');
            graph.addEdge('E', 'G');
            graph.addEdge('F', 'H');
            graph.addEdge('G', 'H');
            graph.addEdge('H', 'I');
            graph.showAdjacencyList();
        }
    }
}

/*
LinkedList<Vertex> listA = new LinkedList<>(); listA.addLast(A); listA.addLast(C); listA.addLast(D);
LinkedList<Vertex> listB = new LinkedList<>(); listB.addLast(B); listB.addLast(D);
LinkedList<Vertex> listC = new LinkedList<>(); listC.addLast(C); listC.addLast(E); listC.addLast(F);
LinkedList<Vertex> listD = new LinkedList<>(); listD.addLast(D); listD.addLast(E);
LinkedList<Vertex> listE = new LinkedList<>(); listE.addLast(E); listE.addLast(G);
LinkedList<Vertex> listF = new LinkedList<>(); listF.addLast(F); listF.addLast(H);
LinkedList<Vertex> listG = new LinkedList<>(); listG.addLast(G); listG.addLast(H);
LinkedList<Vertex> listH = new LinkedList<>(); listH.addLast(H); listH.addLast(I);
LinkedList<Vertex> listI = new LinkedList<>(); listI.addLast(I);

Or

String[][] vert = { "A","B","C","D","E","F","G","H","I"}; (Breath FIFO, Depth LIFO)
for(String str : vert)
    myGraph.addVertex(str);
myGraph.addEdge("A","C",1);
myGraph.addEdge("A","D",1);
myGraph.addEdge("B","D",1);
myGraph.addEdge("C","E",1);
myGraph.addEdge("C","F",1);
myGraph.addEdge("D","E",1);
myGraph.addEdge("E","G",1);
myGraph.addEdge("F","H",1);
myGraph.addEdge("G","H",1);
myGraph.addEdge("H","I",1);
*/