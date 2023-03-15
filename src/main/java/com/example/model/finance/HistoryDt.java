package com.example.model.finance;

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
public class HistoryDt {
	@Id
	private String ym; // 년월
	
	private int oPrc; // 시작가
	private int hiProc; // 고가
	private int lProc; // 저가
	private int cPorc; // 종가
	private int vol; // 거래량
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="stk_cd") // 종목코드
	private Stock stock;
}
