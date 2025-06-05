package xyz;

public class AdvancedGraph {
	public static class graph{
		private Mp<Integer,List<Integer>> adjlist = new HashMap<Integer,List<Integer>>();
		
		void addaEdge(int u,int v) {
			djlist.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
			djlist.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
			
		}
	}
	

}
