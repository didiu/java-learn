
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	ServerSocket ss=null;
	public Server() {
	
	}	
	public static void main(String[] args) {
		new Server().door();
	}

	private void door() {
		try {
			ss=new ServerSocket(12343);
			System.out.println("服务器的IP是:"+InetAddress.getLocalHost());
			while(true) {
				Socket socket=ss.accept();
				System.out.println("监听已启动:");
				new Server().newThreadPool(socket);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}finally {
			if (ss!=null&&!ss.isClosed()) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	private void recMsg(Socket strSs) {
		BufferedReader bReader = null;
		try {
			System.out.println("正在接收,请稍后");
			bReader = new BufferedReader(new InputStreamReader(strSs.getInputStream(),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("收到的数据为:"+bReader);
	}
	@SuppressWarnings("unused")
	private void sedMsg() {
			
	}
	private void newThreadPool(Socket strSs) {
		System.out.println("收到数据,正在处理...");
		ExecutorService executorServer=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 1; i++) {
			executorServer.submit(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					new Server().recMsg(strSs);
				}
			});
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorServer.shutdown();
		System.out.println("处理完毕,线程结束");
		
	}
	
}

