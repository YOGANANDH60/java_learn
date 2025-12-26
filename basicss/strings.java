public class strings {
    public static void main(String[] args) {
        String name = new String("yoga");
        System.out.println(name);
        System.out.println(name.concat("nandh"));
        System.out.println(name.charAt(3));



        StringBuffer sb=new StringBuffer("yoga");
        sb.append("nandh");
        sb.append(78);

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
