package org.dam2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
	@NonNull
	@EqualsAndHashCode.Include
	@Id
	@Column(length = 10)
	private String nif;
	
	@Column(length = 30, nullable = false)
	private String nombre;
	
	@Column(length = 40, nullable = false)
	private String email;
}
