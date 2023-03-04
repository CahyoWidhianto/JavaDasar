package OprasiData;
//oprasi matematika bisa di lakukan asal tipe dat bersifat number
public class OprasiMatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //oprasi augmanted assigment
        int c = 100;
        c+=10;
        System.out.println(c);
        c-=10;
        System.out.println(c);
        c*=10;
        System.out.println(c);

        //unary oprator
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

    }
}
