package com.kosta.exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePad extends JFrame {
	JTextArea jta;
	
	// 파일열기나 저장할 때에 파일을 선택하기 위한 대화상자를 위한 
	// 변수를 맴버로 선언
	JFileChooser jfc;
	
	// 현재 작업하고 있는 파일을 참조할 변수를 선언
	File file;
	
	// 파일에 변경된 내용이 있는지 판별하기 위한 변수를 선언
	// 파일을 저장하거나 열어온 즉시 그 때는 변경된 내용이 없는 상태니까
	// isNew에 false 저장
	// txtarea에 한글자라도 써지면 isNew에 true 저장
	boolean isNew;
	
	
	// 파일을 저장하기 위한 메소드를 만들어요
	public void saveFile() {
		//파일로 저장할 문자열을 갖고 와요
		String data = jta.getText();
		//이미 파일이 열려있으면
		//파일 선택 대화상자를 열지 않고
		//무조건 저장해야 하기 때문에 0으로 초기값을 준다
		int re = 0;
		
		//파일이 오픈되어있지 않으면 어떤 이름으로 저장할건지 물어볼 대화상자를 띄운다
		if (file==null) {
			
			//어떤이름으로 저장할지 물어볼 대화상자를 띄워요.
			//"저장":0, "취소":1
			re = jfc.showSaveDialog(null);
			//대화상자에서 저장을 눌렀으면
			if (re==0) {
				// 대화상자에 입력한 파일정보를 갖고와서 file변수에 저장
				file = jfc.getSelectedFile();
			}
		}
		
		//이미 파일이 오픈되어있거나
		//대화상자에서 "저장"을 눌렀으면 저장을 시켜요
		if(re == 0) {
			try {
				//문자단위의 파일 출력을 위한 객체를 생성
				//매개변수로 대화상자에서 입력한 파일의 정보를 전달합니다.
				FileWriter fr = new FileWriter(file);
				
				//파일로 내용를 출력합니다.
				fr.write(data);
				
				//파일출력 작업이 끝나면 파일을 닫아 줍니다.
				fr.close();
				
				//파일이 성공적을 저장되었다는 메세지를 출력
				JOptionPane.showMessageDialog(null, "파일에 저장하였습니다.");
				
				//저장한 파일명을 타이틀바에 설정
				setTitle(file.getName());
				
				//방금 막 저장했으므로 변경된 내용이 없다는 표시로 isNew에 false를 설정
				isNew = false;
				
			}catch (Exception e) {
				System.out.println("예외발생:"+e.getMessage());
			}
			
		}
	}
	
	
	public NotePad() {
		
		//JFileChooser 객체를 생성
		//매개변수로 작업디텍토리를 전달합니다.
		jfc = new JFileChooser("c:/data");
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		jmb.add(mn_file);
		
		setJMenuBar(jmb);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//텍스트에리어에 키보드 이벤트를 등록
		jta.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//글씨가 한글자라도 써지면 isNew를 설정하여
				//변경된 내용이 있다라고 표시
				isNew = true;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
		file_new.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 에리어에 저장되지 않은 변경된 내용이 있으면
				//저장하시겠습니까?라고 물어본다.
				if (isNew) {
					//예0:저장O, 아니오1:저장X, 취소2:새파일 취소
					int re = JOptionPane.showConfirmDialog(null, "변경된 내용을 저장하시겠습니까?");
					if (re==2) {return;}
					if (re==0) {saveFile();}
				}
				//새파일을 누르면 textarea를 비우기
				jta.setText("");
				//새파일을 했으므로 file에 null 설정
				file = null;
				//새파일을 했으므로 제목표시줄에 제목없음 표시
				setTitle("제목없음");
				
			}
		});
		
		file_open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 열어올 파일을 선택하기 위한 대화상자를 열어요.
				// 0:열기, 1:취소
				int re = jfc.showOpenDialog(null);
				
				//열기를 눌렀으면 열어오는 동작을 하도록 합니다.
				if(re == 0) {					

					//파일열기 대화상자에서 선택한 파일의 정보를 file변수에 저장
					file = jfc.getSelectedFile();
					
					try {						
						//문자단위 파일의 내용을 컴퓨터메모리로 읽어들이기 위한
						//객체를 생성
						//파일열기 대화상자에서 선택한 파일을 매개변수로 전달
						FileReader fr = new FileReader(file);
						
						//파일로 부터 한글자씩 읽어 들이기 위한 변수를 선언
						int ch;
						
						//파일의 전체내용을 저장하기 위한 변수를 선연
						String data = "";
						
						//파일의 끝이 아닐때까지 읽어들여 data에 저장
						while( (ch = fr.read()) != -1  ) {
							data += (char)ch + "";
						}
						
						//파일로부터 읽어들인 전체문자열  data를 텍스트에리어에 설정
						jta.setText(data);
						
						//파일을 닫아 줍니다.
						fr.close();
						
						//열어온 파일명을 타이틀바에 설정합니다.
						setTitle(file.getName());
						
						isNew = false;
						
					}catch (Exception ex) {
						System.out.println("예외발생:"+ex.getMessage());
					}
				}
				
			}
		});
		
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveFile();
			}
		});
		
	}

	public static void main(String[] args) {
		new NotePad();
	}
}