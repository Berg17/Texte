/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import dados.Cliente;
import java.util.ArrayList;
import telas.TelaPrincipal;
import repositorio.RepositorioDados;

/**
 *
 * @author Douglas
 */
public class SistemaVenda {
    
    private static ArrayList<Cliente> listaCliente = new ArrayList<>();
    
            
            
            
    public static void main(String[] args) {
        System.out.println("Testando main()");
        
        RepositorioDados.inicializandoDados();
     
        TelaPrincipal tela = new TelaPrincipal();
        
    }
   
    public static void cadastraCliente(Cliente c){
        listaCliente.add(c);
        
        System.out.println("Salvo\n\n"+c);
        
        
        
    }
}

