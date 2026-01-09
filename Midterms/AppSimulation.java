/**
 * Nama: Audy Alodia Melizard
 * NIM: 240401010097
 * Mata Kuliah: Pemrograman Berbasis Objek - IF 305
 * Case Study: Sistem Manajemen Stok Voucher Game
 */

public class AppSimulation {
    public static void main(String[] args) {
        System.out.println("--- SIMULASI MANAJEMEN STOK VOUCHER GAME --- ");

        GameVoucher genshin = new GameVoucher("Genshin Impact", "Welkin Moon", 15, 65000.0);
        GameVoucher starRail = new GameVoucher("Honkai: Star Rail", "900 Jade", 5, 75000.0);
        GameVoucher wwm = new GameVoucher("Where Winds Meet", "Early Access Package", 15, 16000.0);

        System.out.println(genshin.getStockInfo());
        System.out.println(starRail.getStockInfo());
        System.out.println(wwm.getStockInfo());

        // Uji penjualan
        System.out.println("\n[UJI 1: Penjualan Voucher Genshin]");
        genshin.sellVoucher(8);

        System.out.println("\n[UJI 2: Penjualan Voucher Star Rail]");
        starRail.sellVoucher(3);

        System.out.println("\n[UJI 3: Penjualan Voucher Where Winds Meet]");
        wwm.sellVoucher(7);

        // Uji restock
        System.out.println("\n[UJI 4: Restock Voucher Star Rail]");
        starRail.restockVoucher(50);

        // Stok akhir
        System.out.println("--- STATUS AKHIR STOK --- ");
        System.out.println(genshin.getStockInfo());
        System.out.println(starRail.getStockInfo());
        System.out.println(wwm.getStockInfo());
        System.out.println("--- SIMULASI SELESAI ---");
    }
}