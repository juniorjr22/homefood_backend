package br.com.homefood.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ToString.Include
	@EqualsAndHashCode.Include
	private Integer id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "recipe_id")
	@ToString.Include
	@EqualsAndHashCode.Include
	@JsonBackReference
	private Recipe recipe;

	@ManyToOne
	@ToString.Include
	@EqualsAndHashCode.Include
	private Ingredient ingredient;
	
	@Column(name = "ingredient_description", nullable = false)
	private String ingredientDescription;

}