public class Massives {
    public static void main(String[] args) {
            byte[] a = new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
            int[] b = new int[]{33, 192, 113, 431};
            int[] c = new int[]{1, 1, 1, 2, 1};
            changeNumber(a);
            maxMin(b);
            checkSumm(c);

        }

        static void changeNumber ( byte[] a){
            for (int i = 0; i <= a.length - 1; i++) {
                if (a[i] == 0) a[i] = 1;
                else a[i] = 0;
            }
            System.out.println(Arrays.toString(a)); //так предложила Idea. как по другому сделать?
        }

        static void maxMin ( int[] b){
            int max = b[0];
            for (int i = 1; i < b.length; i++) { //i задана только в этом цикле? в других местах программа его не видит?
                if (b[i] > max) max = b[i];
                else System.out.println("Go next!");
            }
            int min = b[0];
            for (int i = 1; i < b.length; i++) {
                if (b[i] < min) min = b[i];
                else System.out.println("Go next!");
            }
            System.out.println(max);
            System.out.println(min);

        }
        static void checkSumm ( int[] c){
            for (int i = 0; i <= c.length - 1; i++) {//как сложить все элементы массива после i? как сложить все элементы до i включительно?


            }


        }

    }