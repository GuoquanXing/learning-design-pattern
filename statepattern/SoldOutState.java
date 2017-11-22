package statepattern;

public class SoldOutState implements State {
	NewGumballMachine ngm;

	public SoldOutState(NewGumballMachine ngm) {
		this.ngm = ngm;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rejectCoin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
