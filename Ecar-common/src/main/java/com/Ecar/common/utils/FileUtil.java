package com.Ecar.common.utils;



import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FileUtil {

	/**
	 * 
	 * 1：完成文件上传
					  1：将上传的文件统一放置到upload的文件夹下
					  2：将每天上传的文件，使用日期格式的文件夹分开，将每个业务的模块放置统一文件夹下
					  3：上传的文件名要指定唯一，可以使用UUID的方式，也可以使用日期作为文件名
					  4：封装一个文件上传的方法，该方法可以支持多文件的上传，即支持各种格式文件的上传
					  5：保存路径path的时候，使用相对路径进行保存，这样便于项目的可移植性
	 * @param file 上传的文件
	 * @param fileName 文件名
	 * @param model 保存的模块
	 * @param basePath 文件保存的绝对路径
	 * @return
	 * 
	 */
	public static String getFileUploadURL(File file, String fileName,
			String model,String basePath) {
		// TODO Auto-generated method stub
//		String basePath=ServletActionContext.getServletContext().getRealPath("/upload");
		//String basePath="";
		SimpleDateFormat date=new SimpleDateFormat("/yyyy/MM/dd/");
		String path1=date.format(new Date());
		
		File dirFile=new File(basePath+path1+model);
		/**
		 * 创建文件夹
		 */
		if(!dirFile.exists()){
			dirFile.mkdirs();
		}
		
		//文件名的后缀
		String postfix=fileName.substring(fileName.lastIndexOf("."));
		//保存的文件名
		String saveFileName=UUID.randomUUID()+postfix;
		
		//保存的绝对路径
		String savePath=basePath+path1+model+File.separator+saveFileName;
		
		File saveFile=new File(savePath);
		/**
		 * 或者File saveFile=new File(dirFile,saveFileName);
		 */
		
		save(file,saveFile);
		
		
		//相对路径
		
		String relativePath=File.separator+"upload"+path1+model+File.separator+saveFileName;
		return relativePath;
	}

	/**
	 * springmvc文件上传
	 * @param file
	 * @return
     */
	public static String getFileUploadURL(MultipartFile file,String basePath,String model) throws IOException {
		SimpleDateFormat date=new SimpleDateFormat("/yyyy/MM/dd/");
		String path1=date.format(new Date());

		File dirFile=new File(basePath+path1+model);
		/**
		 * 创建文件夹
		 */
		if(!dirFile.exists()){
			dirFile.mkdirs();
		}

		String fileName=file.getOriginalFilename();
		//文件名的后缀
		String postfix=fileName.substring(fileName.lastIndexOf("."));
		//保存的文件名
		String saveFileName=UUID.randomUUID()+postfix;

		//保存的绝对路径
		String savePath=basePath+path1+model+File.separator+saveFileName;



		file.transferTo(new File(savePath));




		//相对路径

		String relativePath=File.separator+"upload"+path1+model+File.separator+saveFileName;
		return relativePath;
	}
	
	/**
	 * 将这个文件剪切到另一个文件上，两个文件需要存在
	 * @param file
	 * @param saveFile
	 */
	private static void save(File file, File saveFile) {
		// TODO Auto-generated method stub
		file.renameTo(saveFile);
	}

}
