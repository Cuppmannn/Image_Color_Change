package ����_�߰����_2��;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;


class Image{
	static BufferedImage image;	  //�̹��� ���� ���� ���۷���.
	private int image_height; ;  //�̹��� ��ü�� ���� ũ��.
	private int image_width;	//�̹��� ��ü�� ���� ũ��.
	private String image_name; // ���� �̹��� �̸�.
	
	//�̹��� ��ü ������
	Image(String Imagename){
		
		//���� �̹��� ������ ���ۿ� ����
		try {
			image=ImageIO.read(new File(Imagename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.image_name=Imagename;
		this.image_height=image.getHeight(); //�̹��� ��ü ���� ũ�Ⱚ ����
		this.image_width=image.getWidth(); //�̹��� ��ü ���� ũ�Ⱚ ����
	}
	
	
	int getimage_height() {
		return this.image_height;
	}
	int getimage_width() {
		return this.image_width;
	}
	
	String getimage_name(){
		return this.image_name;
	}
		
}



public class Main {
	//�г���: Cupppman 
	public static void main(String[] args) {

		final String HOUSE = "house.png";
				
		  Image image = new Image(HOUSE); //�̹��� ��ü ����(�Ͽ콺 ��ü)
	      System.out.println("���� �ҷ����� �Ϸ�."); //�̹��� ��ü ���� �Ϸ� Ǫ�� ���
	      
	      Converter cv= new Converter(image);
	      cv=new Convert_GreyImageConverter(cv);
	      cv=new Convert_SepiaImageConverter(cv);
	      cv.save(image);
	      System.out.print("��");
/*
	      Converter converter = new Converter(new Convert_GreyImageConverter());
	      converter.convertby(image);
	      converter.save(image);//���̺� �Ŀ��� �ٽ� ���� ����� ����� �ֵ��� ��.      
	      System.out.println("��� Version ���� �Ϸ�.");
	      
	      converter.setConvert(new Convert_SepiaImageConverter());
	      converter.convertby(image);
	      converter.save(image);//���̺� �Ŀ��� �ٽ� ���� ����� ����� �ֵ��� ��.      
	      System.out.println("���Ǿ��� Version ���� �Ϸ�.");
		
	      converter.setConvert(new Convert_InverseImageConverter());
	      converter.convertby(image);
	      converter.save(image);//���̺� �Ŀ��� �ٽ� ���� ����� ����� �ֵ��� ��.      
	      System.out.println("���� Version ���� �Ϸ�.");	
	      
	      //converter.setConvert(new Convert_OriginalColor());
	      converter.setConvert(new Convert_GreyImageConverter());
	      converter.setConvert(new Convert_SepiaImageConverter());
	      converter.convertby(image);
	      converter.save(image);//���̺� �Ŀ��� �ٽ� ���� ����� ����� �ֵ��� ��.      
	      System.out.println("����Version -->��� Version --> ���Ǿ��� Version ���� �Ϸ�.");
	}
*/
	}
}