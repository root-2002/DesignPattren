import singelton.singel;

public class Main {
    public static void main(String[] args) {
        singel s = singel.gitInstance();
        singel s2 = singel.gitInstance();
        s.print();
        s2.print();
      }
}