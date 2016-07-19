package exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame{

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao;
    
    public GuiMenuPrincipal(){
        inicializarComponentes();
        definirEventos();
    }
    
private void inicializarComponentes(){
    setTitle("Menu Principal");
    setBounds(0,0,800,600);
    contentPane = getContentPane();
    
    mnBarra = new JMenuBar();
    mnArquivo = new JMenu("Arquivo");
    mnExemplos = new JMenu("Exemplos");
    miSair = new JMenuItem("SAIR");
    miBotao = new JMenuItem("BOTÃO");
    miCaixaOpcao = new JMenuItem("Caixa de Opcao");
    
    mnArquivo.setMnemonic('A');
    mnExemplos.setMnemonic('E');
    
    mnArquivo.add(miSair);
    mnExemplos.add(miBotao);
    mnExemplos.add(miCaixaOpcao);
    mnBarra.add(mnArquivo);
    mnBarra.add(mnExemplos);
    setJMenuBar(mnBarra);
    
    
}

    private void definirEventos(){
        miSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miBotao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
            
            }
        });
        miCaixaOpcao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GuiCaixaOpcao opcao = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(opcao);
                contentPane.validate();
            }
        });
        
    }
    
    public static void run(){
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tela.width - frame.getSize().width) / 2;
        int y = (tela.height - frame.getSize().height) / 2;
        frame.setLocation(x,y);
        frame.setVisible(true);      
        
    }
    
    
    
    
}