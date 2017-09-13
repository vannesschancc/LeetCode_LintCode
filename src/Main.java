import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Leet Code");
        //strStr();
        //subSets();
        //subSetswDups();
        strStr2();
        //subSetswBit();
        //binarySearch();

    }

    public static void strStr(){
        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println("result: " + implementStrStr.strStr("ab", "ab"));
        System.out.println("result: " + implementStrStr.strStr("ab", "abcd"));
        System.out.println("result: " + implementStrStr.strStr("ad", ""));
        System.out.println("result: " + implementStrStr.strStr("adbasdasdadadaas", "dd"));
        System.out.println("result: " + implementStrStr.strStr("abcd", "ab"));
        System.out.println("result: " + implementStrStr.strStr("abcdefghijk", "ghi"));
        System.out.println("result: " + implementStrStr.strStr("abcdefghijk", "ijk"));
        System.out.println("result: " + implementStrStr.strStr("", ""));
        System.out.println("result: " + implementStrStr.strStr("", "a"));
    }
    public static void strStr2(){
        StrStr2 strStr2 = new StrStr2();
        /*
        System.out.println(strStr2.implementstrStr2("abcdf", "abcd"));
        System.out.println(strStr2.implementstrStr2("abcdf", "bcd"));
        System.out.println(strStr2.implementstrStr2("abcdf", "de"));
        System.out.println(strStr2.implementstrStr2("abcdf", "df"));
        System.out.println(strStr2.implementstrStr2("abcdf", ""));
        System.out.println(strStr2.implementstrStr2("tartarget", "target"));
        System.out.println(strStr2.implementstrStr2("tartarget", ""));
        System.out.println(strStr2.implementstrStr2("", "target"));
        */
        System.out.println(strStr2.strSTR2wRk("abcdf", "abcd"));
        System.out.println(strStr2.strSTR2wRk("abcdf", "bcd"));
        System.out.println(strStr2.strSTR2wRk("abcdf", "de"));
        System.out.println(strStr2.strSTR2wRk("abcdf", "df"));
        System.out.println(strStr2.strSTR2wRk("abcdf", ""));
        System.out.println(strStr2.strSTR2wRk("tartarget", "target"));
        System.out.println(strStr2.strSTR2wRk("tartarget", ""));
        System.out.println(strStr2.strSTR2wRk("", "target"));


    }
    public static void subSets(){
        Subset subset1 = new Subset();
        List<List<Integer>> result = subset1.getSubsets(new int[]{0,1,2,3});
        List<List<Integer>> resultRes = subset1.getSubsetsRecursive(new int[]{0,1,2});
    }
    public static void subSetswDups(){
        SubsetwDup subsetwDup = new SubsetwDup();
        List<List<Integer>> result = subsetwDup.getSubsetsRecursive(new int[]{0,1,2,2});
        System.out.println(result);

    }
    public static void subSetswBit(){
        SubsetwBit subsetwBit = new SubsetwBit();
        System.out.println(subsetwBit.getSubsets(new int[]{1,2,3}));
    }
    public static void binarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 1));
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 2));
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 3));
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 4));
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 5));
        //System.out.println(binarySearch.binarySearchIterative(new int[]{0,1,2,3,4,5}, 0));
        //System.out.println(binarySearch.binarySearchIterative(new int[] {}, 1));
        //System.out.println(binarySearch.binarySearchIterative(null, 1));
        //System.out.println(binarySearch.binarySearchIterative(new int[] {0,1,2,3,4,5}, -1));
        //System.out.println(binarySearch.binarySearchIterative(new int[] {0,1,2,3,4,5}, 6));
        //System.out.println(binarySearch.binarySearchIterative(new int[] {0,0,0,0,0,0}, 6));
        //System.out.println(binarySearch.binarySearchIterative(new int[] {0,0,0,0,0,0}, 0));


        //Recursive
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 1));
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 2));
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 3));
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 4));
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 5));
        //System.out.println(binarySearch.binarySearchRecursion(new int[]{0,1,2,3,4,5}, 0));
        //System.out.println(binarySearch.binarySearchRecursion(new int[] {}, 1));
        //System.out.println(binarySearch.binarySearchRecursion(null, 1));
        //System.out.println(binarySearch.binarySearchRecursion(new int[] {0,1,2,3,4,5}, -1));
        //System.out.println(binarySearch.binarySearchRecursion(new int[] {0,1,2,3,4,5}, 6));
        //System.out.println(binarySearch.binarySearchRecursion(new int[] {0,0,0,0,0,0}, 6));
        System.out.println(binarySearch.binarySearchRecursion(new int[] {0,0,1,1,2,2}, 2));
        System.out.println(binarySearch.binarySearchFirst(new int[] {0,0,1,1,2,3}, 1));
    }
}
