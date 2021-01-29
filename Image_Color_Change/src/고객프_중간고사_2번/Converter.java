package 고객프_중간고사_2번;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

class Converter {
	
	Image image;
	private Convert convert=null; //Convert 참조 레퍼런스를 가지고 있음 : 변환 방식에 따라 참조값이 바뀌는 레퍼런스.
	
	Converter(Convert convert){ //생성자: 초기 Convert 참조값 지정.
		this.convert=convert;
	}
	void setConvert(Convert convert) { //setConvert.
		this.convert=convert;
	}
	
	public Converter(Image image) {
		this.image=image;
	}
	
	public Converter() {}

	void convertby(Image image) { //Convert 레퍼런스의 참조값에 따라 Image 객체의 image를 변경해준다.
		int[] output_color; //Convert의 change() 메소드를 통해 받는 output RGB값을 일시적으로 저장하는 변수.
		for(int y = 0; y < image.getimage_height(); y++) {
          for(int x = 0; x < image.getimage_width(); x++) {
          	output_color=convert.change(new Color(image.image.getRGB(x,y)));
          	Image.image.setRGB(x, y, new Color(output_color[0],output_color[1],output_color[2]).getRGB());
          	}
		}
	}
	
	
	void save(Image image){ //현재 Image 객체의 image를 다른 확장명으로 저장하는 함수
		if(convert instanceof Convert_GreyImageConverter)
			try {
				ImageIO.write(image.image, "png", new File("g_" + image.getimage_name()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(convert instanceof Convert_SepiaImageConverter)
			try {
				ImageIO.write(image.image, "png", new File("s_" + image.getimage_name()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(convert instanceof Convert_InverseImageConverter)
			try {
				ImageIO.write(image.image, "png", new File("i_" + image.getimage_name()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
