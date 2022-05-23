 package br.com.homefood.entity;

import br.com.homefood.classenum.RecipeType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


 @Getter
 @Setter
 @ToString(onlyExplicitlyIncluded = true)
 @EqualsAndHashCode(onlyExplicitlyIncluded = true)
 @Builder
 @AllArgsConstructor
 @NoArgsConstructor
 @Entity
 @Table(name = "recipe")
 public class Recipe {

	 @Id
	 @Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @ToString.Include
	 @EqualsAndHashCode.Include
	 private Integer id;

	 @Column(name = "name", nullable = false)
	 @ToString.Include
	 @EqualsAndHashCode.Include
	 private String name;

	 @ToString.Include
	 @EqualsAndHashCode.Include
	 @Column(name = "salty", nullable = false)
	 private Boolean salty;

	 @ToString.Include
	 @EqualsAndHashCode.Include
	 @Column(name = "candy", nullable = false)
	 private Boolean candy;

	 @Column(name = "preparation_time")
	 private String preparationTime;

	 @Column(name = "preparation_mode", nullable = false)
	 private String preparationMode;

	 @OneToMany(mappedBy = "recipe")
	 @JsonManagedReference
	 private List<RecipeIngredient> ingredients;

	 @Column(name = "amount_ingredients", nullable = false)
	 private Integer amountIngredients;

 }
