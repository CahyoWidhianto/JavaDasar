public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000000L;

        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte =100;
        System.out.println(iniByte);

        //representasi dari tipe data primitif ke bukan primitif
        int iniint =120;
        Integer iniInterger2 = iniint;

        //pemanggilan function untuk konversi dari data bukan primitif ke data primitif
        int age = 20;
        Integer ageObject = age;
        // kembali ke primitif 
        int ageAgain = ageObject;
        // jika tipe data tidak sama dari int ke short atau lainnya
        // bisa menggunakan function dari java menggunakan .
        // semua tipe data yang buka primitif memiliki fungsi bawaan untuk konfersi dari tipe data a ke b
        // tidak hanya int saja tapi semuanya bisa di konfersikan

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        long longAge = ageObject.longValue();

         
    }
}
