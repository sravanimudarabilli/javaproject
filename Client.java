import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Client extends JFrame{
Socket socket;
BufferedReader br;
PrintWriter out;

private JLabel heading=new JLabel("Client Area");
private JTextArea messageArea=new JTextArea();
private JTextField message=new JTextField();
private Font font=new Font("Roboto",Font.PLAIN,20);
public Client() {
	try {
		System.out.println("sending request to server.....");
	socket=new Socket("127.0.0.1",77);
	System.out.println("connection done");
	br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	out=new PrintWriter(socket.getOutputStream());
	createGUI();
	handleEvents();
	startReading();
	//startWriting();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
	private void handleEvents() {
	// TODO Auto-generated method stub
	message.addKeyListener(new KeyListener(){

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==10) {
				String contentToSend=message.getText();
				messageArea.append("Me:"+contentToSend+"\n");
				out.println(contentToSend);
				out.flush();
				message.setText("");
				message.requestFocus();
			}
		}
		
	}
	);
}

	private void createGUI() {
	// TODO Auto-generated method stub
	this.setTitle("client messanger");
	this.setSize(600,600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	heading.setFont(font);
	message.setFont(font);
	messageArea.setFont(font);
	heading.setHorizontalTextPosition(SwingConstants.CENTER);
	heading.setVerticalTextPosition(SwingConstants.BOTTOM);
	heading.setHorizontalAlignment(SwingConstants.CENTER);
	message.setHorizontalAlignment(SwingConstants.CENTER);
	this.setLayout(new BorderLayout());
	this.add(heading,BorderLayout.NORTH);
	this.add(message,BorderLayout.CENTER);
	this.add(messageArea,BorderLayout.SOUTH);
	
	this.setVisible(true);
		
}

	public void startReading() {
	// TODO Auto-generated method stub
		Runnable r=()->{
			System.out.println("reader started..");
			try {
			while(true) {
				
				String msg=br.readLine();
				
			if(msg.equals("exit")) {
					System.out.println("server terminated the chat");
					JOptionPane.showMessageDialog(this,"Server terminated the chat");
					message.setEnabled(false);
					socket.close();
					break;
				}
			messageArea.append("Server:"+msg+"\n");
				}
			}catch(Exception e) {
					e.printStackTrace();
				}
			
		};
		
		new Thread(r).start();
	
}

	public void startWriting() {
		// TODO Auto-generated method stub
		Runnable r1=()->{
			System.out.println("writer started...");
			try {
			while(true && !socket.isClosed()) {
			
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			String content=br1.readLine();
			out.println(content);
			out.flush();
			if(content.equals("exit")){
				socket.close();
				System.out.println("connection is closed");
				break;
				
			}
			
			
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	
		
	};
	
new Thread(r1).start();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Client();
	}

}
