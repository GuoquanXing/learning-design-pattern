package statepattern;

public class HasCoinState implements State {
	NewGumballMachine ngm;

	public HasCoinState(NewGumballMachine ngm) {
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
