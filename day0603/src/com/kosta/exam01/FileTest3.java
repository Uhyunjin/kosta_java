package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//c:/data/bus.pan 삭제
public class FileTest3 extends JFrame{
	JList<String> list;
	JTextArea jta;
	Vector<String> v;
	
	public FileTest3() {
		v = new Vector<String>();
		String path = "c:/data";
		String []arr;
		File dir = new File(path);
		arr = dir.list();
		
		for (String fname : arr) {
			if (fname.endsWith(".txt")||fname.endsWith(".java")) {
				v.add(fname);
			}
		}
		
		list = new JList<String>(v);
		JScrollPane jsp_list = new JScrollPane(list);
		
		jta = new JTextArea();
		JScrollPane jsp_text = new JScrollPane(jta);
		
		add(jsp_list, BorderLayout.WEST);
		add(jsp_text, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		list.addListSelectionListener(new ListSelectionListener() {
//			
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				String fname = list.getSelectedValue();
//				System.out.println(fname);
//			}
//		});
		
		list.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				String fname = list.getSelectedValue();
				System.out.println(fname);
				FileReader fr=null;
				try {
					fr = new FileReader(path+"/"+fname);
					
					int ch;
					String data="";
					while ((ch=fr.read())!=-1) {
						data += (char)ch;
					}
					jta.setText(data);
					//try에서 close()를 해도 되지만 성공/실패에 관련없이 파일을 닫기 위해서
					//finally에서 사용해준다
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					if (fr!=null) {	//null이면 아예 열리지 않았으므로 닫을 필요가 없다
						try {
							fr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String fnames = list.getSelectedValue();
				System.out.println(fnames);
				if (e.getClickCount()==2) {
					File f = new File(path+"/"+fnames);
					f.delete();
					System.out.println(f+"가 삭제되었습니다.");
					jta.setText("");
					File dir = new File(path);
					String []arr = dir.list();
					v.clear();
					for (String fname : arr) {
						if (fname.endsWith(".txt")||fname.endsWith(".java")) {						
							v.add(fname);
						}
					}
					list.updateUI();
				}
				
			}
		}
		);
		
	}
	public static void main(String[] args) {
		new FileTest3();
	}
}