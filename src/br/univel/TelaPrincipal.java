package br.univel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaPrincipal extends JFrame {


	private JTable table;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				TelaPrincipal tp = new TelaPrincipal();						// Instancia uma Janela
				tp.setSize(800, 600); 										// Atribui o Tamanho da Janela
				tp.setLocationRelativeTo(null); 							// Centraliza na Tela 
				tp.setVisible(true);  										// Mostra a Janela
			}
		});

	}


	public TelaPrincipal() {
		JPanel jp = new JPanel();											// Cria um Painel
		jp.setLayout(new BorderLayout());									// Seta o Layout para BorderLayout
		JScrollPane jsc = new JScrollPane();
		table = new JTable();
		jsc.setViewportView(table); 										// Instancia uma JTable
		jp.add(jsc, BorderLayout.CENTER); 									// Instancia um ScrollPane no centro

		JButton button = new JButton("Carregar");							// Instancia um Botao
		jp.add(button, BorderLayout.NORTH);									// Cria um Botao no Topo

		this.setContentPane(jp);											

		button.addActionListener(new ActionListener() {						// Passando uma Classe Anonima 

			@Override
			public void actionPerformed(ActionEvent e) {      				// Chama o metodo Carregar
				carregar();													// 			<-----
			}
		});

	}


	protected void carregar() {

		DaoPessoa dao = new DaoPessoa();									
		List<Pessoa> lista = dao.getPessoas();								

		MeuModelo meuModelo = new MeuModelo(lista);  						 // Instancia um Modelo para Tabela

		table.setModel(meuModelo);											 // Seta o Modelo da Tabela
	}

}
