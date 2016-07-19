package exemplos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GuiBotao extends JPanel {
    
    private JButton btMensagem, btTeimoso;
    
    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes(){
        setLayout(null);
        btMensagem = new JButton("Mensagem");
        btTeimoso = new JButton("Teimoso");
        
        btMensagem.setToolTipText("Clique agui");
        btMesnagem.setMnemonic(KeyEvent.VK_M);
        
        btMensagem.setBounds(50,20,140,38);
        btTeimoso.setBounds(50,70,100,25);
        
        add(btMensagem);
        add(btTeimoso);
                   
    }
    
    private void definirEventos(){
        btMensagem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botao Messagem");
            }
        });
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Botao Teimoso");
        }
        });   
        btTeimoso




 
    
    
}
