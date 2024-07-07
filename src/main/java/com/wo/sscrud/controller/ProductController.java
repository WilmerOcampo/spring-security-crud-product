package com.wo.sscrud.controller;

import com.wo.sscrud.entity.Category;
import com.wo.sscrud.entity.Product;
import com.wo.sscrud.service.ICategoryService;
import com.wo.sscrud.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService productService;
    private final ICategoryService categoryService;

    @GetMapping
    public String products(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/products";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("product", new Product());
        return "product/product";
    }

    @PostMapping("/save")
    public String save(@Validated Product product, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "product/product";
        }
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Product> optionalProduct = productService.findById(id);
        List<Category> categories = categoryService.findAll();
        if (optionalProduct.isPresent()) {
            model.addAttribute("categories", categories);
            model.addAttribute("product", optionalProduct.get());
            return "product/product";
        } else {
            return "redirect:/products";
        }
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        Optional<Product> optionalProduct = productService.findById(id);
        if (optionalProduct.isPresent()) {
            model.addAttribute("product", optionalProduct.get());
            return "product/detail";
        } else {
            return "redirect:/products";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteById(id);
        return "redirect:/products";
    }
}
