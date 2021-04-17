package com.emipaylelo.dto;

import org.springframework.web.multipart.MultipartFile;

public class DocumentDetailsDTO {
	String aadharNo;
	String panNo;
	MultipartFile aadharUrl;
	MultipartFile panUrl;
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public MultipartFile getAadharUrl() {
		return aadharUrl;
	}
	public void setAadharUrl(MultipartFile aadharUrl) {
		this.aadharUrl = aadharUrl;
	}
	public MultipartFile getPanUrl() {
		return panUrl;
	}
	public void setPanUrl(MultipartFile panUrl) {
		this.panUrl = panUrl;
	}
	
	
}
