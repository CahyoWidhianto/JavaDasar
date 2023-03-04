public class KonfersiTipeDataNumber {
    public static void main(String[] args) {

        //konfersi nilai number
        byte inibyte = 10;
        short inishort = inibyte;
        int iniint = inishort;

        byte inibyet2 =  (byte) iniint;

        //overload nilai (tidak boleh konfersi dari yang paling besar ke yang lebih kecil)
        int iniint2 = 1000;
        byte inibyet3 = (byte) iniint2;



    }
}
