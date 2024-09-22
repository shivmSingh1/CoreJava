package Basics;

public class StringBuildersss {
    public static void main(String[] args) {
        String[] arr= new String[]{"my", "name", "is", "shivam", "singh"};
        StringBuilder sb = new StringBuilder();
        for (String string:arr){
            sb.append(string).append(" ");
        }
        System.out.println(sb);
    }
}
