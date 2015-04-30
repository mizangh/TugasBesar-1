/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nikho Sagala
 */
public class Member {

    private String idMember;
    private String namaMember;
    private String noTelepon;
    private boolean statusBayar;

    /**
     * Constructor Member by 1103130063
     */
    public Member() {
    }

    /**
     * Constructor Member by 1103130063 Exception by 1103130066
     *
     * @param idMember mengisi id member pada member, tipe: String
     * @param namaMember mengisi nama member pada member. tipe: String
     * @param noTelepon mengisi nomor telepon pada member, tipe: String
     */
    public Member(String idMember, String namaMember, String noTelepon) {
        if (idMember.length() == 5) {
            this.idMember = idMember;
            this.namaMember = namaMember;
            this.noTelepon = noTelepon;
        } else {
            throw new IllegalArgumentException("ID member harus 5 karakter.");
        }
    }

    /**
     * Method untuk mendapatkan id member by 1103130063
     *
     * @return idMember
     */
    public String getIdMember() {
        return idMember;
    }

    /**
     * Method untuk mengeset id member by 1103130063 Exception by 11013130066
     *
     * @param idMember id member yang akan diset, tipe: String
     */
    public void setIdMember(String idMember) {
        if (idMember.length() == 5) {
            this.idMember = idMember;
        } else {
            throw new IllegalArgumentException("ID member harus 5 karakter.");
        }
    }

    /**
     * Method untuk mendapatkan nama member by 1103130063
     *
     * @return namaMember
     */
    public String getNamaMember() {
        return namaMember;
    }

    /**
     * Method untuk mengeset nama member by 1103130063
     *
     * @param namaMember nama member yang akan diset, tipe: String
     */
    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    /**
     * Method untuk mendapatkan nomor telepon by 1103130063
     *
     * @return noTelepon
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Method untuk mengeset nomor telepon by 1103130063
     *
     * @param noTelepon nomor telepon yang akan diset, tipe: String
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
     * Method untuk mengecek status bayar member by 1103130063
     *
     * @return statusBayar
     */
    public boolean isStatusBayar() {
        return statusBayar;
    }

    /**
     * Method untuk mengeset status bayar dari member by 1103130063
     *
     * @param statusBayar status yang akan diset, tipe: Boolean
     */
    public void setStatusBayar(boolean statusBayar) {
        this.statusBayar = statusBayar;
    }

}
