/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ 
package erkin.beans;
import erkin.entity.Product;
import erkin.jpaejb.ProductFacade;
import java.io.Serializable;
import java.math.BigDecimal;
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
          p.setMarkup(productBean.getMARKUP());
          p.setProductCode(productBean.getPRODUCT_CODE());
          p.setPurchaseCost(productBean.getPURCHASE_COST());
          p.setQuantityOnHand(productBean.getQUANTITY_ON_HAND());
          p.setManufacturerId(productBean.getMANUFACTURER_ID());
          
          ProductFacade.create(p);
          return "index";
      } 
      
      public String Edit(Product m)
      {
          
          productBean.setPRODUCT_ID(productBean.getPRODUCT_ID());
          productBean.setAVAILABLE(productBean.isAVAILABLE());
          productBean.setDESCRIPTION(productBean.getDESCRIPTION());
          productBean.setMANUFACTURER_ID(productBean.getMANUFACTURER_ID());
          productBean.setMARKUP(productBean.getMARKUP());
          productBean.setPRODUCT_CODE(productBean.getPRODUCT_CODE());
          productBean.setPURCHASE_COST(productBean.getPURCHASE_COST());
          productBean.setQUANTITY_ON_HAND(productBean.getQUANTITY_ON_HAND());
          
          return "update";
      }
      
      public String Save()
      {
          Product p = new Product(productBean.getPRODUCT_ID());
          p.setAvailable(productBean.isAVAILABLE());
          p.setDescription(productBean.getDESCRIPTION());
          p.setMarkup(productBean.getMARKUP());
          p.setProductCode(productBean.getPRODUCT_CODE());
          p.setPurchaseCost(productBean.getPURCHASE_COST());
          p.setQuantityOnHand(productBean.getQUANTITY_ON_HAND());
          p.setManufacturerId(productBean.getMANUFACTURER_ID());
      
          ProductFacade.edit(p);
          
          return "index";
      
      }
}
}

      }
}