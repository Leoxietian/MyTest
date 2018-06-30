package com._day01_01;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args){
		//属性分割符 
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		//获取路径分隔符
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(pathSeparator+"----"+pathSeparatorChar);
	    System.out.println(separator+"----"+separatorChar);
	    //表示一个文件路径
	    String path1 = "D:\\test\\note.txt";
	    String path2 = "D:/test/note.txt";
	    String path3 = "D:"+File.separator+"test"+File.separator+"note.txt";
	}

}
