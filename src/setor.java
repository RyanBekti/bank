/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ryan
 */
import javax.swing.JOptionPane;
public class setor {
    private int saldo;
    public void menabung (int bal,int s){
        if (s%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM  BRI tidak menerima uang koin "
                    + "\nSilahkan ulangi kembali","Transaksi GAGAL", 0);
        else if (s<50000)
            JOptionPane.showMessageDialog(null,"Besaran nilai minimal Rp,50000","ERROR",0);
        else if (s>=50000){
            JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar " + saldo);
        }}

    public int getsaldo(){
        return saldo;
    }}

