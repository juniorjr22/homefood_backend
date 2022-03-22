package br.com.homefood.entity;

import br.com.homefood.entity.recipeingredient.RecipeIngredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ingredient")
public class Ingredient {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ToString.Include
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "name")
	@ToString.Include
	@EqualsAndHashCode.Include
	private String name;

	@OneToMany(
			mappedBy = "ingredient",
			cascade = CascadeType.ALL
	)
	private List<RecipeIngredient> recipes;

}
