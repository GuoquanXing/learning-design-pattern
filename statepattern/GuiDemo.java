package statepattern;

import java.awt.Button;  
import java.awt.FlowLayout;  
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
  
  
public class GuiDemo {  
    public static void main(String[] args) {  
        Frame f=new Frame("my awt");  
        f.setSize(500,400);  
        f.setLocation(300,200);  
        f.setLayout(new FlowLayout());  
          
        Button insert =new Button("Insert");;  
        Button buy =new Button("Sending");  
        
        f.add(insert);  
          
        f.add(buy);  
        
        ActionListener myBl = new MyButtonListener();
        
        insert.addActionListener(myBl);
        buy.addActionListener(myBl);
        f.setVisible(true);  
        System.out.println("Hello world!, The Candy Machine is running");  
    }  
  
}  


class MyButtonListener implements ActionListener{
	
	GumballMachine gm  = new GumballMachine(10);

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Insert")){
			gm.insertCoin();
		}else{
			gm.saleCandy();
		}
	}
}
  