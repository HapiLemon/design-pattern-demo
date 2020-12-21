package com.example.adapter.book;

public class Client {
    public static void main(String[] args) {
        ScoreOperation operation=new OperationAdapter();
        int[] scores={84,76,5,69,90,91,88,96};
        int[] result;
        int score;

        System.out.println("after sort:");
        result=operation.sort(scores);
        for (int i : result) {
            System.out.print(i+",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result, 90);
        if (score == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println("找到了");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result, 92);
        if (score == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println("找到了");
        }
    }
}
