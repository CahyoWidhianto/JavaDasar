package OprasiData;
public class OprasiBoolean {
    public static void main(String[] args) {
        int nilai =80;
        int absen =70;

        boolean LulusAbsen = absen >= 75;
        boolean LulusNilaiAkhir = nilai >= 75;

        boolean lulus = LulusAbsen && LulusNilaiAkhir;
        System.out.println(lulus);


    }
}
