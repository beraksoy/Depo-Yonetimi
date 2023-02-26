package depoenson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMethodService implements ProductService {
    Product product = new Product();
    Scanner inp = new Scanner(System.in);
    // URUNLERİ SAKLAMAK İCİN BİR LİST OLUSTURDUM

    List<Product> products = new ArrayList<>();

    public ProductMethodService() {
        // sistemi kontrol edebilmek icin mevct urunler bulunacak
        Product product1 = new Product("cizi", "ulker", "25 kutu", "unlu mamuller", "raf 1");
        Product product2 = new Product("haylayf", "ulker", "25 kutu", "unlu mamuller", "raf 1");
        Product product3 = new Product("kuru fasulye", "oba", "100 kg", "bakliyat", "raf 2");
        Product product4 = new Product("nohut", "yayla", "150 kg", "bakliyat", "raf 2");

        this.products.add(product1);
        this.products.add(product2);
        this.products.add(product3);
        this.products.add(product4);


    }

    @Override
    public void girisMenu() {
        int choice;
        do {
            System.out.println("----------------------------------------");
            System.out.println("---------DEPO YONETİM SİSTEMİ----------");
            System.out.println();
            System.out.println("1: urunleri listele");
            System.out.println("2: urun ekle");
            System.out.println("3: urun sil");
            System.out.println("4: urunleri filtrele");
            System.out.println("0: bir önceki menuye don");
            System.out.println("seciminiz");
            choice = inp.nextInt();
            inp.nextLine();
            switch (choice) {
                case 1:
                    urunListeleme();
                    break;
                case 2:
                    urunEkleme();
                    break;
                case 3:
                    urunSilme();
                    break;
                case 4:
                    System.out.println("birim");
                    String brm = inp.nextLine();
                    filter(brm);
                    break;
                case 0:
                    System.out.println("bir onceki menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("hatali giris yaptınız");
                    break;
            }
        } while (choice != 0);


    }

    // 6.adım: kitaplari formatla yazdiralim
    @Override
    public void urunListeleme() {
        System.out.println("           ----------------URUN LİSTESİ-------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-4s| %-20s| %-15s| %-9s| %-18s| %-5s\n",
                "ID", " Urun Adi ", "Uretici" , " Miktar ", " Birim ", " Raf ");
        System.out.println("---------------------------------------------------------------------------------");
        this.products.forEach(product -> System.out.printf("%-4s| %-20s| %-15s| %-9s| %-18s|%-5s\n",
                product.getId(), product.getName(), product.getUretici(), product.getMiktar(), product.getBirim(), product.getRaf()));
        System.out.println("---------------------------------------------------------------------------------");


    }

    @Override
    public void urunEkleme() {

        int urunid = product.getId();
        boolean isExist = false;
        for (Product product : this.products) {
            if (product == products) {
                System.out.println("bu urun sisteme kayitlidir.");
                isExist = true;
                break;
            }
        }
        if (!isExist) {


            System.out.println("urun adini giriniz");
            String name = inp.nextLine();
            System.out.println("uretici");
            String uretici = inp.nextLine();
            System.out.println("miktar");
            String miktar = inp.nextLine();
            System.out.println("birim");
            String birim = inp.nextLine();
            System.out.println("Raf");
            String raf = inp.nextLine();
            Product newProduct = new Product(name, uretici, miktar, birim, "raf " +raf);
            this.products.add(newProduct);

            System.out.println("çıkmak icin 0 tuslayiniz");


        }
        urunListeleme();

    }

    @Override
    public void urunSilme() {
        boolean isExist = true;
        System.out.println("urun ıd sini giriniz");
        int id = inp.nextInt();
        for (Product product : this.products) {
            if (product.getId() == id) {
                this.products.remove(product);
                System.out.println("urun silindi");
                break;
            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("urun bulunamadi");

        }

    }

    @Override
    public void filter(String filter) {

        int counter = 0;
        for (Product product : this.products) {
            if (product.getBirim().equalsIgnoreCase(filter)) {
                System.out.printf("%-4s| %-20s| %-15s| %-9s| %-18s| %-5s\n",
                        product.getId(), product.getName(), product.getUretici(), product.getMiktar(), product.getBirim(), product.getRaf());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("urun bulunamadi");
        }
    }
}

