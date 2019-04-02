package chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
	private JTextArea ChatArea = new JTextArea();
	private JTextField ChatBox = new JTextField();
	public Bot() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.darkGray);
		ChatArea.setBackground(Color.lightGray);
		ChatBox.setBackground(Color.lightGray);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBotJava");
		frame.add(ChatArea);
		frame.add(ChatBox);
		
		//Area da conversa
		ChatArea.setSize(540, 450);
		ChatArea.setLocation(2, 30);
		
		//Area da escrita
		ChatBox.setSize(540, 30);
		ChatBox.setLocation(2, 500);
		
		ChatBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gtext = ChatBox.getText().toLowerCase();
				ChatArea.append("You -> " + gtext + "\n");
				ChatBox.setText("");
				
				if (gtext.contains("hi")) {
					bot("Hi");
				}else if (gtext.contains( "how are you?")) {
					bot("I'm fine. And you?");
				}else if (gtext.contains("finish")) {
					bot("Bye!");
				}else {
					bot("I don't understand you. Sorry.");
				}
				
			}
			
		});
	}
	
	private void bot(String string) {
		ChatArea.append("Bot -> " + string + "\n");
	}
	
public static void main(String args[]) {
	new Bot();
}

}
