public class tester {

    private static dataEditor editor = new dataEditor();

    public static void main(String[] args){
        double dub = editor.roundDouble(3.14159,2);
        System.out.println(dub);
    }
}
