import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;


public class P2 {
    public static void main(String args[]){
        String[] a = {"classic", "pop", "classic", "classic", "pop", "gay"};
        int[] p = {500, 600, 150, 800, 2500, 300};
        System.out.println(Arrays.toString(solution(a, p)));
    }
    public static int[] solution(String[] genres, int[] plays){
        HashMap<String, LinkedList<Item>> map = new HashMap<>();
        HashMap<String, Integer> rank = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            if(rank.get(genres[i]) == null)
                rank.put(genres[i], 0);
            rank.put(genres[i], rank.get(genres[i]) + plays[i]);
        }

        LinkedList<Rank> rankList = new LinkedList<>();
        for(String s : rank.keySet()){
            rankList.add(new Rank(s, rank.get(s)));
        }
        Collections.sort(rankList);

        for(int i = 0; i < genres.length; i++){
            if(map.get(genres[i]) == null){
                map.put(genres[i], new LinkedList<>());
            }
            map.get(genres[i]).add(new Item(i, plays[i]));
        }

        for(String s : map.keySet()){
            Collections.sort(map.get(s));
        }

        LinkedList<Integer> result = new LinkedList<>();
        for(Rank r : rankList){
            LinkedList<Item> myList = map.get(r.genre);
            result.add(myList.get(0).index);
            if(myList.size() > 1){
                result.add(myList.get(1).index);
            }
        }

        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
class Item implements Comparable<Item>{
    public int index;
    public int plays;
    public Item(int index, int plays){
        this.index = index;
        this.plays = plays;
    }

    @Override
    public int compareTo(Item i){
        if(this.plays > i.plays){
            return -1;
        } else if(this.plays < i.plays){
            return 1;
        } else {
            if(this.index < i.index) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
class Rank implements Comparable<Rank>{
    public String genre;
    public int playsSum;
    public Rank(String g, int plays){
        this.genre = g;
        this.playsSum = plays;
    }

    @Override
    public int compareTo(Rank i){
        if(this.playsSum > i.playsSum){
            return -1;
        } else {
            return 1;
        }
    }
}
