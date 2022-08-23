package br.com.usjt.fluvio.aula09.blocodenotas;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class BlocoDeMensagens {
    // atributo: será um objeto da classe ArrayList
    private ArrayList<String> mensagens;
    // construtor padrão
    public BlocoDeMensagens ( )
    {
        mensagens = new ArrayList<String>( ); // instancia o atributo acima
    }
    // método que armazena mensagem
    public void armazenarMensagem( String mensagem )
    {
        mensagens.add( mensagem );
    }
    // método que retorna a quantidade de mensagens armazenadas
    public int quantidadeDeMensagens()
    {
        return mensagens.size();
    }
    // método que retorna uma mensagem armazenada, dada a posição (índice)
    public String retornarMensagem( int posicao )
    {
        if (posicao < 0 || posicao > mensagens.size()){
            System.out.println("Posicao Indevido");
        }
        return mensagens.get( posicao );
    }
    // método que remove uma mensagem armazenada, dada a posição (índice)
    public void removerMensagem( int posicao )
    {
        if (posicao < 0 || posicao > mensagens.size()){
            System.out.println("Posicao Indevido");
        }else{  mensagens.remove( posicao );}
    }
    public void exibirMensagens(){
        String mensagem = " ";
        for (int i =0;i< mensagens.size();i++){
             mensagem = mensagens.get(i);
        }
        JOptionPane.showMessageDialog(null,"Mensagens guardadas"+ mensagem);
    }

}
