import java.io.*;
import java.net.*;
public class Server {
	ServerSocket server;
	Socket socket;
	BufferedReader br;
	PrintWriter out;
	public Server() {
		try {
			server=new ServerSocket(77);
			System.out.println("server is ready to accept connection");
			System.out.println("waiting...");
			socket=server.accept();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(socket.getOutputStream());
			startReading();
			startWriting();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
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

		public void startReading() {
			// TODO Auto-generated method stub
			Runnable r=()->{
				System.out.println("reader started..");
				try {
				while(true) {
			
					String msg=br.readLine();
					
				if(msg.equals("exit")) {
						System.out.println("client terminated the chat");
						socket.close();
						break;
					}
				System.out.println("Client:"+msg);
					}
				}catch(Exception e) {
						e.printStackTrace();
					}
				
			};
			
			new Thread(r).start();
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Server();
	}

}
