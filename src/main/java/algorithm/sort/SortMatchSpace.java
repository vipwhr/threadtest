package algorithm.sort;

import java.io.*;
import java.util.Date;
import java.util.Random;

public class SortMatchSpace {

    public static final int SIZE = 2500000;

    public static void main(String[] args){
        System.out.println("START TIME:  " + new Date().toString());
        makeRandomNumber();
        System.out.println("==========开始读取 " +SIZE+ " 随机数==========");
        int[] source = getRandomNumber();
        System.out.println("==========读取完成，共计 " +SIZE+ " 随机数==========");
        System.out.println("========== " +SIZE+ " 随机数排序开始==========");
        //System.out.println(Arrays.toString(source));


        QuickSort.sort(source);
        HeapSort.sort(getRandomNumber());
        BucketSort.sort(getRandomNumber());
        MergeSort.sort(getRandomNumber());
        ShellSort.sort(getRandomNumber());
        CountSort.sort(getRandomNumber());
        //InsertSort.sort(getRandomNumber());
        //SelectSort.sort(getRandomNumber());
        //BubbleSort.popSort(getRandomNumber());
        //ThreadSort.sort(getRandomNumber());
        System.out.println("==========排序完成=============");
        //writeDoneFile(source);
        System.out.println("END TIME:  " + new Date().toString());
    }

    private static void makeRandomNumber(){
        System.out.println("==========开始创建 " +SIZE+ " 随机数==========");
        //int[] param =new int[SIZE];
        Random random = new Random();
        BufferedWriter bufferedWriter = null;
        File file = new File("E://source.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter  = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < SIZE; i++) {
            try {
                bufferedWriter.write(random.nextInt(SIZE*10)+"");
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==========创建 " +SIZE+ " 随机数完成==========");
    }



    public static int[] getRandomNumber(){
        int[] real = new int[SIZE];

        File file = new File("E://source.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            int i = 0;
            while((temp = bufferedReader.readLine()) != null){

                real[i] = Integer.valueOf(temp);
                i ++;
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }


        return real;
    }

    private static void writeDoneFile(int[] param){
        System.out.println("==========开始将 " +SIZE+ " 随机数排序结果写入结果文件==========");
        //int[] param =new int[SIZE];
        int legth = param.length;
        BufferedWriter bufferedWriter = null;
        File file = new File("E://result.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter  = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < legth; i++) {
            try {
                bufferedWriter.write(param[i]+"");
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("========== " +SIZE+ " 随机数排序结果写入结果文件完成==========");
    }

}
