package com.okawango.mvc_thymeleaf.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@MappedSuperclass
@SuppressWarnings("serial")
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	//método hashcode & equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		return Objects.equals(id, other.id);
	}

	// método toString
	@Override
	public String toString() {
		return "id = " + id ;
	}

}
