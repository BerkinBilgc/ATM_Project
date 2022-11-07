package com.example.learn;

import java.io.*;

public class operation {
    public static void DosyayaEkle(String metin){
        try{
            File dosya = new File("C:\\Users\\Lenovo\\Desktop\\yeni.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write(metin);
            yaz.close();
            //System.out.println("Ekleme İşlemi Başarılı");
        }
        catch (Exception hata){
            hata.printStackTrace();
        }
    }
}
