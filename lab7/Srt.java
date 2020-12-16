package com.lab7;

import java.util.Arrays;

public class Srt extends Thread {
    private Integer[] mas;
    private int typeOfSrt;
    private int order;

    public Srt(Integer[] mas, int typeOfSort, int order) {
        super();
        this.mas = mas;
        this.typeOfSrt = typeOfSort > 1 ? 1 : typeOfSort;
        this.order = order > 1 ? 1 : order;
    }

    @Override
    public void run() {
        try {
            if(typeOfSrt == 0) sortByValue(order);
            if(typeOfSrt == 1) sortByDigits(order);
        }
        catch(Exception e) {
            System.out.println("End");
        }
    }

    public Integer[] get() {
        return mas;
    }

    private void sortByValue(int order) {
        if(order == 0) Arrays.sort(mas);
        if(order == 1) mas = Arrays.stream(mas).sorted((a, b) -> b - a).toArray(Integer[]::new);
    }

    private void sortByDigits(int order) {
        if(order == 0) {
            mas = Arrays
                    .stream(mas)
                    .sorted((a, b) -> {
                        int i = 0;
                        while(a > 0) {
                            i++;
                            a /= 10;
                        }
                        int j = 0;
                        while(b > 0) {
                            j++;
                            b /= 10;
                        }
                        return i - j;
                    })
                    .toArray(Integer[]::new);
        };

        if(order == 1) {
            mas = Arrays
                    .stream(mas)
                    .sorted((a, b) -> {
                        int i = 0;
                        while(a > 0) {
                            i++;
                            a /= 10;
                        }
                        int j = 0;
                        while(b > 0) {
                            j++;
                            b /= 10;
                        }
                        return j - i;
                    })
                    .toArray(Integer[]::new);
        }
    }
}