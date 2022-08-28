package playground;

import java.io.*;

public class playground1 {
    /**
     *
     */
    private static final double phi = 3.14;

    public static void main(String[] args) throws IOException {
        BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));

        /*
        PROGRAM PERHITUNGAN MATEMATIKA
        LUAS, KELILING, BANGUN RUANG
        */
        String[] listMenu={
            "LUAS & KELILING BANGUN RUANG", "SEGITIGA", "LINGKARAN", "PERSEGI",
            "PERSEGI PANJANG", "JAJAR GENJANG", "TRAPESIUM", "LAYANG-LAYANG",
            "BELAH KETUPAT", "LUAS", "KELILING"};

        double [] sisiSegitiga= new double[3];

        double  sisi=0, alas, tinggi, lebar, jari2, panjang, diagonal, 
                kSegitiga=0, lSegitiga, kLingkaran, lLingkaran, 
                kPersegi, lPersegi, kPPanjang, lPPanjang,
                kJGenjang, lJGenjang, kTrapesium, lTrapesium,
                kLayang, lLayang, kBKetupat, lBKetupat;
            
        int menu;
        
        double q=0,w=0,e=0,r=0;

        while (true) {
            System.out.println("---\tPROGRAM HITUNG MATEMATIKA\t---");
            System.out.println("---\t\tMENU\t\t\t---");
            System.out.println("1. "+listMenu[0]);
            System.out.println("9. EXIT PROGRAM");
            System.out.print("Masukkan index menu yang akan dituju: ");
            menu= Integer.parseInt(rd.readLine());
            System.out.println();
            switch (menu) {
                case 1:     // LUAS DAN KELILING BANGUN RUANG
                    System.out.println("LUAS DAN KELILING BANGUN RUANG YANG TERSEDIA:");
                    for (int a=1; a<8; a++) {
                        System.out.println(a+". "+listMenu[a]);
                    }
                    System.out.print("Masukkan index menu yang akan dituju: ");
                    menu= Integer.parseInt(rd.readLine());
                    System.out.println();
                    switch (menu) {
                        case 1:         // SEGITIGA
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. ALAS\n4. TINGGI");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // LUAS SEGITIGA
                                    System.out.println("CARI LUAS BERDASARKAN:");
                                    System.out.println("1. ALAS DAN TINGGI\n2. KETIGA SISI");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // BERDASARKAN ALAS DAN TINGGI
                                            System.out.print("MASUKKAN ALAS DARI SEGITIGA: ");
                                            alas= Double.parseDouble(rd.readLine());
                                            System.out.print("MASUKKAN TINGGI DARI SEGITIGA: ");
                                            tinggi= Double.parseDouble(rd.readLine());
                                            lSegitiga= 1/2 * alas * tinggi;
                                            System.out.println("LUAS DARI SEGITIGA: "+lSegitiga+"\n");
                                        break;
                                        case 2:     // BERDASARKAN KETIGA SISI
                                            for (int a=0; a<sisiSegitiga.length; a++) {
                                                System.out.print("MASUKKAN SISI KE-"+(a+1)+": ");
                                                sisi= Double.parseDouble(rd.readLine());
                                                sisiSegitiga[a]=sisi;
                                            }
                                            sisi=sisiSegitiga[0]+sisiSegitiga[1]+sisiSegitiga[2];
                                            lSegitiga= Math.sqrt(sisi*(sisi-sisiSegitiga[0])*(sisi-sisiSegitiga[1])*(sisi-sisiSegitiga[2]));
                                            System.out.println("LUAS DARI SEGITIGA: "+lSegitiga+"\n");
                                        break;
                                    }
                                break;
                                case 2:     // KELILING SEGITIGA
                                    for (int a=1; a<=3; a++) {
                                        System.out.print("MASUKKAN SISI KE-"+a+" DARI SEGITIGA: ");
                                        sisi= Double.parseDouble(rd.readLine());
                                        kSegitiga+=sisi;
                                    }
                                    System.out.println("KELILING DARI SEGITIGA: "+kSegitiga+"\n");
                                break;
                                case 3:     // CARI ALAS SEGITIGA
                                    System.out.println("CARI ALAS SEGITIGA BERDASARKAN:");
                                    System.out.println("1. LUAS");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:
                                            System.out.print("MASUKKAN LUAS SEGITIGA: ");
                                            lSegitiga= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN TINGGI SEGITIGA: ");
                                            tinggi= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            alas= (lSegitiga/tinggi)*2;
                                            System.out.println("ALAS DARI SEGITIGA: "+alas+" cm \n");
                                        break;
                                        default:
                                        break;
                                    }
                                break;
                                case 4:     // CARI TINGGI SEGITIGA
                                    System.out.println("CARI TINGGI SEGITIGA BERDASARKAN:");
                                    System.out.println("1. LUAS");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:
                                            System.out.print("MASUKKAN LUAS SEGITIGA: ");
                                            lSegitiga= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN ALAS SEGITIGA: ");
                                            alas= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            tinggi= (lSegitiga/alas)*2;
                                            System.out.println("TINGGI DARI SEGITIGA: "+tinggi+"\n");
                                        break;
                                        default:
                                        break;
                                    }
                                break;
                            }
                        break;
                        case 2:     // LINGKARAN
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. JARI-JARI");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // LUAS LINGKARAN
                                    System.out.print("MASUKKAN JARI-JARI DARI LINGKARAN: ");
                                    jari2= Double.parseDouble(rd.readLine());
                                    lLingkaran= playground1.phi*jari2*jari2;
                                    System.out.println();
                                    System.out.println("LUAS DARI LINGKARAN: "+lLingkaran+"\n");
                                break;
                                case 2:     // KELILING LINGKARAN
                                    System.out.print("MASUKKAN JARI-JARI DARI LINGKARAN: ");
                                    jari2= Double.parseDouble(rd.readLine());
                                    kLingkaran= 2*playground1.phi*jari2;
                                    System.out.println();
                                    System.out.println("KELILING DARI LINGKARAN: "+kLingkaran+"\n");
                                break;
                                case 3:     // CARI JARI-JARI LINGKARAN
                                    System.out.println("CARI JARI-JARI LINGKARAN BERDASARKAN:");
                                    System.out.println("1. LUAS\n2. KELILING");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // CARI BERDASARKAN LUAS LINGKARAN
                                            System.out.print("MASUKKAN LUAS DARI LINGKARAN: ");
                                            lLingkaran= Double.parseDouble(rd.readLine());
                                            jari2= Math.sqrt(lLingkaran/phi);
                                            System.out.println();
                                            System.out.println("JARI-JARI DARI LINGKARAN: "+jari2+"\n");
                                        break;
                                        case 2:     // CARI BERDASARKAN KELILING LINGKARAN
                                            System.out.print("MASUKKAN KELILING DARI LINGKARAN: ");
                                            kLingkaran= Double.parseDouble(rd.readLine());
                                            jari2= kLingkaran/2/phi;
                                            System.out.println();
                                            System.out.println("JARI-JARI DARI LINGKARAN: "+jari2+"\n");
                                        break;
                                    }
                                break;
                            }
                        break;
                        case 3:     // PERSEGI
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. SISI");
                            System.out.println("4.DIAGONAL");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // CARI LUAS PERSEGI
                                    System.out.println("CARI LUAS BERDASARKAN:");
                                    System.out.println("1. SISI\n2. KELILING\n3. DIAGONAL");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // BERDASARKAN SISI
                                            System.out.print("MASUKKAN SISI PERSEGI: ");
                                            sisi= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lPersegi= Math.pow(sisi, 2);
                                            System.out.println("LUAS DARI PERSEGI: "+lPersegi+"\n");
                                        break;
                                        case 2:     // BERDASARKAN KELILING
                                            System.out.print("MASUKKAN KELILING PERSEGI: ");
                                            kPersegi= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lPersegi= Math.pow(kPersegi/4, 2);
                                            System.out.println("LUAS DARI PERSEGI: "+lPersegi+"\n");
                                        break;
                                        case 3:     // BERDASARKAN DIAGONAL
                                            System.out.print("MASUKKAN DIAGONAL PERSEGI: ");
                                            diagonal= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lPersegi= Math.pow(diagonal, 2)/2;
                                            System.out.println("LUAS DARI PERSEGI: "+lPersegi+"\n");
                                        break;
                                    }
                                break;
                                case 2:     // KELILING PERSEGI
                                    System.out.print("MASUKKAN SISI PERSEGI: ");
                                    sisi= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    kPersegi= sisi*4;
                                    System.out.println("KELILING DARI PERSEGI: "+kPersegi+"\n");
                                break;
                                case 3:     // CARI SISI PERSEGI
                                    System.out.println("METODE YANG DIGUNAKAN: ");
                                    System.out.println("1. LUAS\n2. KELILING\n3. DIAGONAL");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // BERDASARKAN LUAS
                                            System.out.print("MASUKKAN LUAS DARI PERSEGI: ");
                                            lPersegi= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            sisi= Math.sqrt(lPersegi);
                                            System.out.println("SISI DARI PERSEGI: "+sisi+"\n");
                                        break;
                                        case 2:     // BERDASARKAN KELILING
                                            System.out.print("MASUKKAN KELILING DARI PERSEGI: ");
                                            kPersegi= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            sisi= kPersegi/4;
                                            System.out.println("SISI DARI PERSEGI: "+sisi+"\n");
                                        break;
                                        case 3:     // BERDASARKAN DIAGONAL
                                            System.out.print("MASUKKAN DIAGONAL DARI PERSEGI: ");
                                            diagonal= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            sisi= diagonal/Math.sqrt(2);
                                            System.out.println("SISI DARI PERSEGI: "+sisi+"\n");
                                        break;
                                    }
                                break;
                                case 4:     // CARI DIAGONAL PERSEGI
                                    System.out.print("MASUKKAN SISI DARI PERSEGI: ");
                                    sisi= Double.parseDouble(rd.readLine());
                                    diagonal= sisi*Math.sqrt(2);
                                    System.out.println("DIAGONAL DARI PERSEGI: "+diagonal+"\n");
                                break;
                            }
                        break;
                        case 4:     // PERSEGI PANJANG
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. PANJANG\n4. LEBAR\n5. DIAGONAL");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // CARI LUAS
                                    System.out.print("MASUKKAN PANJANG: ");    
                                    panjang= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    System.out.print("MASUKKAN LEBAR: ");
                                    lebar= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    lPPanjang= panjang*lebar;
                                    System.out.println("LUAS DARI PERSEGI PANJANG: "+lPPanjang+"\n");
                                break;
                                case 2:     // CARI KELILING
                                    System.out.print("MASUKKAN PANJANG: ");    
                                    panjang= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    System.out.print("MASUKKAN LEBAR: ");
                                    lebar= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    kPPanjang= 2*(panjang+lebar);
                                    System.out.println("KELILING DARI PERSEGI PANJANG: "+kPPanjang+"\n");
                                break;
                                case 3:     // CARI PANJANG
                                    System.out.println("CARI PANJANG BERDASARKAN:");
                                    System.out.println("1. LUAS DAN LEBAR\n2. KELILING DAN LEBAR\n3. DIAGONAL DAN LEBAR");
                                    System.out.print("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // BERDASARKAN LUAS DAN LEBAR
                                            System.out.print("MASUKKAN LUAS: ");
                                            lPPanjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN LEBAR: ");
                                            lebar= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            panjang= lPPanjang/lebar;
                                            System.out.println("PANJANG DARI PERSEGI PANJANG: "+panjang+"\n");
                                        break;
                                        case 2:     // BERDASARKAN KELILING DAN LEBAR
                                            System.out.print("MASUKKAN KELILING: ");
                                            kPPanjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN LEBAR: ");
                                            lebar= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            panjang= kPPanjang/2 - lebar;
                                            System.out.println("PANJANG DARI PERSEGI PANJANG: "+panjang+"\n");
                                        break;
                                        case 3:     // BERDASARKAN DIAGONAL DAN LEBAR
                                            System.out.print("MASUKKAN DIAGONAL: ");
                                            diagonal= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN LEBAR: ");
                                            lebar= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            panjang= Math.sqrt(Math.pow(diagonal, 2)-Math.pow(lebar, 2));
                                            System.out.println("PANJANG DARI PERSEGI PANJANG: "+panjang+"\n");
                                        break;
                                    }
                                break;
                                case 4:     // CARI LEBAR
                                    System.out.println("CARI LEBAR BERDASARKAN:");
                                    System.out.println("1. LUAS DAN PANJANG\n2. KELILING DAN PANJANG\n3. DIAGONAL DAN PANJANG");
                                    System.out.println("Masukkan index yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // CARI BERDASARKAN LUAS DAN PANJANG
                                            System.out.print("MASUKKAN LUAS: ");
                                            lPPanjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN PANJANG: ");
                                            panjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lebar= lPPanjang/panjang;
                                            System.out.println("LEBAR DARI PERSEGI PANJANG: "+lebar+"\n");
                                        break;
                                        case 2:     // CARI BERDASARKAN KELILING DAN PANJANG
                                            System.out.print("MASUKKAN KELILING: ");
                                            kPPanjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN PANJANG: ");
                                            panjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lebar= kPPanjang/2 - panjang;
                                            System.out.println("LEBAR DARI PERSEGI PANJANG: "+lebar+"\n");
                                        break;
                                        case 3:     // CARI BERDASARKAN DIAGONAL DAN PANJANG
                                            System.out.print("MASUKKAN DIAGONAL: ");
                                            diagonal= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            System.out.print("MASUKKAN PANJANG: ");
                                            panjang= Double.parseDouble(rd.readLine());
                                            System.out.println();
                                            lebar= Math.sqrt(Math.pow(diagonal, 2)-Math.pow(panjang, 2));
                                            System.out.println("LEBAR DARI PERSEGI PANJANG: "+lebar+"\n");
                                        break;
                                    }
                                break;
                                case 5:     // CARI DIAGONAL
                                    System.out.print("MASUKKAN PANJANG DARI PERSEGI PANJANG: ");
                                    panjang= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    System.out.print("MASUKKAN LEBAR DARI PERSEGI PANJANG: ");
                                    lebar= Double.parseDouble(rd.readLine());
                                    System.out.println();
                                    diagonal= Math.sqrt(Math.pow(panjang, 2)+Math.pow(lebar, 2));
                                    System.out.println("DIAGONAL DARI PERSEGI PANJANG: "+diagonal+"\n");
                                break;
                            }
                        break;
                        case 5:     // JAJAR GENJANG
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. ALAS\n4. TINGGI\n5. SISI MIRING");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // CARI LUAS JAJAR GENJANG
                                    System.out.print("MASUKKAN ALAS DARI JAJAR GENJANG: ");
                                    alas= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN TINGGI DARI JAJAR GENJANG: ");
                                    tinggi= Double.parseDouble(rd.readLine());
                                    lJGenjang= alas*tinggi;
                                    System.out.println("LUAS DARI JAJAR GENJANG: "+lJGenjang+"\n");
                                break;
                                case 2:     // CARI KELILING JAJAR GENJANG
                                    System.out.print("MASUKKAN SISI A: ");
                                    sisi= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN SISI B: ");
                                    sisi+= Double.parseDouble(rd.readLine());
                                    kJGenjang= 2*sisi;
                                    System.out.println("KELILING DARI JAJAR GENJANG: "+kJGenjang+"\n");
                                break;
                                case 3:     // CARI ALAS JAJAR GENJANG
                                    System.out.println("CARI ALAS JAJAR GENJANG BERDASARKAN:");
                                    System.out.println("1. LUAS DAN TINGGI\n2. KELILING DAN SISI MIRING (B)");
                                    System.out.print("Masukkan index yang ingin dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    switch (menu) {
                                        case 1:     // CARI ALAS BERDASARKAN LUAS
                                            System.out.print("MASUKKAN LUAS DARI JAJAR GENJANG: ");
                                            lJGenjang= Double.parseDouble(rd.readLine());
                                            System.out.print("MASUKKAN TINGGI DARI JAJAR GENJANG: ");
                                            tinggi= Double.parseDouble(rd.readLine());
                                            alas= lJGenjang/tinggi;
                                            System.out.println("ALAS DARI JAJAR GENJANG: "+alas+"\n");
                                        break;
                                        case 2:     // CARI ALAS BERDASARKAN KELILING
                                            System.out.print("MASUKKAN KELILING DARI JAJAR GENJANG: ");
                                            kJGenjang= Double.parseDouble(rd.readLine());
                                            System.out.print("MASUKKAN SISI MIRING DARI JAJAR GENJANG: ");
                                            sisi= Double.parseDouble(rd.readLine());
                                            alas= kJGenjang/2 - sisi;
                                            System.out.println("ALAS DARI JAJAR GENJANG: "+alas+"\n");
                                        break;
                                    }
                                break;
                                case 4:     // CARI TINGGI JAJAR GENJANG
                                    System.out.print("MASUKKAN LUAS DARI JAJAR GENJANG: ");
                                    lJGenjang= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN ALAS DARI JAJAR GENJANG: ");
                                    alas= Double.parseDouble(rd.readLine());
                                    tinggi= lJGenjang/alas;
                                    System.out.println("TINGGI DARI JAJAR GENJANG: "+tinggi+"\n");
                                break;
                                case 5:     // CARI SISI MIRING JAJAR GENJANG
                                    System.out.print("MASUKKAN KELILING DARI JAJAR GENJANG: ");
                                    kJGenjang= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN SISI A DARI JAJAR GENJANG: ");
                                    alas= Double.parseDouble(rd.readLine());
                                    sisi= kJGenjang/2-alas;
                                    System.out.println("SISI MIRING DARI JAJAR GENJANG: "+sisi+"\n");
                                break;
                            }
                        break;
                        case 6:     // TRAPESIUM
                            System.out.println("PILIH MENU YANG AKAN DICARI");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. TINGGI\n4. SEMUA SISI (A, B, C, D)");
                            System.out.print("Masukkan index menu yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                            switch (menu) {
                                case 1:     // CARI LUAS TRAPESIUM
                                    System.out.print("MASUKKAN TINGGI TRAPESIUM: ");
                                    tinggi= Double.parseDouble(rd.readLine());
                                    for (int a=0; a<2; a++) {
                                        if (a==0) {
                                            System.out.print("MASUKKAN SISI A (SISI YANG BERLAWANAN): ");
                                        } else {
                                            System.out.print("MASUKKAN SISI B (SISI YANG BERLAWANAN): ");
                                        }
                                        sisi= Double.parseDouble(rd.readLine());
                                        sisiSegitiga[a]=sisi;
                                    }
                                    lTrapesium= (sisiSegitiga[0]+sisiSegitiga[1])*tinggi/2;
                                    System.out.println("LUAS DARI TRAPESIUM: "+lTrapesium+"\n");
                                break;
                                case 2:     // CARI KELILING TRAPESIUM
                                    for (int i=1; i<=4; i++) {
                                        switch (i) {    // MASUKKAN KEEMPAT SISI TRAPESIUM
                                            case 1:     // MASUKKAN SISI A
                                                System.out.print("MASUKKAN SISI A (SISI YANG SEJAJAR): ");
                                                q= Double.parseDouble(rd.readLine());
                                                break;
                                            case 2:     // MASUKKAN SISI B
                                                System.out.print("MASUKKAN SISI B (SISI YANG SEJAJAR): ");
                                                w= Double.parseDouble(rd.readLine());
                                                break;
                                            case 3:     // MASUKKAN SISI C
                                                System.out.print("MASUKKAN SISI C: ");
                                                e= Double.parseDouble(rd.readLine());
                                                break;
                                            case 4:     // MASUKKAN SISI D
                                                System.out.print("MASUKKAN SISI D: ");
                                                r= Double.parseDouble(rd.readLine());
                                                break;
                                        }
                                    }
                                    kTrapesium= q+w+e+r;
                                    System.out.println("KELILING DARI TRAPESIUM: "+kTrapesium+"\n");
                                break;
                                case 3:     // CARI TINGGI TRAPESIUM
                                    System.out.print("MASUKKAN LUAS TRAPESIUM: ");
                                    lTrapesium= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN SISI A (SISI YANG SEJAJAR): ");
                                    sisi= Double.parseDouble(rd.readLine());
                                    System.out.print("MASUKKAN SISI B (SISI YANG SEJAJAR): ");
                                    sisi+= Double.parseDouble(rd.readLine());
                                    tinggi= 2*lTrapesium/sisi;
                                    System.out.println("TINGGI DARI TRAPESIUM: "+tinggi+"\n");
                                break;
                                case 4:     // CARI SISI A B C D
                                    System.out.println("MENCARI SISI A, B, C, DAN D");
                                    System.out.println("MASUKKAN METODE MANA YANG AKAN DIGUNAKAN");
                                    System.out.println("1. LUAS (HANYA BERLAKU UNTUK SISI A DAN B {ATAU SISI YANG SEJAJAR})\n2. KELILING");
                                    System.out.print("Masukkan index menu yang akan dituju: ");
                                    menu= Integer.parseInt(rd.readLine());
                                    System.out.println();
                                    switch (menu) {
                                        case 1:     // MENGGUNAKAN LUAS TRAPESIUM
                                            System.out.print("MASUKKAN LUAS TRAPESIUM: ");
                                            lTrapesium= Double.parseDouble(rd.readLine());
                                            System.out.print("MASUKKAN TINGGI TRAPESIUM: ");
                                            tinggi= Double.parseDouble(rd.readLine());
                                            System.out.print("MASUKKAN SISI B / YANG SEJAJAR: ");
                                            sisiSegitiga[0]= Double.parseDouble(rd.readLine());
                                            sisi= 2*lTrapesium/tinggi-sisiSegitiga[0];
                                            System.out.println("PANJANG SISI A DARI TRAPESIUM: "+sisi+"\n");
                                            break;
                                        case 2:     // MENGGUNAKAN KELILING TRAPESIUM
                                            System.out.print("MASUKKAN KELILING TRAPESIUM: ");
                                            kTrapesium= Double.parseDouble(rd.readLine());
                                            System.out.println("MASUKKAN KETIGA SISI LAINNYA");
                                            for (int a=1; a<=3; a++) {
                                                System.out.print("\tMASUKKAN SISI KE-"+a+": ");
                                                if (a==1) {
                                                    sisi= Double.parseDouble(rd.readLine());
                                                } else {
                                                    sisi+= Double.parseDouble(rd.readLine());
                                                }
                                            }
                                            alas= kTrapesium-sisi;
                                            System.out.println("PANJANG SALAH SATU SISI DARI TRAPESIUM: "+alas+"\n");
                                            break;
                                    }
                                break;
                            }
                        break;
                        case 7:     // LAYANG-LAYANG
                            System.out.println("PILIH MENU YANG AKAN DITUJU");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. PANJANG\n4. LEBAR\n5. DIAGONAL");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                        break;
                        case 8:     // BELAH KETUPAT
                            System.out.println("PILIH LUAS ATAU KELILING");
                            for (int a=9; a<11; a++) {
                                System.out.println((a-8)+". "+listMenu[a]);
                            }
                            System.out.println("3. PANJANG\n4. LEBAR\n5. DIAGONAL");
                            System.out.print("Masukkan index yang akan dituju: ");
                            menu= Integer.parseInt(rd.readLine());
                            System.out.println();
                        break;
                    }
                break;
                case 9:
                    System.exit(0);
                break;
            }
        }
    }
}