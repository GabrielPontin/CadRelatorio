package br.univel.print;

import java.util.List;

import br.univel.Pessoa;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class PessoaJRDataSource implements JRDataSource {

	private List<Pessoa> lista;

	public PessoaJRDataSource(List<Pessoa> lista) {
		this.lista = lista;
	}

	@Override
	public Object getFieldValue(JRField arg0) throws JRException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean next() throws JRException {
		// TODO Auto-generated method stub
		return false;
	}

}
