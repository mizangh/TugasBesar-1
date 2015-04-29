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
public class Application {

    private ArrayList<Member> daftarMember;
    private ArrayList<Lapangan> daftarLapangan;
    protected Transaksi transaksi;

    public Application() {
        daftarMember = new ArrayList<>();
        daftarLapangan = new ArrayList<>();
    }

    /**
     * Method untuk menambah member baru, dengan mengisi di ArrayList
     * daftarMember by 1103130063
     *
     * @param idMember id member yang akan ditambah, tipe: String
     * @param namaMember nama member yang akan ditambah, tipe: String
     * @param noTelepon no telepon member yang akan ditambah, tipe: String
     */
    public void addMember(String idMember, String namaMember, String noTelepon) {
        Member m = new Member(idMember, namaMember, noTelepon);
        try {
            daftarMember.add(m);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Illegal Argument Exception.");
        }
    }

    /**
     * Method untuk mencari member by 1103130063
     *
     * @param idMember id member yang akan dicari, tipe: String
     * @return cari
     */
    public int cariMember(String idMember) {
        int m = -1;
        try {
            for (Member temp : daftarMember) {
                if (temp.getIdMember().equals(idMember)) {
                    m = daftarMember.indexOf(temp);
                }
            }
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Illegal argument exception.");
        }
        return m;
    }

    /**
     * Method untuk menghapus member by 1103130063
     *
     * @param idMember id member yang akan dihapus, tipe: String
     */
    public void removeMember(String idMember) {
        int cari = cariMember(idMember);
        if (cari != -1) {
            daftarMember.remove(cari);
        } else {
            throw new IllegalArgumentException("Member tidak ada.");
        }
    }

    /**
     * Method untuk mengubah data member di Array daftarMember by 1103130063
     *
     * @param idMember id member yang akan diubah diubah, tipe: String
     * @param namaMember nama member baru yang ingin diubah, tipe: String
     * @param noTelepon no telepon member yang ingin diubah, tipe: String
     */
    public void editMember(String idMember, String namaMember, String noTelepon) {
        int cari = cariMember(idMember);
        if (cari != -1) {
            Member member = new Member(idMember, namaMember, noTelepon);
            daftarMember.set(cari, member);
        } else {
            throw new IllegalArgumentException("Member tidak ada.");
        }
    }

    /**
     * Method untuk mencari member by 1103130063
     *
     * @param idMember id member yang akan dicari, tipe: String
     * @return member
     */
    public Member returnMember(String idMember) {
        Member member = null;
        for (Member temp : daftarMember) {
            if (temp.getIdMember().equals(idMember)) {
                member = daftarMember.get(daftarMember.indexOf(temp));
            }
        }
        return member;
    }

    /**
     * Method untuk menambah lapangan by 1103130063
     *
     * @param noLapangan no lapangan yang akan diisi, tipe: String
     * @param jenisLapangan jenis lapangan yang akan diisi, tipe: String
     * @param harga harga lapangan yang akan diisi, tipe: int
     */
    public void addLapangan(String noLapangan, String jenisLapangan, int harga) {
        Lapangan l = new Lapangan(noLapangan, jenisLapangan, harga);
        try {
            daftarLapangan.add(l);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Illegal Argument Exception.");
        }

    }

    /**
     * Method untuk mencari lapangan by 1103130063
     * 
     * @param noLapangan no lapangan yang akan dicari, tipe: String
     * @return lapangan
     */
    public Lapangan cariLapangan(String noLapangan) {
        Lapangan lapangan = null;
        for (Lapangan temp : daftarLapangan) {
            if (temp.getNoLapangan().equals(noLapangan)) {
                lapangan = daftarLapangan.get(daftarLapangan.indexOf(temp));
            }
        }
        return lapangan;
    }

}
