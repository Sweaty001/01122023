package THROW;

import java.util.InputMismatchException;
import java.util.zip.Inflater;
import java.util.*;

public class throw1{
    public static validarInteger(Integer erro) {
        boolean retornar = false;

        if (Integer.valueOf(erro) > 2147483647) {
            throw new InputMismatchException("Ops! Valor inteiro maior que o permitido. ");
            return false;
        } else if (Short.valueOf(erro) <= 2147483647){

            System.out.println("Valor aceito pelo sistema, prosseguindo...");
            
        } else {

            Integer[] numeros = {0,1,2,3,4,5,6,7,8,9};
            boolean achouInteiro;
            boolean achouString;
            
            
            for (int n = 0; n < erro.length(); n++);{
                achouInteiro = false;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] ==  Integer.valueOf(erro.substring(n, n + 1))) {
                        achouInteiro = true;
                    }
                }
                if (achouInteiro == false) {
                    achouString = true;
                }
            }
            if (achouString == true) {
                
            }
        }

    }
}


    
