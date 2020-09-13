class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        
        for(List<Integer> edge : edges) {
            visited.add(edge.get(1));
        }
        
        for(int i=0; i<n; i++){
            if(!visited.contains(i)) {
               result.add(i); 
            }
        }
        
        return result;
        
    }
}
