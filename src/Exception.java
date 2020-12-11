public class Exception{
    public static void main(String[] ags) {
        try{
            String str = null;
            System.out.println(str + "の長さは" + str.length());
        }
        catch(NullPointerException str){
            System.out.println("NullPointerExceptionが発生した。");
            System.out.println(str.getMessage());
        }
    }
}