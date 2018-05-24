/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author uca
 */
public class Gui extends JFrame{
    
    private JTextField caja1,caja2;
    private JButton boton;
    
    public Gui(){
        super("Hola Mundo");
        initialComponents();
    }
    
    public void initialComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //layout
        caja1= new JTextField(); //SE PUEDE PONER DE PARAMETRO SI QUIERE ESTAR ALGO ESCRITO YA
        caja1.setBounds(10, 50, 150, 30); //TAMAÑO DEL TEXTFIELD
        
        
        
        boton= new JButton("click aca");
        boton.setBounds(10, 100, 150, 30);
        
        caja2= new JTextField(); //SE PUEDE PONER DE PARAMETRO SI QUIERE ESTAR ALGO ESCRITO YA
        caja2.setBounds(10, 150, 150, 30); //TAMAÑO DEL TEXTFIELD
        caja2.setEditable(false);
        
        Container contenedor= getContentPane();
        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(boton);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                caja2.setText(caja1.getText());
            }

        });
        
        
        setSize(300, 300);
    }
    
    /*public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
        @Override
        public void run(){
            new Gui().setVisible(true);
        }
    });
    }*/
}
