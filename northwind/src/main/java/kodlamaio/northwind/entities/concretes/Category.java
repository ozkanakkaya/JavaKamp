package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//constructorları getir
@NoArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})//*
public class Category {
	@Id
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;
}
//*
//@MappedBy anatasyonu uyguladığımız List<Product> products yapısının sürekli dönüp bir sonsuz döngü oluşturuyor.
//Bunun önüne ise yandaki gibi bir @JsonIgnoreProperties anatasyonu eklenmesi gerekiyor.
//Bu anatasyon doğru değer döndüren bir işlem olduğu taktirde döngüyü sonlandırıyor ve böylece sonsuz döngünün önüne geçilmiş olunuyor.
//Yazmış olduğumuz @JsonIgnoreProperties içerisindeki "products" ise hangi veride bunun uygulanacağının bilgisidir.