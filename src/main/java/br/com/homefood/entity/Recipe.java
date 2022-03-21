package br.com.homefood.entity;

import br.com.homefood.classenum.RecipeType;
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

	@Column(name = "name")
	@ToString.Include
	@EqualsAndHashCode.Include
	private String name;
	
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	@ToString.Include
	@EqualsAndHashCode.Include
	private RecipeType type;
	
	@Column(name = "preparation_time")
	private String preparationTime;
	
	@Column(name = "preparation_mode")
	private String preparationMode;

	@OneToMany(
			mappedBy = "recipe",
			cascade = CascadeType.ALL
	)
	private List<RecipeIngredient> ingredients;

}
