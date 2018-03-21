public class ProxyDesignPatternUsage{
	
	public static void main(String[] args){
		Subject subject = new ProxySubject();
		subject.doAction();
	}
}