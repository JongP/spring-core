package com.jong.aop;

import java.lang.reflect.Proxy;

public class SortingUtils implements Sortable{
    private SortingUtils() {};

    public static Sortable getInstance() {
        return instance;
    }

    private static Sortable instance = SortingUtils.newInstance();
    private static Sortable newInstance() {
        Sortable sortingUtils = new SortingUtils();
        return (Sortable) Proxy.newProxyInstance(sortingUtils.getClass().getClassLoader(),
                                                 sortingUtils.getClass().getInterfaces(), new DynamicInvocationHandler(sortingUtils));
    }

    @Override
    public void quickSort(int[] arr) {
        //long startTime = System.nanoTime();
        ////sorting logic
        //long estimatedTime = System.nanoTime() - startTime;
        System.out.println("quickSort");
    }

    @Override
    public void mergeSort(int[] arr) {
        //long startTime = System.nanoTime();
        ////sorting logic
        //long estimatedTime = System.nanoTime() - startTime;
        System.out.println("mergeSort");
    }
}
