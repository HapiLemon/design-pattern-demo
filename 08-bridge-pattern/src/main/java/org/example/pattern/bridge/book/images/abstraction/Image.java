package org.example.pattern.bridge.book.images.abstraction;

import org.example.pattern.bridge.book.images.Implementor.ImageImp;

//抽象图像类：抽象类
public abstract class Image {
	protected ImageImp imp;
 
	public void setImageImp(ImageImp imp) {
		this.imp = imp;
	} 
 
	public abstract void parseFile(String fileName);
}