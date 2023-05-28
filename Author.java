package com.hibernate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
     private int aId;
	@Column(name="author_name",length=20)
	private String name;
	
	@OneToMany//one author can write many books
	private List<Book>books;
}
