package com.open.harmony.controller;
import com.open.harmony.common.Result;
import com.open.harmony.entity.Product;
import com.open.harmony.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "商品模块")
@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 查询所有商品
     *
     * @return
     */
    @ApiOperation("查询所有商品")
    @GetMapping("/findAll")
    public Result selectAll() {
        return productService.findAll();
    }

    /**
     * 查询所有商品
     *
     * @return
     */
    @ApiOperation("根据商户id查询所有商品")
    @GetMapping("/findAllByStoreId")
    public Result selectAllByStoreId(Integer storeId) {
        return productService.findAllByStoreId(storeId);
    }

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    @ApiOperation("更改指定商品")
    @PutMapping("/updateProduct")
    public Result updateProduct(@RequestBody Product product) {

        product.setUpdateTime(new Date());
        return productService.updateProduct(product);
    }

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @ApiOperation("添加商品")
    @PostMapping("/addProduct")
    public Result addGoods(@RequestBody Product product) {

        product.setCreatedTime(new Date());
        product.setUpdateTime(new Date());
        return productService.insertProduct(product);
    }

    /**
     * 删除指定商品
     * @param name
     * @param store_id
     * @return
     */
    @Transactional
    @DeleteMapping("/deleteProduct")
    public Result deleteProduct(String name, @RequestParam(required = false) Integer store_id) {
        return productService.deleteProduct(name, store_id);
    }
}
//    /**
//     * 删除指定商品
//     * @param id
//     * @return
//     */
//    @ApiOperation("删除商品")
//    @DeleteMapping("/deleteProduct/{id}")
//    public Result deleteProduct(@PathVariable Integer id){
//        return productService.deleteProduct(id);
//    }


//    /**
//     * sql根据名字和商店id删除
//     * @param product
//     * @return
//     */
//    @ApiOperation("删除商品")
//    @DeleteMapping("/deleteProduct")
//    public Result deleteProduct(@RequestBody Product product){
//        return productService.deleteProduct(product);
//    }

