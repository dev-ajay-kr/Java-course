public class A {



   public static void Atrate(int n)
    {
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@ ");
            }

            System.out.println();
        }
    }



   public static void main(String args[])
    {
        int k =6;
        Atrate(k);
        }
        }