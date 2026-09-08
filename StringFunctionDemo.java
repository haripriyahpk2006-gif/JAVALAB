public class StringFunctionDemo{
    public static void main(String[] args){
        String str1="java programming";
        String str2=" java programming";
        String str3="Welcome to java";
        String str4="";
        System.out.println("Original string:"+str1);
        System.out.println("Length:"+str1.length());
        System.out.println("Substring(5):"+str1.substring(5));
        System.out.println("Substring(5,11):"+str1.substring(5,11));
        System.out.println("Concatenation:"+str1.concat("Language"));
        System.out.println("Equals:"+str1.equals(str2));
        System.out.println("Equals ignore case:"+str1.equalsIgnoreCase(str2));
        System.out.println("CompareTo:"+str1.compareTo(str2));
        System.out.println("compareTo ignore case:"+str1.compareToIgnoreCase(str2));
        System.out.println("contains'java':"+str1.contains("java"));
        System.out.println("starts with 'java':"+str1.startsWith("java"));
        System.out.println("endswith 'ming':"+str1.endsWith("ming"));
        System.out.println("index of 'p':"+str1.indexOf('p'));
        System.out.println("last index of 'a':"+str1.lastIndexOf('a'));
        System.out.println("Replace java with python:"+str1.replace("java","python"));
        System.out.println("replace all vowels:"+str1.replaceAll("[AEIOUaeiou]","*"));
        System.out.println("Upper case:"+str1.toUpperCase());
        System.out.println("Lower case:"+str1.toLowerCase());
        System.out.println("Trim:"+str3.trim()+"");
        System.out.println("is empty:"+str4.isEmpty());

        String[] words=str1.split(" ");
        System.out.println("Split:");
        for(String word:words){
            System.out.println("word");
        }
        int num=100;
        String s=String.valueOf(num);
        System.out.println("ValueOf():"+s);
        char[]ch=str1.toCharArray();
        System.out.println("CharaterArray:");
        for(char c:ch){
            System.out.println(c+"");
        }
        System.out.println();
        String joined=String.join("-","java","python","c++");
        System.out.println("join:"+joined);
        System.out.println("Repeat:" +"Hi".repeat(3));


    }
}


