package br.com.homefood.classenum;

public enum RecipeType {
	
	SALTY(1, "Salgado"),
	CANDY(2, "Doce");
		
	private Integer code;
	
	private String description;

	RecipeType(Integer code, String description) {
		
		this.code = code;
		this.description = description;
		
	}

}

