package com._day01_01;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args){
		//���Էָ�� 
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		//��ȡ·���ָ���
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(pathSeparator+"----"+pathSeparatorChar);
	    System.out.println(separator+"----"+separatorChar);
	    //��ʾһ���ļ�·��
	    String path1 = "D:\\test\\note.txt";
	    String path2 = "D:/test/note.txt";
	    String path3 = "D:"+File.separator+"test"+File.separator+"note.txt";
	}

}
