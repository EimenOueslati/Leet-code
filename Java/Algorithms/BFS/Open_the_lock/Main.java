package Algorithms.BFS.Open_the_lock;

public class Main {
    public static void main(String[] args) {
        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target = "0202";
        openTheLock open = new openTheLock();
        System.out.println(open.openLock(deadends, target)); 
    }
}
