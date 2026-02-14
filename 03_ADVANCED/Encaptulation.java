class Data {
    private int marks;

    public void setMarks(int n) {
        marks = n;
    }
    public int getMarks() {
        return marks;
    }
}
public class Encaptulation {
    public static void main(String[] args) {
        Data obj = new Data();

        obj.setMarks(89);
        int res = obj.getMarks();

        System.out.println(res);
    }
}
