package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.CafeDAO;

@Controller
public class OrderController {
	
	// cafe 목록 조회
	@RequestMapping(value="order/cafeAll.do", method=RequestMethod.GET)
	public ModelAndView cafeAll() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("cafeAll", CafeDAO.getAllCafe());
		mv.setViewName("CafeChoice");
		
		return mv;
	}
	
	// type 별 메뉴 조회
	@RequestMapping(value="order/menuAll.do", method=RequestMethod.GET)
	public ModelAndView menuAll(@RequestParam("type") String type) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("cafeMenu", CafeDAO.getAllMenu(type));
		mv.setViewName("Order");
		
		return mv;
	}
	
	// cafe 별 타입 조회
	@RequestMapping(value="order/typeAll.do", method=RequestMethod.GET)
	public ModelAndView typeAll(@RequestParam("cafeName") String cafeName) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("menuType", CafeDAO.getAllType(cafeName));
		mv.setViewName("Order");
		
		return mv;
	}
	
	// topping 조회
	@RequestMapping(value="order/toppingAll.do", method=RequestMethod.GET)
	public ModelAndView toppingAll() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("topping", CafeDAO.getAllTopping());
		mv.setViewName("Order");
		
		return mv;
	}
}
