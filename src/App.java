public class App {
    public static void main(String[] args) throws Exception {
        
        //telefon sınıfında yapıcı metot kullanılmıyor
        Telefon tel1 = new Telefon();
        tel1.Marka = "Samsung";
        tel1.Model = "A70";
        
        //ogrenci sınıfı yapıcı metot kullanıyor.
        Ogrenci ogrenci = new Ogrenci("Ecem",
                "Aykanat",
                1592);
        System.out.println(ogrenci.Ad);

        Ucgen ucgen1 = new Ucgen(5, 6);
        System.out.println(ucgen1.Alan());
        

    }

}
