import java.util.Random;

public class Die {
    private int sides;
    private Random rg;

    public Die(int sideCount){
        sides = (sideCount<2||sideCount>40)?6:sideCount;
        rg = new Random();
    }
    public Die(){
        this(6);
    }

    public int roll(){
        return rg.nextInt(sides) + 1;
    }
    public String toString(){
        return sides+"-sided die";
    }

    public static void main(String [] args){
        Die d6 = new Die();
        Die d20 = new Die(20);
        Die bigDie = new Die(100);

        System.out.println("The dice are:");
        System.out.println("d6: a " + d6);
        System.out.println("d20: a " + d20);
        System.out.println("bigDie: a " + bigDie);
        System.out.println();
        
        for(int x=0; x<21; x++){
            System.out.print("Rolling a " + d6);
            System.out.println(": Rolled a "+d6.roll());

            System.out.print("Rolling a " + d20);
            System.out.println(": Rolled a "+d20.roll());

            System.out.print("Rolling a " + bigDie);
            System.out.println(": Rolled a "+bigDie.roll());
        }
        System.out.println("All Done!");

    }


}