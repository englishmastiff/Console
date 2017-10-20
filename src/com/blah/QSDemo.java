/* Try this 6-3: A simple version of the Quicksort

The Quicksort is considered the best general-purpose sorting algorithm, which relies on recursion.
Quicksort is built on the idea of partitions - it selects a value, the comparand, then partitions the array into two sections.
All elements >= to the partition value are put on one side, and all < are put onto the other side.
*/
class QuickSort {
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    private static void qs(char items[], int left, int right) {
        int i;
        int j;
        char x;
        char y;

        i = left; j = right;
        x= items[(left+right)/2];

        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j < left)) j--;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}

class QSDemo {
    public static void main(String args[]) {
        char a[] = {'d', 'x', 'a','r','p','j','i'};
        int i;

        System.out.println("Original array: ");
        for(i=0; i < a.length; i++)
            System.out.println(a[i]);

        System.out.println();

        // now, sort the array
        QuickSort.qsort(a);

        System.out.print("Sorted array: ");
        for(i=0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
