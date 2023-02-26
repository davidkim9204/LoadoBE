package Loado.simulator.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {
	
	@Id
	private long Id;
	private String Name;
	private String Grade;
	private String Icon;
	private int BundleCount;
	private int TradeRemainCount;
	private double YDayAvgPrice;
	private long RecentPrice;
	private long CurrentMinPrice;
	
	public Item(long id, String name, String grade, String icon, int bundleCount, int tradeRemainCount,
			double yDayAvgPrice, long recentPrice, long currentMinPrice) {
		super();
		Id = id;
		Name = name;
		Grade = grade;
		Icon = icon;
		BundleCount = bundleCount;
		TradeRemainCount = tradeRemainCount;
		YDayAvgPrice = yDayAvgPrice;
		RecentPrice = recentPrice;
		CurrentMinPrice = currentMinPrice;
	}
	
	
}
