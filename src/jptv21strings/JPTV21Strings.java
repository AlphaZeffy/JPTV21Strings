/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21strings;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----rabota so strokami-----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite stroku");
        String str = scanner.nextLine();
        char[] charArrayBegin = str.toCharArray();
        char[] charArrayEnd = new char[charArrayBegin.length];
        for(int i = 0; < charArrayBegin.length; i++){
            charArrayBegin[i] = charArrayBegin[charArrayBegin.lenght - i -i ];
        }
        System.out.println("CharArrayEnd= "+ Arrays.toString(charArrayEnd));
        String reversString = new String(charArrayEnd);
        System.out.println("Reverse strings: "+ reversString);
    }
    
}
