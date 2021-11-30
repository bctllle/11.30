package TanChiShe;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Demo6 extends Frame{
	static boolean tag=true;
	public static void main(String[] args) {
		Demo6 frame =new Demo6();
		frame.setSize(400, 400);
         frame.setBackground(Color.blue);
         Button button=new Button("点击看效果");
         frame.setLayout(new FlowLayout(FlowLayout.LEFT,100,100));
         frame.add(button);
         frame.setVisible(true);
         frame.addWindowListener(new WindowAdapter(){
        	 private void windowCloseing() {
				// TODO Auto-generated method stub
System.exit(0);
			}
         });
         button.addActionListener((ActionListener) new ActionListener() {

			private boolean tag;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!tag)
					return;
				System.out.println(11111);
					
			}
        	 
         });
	}
  
}
