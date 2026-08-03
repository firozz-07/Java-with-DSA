

public class normalStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("firoz");
        System.out.println(str);

        String name=str.toString();
        System.out.println(name);
        str.setCharAt(0, 'z');
        System.out.println(str);
    }
}
