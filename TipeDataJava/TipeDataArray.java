//array adalah tipe data yang berisikan kumpulan data yang sama
//tipe data array tidak bisa dirubah setelah di buat
//identitas array direpresentasikan dengan nilai anggka di mulai dari anggka 0 sampai jumlah data di kurang 1
//pembuatan array di lakukan denagan perintah (new di ikuti dengan tipe data yang akan di pakai dengan kurung siku yang merepresentasikan jumlah array)


public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[5];
        arrayString[0] = "C";
        arrayString[1] = "A";
        arrayString[2] = "H";
        arrayString[3] = "Y";
        arrayString[4] = "O";

        // pemanggilan nilai array
        System.out.println("dengan spasi / enter println");
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[4]);
        
        System.out.println("tanpa spasi / enter print");
        System.out.print(arrayString[0]);
        System.out.print(arrayString[1]);
        System.out.print(arrayString[2]);
        System.out.print(arrayString[3]);
        System.out.println(arrayString[4]);

        System.out.println("inisialisasi array");


        //array initializer 
        String[] nama = {
            "C", "A", "H", "Y", "O"
        };

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
            10L, 11L, 12L, 13L, 14L, 15L
        };

        // oprasi array
        // array[index] = mengambil data array
        // array[index] value = mengubah data array
        // array[index] value = null untuk menghapus
        // array.length = mengambil panjang array
        System.out.println("panjang array");
        System.out.println(arrayLong.length);
        System.out.println("penghapusan nilai array");
        nama[1] = null;
        System.out.println(nama[1]);

        System.out.println("array dalam array");
        String[][] members = {
            {"hahah", "2", "3", "4", "hihihi",},
            {"1", "2", "3", "4",},
            {"1", "rampung", "3",}
        };
        System.out.println(members[0]);
        
        String[] members1 = members[0];
        System.out.println(members1[0]);

        System.out.println(members[0][4]);
        System.out.println(members[2][1]);



         
    }
}
