
import com.sida.mybudget.bo.BGToolkit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhDung
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println(BGToolkit.checkMail(sc.nextLine()));
        }
    }
    
}
