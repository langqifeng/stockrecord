package com.hust.stock.domain;

import java.util.Date;

/**
 * 用户资金账户类
 * @author chuanrong
 *
 */
public class StockZJZH {
	
	/**
	 * 资金持有人id
	 */
	private long holderid;
	
	/**
	 * 记录时间
	 */
	private Date date;
	
	/**
	 * 当日盈利率
	 */
	private double theDayProfitRate_DRYKL;
	
	/**
	 * 当日盈亏
	 */
	private double theDayProfitAndLoss_DRYK;
	
	/**
	 * 昨日资产
	 */
	private double yesterdayAssets_ZRZC;
	
	/**
	 * 当日上证涨幅
	 */
	private double theDaySZRose_DRSZZF;
	
	
	/**
	 * 本周周盈利率
	 */
	private double theWeekProfitRate_BZZYLL;
	
	
	/**
	 * 本周盈亏
	 */
	private double theWeekProfitAndLoss_BZYK;
	
	
	/**
	 * 本周排名
	 */
	private int theWeekRank_BZPM;
	
	
	/**
	 * 本周操作次数
	 */
	private int theWeekOperateTimes_BZCZCS;
	
	
	/**
	 * 本月盈利率
	 */
	private double theMonthProfitRate_BYYLL;
	
	
	/**
	 * 本月盈亏
	 */
	private double theMonthProfitAndLoss_BYYK;
	
	
	/**
	 * 本月排名
	 */
	private int theMonthRank_BYPM;
	
	
	/**
	 * 本月操作次数
	 */
	private int theMonthOperateTimes_BYCZCS;
	
	
	/**
	 * 总盈利率
	 */
	private double grossProfitRate_ZYLL;
	
	/**
	 * 总盈亏
	 */
	private double totalProfitAndLoss_ZYK;
	
	/**
	 * 浮动盈亏
	 */
	private double floatingProfitAndLoss_FDYK;
	
	/**
	 * 实现盈亏
	 */
	private double realizationProfitAndLoss_SXYK;
	
	/**
	 * 总资产
	 */
	private double totalAssets_ZZC;
	
	
	/**
	 * 起始资产
	 */
	private double initialAssets_QSZC;
	
	
	/**
	 * 资金余额
	 */
	private double remainingSum_ZJYE;
	
	/**
	 * 股票市值
	 */
	private double stockMarketValue_GPSZ;
	
	
	
	public long getHolderid() {
		return holderid;
	}

	public void setHolderid(long holderid) {
		this.holderid = holderid;
	}

	public double getTheDayProfitRate_DRYKL() {
		return theDayProfitRate_DRYKL;
	}

	public void setTheDayProfitRate_DRYKL(double theDayProfitRate_DRYKL) {
		this.theDayProfitRate_DRYKL = theDayProfitRate_DRYKL;
	}

	public double getTheDayProfitAndLoss_DRYK() {
		return theDayProfitAndLoss_DRYK;
	}

	public void setTheDayProfitAndLoss_DRYK(double theDayProfitAndLoss_DRYK) {
		this.theDayProfitAndLoss_DRYK = theDayProfitAndLoss_DRYK;
	}

	public double getYesterdayAssets_ZRZC() {
		return yesterdayAssets_ZRZC;
	}

	public void setYesterdayAssets_ZRZC(double yesterdayAssets_ZRZC) {
		this.yesterdayAssets_ZRZC = yesterdayAssets_ZRZC;
	}

	public double getTheDaySZRose_DRSZZF() {
		return theDaySZRose_DRSZZF;
	}

	public void setTheDaySZRose_DRSZZF(double theDaySZRose_DRSZZF) {
		this.theDaySZRose_DRSZZF = theDaySZRose_DRSZZF;
	}

	public double getTheWeekProfitRate_BZZYLL() {
		return theWeekProfitRate_BZZYLL;
	}

	public void setTheWeekProfitRate_BZZYLL(double theWeekProfitRate_BZZYLL) {
		this.theWeekProfitRate_BZZYLL = theWeekProfitRate_BZZYLL;
	}

	public double getTheWeekProfitAndLoss_BZYK() {
		return theWeekProfitAndLoss_BZYK;
	}

