/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class Transaksi {

    private final ArrayList<String> laporan;
    private double pemasukan;

    /**
     * Constructor untuk transaksi, untuk menginstansiasi laporan by 1103130063
     */
    public Transaksi() {
        laporan = new ArrayList<>();
        pemasukan = 0;
    }

    /**
     * Method untuk memesan lapangan futsal by 1103130045 
     * Exception by 1103130066
     *
     * @param tanggal tanggal yang akan di set ke jadwal, tipe: String
     * @param hari hari yang akan diset ke jadwal, tipe: String
     * @param lapangan lapangan yang akan dipesan, tipe: Lapangan
     * @param member member yang akan memesan, tipe: Member
     * @param jam jam berapa lapangan dipesan, tipe: int
     */
    public void pesanLapangan(String tanggal, String hari, Lapangan lapangan, Member member, int jam) {
        try {
            Jadwal jadwal[] = new Jadwal[23];
            Jadwal j = new Jadwal(tanggal, hari, Integer.toString(jam), member);
            String s;
            if (jam >= 8) {
                if (!member.isStatusBayar()) {
                    s = "Lapangan " + lapangan.getNoLapangan() + " dipesan oleh " + member.getNamaMember() + " jam " + Integer.toString(jam) + " belum bayar uang muka.";
                } else {
                    s = "Lapangan " + lapangan.getNoLapangan() + " dipesan oleh " + member.getNamaMember() + " jam " + Integer.toString(jam) + " sudah bayar uang muka sebesar " + bayarUangMuka(lapangan, member);
                }
            } else {
                throw new IllegalArgumentException("Lapangan masih tutup.");
            }
            jadwal[jam] = j;
            lapangan.setJadwal(jadwal);
            laporan.add(s);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Illegal argument exception.");
        }

    }

    /**
     * Method untuk menghapus jadwal by 1103130063, 1103130045
     *
     * @param lapangan lapangan yang jadwalnya mau dihapus
     * @param jam jam jadwal dihapus
     */
    public void hapusJadwal(Lapangan lapangan, int jam) {
        Jadwal j[] = lapangan.getJadwal();
        if (j[jam] != null) {
            j[jam] = null;
            lapangan.setJadwal(j);
        } else {
            throw new IllegalArgumentException("Jadwal kosong.");
        }
    }

    /**
     * Method untuk membayar uang muka by 1103130063
     *
     * @param lapangan lapangan yang akan dibayar uang muka, tipe: Lapangan
     * @param member member yang akan membayar uang muka, tipe: Member
     * @return uangMuka
     */
    public double bayarUangMuka(Lapangan lapangan, Member member) {
        double uangMuka = 0.5 * lapangan.getHarga();
        member.setStatusBayar(true);
        setPemasukan(this.pemasukan + uangMuka);
        return uangMuka;
    }

    /**
     * Method untuk membayar pelunasan biaya lapangan by 1103130045
     *
     * @param lapangan lapangan yang akan dibayar uang pelunasan, tipe: Lapangan
     * @param member member yang akan membayar uang pelunasan, tipe: Member
     * @return sisaBayar
     */
    public double bayarPelunasanLapangan(Lapangan lapangan, Member member) {
        double sisaBayar = bayarUangMuka(lapangan, member);
        member.setStatusBayar(true);
        setPemasukan(this.pemasukan + sisaBayar);
        return sisaBayar;
    }

    /**
     * Method untuk mendapatkan pemasukan
     *
     * @return pemasukan
     */
    public double getPemasukan() {
        return pemasukan;
    }

    /**
     * Method untuk mengeset pemasukan by 1103130063
     *
     * @param pemasukan pemasukan yang akan diset, tipe: int
     */
    public void setPemasukan(double pemasukan) {
        this.pemasukan = pemasukan;
    }

    /**
     * Method untuk membatalkan lapangan by 1103130066
     *
     * @param lapangan lapangan yang akan dibatalkan, tipe: Lapangan
     * @param jam pemesanan jam berapa yang dibatalkan, tipe: int
     */
    public void batalLapangan(Lapangan lapangan, int jam) {
        Jadwal jadwal[];
        String s;
        jadwal = lapangan.getJadwal();
        jadwal[jam] = null;
        s = "Pemesanan lapangan " + lapangan.getNoLapangan() + " pada jam " + Integer.toString(jam) + " dibatalkan.";
        lapangan.setJadwal(jadwal);
        laporan.add(s);
    }

    /**
     * Method untuk mendapatkan laporan by 1103130063
     *
     * @return laporan
     */
    public ArrayList<String> getLaporan() {
        return laporan;
    }

}