package jp.isakmp2spring.booklist.app.bookmanager;


import javax.inject.Inject;

import jp.isakmp2spring.booklist.domain.model.*;
import jp.isakmp2spring.booklist.domain.model.Book;
import jp.isakmp2spring.booklist.app.user.UserForm;
import jp.isakmp2spring.booklist.domain.service.user.UserService;

import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("bookmanager")
public class BookController {
    @Inject
    protected UserService userService;

    @Inject
    protected Mapper beanMapper;

    @RequestMapping(value = "borrow", method = RequestMethod.GET)
    public String getBookList(UserForm form, Model model) {
    	Book fm = new Book();
    	fm.setBookName("ここに本のタイトルを書く");
    	model.addAttribute("fStr",fm);
		model.addAttribute("title","E306~本貸し出しシステム");
		model.addAttribute("message","本貸し出しシステムです。");
        return "bookmanager/borrow";
        
    }
    @RequestMapping(value = "borrow", method = RequestMethod.POST)
    public String postBookList(@ModelAttribute Book fm ,
			Errors result,
    		UserForm form, 
    		Model model) {
		model.addAttribute("title","E306~本貸し出しシステム");
		model.addAttribute("message","本貸し出しシステムです。");
		DataDao dao = new BookDataDaoImpl();
		dao.update(fm);
        return "bookmanager/borrow";
    }
//    @RequestMapping(value = "updateBookList", method = RequestMethod.POST)
//    public String updateBookList(@ModelAttribute Book fm ,
//			Errors result,
//    		UserForm form, 
//    		Model model) {
//		model.addAttribute("title","E306~本貸し出しシステム");
//		model.addAttribute("message","本貸し出しシステムです。");
//		DataDao dao = new BookDataDaoImpl();
//		dao.update(fm);
//        return "bookmanager/borrow";
//    }
}
