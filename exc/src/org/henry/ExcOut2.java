package org.henry;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import net.sf.jxls.transformer.XLSTransformer;



public class ExcOut2 {

	public static void main(String[] args) throws Exception {

		
		
		
		 String templateFileName= "D:\\template.xls";  
		
		 
	        String destFileName= "D:\\"+new Date().getTime()+"out.xls";  

	        List<Employee> staff = new ArrayList<Employee>();  
	        staff.add(new Employee("Derek", 35, 3000, 0.30));  
	        staff.add(new Employee("Elsa", 28, 1500, 0.15));  
	        staff.add(new Employee("Oleg", 32, 2300, 0.25));  
	        Map<String,Object> beans = new HashMap<String,Object>();  
	        beans.put("employees", staff);  
	        XLSTransformer transformer = new XLSTransformer();  
	        InputStream in=null;  
	        OutputStream out=null;  
	     
	        try {  
	            in=new BufferedInputStream(new FileInputStream(templateFileName));  
	            Workbook workbook=transformer.transformXLS(in, beans);  
	            out= new  FileOutputStream(destFileName);
	           
	            workbook.write(out);  
	            out.flush();  
	        
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (in!=null){try {in.close();} catch (Exception e) {}}  
	            if (out!=null){try {out.close();} catch (Exception e) {}}  
	        }  
	    }  
		
		
		
	}


