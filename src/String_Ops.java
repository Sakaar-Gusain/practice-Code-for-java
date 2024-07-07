public class String_Ops{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";
        String str4 = new String("HelloWorld");

        System.out.println("Length of str1: " + str1.length()); 
        System.out.println("Length of str2: " + str2.length()); 
        System.out.println("Length of str3: " + str3.length()); 
        System.out.println("Length of str4: " + str4.length()); 

        System.out.println("\nCheck if str1 is equal to str2: " + str1.equals(str2)); 
        System.out.println("Check if str1 is equal to str3: " + str1.equals(str3)); 
        System.out.println("Check if str1 is equal to str4: " + str1.equals(str4)); 

        System.out.println("\nConcatenate str1 and str2: " + str1.concat(str2)); 

        System.out.println("\nGet character at index 1 of str1: " + str1.charAt(1)); 

        System.out.println("\nIndex of 'o' in str1: " + str1.indexOf('o')); 
        System.out.println("Index of 'o' in str1 starting from index 5: " + str1.indexOf('o', 5)); 

        System.out.println("\nReplace 'e' with 'a' in str1: " + str1.replace('e', 'a')); 

        System.out.println("\nConvert str1 to lowercase: " + str1.toLowerCase()); 
        System.out.println("Convert str1 to uppercase: " + str1.toUpperCase()); 

        System.out.println("\nTrim whitespace from str4: " + str4.trim()); 

        System.out.println("\nCompare str1 and str2 lexicographically: " + str1.compareTo(str2));
    }
}