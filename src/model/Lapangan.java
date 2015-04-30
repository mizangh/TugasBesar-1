package model;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikho Sagala
 */
public class Lapangan implements Serializable {

    private String noLapangan;
    private String jenisLapangan;
    private double harga;
    private Jadwal jadwal[];

    /**
     * Constructor Lapangan by 1103130063
     */
    public Lapangan() {
    }

    /**
     * Constructor Lapangan by 1103130063
     *
     * @param noLapangan mengisi no lapangan pada lapangan, tipe: String
     * @param jenisLapangan mengisi jenis lapangan pada lapangan, tipe: String
     * @param harga mengisi harga pada lapangan, tipe: int
     */
    public Lapangan(String noLapangan, String jenisLapangan, int harga) {
        this.noLapangan = noLapangan;
        this.jenisLapangan = jenisLapangan;
        this.harga = harga;
        jadwal = new Jadwal[23];
    }

    /**
     * Method untuk mendapatkan no lapangan by 1103130063
     *
     * @return noLapangan
     */
    public String getNoLapangan() {
        return noLapangan;
    }

    /**
     * Method untuk mengeset nomor lapangan by 1103130063
     *
     * @param noLapangan nomor lapangan yang akan diset, tipe: String
     */
    public void setNoLapangan(String noLapangan) {
        this.noLapangan = noLapangan;
    }

    /**
     * Method untuk mendapatkan jenis lapangan by 1103130063
     *
     * @return jenisLapangan
     */
    public String getJenisLapangan() {
        return jenisLapangan;
    }

    /**
     * Method untuk mengeset jenis lapangan by 1103130063
     *
     * @param jenisLapangan jenis lapangan yang akan diset, tipe: String
     */
    public void setJenisLapangan(String jenisLapangan) {
        this.jenisLapangan = jenisLapangan;
    }

    /**
     * Method untuk mendapatkan harga by 1103130063
     *
     * @return harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Method untuk mengeset harga by 1103130063
     *
     * @param harga harga yang akan diset, tipe: double
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * Method untuk mendapatkan jadwal di lapangan by 1103130063
     *
     * @return jadwal[]
     */
    public Jadwal[] getJadwal() {
        return jadwal;
    }

    /**
     * Method untuk mengeset jadwal di lapangan
     *
     * @param jadwal jadwal yang akan diset, tipe: Jadwal[]
     */
    public void setJadwal(Jadwal jadwal[]) {
        this.jadwal = jadwal;
    }

}
