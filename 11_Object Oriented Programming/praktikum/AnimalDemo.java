public class AnimalDemo {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.nama = "binatang";
        System.out.println(a.identify_mySelf());
        Herbivor h = new Herbivor();
        h.nama = "kambing";
        h.jenis_makanan = "tumbuhan";
        h.gigi = "tumpul teeth";
        System.out.println(h.identify_mySelf());
        Carnivor c = new Carnivor();
        c.nama = "Singa";
        c.jenis_makanan = "daging";
        c.gigi = "tajam teeth";
        System.out.println(c.identify_mySelf());
        Omnivor o = new Omnivor();
        o.nama = "Ayam";
        o.jenis_makanan = "semua";
        o.jenis_makanan = "tajam and tumpul teeth";
        System.out.println(o.identify_mySelf());
    }
}
