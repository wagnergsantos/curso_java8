package br.gov.df.caesb.avaliacao1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Processo implements java.io.Serializable {

	private static final long serialVersionUID = -6536385258453772423L;

	private Integer codigo;
	private String numero;
	private TipoProcesso tipoProcesso;
	private Date dataFase;
	private Integer numVara;
	private Date dataProtocolo;
	private Date dataCitacao;
	private Double valorCausaAtual;
	private Date dtValorCausaAtual;
	private String numInterno;
	private Boolean isRelevante;
	private Boolean revisado;
	private Boolean isContingenciavel;
	private Boolean etribunal;
	private Boolean faseExecucao;
	private Double valorExecutado;
	private Date dtValorExecutado;
	private Double valorExecutadoAtual;
	private Date dtValorExecutadoAtual;
	private Double valorDevido;
	private Date dtValorDevido;
	private Double valorDevidoAtual;
	private Date dtValorDevidoAtual;
	private Double valorPago;
	private Date dtValorPago;
	private Boolean encerrado;
	private String objeto;
	private Double valorCausa;
	private Date dataEncerramento;
	private List<Andamento> andamentos = new ArrayList<Andamento>(0);

	public Processo() {

	}

	public Processo(Integer codigo, String numero, TipoProcesso tipoProcesso) {
		this.codigo = codigo;
		this.numero = numero;
		this.tipoProcesso = tipoProcesso;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoProcesso getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso(TipoProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	public Date getDataFase() {
		return dataFase;
	}

	public void setDataFase(Date dataFase) {
		this.dataFase = dataFase;
	}

	public Integer getNumVara() {
		return numVara;
	}

	public void setNumVara(Integer numVara) {
		this.numVara = numVara;
	}

	public Date getDataProtocolo() {
		return dataProtocolo;
	}

	public void setDataProtocolo(Date dataProtocolo) {
		this.dataProtocolo = dataProtocolo;
	}

	public Date getDataCitacao() {
		return dataCitacao;
	}

	public void setDataCitacao(Date dataCitacao) {
		this.dataCitacao = dataCitacao;
	}

	public Double getValorCausaAtual() {
		return valorCausaAtual;
	}

	public void setValorCausaAtual(Double valorCausaAtual) {
		this.valorCausaAtual = valorCausaAtual;
	}

	public Date getDtValorCausaAtual() {
		return dtValorCausaAtual;
	}

	public void setDtValorCausaAtual(Date dtValorCausaAtual) {
		this.dtValorCausaAtual = dtValorCausaAtual;
	}

	public String getNumInterno() {
		return numInterno;
	}

	public void setNumInterno(String numInterno) {
		this.numInterno = numInterno;
	}

	public Boolean isRelevante() {
		return isRelevante;
	}

	public void setRelevante(Boolean isRelevante) {
		this.isRelevante = isRelevante;
	}

	public Boolean isRevisado() {
		return revisado;
	}

	public void setRevisado(Boolean revisado) {
		this.revisado = revisado;
	}

	public Boolean isContingenciavel() {
		return isContingenciavel;
	}

	public void setContingenciavel(Boolean isContingenciavel) {
		this.isContingenciavel = isContingenciavel;
	}

	public Boolean isEtribunal() {
		return etribunal;
	}

	public void setEtribunal(Boolean etribunal) {
		this.etribunal = etribunal;
	}

	public Boolean isFaseExecucao() {
		return faseExecucao;
	}

	public void setFaseExecucao(Boolean faseExecucao) {
		this.faseExecucao = faseExecucao;
	}

	public Double getValorExecutado() {
		return valorExecutado;
	}

	public void setValorExecutado(Double valorExecutado) {
		this.valorExecutado = valorExecutado;
	}

	public Date getDtValorExecutado() {
		return dtValorExecutado;
	}

	public void setDtValorExecutado(Date dtValorExecutado) {
		this.dtValorExecutado = dtValorExecutado;
	}

	public Double getValorExecutadoAtual() {
		return valorExecutadoAtual;
	}

	public void setValorExecutadoAtual(Double valorExecutadoAtual) {
		this.valorExecutadoAtual = valorExecutadoAtual;
	}

	public Date getDtValorExecutadoAtual() {
		return dtValorExecutadoAtual;
	}

	public void setDtValorExecutadoAtual(Date dtValorExecutadoAtual) {
		this.dtValorExecutadoAtual = dtValorExecutadoAtual;
	}

	public Double getValorDevido() {
		return valorDevido;
	}

	public void setValorDevido(Double valorDevido) {
		this.valorDevido = valorDevido;
	}

	public Date getDtValorDevido() {
		return dtValorDevido;
	}

	public void setDtValorDevido(Date dtValorDevido) {
		this.dtValorDevido = dtValorDevido;
	}

	public Double getValorDevidoAtual() {
		return valorDevidoAtual;
	}

	public void setValorDevidoAtual(Double valorDevidoAtual) {
		this.valorDevidoAtual = valorDevidoAtual;
	}

	public Date getDtValorDevidoAtual() {
		return dtValorDevidoAtual;
	}

	public void setDtValorDevidoAtual(Date dtValorDevidoAtual) {
		this.dtValorDevidoAtual = dtValorDevidoAtual;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDtValorPago() {
		return dtValorPago;
	}

	public void setDtValorPago(Date dtValorPago) {
		this.dtValorPago = dtValorPago;
	}

	public Boolean isEncerrado() {
		return encerrado;
	}

	public void setEncerrado(Boolean encerrado) {
		this.encerrado = encerrado;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public Double getValorCausa() {
		return valorCausa;
	}

	public void setValorCausa(Double valorCausa) {
		this.valorCausa = valorCausa;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public List<Andamento> getAndamentos() {
		return andamentos;
	}

	public void setAndamentos(List<Andamento> andamentos) {
		this.andamentos = andamentos;
	}

	public void adicionaAndamento(Andamento andamento) {
		andamentos.add(andamento);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[Processo] ").append("Codigo: ").append(codigo).append(" Numero: ")
				.append(numero).append(" Tipo Processo: ").append(tipoProcesso);
		andamentos.sort(Comparator.comparing(Andamento::getDataAndamento));
		andamentos.forEach(a -> sb.append("\n[Andamento]").append("Código: ").append(a.getCodigo()).append(" Data: ")
				.append(a.getDataAndamento()));
		return sb.toString();
	}

}
