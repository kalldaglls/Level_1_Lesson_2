    import java.util.Arrays;

    public class Lesson_2_ {
        public static void main(String[] args) {
            byte[] a = new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
            int[] b = new int[]{33, 192, 113, 431};
            int [] c = new int []{1,1,1,2,1};
            int [] d = new int [8];
            int[] e = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
            System.out.println(Arrays.toString(changeNumber(a)));
            fillArray(d);
            multiplyTwo(e);
            fillDiagonalEl();
            maxMin(b);
            checkSumm(c);
        }

        static byte[] changeNumber (byte[] a) {
            for (int i = 0; i <= a.length - 1; i++) {
                if (a[i] == 0) a[i] = 1;
                else a[i] = 0;
            }
            return a;
        }
        static void fillArray(int[] d) {// 1. зачем предлагает сделать insert NotNull?
            for (int i = 0; i <= d.length - 1; i++){//2.как ещё можно было решить?
                d[i] = 3 * i;
            }
            System.out.println(Arrays.toString(d));

        }
        static void multiplyTwo(int[] e) {
            for (int i = 0; i < e.length; i++) {
                if (e[i] < 6) e[i] = e[i] * 2;//3.корректна ли данная конструкция?
            }
            System.out.println(Arrays.toString(e));

        }
        static void fillDiagonalEl() {
            int[][] numbers = {
                    {0, -82, 91, 112},
                    {0, -82, 91, 112},
                    {0, -82, 91, 112},
                    {0, -82, 91, 112}
            };
            for (int i = 0; i <= numbers.length; i = i + numbers.length - 1) {
                for (int j = 0; j < numbers[i].length; j = j + numbers[i].length - 1) {
                    numbers [i] [j] = 1;//4.Не получилось вывести обновленый массив -
                    // выдал [[I@7382f612 [[I@7382f612 [[I@7382f612 [[I@7382f612. Можно ли это вообще сделать одной командой?
                }
            }
            System.out.println();
        }
        static void maxMin(int[] b) {
            int max = b[0];
            for (int i = 1; i < b.length; i++) { //5. i задана только в этом цикле? в других местах программа его не видит?
                if (b[i] > max) max = b[i];
                else System.out.println("Go next!");
            }
            int min = b[0];
            for (int i = 1; i < b.length; i++) {
                if (b[i] < min ) min = b[i];
                else System.out.println("Go next!");
            }
            System.out.println(max);
            System.out.println(min);

        }
        static void checkSumm(int [] c) {
            int sum = 0;
            for (int i = 0; i <= c.length - 1; i++) {
                sum += c[i];
            }
            System.out.println("Сумма равна:" + " " + sum);
            int sum2 = 0;
            for (int j = 0; j <= c.length - 1; j++) {
                sum2 +=c[j];
                if (sum2 == sum - sum2) {
                    System.out.println(true + " " + "после элемента массива №" + " " + (j+1));
                    break;
                }
                else System.out.println("Search further!");
            }
        }
    }