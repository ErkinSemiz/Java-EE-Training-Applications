/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erkin.beans;
import erkin.entity.Manufacturer;
import erkin.jpaejb.ManufacturerFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

@Named(value = "MANUFACTURERCONTROLLER")
@SessionScoped
 
public class MANUFACTURERCONTROLLER implements Serializable {
    
    @EJB
    ManufacturerFacade manufacturerFacade;
    
    @Inject
    MANUFACTURERBEANS manufacturerBean;
    
    public List<Manufacturer> getAll(){
        return manufacturerFacade.findAll();
    }
    
     public int count(){
        return manufacturerFacade.count();
    }
    
      public String delete(Manufacturer m){
        manufacturerFacade.remove(m);
        return null;
    }
      
      public String add() {
       
          Manufacturer m = new Manufacturer();
          m.setAddressline1(manufacturerBean.getADDRESSLINE1());
          m.setAddressline2(manufacturerBean.getADDRESSLINE2());
          m.setCity(manufacturerBean.getCITY());
          m.setEmail(manufacturerBean.getEMAIL());
          m.setFax(manufacturerBean.getFAX());
          m.setName(manufacturerBean.getNAME());
          m.setPhone(manufacturerBean.getPHONE());
          m.setState(manufacturerBean.getSTATE());
          m.setZip(manufacturerBean.getZIP());
          
          manufacturerFacade.create(m);
          return "index";
      } 
      
      public String Edit(Manufacturer m)
      {
          
          manufacturerBean.setMANUFACTURER_ID(manufacturerBean.getMANUFACTURER_ID());
          manufacturerBean.setADDRESSLINE1(manufacturerBean.getADDRESSLINE1());
          manufacturerBean.setADDRESSLINE2(manufacturerBean.getADDRESSLINE1());
          manufacturerBean.setCITY(manufacturerBean.getCITY());
          manufacturerBean.setEMAIL(manufacturerBean.getEMAIL());
          manufacturerBean.setFAX(manufacturerBean.getFAX());
          manufacturerBean.setNAME(manufacturerBean.getNAME());
          manufacturerBean.setPHONE(manufacturerBean.getPHONE());
          manufacturerBean.setSTATE(manufacturerBean.getSTATE());
          manufacturerBean.setZIP(manufacturerBean.getZIP());
         
          return "update";
      }
      
      public String Save()
      {
          Manufacturer m = new Manufacturer(manufacturerBean.getMANUFACTURER_ID());
          m.setAddressline1(manufacturerBean.getADDRESSLINE1());
          m.setAddressline2(manufacturerBean.getADDRESSLINE2());
          m.setCity(manufacturerBean.getCITY());
          m.setEmail(manufacturerBean.getEMAIL());
          m.setFax(manufacturerBean.getFAX());
          m.setName(manufacturerBean.getNAME());
          m.setPhone(manufacturerBean.getPHONE());
          m.setState(manufacturerBean.getSTATE());
          m.setZip(manufacturerBean.getZIP());
      
          manufacturerFacade.edit(m);
          
          return "index";
      
      }
}
