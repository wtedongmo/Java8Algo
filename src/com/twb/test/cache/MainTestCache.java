package com.twb.test.cache;

public class MainTestCache {

    public static void main(String[] args) {

        SimpleCache cache = new InMemorySimpleCache();

        cache.add("1", "1");
        cache.add("2", "2");
        cache.add("3", "3");
        cache.add("4", "4", 6000);
        cache.add("5", "5", 7000);

        try {
            Thread.sleep(3 * 1000);
            for(int i=1; i<=5 ; i++){
                System.out.println("Key "+i+" value: "+ cache.get(""+i));
            }
            Thread.sleep(3 * 1000);
            for(int i=1; i<=5 ; i++){
                System.out.println("Key "+i+" value: "+ cache.get(""+i));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
