package MethodBlock;

public class MethodVarArgument {
    public static void main(String[] args) {
        // int[] values = {80,50,40,80,80};
        sayCongrats("Cahyo", 80,90,90,90);
    }

    static void sayCongrats(String name, int... values) {
    // static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        int finalValue = total/ values.length;

        if(finalValue >=75){
            System.out.println("Selamat " + name + " Anda Lulus");
        }else{
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}

//bisa menggunakan nama yang sama pada method tapi parameternya haru berbeda 