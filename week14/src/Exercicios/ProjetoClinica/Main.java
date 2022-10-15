package Exercicios.ProjetoClinica;

import Exercicios.ProjetoClinica.Cliente;
import Exercicios.ProjetoClinica.Clinica;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Alberto");
        cliente.setAltura(1.80);
        cliente.setPeso(80.0);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Felipe");
        cliente1.setAltura(1.80);
        cliente1.setPeso(80.0);

        Clinica clinica = new Clinica();
        clinica.listaClientes.add(cliente);
        clinica.listaClientes.add(cliente1);
        clinica.listaClientes.add(cliente1);

        clinica.categorizaClientes();

        System.out.println(clinica.tratamento(cliente));
        System.out.println(clinica.tratamento(cliente1, 10.0));
    }
}