package com.ksdc.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
@ElementCollection
@CollectionTable(name = "role_names", joinColumns = @JoinColumn(name = "role_id"))
@Column(name = "role")
	private List<String> roleNames;
}
