public class ProxySubject implements Subject{
	private Subject subject = new RealSubject();
	private int actionCounter = 0;
	//the implementation of proxy just call the realSubject method, this is called delegation.
	//in general some additional task are supposed to done when calling proxy implementation, which is a type case for separate of duty:
	// RealSubject implementation focuses on the essential logic, but proxy add some ad-hoc logic, which distinguisheds the proxy to actual implementation.
	public void doAction(){	
		subject.doAction();
		actionCounter = actionCounter + 1;
	}
}