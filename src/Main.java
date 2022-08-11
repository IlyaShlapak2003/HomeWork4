public class Main {
    public static void main(String[] args) {
        //Задание 1
        short a =1;
        while (a<=10){
            System.out.print(a + " ");
            a+=1;
        }
        System.out.println(" ");
        for(int i=10;i!=0;i--){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        //Задание 2
        int firstFriday = 4;
        for (int i=1;i<=31;i++){
            if ((i==firstFriday) || i==(firstFriday+7) || i==(firstFriday+(7*2)) || i==(firstFriday+(7*3)) || i==(firstFriday+(7*4)) ){
                System.out.println("Сегоденя пятница, " + i + "-е число. Необходимо подготовить отчет." );
            }
        }
        System.out.println(" ");
        //Задание 3
        int ab= 2022-200;
        int bc=2022+100;
        for (int i=0; i<=(2022+100); i+=79){
            if (i>=ab && i<=bc){
                System.out.println(i);
            }
        }
    }
}