package testsiswa;

public class TestSiswa {

    public static void main(String[] args) {
        encapSiswa siswa = new encapSiswa();
        siswa.setName("agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("nama: " + siswa.getName()
                + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge()
                + " tahun");

    }

}
