package Arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField txtEtapas;
	private JTextField txtResultado;
	
	//Variaveis para usarmos para as operações aritmeticas
	Double numero1, numero2;
	String tipoOperacao = "nada";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora JAVA_Eribaldo Oliveira");
		frmCalculadora.setBounds(100, 100, 528, 481);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o SETE no final
				txtResultado.setText(txtResultado.getText() + "7");
				
			}
		});
		btnSete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSete.setBounds(23, 192, 85, 49);
		frmCalculadora.getContentPane().add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o OITO no final
				txtResultado.setText(txtResultado.getText() + "8");
				
			}
		});
		btnOito.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOito.setBounds(118, 192, 85, 49);
		frmCalculadora.getContentPane().add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o NOVE no final
				txtResultado.setText(txtResultado.getText() + "9");
				
			}
		});
		btnNove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNove.setBounds(211, 192, 85, 49);
		frmCalculadora.getContentPane().add(btnNove);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//C - Clear (Limpar)
				txtResultado.setText("");
				txtEtapas.setText("");
				tipoOperacao = "nada";
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(306, 192, 85, 49);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CE - Cancel entry
				//Cancelar a última etapa
				txtResultado.setText("");
				
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCe.setBounds(403, 192, 85, 49);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o QUATRO no final
				txtResultado.setText(txtResultado.getText() + "4");
				
			}
		});
		btnQuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuatro.setBounds(23, 251, 85, 49);
		frmCalculadora.getContentPane().add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o CINCO no final
				txtResultado.setText(txtResultado.getText() + "5");
				
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCinco.setBounds(118, 251, 85, 49);
		frmCalculadora.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o SEIS no final
				txtResultado.setText(txtResultado.getText() + "6");
				
			}
		});
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSeis.setBounds(211, 251, 85, 49);
		frmCalculadora.getContentPane().add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitado
				// e acrescentar o UM no final
				txtResultado.setText(txtResultado.getText() + "1");
				
			}
		});
		btnUm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUm.setBounds(23, 310, 85, 49);
		frmCalculadora.getContentPane().add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitado
				// e acrescentar o DOIS no final
				txtResultado.setText(txtResultado.getText() + "2");
				
			}
		});
		btnDois.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDois.setBounds(118, 310, 85, 49);
		frmCalculadora.getContentPane().add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitados
				// e acrescentar o TRES no final
				txtResultado.setText(txtResultado.getText() + "3");
				
			}
		});
		btnTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTres.setBounds(211, 310, 85, 49);
		frmCalculadora.getContentPane().add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitado
				// e acrescentar o ZERO no final
				txtResultado.setText(txtResultado.getText() + "0");
				
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnZero.setBounds(23, 369, 85, 49);
		frmCalculadora.getContentPane().add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Vai pegar os números que já foram digitado
				// e acrescentar o ZERO no final
				txtResultado.setText(txtResultado.getText() + ".");
				
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPonto.setBounds(118, 369, 85, 49);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Após clicar no igual confirma a operacao e adiciona o número da etapa
				txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				
				//Pega o texto txtResultado e coloca como Double na variavel
				numero2 = Double.parseDouble(txtResultado.getText());
				
				//Limpando o campo do txtResultado
				txtResultado.setText("");
				
				//if - se
				if(tipoOperacao.equals("adicao")){
					
					//Somo o valor1 + valor2 e imprimo como texto no campo txtResultado
					txtResultado.setText(String.valueOf(numero1 + numero2));
					
				//else - senão
				//else if - senão se
				}else if(tipoOperacao.equals("subtracao")){
					
					//Somo o valor1 - valor2 e imprimo como texto no campo txtResultado
					txtResultado.setText(String.valueOf(numero1 - numero2));
					
				}else if(tipoOperacao.equals("divisao")){
					
					//Somo o valor1 / valor2 e imprimo como texto no campo txtResultado
					txtResultado.setText(String.valueOf(numero1 / numero2));
					
				}else if(tipoOperacao.equals("multiplicacao")){
					
					//Somo o valor1 * valor2 e imprimo como texto no campo txtResultado
					txtResultado.setText(String.valueOf(numero1 * numero2));
				
					//else - Senão
				}else {
					
					JOptionPane.showMessageDialog(null,  "Por favor selecione uma operação");
					
				}
				
			}
		});
		btnIgual.setBackground(new Color(255, 255, 128));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIgual.setBounds(211, 369, 180, 49);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if - Se
				//Junta o texto de Etapas com o texto de resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
					
					
				}
				
				//Pega toas as etapas e inclui a opereção no final
				txtEtapas.setText(txtEtapas.getText() + "+");
				
				//Pega o texto do resultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "adicao";
				
			}
		});
		btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdicao.setBounds(306, 251, 85, 108);
		frmCalculadora.getContentPane().add(btnAdicao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if - Se
				//Junta o texto de Etapas com o texto de resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
					
					
				}
				
				//Pega toas as etapas e inclui a opereção no final
				txtEtapas.setText(txtEtapas.getText() + "-");
				
				//Pega o texto do resultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "subtracao";
				
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtracao.setBounds(403, 251, 85, 49);
		frmCalculadora.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if - Se
				//Junta o texto de Etapas com o texto de resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
					
					
				}
				
				//Pega toas as etapas e inclui a opereção no final
				txtEtapas.setText(txtEtapas.getText() + "x");
				
				//Pega o texto do resultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "multiplicacao";
				
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiplicacao.setBounds(403, 310, 85, 49);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if - Se
				//Junta o texto de Etapas com o texto de resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
					
					
				}
				
				//Pega toas as etapas e inclui a opereção no final
				txtEtapas.setText(txtEtapas.getText() + "/");
				
				//Pega o texto do resultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de resultado
				txtResultado.setText("");
				
				tipoOperacao = "divisao";
				
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivisao.setBounds(403, 369, 85, 49);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		txtEtapas = new JTextField();
		txtEtapas.setEditable(false);
		txtEtapas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtEtapas.setBounds(23, 38, 465, 49);
		frmCalculadora.getContentPane().add(txtEtapas);
		txtEtapas.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtResultado.setColumns(10);
		txtResultado.setBounds(23, 128, 465, 49);
		frmCalculadora.getContentPane().add(txtResultado);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 0, -1);
		frmCalculadora.getContentPane().add(panel);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(200, 98, 96, 19);
		frmCalculadora.getContentPane().add(lblResultado);
		
		JLabel lblCalculo = new JLabel("Cálculo");
		lblCalculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCalculo.setBounds(200, 11, 96, 19);
		frmCalculadora.getContentPane().add(lblCalculo);
	}
}
