package MvcPractice;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView hello() {

		ModelAndView Modelview = new ModelAndView("HelloPage");

		return Modelview;
	}

	@RequestMapping(value = "/submission.html", method = RequestMethod.POST)
	public ModelAndView submission(@Valid @ModelAttribute("student1") studentDetails student1, BindingResult Result) {

		if (Result.hasErrors()) {
			ModelAndView Modelview = new ModelAndView("HelloPage");
			return Modelview;
		}

		ModelAndView Modelview = new ModelAndView("submit");
		return Modelview;
	}

	@ModelAttribute
	public void commonobject(Model model1) {
		model1.addAttribute("msg", "Welome to Khan Page!");

	}
	
	public void binder(WebDataBinder bind) {
		
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
		bind.registerCustomEditor(Date.class,"DOB" , new CustomDateEditor(dt,false));
	}

}
