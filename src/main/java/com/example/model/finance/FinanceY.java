package com.example.model.finance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinanceY {
	@Id
	@Column(name="yy")
	private String yy; // 년도
	
	@Id
	@Column(name="fin_itm_nm")
	private String finItmNm; // 종목명
	
	private int finItmVal; // 항목값
	private String datSou; // 데이터소스
	
	@ManyToOne(fetch = FetchType.LAZY) // 종목코드
	@JoinColumn(name="stk_cd")
	private Stock stock;
	
}
