package com.network;

import java.io.Serializable;


//데이터를 보낼때는 직렬화가 되어있어야한다 그래서
public class FileInfo implements Serializable {

	/*
	100 : 파일전송시작(파일명)
	110 : 파일내용을 전송
	200 : 파일 전송종료(파일명)
	size : 전송크기
	data : 전송내용
	*/
	
	private static final long serialVersionUID = 1L;
	private int code;
	private int size;
	private byte[] data = new byte[1024]; //데이터를 보낼때 받을때 묶음으로 보낼꺼에요
	 									  //그 묶음을 [1024]
	//데이터를 보낼때는 직렬화가 되어있어야한다 그래서
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}

}
