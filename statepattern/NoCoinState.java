package statepattern;

public class NoCoinState implements State{
NewGumballMachine ngm;
	
	public NoCoinState(NewGumballMachine ngm) {
		this.ngm = ngm;
	}
	
	@Override
	public void insertCoin() {
		System.out.println("Coin Inserted");
		
	}

	@Override
	public void rejectCoin() {
		System.out.println("There is no coin, cannot reject");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("There is no coin, cannot turnCrank");
		
	}

	@Override
	public void dispense() {
		
	}

}
