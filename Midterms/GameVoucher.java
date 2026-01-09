/**
 * Nama: Audy Alodia Melizard
 * NIM: 240401010097
 * Mata Kuliah: Pemrograman Berbasis Objek - IF 305
 * Case Study: Sistem Manajemen Stok Voucher Game
 */

public class GameVoucher {
    // Enkapsulasi agar data stok dan harga agar hanya bisa diubah melalui methods yang terkontrol

    private String gameName;
    private String voucherDesc;
    private int currentStock;
    private double price;
    private final int MINIMUM_STOCK_LIMIT = 5;

    // Constructor untuk inisialisasi Object dan mengatur nilai awal

    public GameVoucher(String gameName, String voucherDesc, int currentStock, double price) {
        this.gameName = gameName;
        this.voucherDesc = voucherDesc;
        this.currentStock = currentStock;
        this.price = price;
        System.out.println("Voucher " + this.gameName + " (" + this.voucherDesc + ") berhasil didaftarkan.");
    }

    // Method untuk menambah stok

    public void restockVoucher(int addSum) {
        if (addSum > 0) {
            this.currentStock += addSum;
            System.out.println("--> Berhaasil restock. Stok " + this.gameName + " bertambah " + addSum + " unit.");
            StockWarning();
        }
        else {
            System.err.println(" !!! Gagal restock. Jumlah harus lebih dari 0.");
        }
    }

    // Method untuk mengurangi stock
    public boolean sellVoucher(int salesAmount) {
        // Enkapsulasi untuk validasi data di dalam method agar stok tidak negatif
        if (salesAmount > 0 && this.currentStock >= salesAmount){
            this.currentStock -= salesAmount;
            double totalPrice = salesAmount * this.price;
            System.out.printf("--> Berhasil terjual: %d unit. Total harga: Rp %.2f.%n", salesAmount, totalPrice);
            StockWarning();
            return true;
        }
        else if (this.currentStock < salesAmount) {
            System.err.println("!!! Gagal jual: Stok " + this.gameName + " tidak mencukupi. (Sisa: " + this.currentStock +")");
            return false;
        }
        else {
            System.err.println("!!! Gagaljual: jumlah penjualan harus lebih dari nol");
            return false;
        }
    }

    // Private Method untuk cek kondisi (batas minimum stok)
    private void StockWarning() {
        if (this.currentStock <= MINIMUM_STOCK_LIMIT) {
            System.out.println("!!! Reminder: Stok " + this.gameName + " tersisa " + this.currentStock + " unit.");
        }
    }

    // Method getter untuk menampilkan semua informasi objek
    public String getStockInfo(){
        return "\n--- Status Voucher---\n"
        + "Game: " + gameName + " (" + voucherDesc + ")\n"
        + "Harga: Rp " + String.format("%.2f", price) + "\n"
        + "Stok Tersisa: " + currentStock + " unit\n"
        + "-----------------------------";
    }
}