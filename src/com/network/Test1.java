package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test1 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String host;

			System.out.print("호스트[www.naver.com]?");
			host = br.readLine();

			InetAddress ia = InetAddress.getByName(host);
			//이미 한번 찾아갔던 그 모습을 cashe 가지고 있다.
			//바뀐내용만 가져와서 보다 빨리 띄운다.
			//dns로 가져 ip를 가져오는게 맞지만 내부에 그 ip에 대한 내용이있다면
			//내부에 그 ip에 대한 내용을 가져오고 달라진 모습만 채워준다.

			System.out.println("ip주소: " + ia.getHostAddress());
			System.out.println("호스트: " + ia.getHostName());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
