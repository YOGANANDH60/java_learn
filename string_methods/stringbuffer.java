package string_methods;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(20);

        sb.append("hello yoga,");
        sb.append(" how's going");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.lastIndexOf("o"));
        System.out.println(sb.charAt(19));
        // System.out.println(sb.length());
        // System.out.println(sb.substring(5,8));


    }
}
