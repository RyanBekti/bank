

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */import javax.swing.JOptionPane;
public class tarik {
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI menerima uang koin "
                    + "\nSIlahkan ulangi lagi","Transaksi GAGAL",0);
        else {
            if (t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi \n "
                        + "silahkan lakukan penyetoran uang","Transaksi GAGAL",0);
            else if (t<50000)
                JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan uang Rp.50000","Transaksi GAGAL",0);
            else{
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar :"+saldo);
                if (tab<=50000)
                    JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp.50000,00;"
                            + " Segera lakukan penyetoran untuk menghindari penutupan akun anda.","CAUTION",2);
            }
                
        }
    }
    public int getsaldo(){
     return saldo;   
    }
}
