package com.cn.readdata;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class DataPare {


	public static List<String[]> readData(String filepath)

	{
		List<String[]> ls = new ArrayList<String[]>();
		InputStream is = null;
		BufferedReader br=null;
		try {
			is = new FileInputStream(filepath);
			br = new BufferedReader(new InputStreamReader(is));
			String tem = null;
			while (!(tem = StringUtils.trimToEmpty(br.readLine())).equals("")) {
				String str[] = tem.split(",");
				ls.add(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				br.close();
				is.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return ls;

	}

}
