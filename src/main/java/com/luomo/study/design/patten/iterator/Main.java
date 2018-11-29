package com.luomo.study.design.patten.iterator;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList size:" + arrayList.size());
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 11; i++) {
            hashSet.add(i);
        }
        System.out.println("hashSet size:" + hashSet.size());
        for (Integer i : hashSet) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 11; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList size:" + linkedList.size());
        for (Integer i : linkedList) {
            System.out.println(i);
        }
    }

}
