import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Reversed: " + reverse(12345));
//        System.out.println("Perfect Square: " + isSquare(3));
//        System.out.println("is Array Sum as Sub: " + isSub();
//        System.out.println("is Sub Character: " + isSubChar("mynameiskhan", "sam"));

        //check if inertial array is passed
//        System.out.println("is Inertal array like : {2, 12, 4, 6, 8, 11}: " + isInertial());
        //check if array is centered with Odd number and length

//        System.out.println("is Array Centred: " + isCentered());
//        System.out.println("is Array Centred: " + isCenter15());

//        System.out.println("is Gurthrei Array: " + gurSequence());
//        System.out.println("is Common Value Array: " + Arrays.toString(isCommonArray()));

        //Point of Equilibrium
//        System.out.println("POE for {1, 8, 3, 7, 10, 2} is: "+ poe(new int[]{1, 8, 3, 7, 10, 2}));
//        System.out.println("POE for {1, 5, 3, 1, 1, 1, 1, 1, 1} is: "+ poe(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
//        System.out.println("POE for {2, 1, 1, 1, 2, 1, 7} is: "+ poe(new int[]{2, 1, 1, 1, 2, 1, 7}));
//        System.out.println("POE for {1, 2, 3} is: "+ poe(new int[]{1, 2, 3}));
//        System.out.println("POE for {3, 4, 5, 10} is: "+ poe(new int[]{3, 4, 5, 10}));
//        System.out.println("POE for {1, 2, 10, 3, 4} is: "+ poe(new int[]{1, 2, 10, 3, 4}));

        //porcupine number
//        System.out.println("Next Porcupine Number: " + porcupine(51));
        System.out.println("is Porcupine Number: " + fp(51));
        System.out.println("is Porcupine Number: " + fp(4));
