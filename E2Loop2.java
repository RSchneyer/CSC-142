public class E2Loop2 {
    public static void main(String [] args){
        int ctr = 0;
        char c;
        String input = "Computer Science";

        while(ctr < input.length()){
            c = input.charAt(ctr);
            if(( c < 'a' || c > 'm' ) && c != ' '){
                System.out.println(""+c);
            }
            ctr++;    
        }
    
    }
}