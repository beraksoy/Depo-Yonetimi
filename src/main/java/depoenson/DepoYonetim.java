package depoenson;

public class DepoYonetim {


    public static void main(String[] args) {
        ProductMethodService productMethodService = new ProductMethodService();


        productMethodService.girisMenu();
        productMethodService.urunEkleme();
        productMethodService.urunListeleme();


    }
}
