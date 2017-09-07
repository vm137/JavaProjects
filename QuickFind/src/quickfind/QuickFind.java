package quickfind;
public class QuickFind {
    private int[] id;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          QuickFind obj = new QuickFind(10);
          obj.connected(3,4);
    }
    
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++) {
            if (id[i] == pid) { id[i] = qid; }
        }
    }
    
}
