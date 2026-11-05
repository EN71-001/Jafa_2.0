package org.jafa;

public class Przeliczanie {

    public static void main(String[] args) {


        int len = args.length;
        if (len > 0) {
            String str = args[0];
            System.out.println(str);

            int wal;
            if (str.startsWith("0x")) {
                wal = strToHex(str.substring(2),16);
            } else if (str.startsWith("B")) {
                wal = strToHex(str.substring(1),2);
            } else {
                wal = strToHex(str,10);
            }

            System.out.println(wal);


        }

    }

    private static int strToHex( String str , int dvoice ) {
        int sum=0;
        for(int i=0;i<str.length();i++){
            int v = charToVal(str.substring(i));
            sum=sum*dvoice;
            sum=sum+v;
            System.out.println(v);
        }
        System.out.println(sum);
        String s = hexToString(sum, 10)+" : "+hexToString(sum, 16)+" : "+hexToString(sum, 2);
        System.out.println(s);
        return 2;
    }
    private static String hexToString(int value, int dvoice ){
        String str="          ";
        char[] charArray = str.toCharArray();
        int rest=0;
        int c=0;
        int pos=9;
        while (pos>-1){
            rest=value/dvoice;
            c=value%dvoice;
            if (c<10) {c=c+48;} else c=c+48+7;
            charArray[pos]= (char) (c);
            pos--;
            value=rest;
        }
        return String.copyValueOf(charArray);
    }

    private static int charToVal(String str) {
        int v = str.codePointAt(0)-48;
        if(v>9) v=v-7;
        if (v<0) {return 0;}
        if (v>15) {return 0;}
        return v;
    }

}
