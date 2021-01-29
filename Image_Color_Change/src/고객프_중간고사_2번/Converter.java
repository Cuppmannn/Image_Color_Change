package ����_�߰����_2��;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

class Converter {
	
	Image image;
	private Convert convert=null; //Convert ���� ���۷����� ������ ���� : ��ȯ ��Ŀ� ���� �������� �ٲ�� ���۷���.
	
	Converter(Convert convert){ //������: �ʱ� Convert ������ ����.
		this.convert=convert;
	}
	void setConvert(Convert convert) { //setConvert.
		this.convert=convert;
	}
	
	public Converter(Image image) {
		this.image=image;
	}
	
	public Converter() {}

	void convertby(Image image) { //Convert ���۷����� �������� ���� Image ��ü�� image�� �������ش�.
		int[] output_color; //Convert�� change() �޼ҵ带 ���� �޴� output RGB���� �Ͻ������� �����ϴ� ����.
		for(int y = 0; y < image.getimage_height(); y++) {
          for(int x = 0; x < image.getimage_width(); x++) {
          	output_color=convert.change(new Color(image.image.getRGB(x,y)));
          	Image.image.setRGB(x, y, new Color(output_color[0],output_color[1],output_color[2]).getRGB());
          	}
		}
	}
	
	
	void save(Image image){ //���� Image ��ü�� image�� �ٸ� Ȯ������� �����ϴ� �Լ�
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
