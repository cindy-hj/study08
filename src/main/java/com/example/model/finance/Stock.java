package com.example.model.finance;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
	@Id
	private String stkCd; // 종목코드
	
	private String stkNm; // 종목명
	private String exCd; // 거래소코드
	private String natCd; // 국가코드
	private String secNm; // 섹터명
	private String stkTpNm; // 주식유형명
	
	@OneToMany(mappedBy = "stock") // historyYm
	private List<HistoryYm> historyYm = new ArrayList<>();
	
	@OneToMany(mappedBy = "stock") // financeY
	private List<FinanceY> financeY = new ArrayList<>();
	
	@OneToMany(mappedBy = "stock") // historyDt
	private List<HistoryDt> historyDt = new ArrayList<>();
}
