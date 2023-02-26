package depoenson;

public class Product {
    //id      ismi    ureticisi   miktari     birimi      raf

    private static int count=500;

    private int id;
    private String name;
    private String uretici;
    private String miktar;
    private String birim;
    private String raf;

    public Product(String name, String uretici, String miktar, String birim, String raf) {
        count++;
        this.id = count;
        this.name = name;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Uretici='" + uretici + '\'' +
                ", Miktar='" + miktar + '\'' +
                ", Birim='" + birim + '\'' +
                ", Raf='" + raf + '\'' +
                '}';
    }
}
