package com.example.cartify.Logic;

import com.example.cartify.Model.Input.Int_Product;
import com.example.cartify.Model.Output.FullProduct;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Product;
import com.example.cartify.Model.Update.Udt_Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductLogicI {
    GenericResponse getAllProduct ();
    GenericResponse createProduct(Int_Product input);
    GenericResponse updateProduct (Udt_Product input);
    GenericResponse deleteProduct (Integer productId);
    GenericResponse searchProductByName (String name);
    GenericResponse sellerSearchProductByName (String name, String sellerId);
    List<FullProduct> sellerGetAllProduct (Integer sellerId);
    FullProduct getFullProduct (Integer productId);
    FullProduct getFullProduct (Product product);
}
