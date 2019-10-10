package com.cssl.controller;

import com.cssl.pojo.*;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;import javax.servlet.http.HttpSession;


/*
 * 通往个个页面;
 */
@Controller
public class NikeControll {

    @Autowired
    NikeClientService nike_ClientService;

    //首页;
    @RequestMapping("/Nikefront")
    public String frontIndex(int npc_two_id,
                             Model model,
                             HttpSession session){

        //获取用户编号;
        session.setAttribute("uid",1);

        //查询8件商品信息;
        System.out.println("8081:Nikefront-->NikeControll-->productLimit");
        List<Nike_product> productList=nike_ClientService.productLimit(npc_two_id);
        System.out.println("npc_two_id:"+npc_two_id);
        for (Nike_product product:productList){ System.out.println("product:"+product); }

        //根据用户编号查询购物车;
        System.out.println("8081:Nikefront-->NikeControll-->trolleyUn_id");
        List<Nike_trolley> trolleyList=nike_ClientService.trolleyUn_id(Integer.parseInt(session.getAttribute("uid").toString()));
        /*for (Nike_trolley trolley:trolleyList){ System.out.println("trolley:"+trolley); }*/

        //查询颜色所有信息;
        System.out.println("8081:Nikefront-->NikeControll-->colorFindAll");
        List<Nike_color> colorList=nike_ClientService.colorFindAll();
        /*for (Nike_color color:colorList){ System.out.println("color:"+color); }*/

        //根据用户查询购物车数量
        session.setAttribute("trolleyCount",trolleyList.size());
        session.setAttribute("trolleyList",trolleyList);

        //商品数量
        model.addAttribute("productCount",productList.size());

        model.addAttribute("productList",productList);
        model.addAttribute("colorList",colorList);

        return "index";
    }

    //商品详情页面;
    @RequestMapping("/productDetail")
    public String productDetails(int np_id,Model model,HttpSession session){

        //查询单个商品;
        Nike_product product=nike_ClientService.productSingle(np_id);
        //System.out.println("product:"+product);

        //查询有关用户喜欢的商品;
        List<Nike_product> userLike=nike_ClientService.userLikeProduct(product.getNpc_two_id(),product.getNp_id());
        session.setAttribute("userLike",userLike);
        //查询颜色所有信息;
        System.out.println("8081:Nikefront-->NikeControll-->colorFindAll");
        List<Nike_color> userColorList=nike_ClientService.colorFindAll();
        session.setAttribute("userColorList",userColorList);

        //根据商品编号查询颜色;
        List<Nike_color> colorList=nike_ClientService.colorSingle(np_id);
        //for (Nike_color color:colorList){System.out.println("color:"+color);}

        List<Nike_image> imagesList=null;
        List<Nike_size> sizeList=null;
        if(colorList.size()!=0){
            //根据颜色编号查询图片;
            imagesList=nike_ClientService.imageList(colorList.get(0).getNc_id());
            //for (Nike_image image:imagesList){System.out.println("image:"+image);}

            //根据颜色编号查询尺码;
            sizeList=nike_ClientService.sizeList(colorList.get(0).getNc_id());
            //for (Nike_size size:sizeList){System.out.println("size:"+size);}

        }

        model.addAttribute("imagesList",imagesList);
        model.addAttribute("sizeList",sizeList);
        model.addAttribute("product",product);
        model.addAttribute("colorList",colorList);

        return "product-detail";
    }

    //商品详情页面切换颜色图片;
    @RequestMapping("/colorSwitch")
    public String colorSwitch (int np_id,int nc_id,Model model){

        //查询单个商品;
        Nike_product product=nike_ClientService.productSingle(np_id);
        //System.out.println("product:"+product);

        //根据商品编号查询颜色;
        List<Nike_color> colorList=nike_ClientService.colorSingle(np_id);
        //for (Nike_color color:colorList){System.out.println("color:"+color);}

        //根据颜色编号查询图片;
        List<Nike_image> imagesList=nike_ClientService.imageList(nc_id);
        //for (Nike_image image:imagesList){System.out.println("image:"+image);}

        //根据颜色编号查询尺码;
        List<Nike_size> sizeList=nike_ClientService.sizeList(nc_id);
        //for (Nike_size size:sizeList){System.out.println("size:"+size);}

        model.addAttribute("product",product);
        model.addAttribute("colorList",colorList);
        model.addAttribute("imagesList",imagesList);
        model.addAttribute("sizeList",sizeList);

        return "product-detail";
    }

    //鞋子尺码表;
    @RequestMapping("/sizeTable")
    public String sizeTable(){

        return "shoe-size";
    }

    //登陆页面;
    @RequestMapping("/log")
    public String logMethod(){

        return "login";
    }

}
