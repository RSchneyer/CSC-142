public class NumSum {
    public static void main(String [] args) {
            int sum = 0;
            int num = 2;
            while(num<=20){
                System.out.print(num);
                if(num<20){
                    System.out.print("+");
                }
                sum += num;
                num += 2;
            }
            System.out.print("=");
            System.out.print(sum);
        }
    }