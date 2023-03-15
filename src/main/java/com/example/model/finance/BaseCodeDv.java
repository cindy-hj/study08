package com.example.model.finance;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="basecode_dv")
public class BaseCodeDv {
	@Id
	private String basCdDv; // 기초코드구분
	private String basCdDvNm; // 기초코드 구분명

	@OneToMany(mappedBy = "bascodedv")
	private List<BaseCode> baseCode = new ArrayList<>();
}
