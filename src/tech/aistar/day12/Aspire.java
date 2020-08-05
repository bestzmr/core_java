package tech.aistar.day12;

/**
 * @author: Merlin
 * @time: 2020/8/5 18:47
 */
public class Aspire {
    public static void aspire(String str) {
        int[] array = new int[6];//a->0 s->1 p->2 i->3 r->4 e->5
        char[] array2 = new char[6];
        array2[0] = 'a';
        array2[1] = 's';
        array2[2] = 'p';
        array2[3] = 'i';
        array2[4] = 'r';
        array2[5] = 'e';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                array[0]++;
            } else if (str.charAt(i) == 's') {
                array[1]++;
            } else if (str.charAt(i) == 'p') {
                array[2]++;
            } else if (str.charAt(i) == 'i') {
                array[3]++;
            } else if (str.charAt(i) == 'r') {
                array[4]++;
            } else if (str.charAt(i) == 'e') {
                array[5]++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array2[i]+":"+array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 0; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                }

            }
            if (max != 0) {
                for (int k = 0; k < array.length; k++) {
                    if (max == array[k]) {
                        array[k] = 0;
                        System.out.println(array2[k]);

                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        aspire("adssdfpjasldfiiireeasee");
    }

}
