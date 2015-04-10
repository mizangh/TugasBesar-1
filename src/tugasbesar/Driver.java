/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.Arrays;

/**
 *
 * @author Nikho Sagala
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kasir k = new Kasir("K001", "Ragil");
        Lapangan l = new Lapangan("Wembley", "Rumput Laut", 120000);
        Lapangan l2 = new Lapangan("Camp Nou", "Rumput Jepang", 160000);
        Transaksi t = new Transaksi();
        k.addMember("M0001", "Zavli", "081333992122");
        k.addMember("M0003", "Ucok", "081344992122");
        k.removeMember("M0003");
        k.addMember("M0004", "Paijo", "081334451223");
        k.addMember("M0005", "Aryadi", "081324124124");
        t.bayarUangMuka(l2, k.returnMember("M0001"));
        t.bayarUangMuka(l, k.returnMember("M0005"));
        t.pesanLapangan("10 April 2015", "Jumat", l, k.returnMember("M0005"), 8);
        t.pesanLapangan("11 April 2015", "Sabtu", l2, k.returnMember("M0001"), 8);
        t.batalLapangan(l2, 8);
        System.out.println(k.cariMember("M0004"));
        t.pesanLapangan("10 April 2015", "Jumat", l2, k.returnMember("M0004"), 9);
        System.out.println(Arrays.toString(l.getJadwal()));
        System.out.println(Arrays.toString(l2.getJadwal()));
        System.out.println(t.getLaporan());
    }

}
