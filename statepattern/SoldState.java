package statepattern;

public class SoldState implements State {
	NewGumballMachine ngm;
	
	public SoldState(NewGumballMachine ngm) {
		this.ngm = ngm;
	}

	@Override
	public void insertCoin() {
		System.out.println("Please wait, we've already given you a candy");
		
	}

	@Override
	public void rejectCoin() {
		System.out.println("Candy is released, cannot reject");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("you have turned already, cannot turn again");
	}

	@Override
	public void dispense() {
		ngm.releaseCandy();
		if (ngm.count > 0) {
			ngm.setState(ngm.getNoCoinState());
		}else{
			System.out.println("No Candy");
			ngm.setState(ngm.getSoldOutState());
		}
		
	}

}
