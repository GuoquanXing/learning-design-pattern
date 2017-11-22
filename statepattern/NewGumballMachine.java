package statepattern;

public class NewGumballMachine {
	
	State soldOutState;
	State soldState;
	State noCoinState;
	State hasCoinState;
	
	public void setState(State state) {
		this.state = state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public int getCount() {
		return count;
	}

	State state = soldOutState;
	int count = 0;
	
	public NewGumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		
		this.count = numberGumballs;
		
		if (count > 0){
			state = noCoinState;
		}
		
	}
	
	void releaseCandy(){
		System.out.println("a candy is comming...");
		if (count != 0){
			count = count - 1;
		}
	}

}
