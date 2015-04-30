/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import model.Application;
import model.Transaksi;

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
        Application app = new Application();
        Transaksi t = new Transaksi();
        app.addLapangan("001", "Rumput Laut", 120000);
        app.addLapangan("002", "Rumput Jepang", 160000);
        app.addMember("M0001", "Zavli", "081333992122");
        app.addMember("M0003", "Ucok", "081344992122");
        app.removeMember("M0003");
        app.addMember("M0004", "Paijo", "081334451223");
        app.addMember("M0005", "Aryadi", "081324124124");
        t.bayarUangMuka(app.cariLapangan("002"), app.returnMember("M0001"));
        t.bayarUangMuka(app.cariLapangan("002"), app.returnMember("M0005"));
        t.pesanLapangan("10 April 2015", "Jumat", app.cariLapangan("002"), app.returnMember("M0005"), 8);
        t.pesanLapangan("11 April 2015", "Sabtu", app.cariLapangan("002"), app.returnMember("M0001"), 8);
        t.batalLapangan(app.cariLapangan("002"), 8);
        System.out.println(app.cariMember("M0004"));
        t.pesanLapangan("10 April 2015", "Jumat", app.cariLapangan("002"), app.returnMember("M0004"), 9);
        System.out.println(Arrays.toString(app.cariLapangan("001").getJadwal()));
        System.out.println(app.getDaftarMember());
        System.out.println(Arrays.toString(app.cariLapangan("002").getJadwal()));
        System.out.println(t.getLaporan());
    }

}
