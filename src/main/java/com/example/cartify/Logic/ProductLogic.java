package com.example.cartify.Logic;

import com.example.cartify.DAO.ProductDAOI;
import com.example.cartify.DAO.ReviewDAOI;
import com.example.cartify.Model.Input.Int_Product;
import com.example.cartify.Model.Output.FullProduct;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Product;
import com.example.cartify.Model.Update.Udt_Product;

import javax.ejb.EJB;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLogic {
    @EJB
    ProductDAOI productDAO;
    @EJB
    ReviewDAOI reviewDAO;
    @EJB
    ReviewLogic reviewLogic;

    public GenericResponse getAllProduct (){
        return new GenericResponse(productDAO.getAllProduct());
    }
    public GenericResponse createProduct(Int_Product input) {
        Product object = productDAO.create(input.toProduct());
        if (object == null) {
            return new GenericResponse(false);
        }
        else {
            return new GenericResponse(getFullProduct(object));
        }
    }
    public GenericResponse updateProduct (Udt_Product input) {
        Product object = productDAO.update(input.toProduct(productDAO.getProductbyId(input.getProductId())));
        if (object == null) {
            return new GenericResponse(false);
        }
        else {
            return new GenericResponse(getFullProduct(object));
        }
    }
    public GenericResponse deleteProduct (Integer productId) {
        return new GenericResponse(productDAO.delete(productDAO.getProductbyId(productId)));
    }
    public GenericResponse searchProductByName (String name ) {
        List<Product> result = productDAO.findByConditionLike("Name", name);
        return new GenericResponse(result);
    }
    public GenericResponse sellerSearchProductByName (String name, String sellerId ) {
        List<Product> result = productDAO.SellerFindByConditionLike("Name", name, "sellerID", sellerId);
        return new GenericResponse(result);
    }
    public List<FullProduct> sellerGetAllProduct (Integer sellerId ) {
        List<Product> result = productDAO.findByFieldEqual("sellerID", sellerId);
        return result.stream().map(x->getFullProduct(x)).collect(Collectors.toList());
    }
    public FullProduct getFullProduct (Integer productId) {
        return getFullProduct(productDAO.getProductbyId(productId));
    }
    public FullProduct getFullProduct (Product product) {
        return new FullProduct(product, reviewDAO.findByFieldEqual("productID", product.getId()).stream().map(x->reviewLogic.getFullReview(x)).collect(Collectors.toList()));
    }
}
