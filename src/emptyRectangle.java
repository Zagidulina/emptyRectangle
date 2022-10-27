import java.sql.SQLOutput;

public class emptyRectangle {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {

            if (a == 0 || a == 9) {
                int b = 0;
                while (b < 20) {
                    System.out.print("Б");
                    b++;
                }
            } else {
                int c = 0;
                while (c < 20) {
                    if (c == 0 || c == 19) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }

                    c++;
                }
            }

            System.out.println();
            a++;
        }


    }

}

