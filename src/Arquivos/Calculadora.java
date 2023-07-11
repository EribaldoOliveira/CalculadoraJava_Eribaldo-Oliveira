package Arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmCalculadoraJava;
	private JTextField txtEtapas;
	private JTextField txtResultado;
	
	//Variáveis para usarmos nas operações aritméticas
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
					window.frmCalculadoraJava.setVisible(true);
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
		frmCalculadoraJava = new JFrame();
		frmCalculadoraJava.setTitle("Calculadora Java _ Eribaldo Oliveira");
		frmCalculadoraJava.setBounds(100, 100, 436, 345);
		frmCalculadoraJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraJava.getContentPane().setLayout(null);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o SETE no final. 
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btnSete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSete.setBounds(22, 105, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o OITO no final. 
				txtResultado.setText(txtResultado.getText() + "8");
				
			}
		});
		btnOito.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOito.setBounds(100, 105, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o NOVE no final. 
				txtResultado.setText(txtResultado.getText() + "9");
				
			}
		});
		btnNove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNove.setBounds(178, 105, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnNove);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				// C -> Clear (Limpar)
				txtResultado.setText("");
				txtEtapas.setText("");
				tipoOperacao = "nada";
								
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(256, 105, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCe.setBounds(334, 105, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnCe);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o QUATRO no final. 
				txtResultado.setText(txtResultado.getText() + "4");
				
			}
		});
		btnQuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuatro.setBounds(22, 155, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o CINCO no final. 
				txtResultado.setText(txtResultado.getText() + "5");
				
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCinco.setBounds(100, 155, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o SEIS no final. 
				txtResultado.setText(txtResultado.getText() + "6");
				
			}
		});
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSeis.setBounds(178, 155, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o UM no final. 
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});
		btnUm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUm.setBounds(22, 205, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o DOIS no final. 
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btnDois.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDois.setBounds(100, 205, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o TRÊS no final. 
				txtResultado.setText(txtResultado.getText() + "3");
				
			}
		});
		btnTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTres.setBounds(178, 205, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o ZERO no final. 
				txtResultado.setText(txtResultado.getText() + "0");
				
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnZero.setBounds(22, 255, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Vai pegar os números que já foram digitados 
				// e acrescentar o ZERO no final. 
				txtResultado.setText(txtResultado.getText() + ". ");
				
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPonto.setBounds(100, 255, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
				
				
		  		
		  		
		  		//Após clicar no igual confirma a operação e adiciona o número da etapa 
				txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				
				//Pega o texto do txtResultado e coloca como Double na variável -> numero2.
				numero2 = Double.parseDouble(txtResultado.getText());
				
				//Limpando o campo do txtResultado
				txtResultado.setText("");
				
				//txtResultado.setText(tipoOperacao.equals("adicao")){
				
				if (tipoOperacao.equals("adicao")){
					
					//Somo o valor1 + valor2 e imprimo como texto no campo -> txtResultado 
					txtResultado.setText(String.valueOf(numero1 + numero2));
				}
					
				
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIgual.setBounds(178, 255, 146, 39);
		frmCalculadoraJava.getContentPane().add(btnIgual);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Junta o texto de Etapas com o texto de Resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
					
				}
				
				// Pega todas as Etapas e inclui  a operação no final
				txtEtapas.setText(txtEtapas.getText() + "+");
				
				//Pega o texto do Reultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de Resultado
				txtResultado.setText("");
				
				tipoOperacao = "adição";
			}
		});
		btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdicao.setBounds(256, 155, 68, 89);
		frmCalculadoraJava.getContentPane().add(btnAdicao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Junta o texto de Etapas com o texto de Resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
				}
				
				// Pega todas as Etapas e inclui  a operação no final
				txtEtapas.setText(txtEtapas.getText() + "-");
				
				//Pega o texto do Reultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de Resultado
				txtResultado.setText("");
				
				tipoOperacao = "subtração";
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtracao.setBounds(334, 155, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Junta o texto de Etapas com o texto de Resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {					
					
				}
				
				// Pega todas as Etapas e inclui  a operação no final
				txtEtapas.setText(txtEtapas.getText() + "x");
				
				//Pega o texto do Reultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de Resultado
				txtResultado.setText("");
				
				tipoOperacao = "multiplicação";
				
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiplicacao.setBounds(334, 205, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnMultiplicacao);
		
		// Parei na aula 63, seção 12, em 11m:48s
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Junta o texto de Etapas com o texto de Resultado
				if(tipoOperacao.equals("nada")) {
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {					
					
				}
				
				// Pega todas as Etapas e inclui  a operação no final
				txtEtapas.setText(txtEtapas.getText() + "/");
				
				//Pega o texto do Resultado e converte para Double
				numero1 = Double.parseDouble(txtResultado.getText());
				
				//Apagando o texto do campo de Resultado
				txtResultado.setText("");
				
				tipoOperacao = "divisão";
				
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivisao.setBounds(334, 255, 68, 39);
		frmCalculadoraJava.getContentPane().add(btnDivisao);
		
		txtEtapas = new JTextField();
		txtEtapas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtEtapas.setBounds(22, 11, 380, 39);
		frmCalculadoraJava.getContentPane().add(txtEtapas);
		txtEtapas.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtResultado.setColumns(10);
		txtResultado.setBounds(22, 55, 380, 39);
		frmCalculadoraJava.getContentPane().add(txtResultado);
	}
}
