/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author PalmZaaa
 */
public class UploadAction extends ActionSupport{
    
    private File myFile;
   private String myFileContentType;
   private String myFileFileName;
   private String destPath;
        
    public String execute(){
        
        try{
            destPath = "D:/Tutotial";
            System.out.println(myFile.getName());
            System.out.println(myFile.getPath());
            File destFile = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);
            
            return "success";
        
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
        return "error";
    }

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    
    
    
}
