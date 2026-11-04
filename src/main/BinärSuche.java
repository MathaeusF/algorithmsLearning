package main;
public class BinärSuche {
    public static int binärSucheRecursive(int[] array, int key) {
        return binärSucheRecursive(array, 0, array.length - 1, key);
    }
    public static int binärSucheRecursive(int[] array, int low, int high, int key){
        if(high<low) return -1;
        int mid = (low + high) >>> 1;
        int midVal = array[mid];

        if(key==midVal)
            return mid;
        else if (key < midVal)
            return binärSucheRecursive(array,low,mid-1,key);
        else
            return binärSucheRecursive(array, mid+1, high, key);

    }
    public static int binärSucheIterative(int[]array, int key){
        return binärSucheIterative(array, 0, array.length, key);
    }
    public static int binärSucheIterative(int[]array, int low,int high,int key){
        int mid;
        int midVal;

        while (low<=high){
            mid = (low+high) >>> 1;
            midVal = array[mid];
            if(key == midVal)
                return mid;
            else if (key<midVal)
                high = mid-1;
            else
                low = mid + 1;

            }
        return -1;
        }
    }

