/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marcio Almeida
 */
public class Util {

    public class EditarFrame {

	//limpa os dados do frame.

        public static void limparDados(JFrame frame) {
            Component[] componentes = frame.getContentPane().getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setText("");
                } else if (componente instanceof JPanel) {
                    limparDados((JPanel) componente);
                }                
            }
        }

	//limpa os dados do panel
        public static void limparDados(JPanel panel) {
            Component[] componentes = panel.getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setText("");
                } if (componente instanceof JTextArea) {
                    JTextArea campoTexto = (JTextArea) componente;
                    campoTexto.setText("");
                }else if (componente instanceof JPanel) {
                    limparDados((JPanel) componente);
                }
            }
        }
        
        public static void limparCampos(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(""); // Limpa campos de texto
            } else if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(0); // Limpa seleção do ComboBox
            } else if (component instanceof JTextArea) {
                ((JTextArea) component).setText(""); // Limpa TextArea
            } else if (component instanceof Container) {
                limparCampos((Container) component); // Limpa campos em containers aninhados
            }
        }
    }

	//ativa os campos do frame.
        public static void ativaCampos(JFrame frame) {
            Component[] componentes = frame.getContentPane().getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setEnabled(true);
                } if (componente instanceof JTextArea) {
                    JTextArea campoTexto = (JTextArea) componente;
                    campoTexto.setText("");
                }else if (componente instanceof JPanel) {
                    ativaCampos((JPanel) componente);
                }           
            }
        }

	//ativa os campos do panel
        public static void ativaCampos(JPanel panel) {
            Component[] componentes = panel.getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setEnabled(true);
                } else if (componente instanceof JPanel) {
                    ativaCampos((JPanel) componente);
                }
            }
        }

	//desativa os campos do frame.
        public static void desativaCampos(JFrame frame) {
            Component[] componentes = frame.getContentPane().getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setEnabled(false);
                } else if (componente instanceof JPanel) {
                    desativaCampos((JPanel) componente);
                }           
            }
        }

	//desativa os campos do panel
        public static void desativaCampos(JPanel panel) {
            Component[] componentes = panel.getComponents();

            for (Component componente : componentes) {
                if (componente instanceof JTextField) {
                    JTextField campoTexto = (JTextField) componente;
                    campoTexto.setEnabled(false);
                } else if (componente instanceof JPanel) {
                    desativaCampos((JPanel) componente);
                }
                
            }
        }
    }

    //verifica se o dado é numerico    
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
