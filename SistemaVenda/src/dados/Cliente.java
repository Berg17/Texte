/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Wyllamberg
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    private static int codigoAutoIncremental = 1;
    
    public Cliente(String nome, String cpf, String telefone, String email) {
        this.codigo = codigoAutoIncremental;

       codigoAutoIncremental++;
        
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        String relatorio = "";
        relatorio +="codigo: "+codigo;
        relatorio +="\nnome: "+nome;
        relatorio +="\ncpf: "+cpf;
        relatorio +="\ntelefone: "+telefone;
        relatorio +="\nemail: "+email;
        
      return relatorio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
