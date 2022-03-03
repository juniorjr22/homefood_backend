package br.com.homefood.classenum;

public enum TipoReceita {
	
	SALGADO(1, "Salgado"),
	DOCE(2, "Doce");
		
	private Integer codigo;
	
	private String descricao;

	TipoReceita(Integer codigo, String descricao) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

}

