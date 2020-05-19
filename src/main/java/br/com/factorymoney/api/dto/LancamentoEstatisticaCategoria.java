package br.com.factorymoney.api.dto;

import java.math.BigDecimal;

import br.com.factorymoney.api.model.Categoria;

public class LancamentoEstatisticaCategoria {

	private Categoria categoria;

	private BigDecimal total;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public LancamentoEstatisticaCategoria(Categoria categoria, BigDecimal total) {
		this.categoria = categoria;
		this.total = total;
	}

}