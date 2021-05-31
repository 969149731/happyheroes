package com.kxcs.service;
/**
 * @Author chenjie
 * @Date 2021年5月18日下午2:18:57
 * @Des 商品接口类
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kxcs.entity.Product;
import com.kxcs.entity.ProductExample;

public interface IProductService {
    int deleteByPrimaryKey(String proid);
    int insert(Product record);
    List<Product> selectByExample(ProductExample example);
    public List<Product> getlist();
    Product selectByPrimaryKey(String proid);
    List<Product> getbyparams( String proid,String supname,String pname,String protype );
    boolean updateByPrimaryKey(Product record);
    }
