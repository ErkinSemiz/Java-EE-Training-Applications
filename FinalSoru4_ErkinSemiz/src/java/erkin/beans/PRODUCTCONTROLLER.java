/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ 
package erkin.beans;
import erkin.entity.Product;
import erkin.jpaejb.ProductFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;
/**
 *
 * @author Erkin
 */
public class PRODUCTCONTROLLER {
    @EJB
    ProductFacade ProductFacade;
    
    @Inject
    PRODUCTBEANS productBean;
    
    public List<Product> getAll(){
        return ProductFacade.findAll();
    }
    
     public int count(){
        return ProductFacade.count();
    }
    
      public String delete(Product m){
        ProductFacade.remove(m);
        return null;
    }
      
      public String add() {
       
          Product p = new Product();
          p.setAvailable(productBean.isAVAILABLE());
          p.setDescription(productBean.getDESCRIPTION());
         /* p.setMarkup(productBean.getMARKUP());
          p.setProductCode(productBean.getPRODUCT_CODE());
          p.setPurchaseCost(productBean.getPURCHASE_COST());
          p.setQuantityOnHand(productBean.getQUANTITY_ON_HAND());
          
          
          m.setAddressline1(productBean.getADDRESSLINE1());
          m.setAddressline2(productBean.getADDRESSLINE2());
          m.setCity(productBean.getCITY());
          m.setEmail(productBean.getEMAIL());
          m.setFax(productBean.getFAX());
          m.setName(productBean.getNAME());
          m.setPhone(productBean.getPHONE());
          m.setState(productBean.getSTATE());
          m.setZip(productBean.getZIP());
          
          ProductFacade.create(m);
          return "index";
      } 
      
      public String Edit(Product m)
      {
          
          productBean.setPRODUCT_ID(productBean.getPRODUCT_ID());
         
          return "update";
      }
      
      public String Save()
      {
          Product m = new Product(productBean.getMANUFACTURER_ID());
          m.setAddressline1(productBean.getADDRESSLINE1());
          m.setAddressline2(productBean.getADDRESSLINE2());
          m.setCity(productBean.getCITY());
          m.setEmail(productBean.getEMAIL());
          m.setFax(productBean.getFAX());
          m.setName(productBean.getNAME());
          m.setPhone(productBean.getPHONE());
          m.setState(productBean.getSTATE());
          m.setZip(productBean.getZIP());
      
          ProductFacade.edit(m);
          
          return "index";
      
      }
}
}
*/      return null;
      }
}