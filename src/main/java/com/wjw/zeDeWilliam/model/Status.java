package com.wjw.zeDeWilliam.model;


public enum Status {
	PENDENTE("Pendente"),
	CONCLUIDO("Concluído");
	//CANCELADO("Cancelado");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}

}
