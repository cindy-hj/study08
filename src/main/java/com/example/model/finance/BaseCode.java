package com.example.model.finance;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="basecode")
public class BaseCode {
	@Id
	private Long basCd; // 기초코드
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="bas_cd_dv")
	private BaseCodeDv bascodedv; // 기초코드 구분
	
	private String basCdNm; // 기초코드명
	private int SrtOd; // 정렬순서
}
