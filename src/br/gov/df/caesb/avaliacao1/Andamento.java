package br.gov.df.caesb.avaliacao1;

import java.util.Date;

public class Andamento implements java.io.Serializable {

	private static final long serialVersionUID = 6341258769371427932L;
	private Integer codigo;
	private Processo processo;
	private Date dataAndamento;
	private String descricao;
	

	public Andamento(Integer codigo, Date dataAndamento) {
		this.codigo = codigo;
		this.dataAndamento = dataAndamento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Date getDataAndamento() {
		return dataAndamento;
	}

	public void setDataAndamento(Date dataAndamento) {
		this.dataAndamento = dataAndamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Andamento other = (Andamento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
