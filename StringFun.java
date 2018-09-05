Spublic class StringFun {
    public static void main(String[] args) {
        String s = "Jessica ";
        String otherString = "Baseball";
        String subString = "Ball";
        int len = s.length();
        boolean equa = s.equals(otherString);
        // not inclusive of the end term
        String index = s.substring(0,4);
        String trim = s.trim();
        int sub = s.indexOf(subString); 
        int lastSub= s.lastIndexOf(subString);
        int a = s.charAt(3);
        String newWord = s.concat(otherString);
        String replace =  s.toUpperCase();

        System.out.println(len);
        System.out.println(equa);
        System.out.println(index);
        System.out.println(trim);
        System.out.println(sub);
        System.out.println(lastSub);
        System.out.println(a);
        System.out.println(newWord);
        System.out.println(replace);
    }
}