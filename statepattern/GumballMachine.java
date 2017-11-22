package statepattern;

import java.util.ArrayList;

public class GumballMachine {

	public ArrayList<String> als;
	public boolean hasCandy;
	public boolean hasMoney;

	public GumballMachine(int size) {
		hasCandy = true;
		hasMoney = false;
		als = new ArrayList<String>(size);

		for (int i = 0; i < 10; i++) {
			als.add("Candy" + i);
		}
	}

	public void saleCandy() {

		if (hasMoney) {
			if (this.als.size() > 0) {
				if (RandomUtil.isLucky() && this.als.size() > 2){
					System.out.println(this.als.get(this.als.size() -1) 
							+ "," + this.als.get(this.als.size() - 2) + " Sold,Lucky!!!");
					als.remove(this.als.size() - 2);
					hasMoney = false;
				}else{
					System.out.println(als.get(this.als.size() - 1) + " Sold");
					als.remove(this.als.size() - 1);
					hasMoney = false;
				}
				
			} else {
				hasCandy = false;
				System.out.println("Candy sold out, money returned to you now");
				hasMoney = false;
			}

		} else {
			System.out.println("Sorry,there is no money, system cannot sale candy");

			}
		}

	public void insertCoin() {
		if (hasCandy){
			if (hasMoney) {
				System.out.println("Sorry,there is a coin already");
			} else {
				hasMoney = true;
				System.out.println("Money inserted");
			}
		}else{
			System.out.println("Candy sold out, you do not need to insert money");
		}
		
	}

}
