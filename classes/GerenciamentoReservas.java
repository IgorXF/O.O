/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor xisto
 */
public class GerenciamentoReservas {
    List<Reserva> reservas; //duvida!!!!!!!

    public GerenciamentoReservas() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void cancelarReserva(String nomeReserva) {
        this.reservas.removeIf(reserva -> reserva.getNomeReserva().equals(nomeReserva));
    }

    public void listarReservas() {
        for (Reserva reserva : this.reservas) {
            System.out.println(reserva);
        }
    }

    public Reserva buscarReserva(String nomeReserva) {
        for (Reserva reserva : this.reservas) {
            if (reserva.getNomeReserva().equals(nomeReserva)) {
                return reserva;
            }
        }
        return null;
    }
}


