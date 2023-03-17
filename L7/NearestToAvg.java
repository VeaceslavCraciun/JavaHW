package JavaHW.L7;

import java.util.Scanner;

public class NearestToAvg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        double size = sc.nextInt(), load = 0;
        System.out.println("Now enter the elements to find nearest to average");
        double array[] = new double[(int)size];

        for(int i = 0; i<size; i++){
            array[i] = sc.nextDouble();
            load = load + array[i];
        }
//        System.out.println(load);
        double avg = load/size, record = size, answer = 0;

        for(int i = 0; i<size; i++){
            double dist = Math.abs(array[i]-avg);
            if(dist < record){
                answer = array[i];
                record = dist;
            }
        }

        System.out.println(answer);
    }
}