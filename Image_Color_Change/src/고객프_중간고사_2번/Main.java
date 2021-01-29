package 고객프_중간고사_2번;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;


class Image{
	static BufferedImage image;	  //이미지 파일 버퍼 레퍼런스.
	private int image_height; ;  //이미지 객체의 높이 크기.
	private int image_width;	//이미지 객체의 넓이 크기.
	private String image_name; // 원본 이미지 이름.
	
	//이미지 객체 생성자
	Image(String Imagename){
		
		//원본 이미지 파일을 버퍼에 복사
		try {
			image=ImageIO.read(new File(Imagename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.image_name=Imagename;
		this.image_height=image.getHeight(); //이미지 객체 넓이 크기값 저장
		this.image_width=image.getWidth(); //이미지 객체 넓이 크기값 저장
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
	//닉네임: Cupppman 
	public static void main(String[] args) {

		final String HOUSE = "house.png";
				
		  Image image = new Image(HOUSE); //이미지 객체 생성(하우스 객체)
	      System.out.println("원본 불러오기 완료."); //이미지 객체 생성 완료 푸쉬 출력
	      
	      Converter cv= new Converter(image);
	      cv=new Convert_GreyImageConverter(cv);
	      cv=new Convert_SepiaImageConverter(cv);
	      cv.save(image);
	      System.out.print("끝");
/*
	      Converter converter = new Converter(new Convert_GreyImageConverter());
	      converter.convertby(image);
	      converter.save(image);//세이브 후에는 다시 원본 모양을 갖출수 있도록 함.      
	      System.out.println("흑백 Version 저장 완료.");
	      
	      converter.setConvert(new Convert_SepiaImageConverter());
	      converter.convertby(image);
	      converter.save(image);//세이브 후에는 다시 원본 모양을 갖출수 있도록 함.      
	      System.out.println("세피아톤 Version 저장 완료.");
		
	      converter.setConvert(new Convert_InverseImageConverter());
	      converter.convertby(image);
	      converter.save(image);//세이브 후에는 다시 원본 모양을 갖출수 있도록 함.      
	      System.out.println("반전 Version 저장 완료.");	
	      
	      //converter.setConvert(new Convert_OriginalColor());
	      converter.setConvert(new Convert_GreyImageConverter());
	      converter.setConvert(new Convert_SepiaImageConverter());
	      converter.convertby(image);
	      converter.save(image);//세이브 후에는 다시 원본 모양을 갖출수 있도록 함.      
	      System.out.println("원본Version -->흑백 Version --> 세피아톤 Version 저장 완료.");
	}
*/
	}
}