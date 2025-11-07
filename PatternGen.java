//Carson Kim
//11/5/25
//Pattern Generator that generates different lines of pattern with the use of different loops

public class PatternGen {
    public static void main(String[] args) {
        // Example usage:
        stars(7);
        triangle(5);
        eo(6);
        odds(7);
        pyramid(5);
    }

    public static void stars(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

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
    public static void odds(int start){
        for(int i = start;i>=1;i-=2){
            for(int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void eo(int maxE){
        boolean startE= (maxE%2 != 0);
        for(int i = 1; i<=maxE;i++){
            char character;
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
        for(int i = maxE-1;i>=1;i--){
            char character;
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
    public static void pyramid(int rows){
        for(int i = 1; i<=rows;i++){
            for(int j = 1;j<rows;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=(2*i)-1;k++){
                System.out.print(i);
            }
            System.out.println();
        }

}
}
