package action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class NewThread extends Thread{
	Socket s;
	BufferedReader bReader;
	public NewThread(Socket s) {
		super();
		this.s=s;
		try {
			bReader=new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		super.run();
		String data=null;
		try {
			while((data=bReader.readLine())!=null){
				s.getOutputStream().write((data+"\n").getBytes());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
