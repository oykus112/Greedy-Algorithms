import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class MST 
{ 
    private static final int V=10; 
    int total_w=0;
    String []a=new String[10];
    String []a1=new String[10];
    String []a2=new String[10];
    
    
    public MST(String arr[]) {
    	a1=arr;
    }
   
    
    int minKey(int key[], Boolean mstSet[]) 
    { 
     
        int min = Integer.MAX_VALUE, min_index=-1; 
  
        for (int v = 0; v < V; v++) 
            if (mstSet[v] == false && key[v] < min) 
            { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  

    void printMST(int parent[], int n, int graph[][]) throws IOException 
    { 
    	
    	int ct=0;
    	
    	  File file = new File("Result.txt");
 	     FileWriter fileWriter = new FileWriter(file, false);
 	     BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write("Edge \tWeight"); 
        for (int i = 1; i < V; i++) {
          a[ct++]=(a1[parent[i]]+" - "+ a1[i]+" "+graph[i][parent[i]]+"m\n"); 
          total_w=total_w+graph[i][parent[i]];
        }
        Total();
        
        bWriter.close();
    } 
  
    
    int Total() {
    	return total_w;
    }
    String[] getString() {
		return a;
    }

    
    void primMST(int graph[][]) throws IOException 
    { 
        int parent[] = new int[V]; 
  
       
        int key[] = new int [V]; 
  
        Boolean mstSet[] = new Boolean[V]; 
  
        
        for (int i = 0; i < V; i++) 
        { 
            key[i] = Integer.MAX_VALUE; 
            mstSet[i] = false; 
        } 
  
        
        key[0] = 0;     
                        
        parent[0] = -1; 
  
        
        for (int count = 0; count < V-1; count++) 
        { 
           
            int u = minKey(key, mstSet); 
  
    
            mstSet[u] = true; 
  
        
            for (int v = 0; v < V; v++) 
  
     
                if (graph[u][v]!=0 && mstSet[v] == false && 
                    graph[u][v] < key[v]) 
                { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  

        printMST(parent, V, graph); 
    } 
}