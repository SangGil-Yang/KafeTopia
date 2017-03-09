package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.ReviewBoardDAO;
import model.domain.dto.ReviewBoard;

public class ReviewBoardController {
	@Controller
	public class ProbonoSubController {
		//예외 전담 처리 로직의 메소드
		@ExceptionHandler(Exception.class)
		public String exceptionProcess(Exception e){
			return "redirect:/showError.jsp?errorMsg=" + e.getMessage();
		}

		//리뷰 작성 화면[WriteReview.jsp], 리뷰 작성완료 누르면 ReviewBoard.jsp로 넘어가야함
		@RequestMapping(value="write")
		protected ModelAndView write(@RequestParam(value="author") String author,
				@RequestParam(value="cafeid") String cafeid, @RequestParam(value="title") String title,
				@RequestParam(value="content") String content, @RequestParam(value="img") String img) throws Exception {

			ModelAndView mv = new ModelAndView();
			if(author == null || cafeid == null || title.trim().length() == 0 || content.trim().length() == 0){
				mv.setViewName("WriteReview");
			}
			
			boolean result = ReviewBoardDAO.writeContent(new ReviewBoard(author, cafeid, title, content, img));
			if(result){
				mv.setViewName("ReviewBoard");
				//	mv.addObject("activist", activist);
			}
			return mv;
		}
		
		//ㄹㅣ뷰 리스트 출력 화면[ReviewBoard.jsp]
		@RequestMapping(value="list")
		public ModelAndView list() throws Exception {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ReviewBoard");
			mv.addObject("list", ReviewBoardDAO.getAllContents());
			return mv;
		}
		
	}

}

