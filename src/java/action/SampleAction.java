/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import utils.ReturnList;

/**
 *
 * @author PalmZaaa
 */
public class SampleAction implements ServletRequestAware{
    HttpServletRequest request;

    
    public String execute(){
        System.out.println("Action");
        if(getServletRequest().getParameter("name").equals("PALM")){
            return "success";
        }else{
            return "error";
        }
        
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    
    public HttpServletRequest getServletRequest() {
        return this.request;
    }
}
