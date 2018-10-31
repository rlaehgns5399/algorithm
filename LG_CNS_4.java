import java.util.Arrays;
import java.util.HashMap;

public class LG_CNS_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer;
		int[][] directory = { {1, 2}, {2, 3}, {3, 4}, {4, 5} };
		int[][] query = { {1, 5}, {2, 5}, {3, 5}, {4, 5} };
		Tree tree = new Tree(query.length);
		
		for(int i = 0; i < directory.length; i++){
			tree.addNode(directory[i][0], directory[i][1]);
		}
		for(int i = 0; i < query.length; i++){
			tree.findWay(query[i][0], query[i][1]);
		}
		answer = tree.result_arr;
		
		System.out.println(Arrays.toString(answer));

	}
	
	static class Tree{
		Node root = new Node(Integer.MAX_VALUE);
		int size = 0;
		int[] result_arr;
		int result_p = 0;
		
		public Tree(int N){
			result_arr = new int[N];
		}
		public void addNode(int x, int y){
			Node nodex = find(this.root, x);
			if(nodex == null){
				nodex = new Node(x);
				nodex.root = this.root;
			}
			Node nodey = find(this.root, y);
			if(nodey == null){
				nodey = new Node(y);
			}
			this.root.children.put(x, nodex);
			this.root.children.put(y, nodey);
			nodex.children.put(y, nodey);
			nodey.makeroot(nodex);
		}
		
		public Node find(Node node, int no){
			Node temp = null;
			if(node.value == no) return node;
			
			for(Integer i : node.children.keySet()){
				if(i == no) temp = find(node.children.get(i), no);
			}
			
			return temp;
		}
		
		public void findWay(int x, int y){
			int result = 1;
			if(x == y) {
				result_arr[result_p++] = result;
				return;
			}
			
			Node a = find(this.root, x);
			
			 
			while(a.value != y){

				System.out.print(a.value + " ");
				boolean ischildnode = false;
				for(Integer i : a.children.keySet()){
					if(i == y) {
						ischildnode = true;
						break;
					}
				}
				result++;
				if(ischildnode){
					a = a.children.get(y);

					System.out.print(a.value + " ");
				} else {
					if(a.root != this.root){
						a = a.root;
						System.out.print(a.value + " ");
					}

				}
			}
			System.out.println();
			result_arr[result_p++] = result;
		}
	}
	static class Node{
		int value;
		Node root;
		HashMap<Integer, Node> children;
		
		public Node(int val){
			this.value = val;
			this.children = new HashMap<Integer, Node>();
		}
		public void makeroot(Node root){
			this.root = root;
		}
		public void print(){
			System.out.print(value + "(");
			for(Integer i : children.keySet()){
				System.out.print(i + "-부모:(" + children.get(i).root.value +") ");
				// System.out.print(i + "-부모:(" + children.get(i).root +") ");
				
			}
			System.out.print(")\n");
		}
	}
}
