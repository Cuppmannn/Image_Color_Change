package 고객프_중간고사_2번;

import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;


//---------------------------------------------------------

abstract class Convert extends Converter{

	abstract int[] change(Color color);
	
}

//------------------------------------------------------------
class Convert_GreyImageConverter extends Convert{
	Converter converter;
	
	public Convert_GreyImageConverter(Converter converter) {
		this.converter=converter;
		converter=new Convert_GreyImageConverter();
		converter.convertby(image);
		// TODO Auto-generated constructor stub
	}
	
	public Convert_GreyImageConverter() {
	}



	@Override
	public int[] change(Color color) {
		// TODO Auto-generated method stub
		int[] output=new int[3];
      output[0] = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
      output[1] = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
      output[2] = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
		return output;
	}
}

//-------------------------------------------------------------

class Convert_SepiaImageConverter extends Convert{
	Converter converter;
	public Convert_SepiaImageConverter(Converter converter) {
		this.converter=converter;
		converter=new Convert_SepiaImageConverter();
		converter.convertby(image);
	}
	
	public Convert_SepiaImageConverter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] change(Color color) {
		// TODO Auto-generated method stub
		int[] output=new int[3];
		int grey=(color.getRed() + color.getGreen() + color.getBlue()) / 3;
      output[0] = 230 * grey / 255;
      output[1] = 180 * grey / 255;
      output[2] = 150 * grey / 255;
		return output;
	}

}

//------------------------------------------------------
class Convert_InverseImageConverter extends Convert{
	Converter converter;
	public Convert_InverseImageConverter(Converter converter) {
		this.converter=converter;
		converter=new Convert_InverseImageConverter();
		converter.convertby(image);
	}
	
	
	public Convert_InverseImageConverter() {
	}


	@Override
	public int[] change(Color color) {
		int[] output=new int[3];
      output[0] = 255 - color.getRed();
      output[1] = 255 - color.getGreen();
      output[2] = 255 - color.getBlue();
		return output;
	}


	
	
}