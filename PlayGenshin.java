// MainGenshinFixed.java

// ----------------------------------------------------
// 1. ABSTRACT CLASS: Character (Diperbaiki: Tidak Ada)
// ----------------------------------------------------
abstract class Character {
    String name;
    String element;

    // Konstruktor untuk init 
    public Character (String name, String element) {
        this.name = name;
        this.element = element;
    }

    // Metode abstract
    public abstract String attack();

    // Metode konkret (Diperbaiki: System huruf besar, kutip lurus)
    public void characterInfo() {
        System.out.println(this.name + " (Elemen: " + this.element + ") is ready to attack!");
    }
}

// ----------------------------------------------------
// 2. CONCRETE SUBCLASS: Venti (Diperbaiki: @override huruf kecil)
// ----------------------------------------------------
class Venti extends Character {
    public Venti(){
        super("Venti", "Anemo");
    }
    
    // Implementasi metode abstrak (Annotation harus huruf kecil: @Override)
    @Override
    public String attack() {
        return this.name + " casting wind domain, Skyward Sonnet!";
    }
}

// ----------------------------------------------------
// 3. CONCRETE SUBCLASS: Zhongli (Diperbaiki: Constructor harus ada)
// ----------------------------------------------------
class Zhongli extends Character {
    
    // Constructor harus didefinisikan secara eksplisit
    public Zhongli() {
        super("Zhongli", "Geo");
    }

    @Override
    public String attack() {
        return this.name + " casting stone pillar, Stone Stele!";
    }
}


// ----------------------------------------------------
// 4. MAIN CLASS (Diperbaiki: Semua System.out, Inisialisasi Objek, Tanda Kurung)
// ----------------------------------------------------
public class PlayGenshin {
    public static void main(String[] args) {

        // Inheritance membuat objek dari subclass (Diperbaiki: Nama kelas Venti/Zhongli)
        Venti vt = new Venti();
        Zhongli zl = new Zhongli();

        System.out.println("--- Characters Ready ---");

        vt.characterInfo();
        zl.characterInfo();

        System.out.println("--- Attacking ---");

        System.out.println("Venti: " + vt.attack());
        // Diperbaiki: System huruf besar dan penutup kurung
        System.out.println("Zhongli: " + zl.attack()); 
    }
}