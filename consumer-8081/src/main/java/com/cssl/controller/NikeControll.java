package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.pojo.Nike_product;
import com.cssl.pojo.Nike_trolley;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;

/*
 * 通往个个页面;
 */
@Controller
public class NikeControll {

    @Autowired
    NikeClientService nike_ClientService;

    //首页;
    @RequestMapping("/Nikefront")
    public String frontIndex(@RequestParam(defaultValue = "0") int npc_two_id,
                             @RequestParam(defaultValue = "0") int uid,
                             Model model,
                             HttpSession session){

        //获取用户编号;
        session.setAttribute("uid",1);

        //查询所有商品信息;
        System.out.println("id:"+npc_two_id);
        System.out.println("8081:Nikefront-->NikeControll-->productLimit");
        List<Nike_product> productList=nike_ClientService.productLimit(npc_two_id);
        /*for (Nike_product product:productList){ System.out.println("product:"+product); }*/

        //根据用户编号查询购物车;
        System.out.println("8081:Nikefront-->NikeControll-->trolleyUn_id");
        List<Nike_trolley> trolleyList=nike_ClientService.trolleyUn_id(Integer.parseInt(session.getAttribute("uid").toString()));
        /*for (Nike_trolley trolley:trolleyList){ System.out.println("trolley:"+trolley); }*/

        //查询颜色所有信息;
        System.out.println("8081:Nikefront-->NikeControll-->colorFindAll");
        List<Nike_color> colorList=nike_ClientService.colorFindAll();
        /*for (Nike_color color:colorList){ System.out.println("color:"+color); }*/


        //根据用户查询购物车数量
        model.addAttribute("trolleyCount",trolleyList.size());
        //商品数量
        model.addAttribute("productCount",productList.size());

        model.addAttribute("productList",productList);
        model.addAttribute("trolleyList",trolleyList);
        model.addAttribute("colorList",colorList);

        return "index";
    }

    @RequestMapping("/kdb")
    public String method(){

        return "kk";
    }

}
