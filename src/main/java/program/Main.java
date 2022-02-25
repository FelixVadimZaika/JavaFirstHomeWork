package program;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
  Scanner in = new Scanner(System.in);
//        System.out.println("Введіть розмір масива:");
//        String str = in.nextLine();
//        int n = Integer.parseInt(str);
//        int []array =new int[n];
//        for (int i =0; i<n;i++) {
//            array[i]=random_int(6,22);
//        }
//        for(int item : array) {
//            System.out.println(item);
//        }

        //Task 1
       /* print_String();

        //Task 2
        System.out.println("Enter numberr:");
      int number=in.nextInt();
        System.out.println("Enter procent:");
      int procent=in.nextInt();
        System.out.println(procent_Function(number,procent));

        //Task 3
        System.out.println("Enter number 1:");
        int number1=in.nextInt();
        System.out.println("Enter number 2:");
        int number2=in.nextInt();
        System.out.println("Enter number 3:");
        int number3=in.nextInt();
        System.out.println(GetNumber(number1,number2,number3));*/
        //Task 4
        /*System.out.println("Enter 6-digit number:");
        String s=in.nextLine();
        System.out.println(Task4(s));*/
        //Task5
        /*System.out.println("Enter munth:");
        int m=in.nextInt();
        Task5(m);*/
        //Task6
        /*System.out.println("Enter meters:");
        int me=in.nextInt();
        System.out.println(Task6(me));*/
        //Task7
        /*System.out.println("Enter start number:");
        int st=in.nextInt();
        System.out.println("Enter end number:");
        int end=in.nextInt();
        System.out.println(Task7(st,end));*/
        //Task 8
        /*System.out.println("Enter start number:");
        int st=in.nextInt();
        System.out.println("Enter end number:");
        int end=in.nextInt();
        Task8(st,end);*/
        //Task9
        /*int []array=new int[10];
        Task9(array);*/
        //Task10
        /*int []arr=new int[15];
        Task10(arr);*/
        //Task11
        System.out.println("Enter direction(V/H):");
        String d=in.nextLine();

        System.out.println("Enter symbol:");
        String s=in.nextLine();

        System.out.println("Enter lenth:");
        int l=in.nextInt();
        Task11(d,s,l);
    }
//    public static int random_int(int min, int max)
//    {
//        return (int) (Math.random()*(max-min))+min;
//    }
public static void print_String()
   {
       System.out.println("“Your time is limited,\n" +
               "\tso don’t waste it\n" +
               " \t\tliving someone else’s life”\n" +
               " \t\t\tSteve Jobs\n");
    }

    public static int procent_Function(int number, int procent)
    {
        return procent*(number/100);

    }
    public static int GetNumber(int n1,int n2,int n3){
        String s1=String.valueOf(n1);
        String s2=String.valueOf(n2);
        String s3=String.valueOf(n3);
        String row=s1+s2+s3;
        return Integer.parseInt(row);
    }

    public static String Task4(String s){
        if(s.length()!=6){
            return "Uncorect number";
        }

        char[]arr=s.toCharArray();
        char c=arr[0];
        arr[0]=arr[5];
        arr[5]=c;
        char c1=arr[1];
        arr[1]=arr[4];
        arr[4]=c1;
        String s2=new String(arr);
        return s2;
    }
    public static void Task5(int m){
        if(m==1||m==2||m==12){
            System.out.println("Winter");
        }
        else if(m>=3&&m<=5){
            System.out.println("Spring");
        }
        else if(m>=6&&m<=8){
            System.out.println("Summer");
        }
        else if(m>=9&&m<=11){
            System.out.println("Autumn");
        }
        else{
            System.out.println("Error!");
        }
    }
    public static float Task6(int me){


        System.out.println("1.Miles");
        System.out.println("2.Inches");
        System.out.println("3.Yards");
        System.out.println("Select values:");
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        float result=0;
        switch (v){
            case 1:
                result= (float) (me * 0.00062137);
                break;
            case 2:
                result= (float) (me * 39.370);
                break;
            case 3:
                result= (float) (me * 1.0936);
                break;

        }
        return result;
    }
    public static  int Task7(int s,int e){
        int count=0;
        if (s>e){
            int tmp=s;
            s=e;
            e=tmp;

        }
        for (int i=s;i<=e;i++){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
    public static void Task8(int s, int e){
        for (int i=s;i<=e;i++){
            for (int j=0;j<10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
    public static void Task9(int[]arr){
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*(10-(-100)))+(-100);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max=0;
        int min=arr[0];
        int negative=0;
        int positive=0;
        int zeros=0;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else if(arr[i]==0){
                zeros++;
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        System.out.println("Negative:"+negative);
        System.out.println("Positive:"+positive);
        System.out.println("Zeros:"+zeros);
    }
    //DOESNT WORK
    /* public static void Task10(int[]arr){
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*(100-(-100)))+(-100);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[]even=new int[0];
        int[]odd;
        int[]postiv;
        int[]negativ;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            }
        }
        for (int i=0;i<even.length;i++){
            System.out.println(even[i]);
        }

    }*/
    public static void Task11(String d,String s,int l){
        if(d=="V"){
            for (int i=0;i<l;i++){
                System.out.println(s);
            }
        }
        else if(d=="H"){
            for (int i=0;i<l;i++){
                System.out.print(" "+s+" ");
            }
        }

        else{
            System.out.println("Error");
        }
        System.out.println(d);
    }
}