//        testmodel();

        //porcupine1();


        }

        //reverse string or int with the help of string method

    static String reverseString(){
        String str = "MyNameIsKhan";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            reverse += str.charAt(i);
        }
        return reverse;

    }

    //reverseInteger without array
    static int reverseInt(){

        int num = 123456789;
        int reversed = 0;

        // run loop until num becomes 0
        while (num != 0) {
            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            //System.out.println("revesed: " + reversed + "digit: " + digit + "num: " + (num /= 10));

            // remove the last digit from num
            num /= 10;
        }
        return reversed;

    }

    //check if array isCentered with Odd number with

    static int isCentered() {

        int[] num = {4, 3, 2, 1, 10, 12, 99};
        int isCent=0;

        if (num.length % 2 == 0) {
            return 0;
        }
        int m = num[num.length / 2];
        for (int i = 0; i < num.length; i++) {

            //System.out.println("Inc: " + i + " Mid Val: " + m + " Val: " + num[i]);

            if(m<=num[i]){
                isCent=1;
            } else {
                isCent=0;
                break;

            }



        }
        return isCent;
    }

    //check if Centered-15
    static int isCenter15(){

        int[] num = {3, 2, 10, 4, 1, 6};

        if(num.length < 3) return 0;

        if(num[num.length/2]==15) return 1;

        int sum, i, j;

        for(i = 0; i < num.length-1; i++){
            sum = 0;
            for(j=i; j < num.length-i; j++){
                sum +=num[j];
                if(sum>15) break;
            }
            if (sum==15) return 1;
        }
        return 0;

    }

    //check if array passed is Inertial

    static int isInertial(){

        int[] a = {2, 12, 4, 6, 8, 11};
        boolean isInertial = true, hasOdd = false;
        int max = 0;

        //chck if the odd value exist or not
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                hasOdd = true;
            }
        }
        //is hasOdd get the max value
        if (hasOdd) {
            for (int k = 0; k < a.length; k++) {
                if (a[k] > max) {
                    max = a[k];
                }
            }
            //if max is even
            if (max % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    //if odd number
                    if (a[j] % 2 != 0) {
                        for (int j2 = 0; j2 < a.length; j2++) {
                            //if even and less than every odd and that is not max
                            if (a[j2] % 2 == 0 && a[j] < a[j2] && a[j2] != max) {
                                isInertial = false;
                            }
                        }
                    }
                }
            } else {
                isInertial = false;
            }
        } else {
            isInertial = false;
        }
        if (isInertial) {
            return 1;
        }
        return 0;

    }


        //check sub character exist of not
        static int isSubChar(String str, String sub) {
            if(str.length() < sub.length() || str.length() == 0 || sub.length() == 0) return 0;
            int len1 = str.length(), len2 = sub.length(), i, j, flag = 0;
            for(i = 0; i < len1 - len2; i++) {
                flag = 1;
                for(j = 0; j < len2; j++) {
                    if(str.charAt(i + j) != sub.charAt(j)) {
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) break;
            }
            return flag;
        }

        //isSub defined to be an array in which each element is greater than sum of all

        static int isSub(int[] a){
        int rtnVal = 1, sum = 0;
        for(int i=a.length-1;i>0;i--)
        {
            sum += a[i];
            if(sum>=a[i-1])
            {
                rtnVal = 0;
                break;
            }
        }
                return rtnVal;

        }

        //isSquare value given to the below
        static  int isSquare(int sq){

        int isSq=0;
        for (int i=0; i<=sq; i++){
            if(i*i==sq){
                isSq=1;
                break;
            }
        }
        return isSq;
        }


        //perfectly find the square number or not



        //reverse the int without array
        static int reverse(int n){
            int rev=0, sign=1, rem=0;
            if(n==0) return 0;
            if(n<0){
                sign=-1;
                n=-n;
            }
            while(n>0){
                rem = n%10;
                rev = rev*10+rem;
                n /=10;
            }
            return sign*rev;
        }

        //Gurthrei Sequence
    static int gurSequence(){

        int[] num = {20, 10, 5, 16, 7, 4, 5, 1};

        int result = 1;

        if(num.length==1 || num[num.length-1]!=1) return 0;


        for(int i = 0; i < num.length; i++){

            int next = 0;

            if(num[i] % 2 == 0){
                if((num[i]/2) != num[i+1]) {
                    result = 0;
                    break;
                }
            } else {
                next = (num[i]*3)+1;
                if(next != num[i+1]) result = 0;
                break;
            }


//            System.out.println("result: " + next);

            if(next == 1) return result;

        }
//        System.out.println("result: " + result);
        return result;
    }

    // is Meera Array


    // is Common Value on Array

    static int[] isCommonArray(){

        int[] a = {1, 8, 3, 2, 6, 0};
        int[] b = {5, 2, 1, 3, 6, 0};

        if(a == null || b == null) return null;
        if(a.length == 0 || b.length == 0) return new int[0];

        int[] c = new int[a.length];
        int k=0;

        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    c[k] = a[i];
                    k++;
                }

            }

        }
        //assigning actual amount of values only
        int[] comm = new int[k];
        for(int l=0; l<k; l++){
            comm[l] = c[l];
        }


        return comm;
    }

    //POE (point of equilibrium) from positive integer

    static int poe(int[] a){

       // int[] a = {1, 8, 3, 2, 6, 0};

        int left = 0, right, i, j, pos = -1;
        if(a.length<3) return -1;
        for(i = 1; i < a.length - 1; i++) {
            left = left + a[i - 1];
            right = 0;
            for(j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if(left == right) pos = i;
        }
        return pos;
    }

    //if prime number

    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        boolean thePrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                thePrime = false;
                break;
            }
        }
        return thePrime;
    }

    //porcupine number

    static String porcupine(int k){

        //initialized with the next value
        int n = 50;
        n++;
        boolean isPorcupine = false;
        String num = "Num: ";
        int max = 2000;

            if(isPrime(n)) {
                while (n < max && n % 10 == 9) {
                    for (int j = n; j < max; j++) {

                        if (isPrime(j) && j % 10 != 9) {
                            num += j;
                            isPorcupine = false;
                            break;
                        } else {
                            num += j;
                            isPorcupine = true;
                            break;
                        }

                    }
                    n++;
                }
            }


        return num;

    }

    static int isPorcupineNumber(int n) {
        int max = 5000;
        int i = n;
        boolean porcupineFound = false;
        int porcupineNumber = 0;

        while (i<max) {
            if (isPrime(i)) {
                for (int j = i; j < max; j++) {
                    if (isPrime(j)) {
                        if (j%10 != 9) {
                            break;
                        }
                        porcupineFound = true;
                        porcupineNumber = j;
                    }
                }
                i++;
            }
            if (porcupineFound) {
                return porcupineNumber;
            }
        }
        return porcupineNumber;

    }

    public static int fp(int n) {
        int i, flag, porcupine = 0;

        if(n % 2 == 0) n += 1;
        else n += 2;

        for( ; ;n += 2 ) {
            flag = 1;
            for(i = 3; i < n; i += 2) {
                if(n % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1 && porcupine % 10 == 9 && n % 10 == 9) break;
            else if(flag == 1) porcupine = n;
        }
        return porcupine;
    }



    }
