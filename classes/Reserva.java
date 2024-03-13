/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author igor xisto
 */
public class Reserva {
    private String nomeReserva;
    private int numPessoas;
    private String dataHora;

    public Reserva() {
        this.nomeReserva = "";
        this.numPessoas = 0;
        this.dataHora = "";
    }

    public Reserva(String nomeReserva, int numPessoas, String dataHora) {
        this.nomeReserva = nomeReserva;
        this.numPessoas = numPessoas;
        this.dataHora = dataHora;
    }

    public String getNomeReserva() {
        return nomeReserva;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    
    
    public void  preencher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da Reserva: ");
        this.nomeReserva = scanner.nextLine();
        System.out.print("Número de Pessoas: ");
        this.numPessoas = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Data e Hora (dd/MM/yyyy HH:mm): ");
        this.dataHora = scanner.nextLine();
    }
 
    @Override
    public String toString() {
        String texto = "Nome da Reserva: " + this.nomeReserva + "\n";
        texto += "Número de Pessoas: " + this.numPessoas + "\n";
        texto += "Data e Hora: " + this.dataHora + "\n";
        return texto;
    }




} 
    


