public class Ucgen {
    public int Yukseklik;
    public int Taban;

    public Ucgen(int yukseklik, int taban) {
        this.Yukseklik = yukseklik;
        this.Taban = taban;
    }

    public int Alan() {
        return this.Yukseklik * this.Taban / 2;
    }
}
