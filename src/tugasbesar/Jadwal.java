/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author Nikho Sagala
 */
public class Jadwal {

    private String tanggal;
    private String hari;
    private String jam;
    private Member member;
    private boolean status;

    /**
     * Constructor Jadwal
     */
    public Jadwal() {
    }

    /**
     * Constructor Jadwal by 1103134341
     *
     * @param tanggal mengisi tanggal pada jadwal, tipe: String
     * @param hari mengisi hari pada jadwal, tipe: String
     * @param jam mengisi jam pada jadwal, tipe: String
     * @param member mengisi member pada jadwal, tipe: Member
     */
    public Jadwal(String tanggal, String hari, String jam, Member member) {
        this.tanggal = tanggal;
        this.hari = hari;
        this.jam = jam;
        this.member = member;
        this.status = true;
    }

    /**
     * Method untuk mendapatkan tanggal by 1103134341
     *
     * @return tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Method untuk mengeset tanggal by 1103134341
     *
     * @param tanggal tanggal yang akan diset, tipe: String
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * Method untuk mendapatkan hari by 1103134341
     *
     * @return hari
     */
    public String getHari() {
        return hari;
    }

    /**
     * Method untuk mengeset hari by 1103134341
     *
     * @param hari hari yang akan diset, tipe: String
     */
    public void setHari(String hari) {
        this.hari = hari;
    }

    /**
     * Method untuk mendapatkan jam by 1103134341
     *
     * @return jam
     */
    public String getJam() {
        return jam;
    }

    /**
     * Method untuk mengeset jam by 1103134341
     *
     * @param jam jam yang akan diset, tipe: String
     */
    public void setJam(String jam) {
        this.jam = jam;
    }

    /**
     * Method untuk mendapatkan status by 1103130063
     *
     * @return status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Method untuk mengeset status by 1103130063
     *
     * @param status status yang akan diset, tipe: Boolean
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Method untuk mendapatkan member yang memesan lapangan by 1103130063
     *
     * @return member
     */
    public Member getMember() {
        return member;
    }

    /**
     * Method untuk mengeset member yang memesan lapangan by 1103130063
     *
     * @param member member yang akan diset, tipe: Member
     */
    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    /**
     * Method untuk mengembalikan toString dari jadwal by 1103130045
     *
     */
    public String toString() {
        String s;
        if (!status) {
            s = "Tanggal : " + tanggal + ", Hari : " + hari + ", Jam : " + jam + ", Status : " + status;
        } else {
            s = "Tanggal : " + tanggal + ", Hari : " + hari + ", Jam : " + jam + ", Dipesan : " + member.getNamaMember();
        }
        return s;
    }
}
