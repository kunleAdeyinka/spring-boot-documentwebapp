package com.quantum.document.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
	
	@Id
	private Long id;
	private String name;
	
	@Lob
	private byte[] data;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", data=" + Arrays.toString(data) + "]";
	}
}
