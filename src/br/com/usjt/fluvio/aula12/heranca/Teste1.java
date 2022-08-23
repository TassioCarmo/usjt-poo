package br.com.usjt.fluvio.aula12.heranca;
import javax.swing.*;
public class Teste1
{
    public static void main( String args[ ] )
    {
        // ******** Teste do Objeto da classe Mensalista
        String nomeMensalista = JOptionPane.showInputDialog(
                "Informe nome do mensalista.");
        String cpfMensalista = JOptionPane.showInputDialog(
                "Informe cpf do mensalista.");
        String sobreNomeMensalista = JOptionPane.showInputDialog(
                "Informe sobrenome do mensalista.");
        int codigoMensalista = Integer.parseInt( JOptionPane.showInputDialog(
                "Informe código do mensalista") );
        double salarioMensalista = Double.parseDouble( JOptionPane.showInputDialog(
                "Informe salário do mensalista") );
        // instancia um objeto Mensalista
        Mensalista mensalista = new Mensalista( nomeMensalista,cpfMensalista, sobreNomeMensalista, codigoMensalista, salarioMensalista );
        String dadosMensalista = "--- Dados do Mensalista ---\n\n" + "\n" + mensalista.dados();
        // Qual método dados() é chamado aqui: o da classe Empregado ou o da classe Mensalista?
        JOptionPane.showMessageDialog( null, dadosMensalista, "Teste do Mensalista", 1 );
        // ********* Teste do Objeto da classe Horista
        String nomeHorista = JOptionPane.showInputDialog(
                "Informe nome do horista.");
        String sobreNomeHorista = JOptionPane.showInputDialog(
                "Informe sobrenome do horista.");
        String cpfHorista = JOptionPane.showInputDialog(
                "Informe cpf do horista.");
        int codigoHorista = Integer.parseInt( JOptionPane.showInputDialog(
                "Informe código do horista") );
        double salarioHorista = Double.parseDouble( JOptionPane.showInputDialog(
                "Informe salário por hora do horista") );
        double horasTrabalhadas = Double.parseDouble( JOptionPane.showInputDialog(
                "Informe as horas trabalhadas do horista") );
        // instancia um objeto Horista
        Horista horista = new Horista( nomeHorista, sobreNomeHorista,cpfHorista, codigoHorista, salarioHorista, horasTrabalhadas );
        String dadisHorista = "--- Dados do Horista ---\n\n" + "\n" + horista.dados();
        // Qual método dados() é chamado aqui: o da classe Empregado ou o da classe Horista?
        JOptionPane.showMessageDialog( null
                , dadisHorista, "Teste do Horista", 1 );

        /*
        // instancia um objeto Mensalista
        Vendedor v = new Vendedor( n, s, cd, sm );
        String dadosMensalista = "--- Dados do Mensalista ---\n\n" + "\n" + m.dados();
        // Qual método dados() é chamado aqui: o da classe Empregado ou o da classe Mensalista?
        JOptionPane.showMessageDialog( null, dadosMensalista, "Teste do Mensalista", 1 );
        // ********* Teste do Objeto da classe Horista

        */
        System.exit(0);
    }
}