	public void setTheWeekProfitAndLoss_BZYK(double theWeekProfitAndLoss_BZYK) {
		this.theWeekProfitAndLoss_BZYK = theWeekProfitAndLoss_BZYK;
	}

	public int getTheWeekRank_BZPM() {
		return theWeekRank_BZPM;
	}

	public void setTheWeekRank_BZPM(int theWeekRank_BZPM) {
		this.theWeekRank_BZPM = theWeekRank_BZPM;
	}

	public int getTheWeekOperateTimes_BZCZCS() {
		return theWeekOperateTimes_BZCZCS;
	}

	public void setTheWeekOperateTimes_BZCZCS(int theWeekOperateTimes_BZCZCS) {
		this.theWeekOperateTimes_BZCZCS = theWeekOperateTimes_BZCZCS;
	}

	public double getTheMonthProfitRate_BYYLL() {
		return theMonthProfitRate_BYYLL;
	}

	public void setTheMonthProfitRate_BYYLL(double theMonthProfitRate_BYYLL) {
		this.theMonthProfitRate_BYYLL = theMonthProfitRate_BYYLL;
	}

	public double getTheMonthProfitAndLoss_BYYK() {
		return theMonthProfitAndLoss_BYYK;
	}

	public void setTheMonthProfitAndLoss_BYYK(double theMonthProfitAndLoss_BYYK) {
		this.theMonthProfitAndLoss_BYYK = theMonthProfitAndLoss_BYYK;
	}

	public int getTheMonthRank_BYPM() {
		return theMonthRank_BYPM;
	}

	public void setTheMonthRank_BYPM(int theMonthRank_BYPM) {
		this.theMonthRank_BYPM = theMonthRank_BYPM;
	}

	public int getTheMonthOperateTimes_BYCZCS() {
		return theMonthOperateTimes_BYCZCS;
	}

	public void setTheMonthOperateTimes_BYCZCS(int theMonthOperateTimes_BYCZCS) {
		this.theMonthOperateTimes_BYCZCS = theMonthOperateTimes_BYCZCS;
	}

	public double getGrossProfitRate_ZYLL() {
		return grossProfitRate_ZYLL;
	}

	public void setGrossProfitRate_ZYLL(double grossProfitRate_ZYLL) {
		this.grossProfitRate_ZYLL = grossProfitRate_ZYLL;
	}

	public double getTotalProfitAndLoss_ZYK() {
		return totalProfitAndLoss_ZYK;
	}

	public void setTotalProfitAndLoss_ZYK(double totalProfitAndLoss_ZYK) {
		this.totalProfitAndLoss_ZYK = totalProfitAndLoss_ZYK;
	}

	public double getFloatingProfitAndLoss_FDYK() {
		return floatingProfitAndLoss_FDYK;
	}

	public void setFloatingProfitAndLoss_FDYK(double floatingProfitAndLoss_FDYK) {
		this.floatingProfitAndLoss_FDYK = floatingProfitAndLoss_FDYK;
	}

	public double getRealizationProfitAndLoss_SXYK() {
		return realizationProfitAndLoss_SXYK;
	}

	public void setRealizationProfitAndLoss_SXYK(double realizationProfitAndLoss_SXYK) {
		this.realizationProfitAndLoss_SXYK = realizationProfitAndLoss_SXYK;
	}

	public double getTotalAssets_ZZC() {
		return totalAssets_ZZC;
	}

	public void setTotalAssets_ZZC(double totalAssets_ZZC) {
		this.totalAssets_ZZC = totalAssets_ZZC;
	}

	public double getRemainingSum_ZJYE() {
		return remainingSum_ZJYE;
	}

	public void setRemainingSum_ZJYE(double remainingSum_ZJYE) {
		this.remainingSum_ZJYE = remainingSum_ZJYE;
	}

	public double getStockMarketValue_GPSZ() {
		return stockMarketValue_GPSZ;
	}

	public void setStockMarketValue_GPSZ(double stockMarketValue_GPSZ) {
		this.stockMarketValue_GPSZ = stockMarketValue_GPSZ;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getInitialAssets_QSZC() {
		return initialAssets_QSZC;
	}

	public void setInitialAssets_QSZC(double initialAssets_QSZC) {
		this.initialAssets_QSZC = initialAssets_QSZC;
	}

}
