//Carson Kim
//11/5/25
//Pattern Generator that generates different lines of pattern with the use of different loops
//no user input

//pre con - have other methods to call that generate patterns
//post con - prints out different patterns based on the method called
public class PatternGen {
    public static void main(String[] args) {
        //calls all methods to generate patterns - copied the # of rows/starting number/max lines from directions doc
        //blank prints in between patterns to separate them
        stars(7);
        System.out.println("");
        triangle(9);
        System.out.println("");
        odds(9);
        System.out.println("");
        eo(6);
        System.out.println("");
        pyramid(5);
    }
//pre con - number of rows to print
//post con - prints out a triangle of stars with the number of rows given
    public static void stars(int rows) {
        int i = 1;
        while (i <= rows) {
            int k = 1;
            int j = 1;
            while (k==1){
                System.out.print("*");
                k++;
            }
                while (j < i) {
                    System.out.print("**");
                    j++;
            }
            System.out.println();
            i++;
        }
    }
//pre con - number of rows to print
//post con - prints out a triangle of numbers with the number of rows given
    public static void triangle(int rows){
        int i = 1;
        while (i <= rows) {
            int j = 1;
            do {
                System.out.print(i);
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        }
    }
//pre con - starting odd number
//post con - prints out a pattern of odd numbers starting from the given number
    public static void odds(int start){
        for(int i = start;i>=1;i-=2){
            for(int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    //pre con - maximum number of lines
    //post con - prints out a pattern of E's and O's in a sideways pyramid shape
    public static void eo(int maxE){
        //top half
        boolean startE= (maxE%2 != 0);
        for(int i = 1; i<=maxE;i++){
            char character;
            //determine starting character
            if(startE){
                if(i%2 != 0){
                    character = 'E';
                }else  {
                    character = 'O';
                }
            
            } else {
                if(i%2 != 0){
                    character = 'O';
                }else{
                    character = 'E';
                }
            }
            for(int j = 1; j<=i;j++){
                System.out.print(character);
            }
            System.out.println();
        }
        //bottom half
        for(int i = maxE-1;i>=1;i--){
            char character;
            //determine starting character
            if(startE){
                if(i%2 != 0){
                    character = 'E';
                }else  {
                    character = 'O';
                }
            
            } else {
                if(i%2 != 0){
                    character = 'O';
                }else{
                    character = 'E';
                }
            }
            for(int j = 1; j<=i;j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
    //pre con - number of rows
    //post con - prints out a pyramid of numbers with the number of rows given
    public static void pyramid(int rows){
        for(int i = 1; i<=rows;i++){
            //print spaces
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            //print numbers
            int numCount = (rows-i)*2+1;
            for(int k = 0;k<numCount;k++){
                System.out.print(i);
            }
            System.out.println();
        }

}
}
