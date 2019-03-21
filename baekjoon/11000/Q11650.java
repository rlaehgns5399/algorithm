import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList<Item> list = new LinkedList<Item>();
        for(int i = 0; i < n; i++){
            list.add(new Item(sc.nextInt(), sc.nextInt()));	
        }
        Collections.sort(list, new Comparator<Item>(){
        	@Override
        	public int compare(Item a, Item b){
        		if(a.x > b.x){
        			return 1;
        		} else if(a.x < b.x){
        			return -1;
        		} else {
        			if( a.y > b.y){
        				return 1;
        			} else {
        				return -1;
        			}
        		}
        	}
        });
        for(Item i : list){
        	System.out.println(i.x + " " + i.y);
        }
    }
}
class Item{
	public int x;
	public int y;
	public Item(int x, int y){
		this.x = x;
		this.y = y;
	}
}
