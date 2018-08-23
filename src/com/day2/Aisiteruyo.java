package com.day2;

import java.io.*;

class Aisiteruyo {

	public static void main(String[] args) throws IOException {
		
		String name, name2, name3;

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));

			

			System.out.println("아나따와 다레데쓰까?");

				name = br.readLine();

			System.out.println("사랑하는 사람이 있습니까?");
				
				name2 = br.readLine();

			System.out.println("소레가 다레데쓰까");
				
				name3 = br.readLine();


			System.out.print(name + "은 " + "사랑하는 사람이" + name2 + "라고 했습니다\n" +
				"바로 "+name3+" 여보입니다. 헿."+"\n림블리양 오늘도 너무 사랑합니다. 여보가 있어 행복행 힛.\n\n");






	}
}
