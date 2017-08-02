package com.cn.readdata;




import java.util.Collection;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cn.data.DataPare;

public class ReadData {
	
	private String name;
	private String password;

	public ReadData(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	@Parameters
	public static Collection<String[]> getData() 
	{
		return DataPare.readData("D:\\workspace\\jingjing\\data\\initdata.csv");
	}
	
	@Test
	public void dataStream()
	{
		System.out.println(name+"------"+password);
	}
}
