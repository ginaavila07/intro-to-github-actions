package edu.cmu.cc.project2.controller;

import edu.cmu.cc.project2.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(Model model) {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public ModelAndView getOperation(@RequestParam(name = "firstNumber") Long first,
                                     @RequestParam(name = "secondNumber", required = false) Long second,
                                     @RequestParam(name = "operation") int operation, Model model) {
        double result = 0L;
        switch (operation) {
            case 1:
                result = calculatorService.add(first, second);
                break;
            case 2:
                result = calculatorService.subtract(first, second);
                break;
            case 3:
                result = calculatorService.multiply(first, second);
                break;
            case 4:
                result = calculatorService.divide(first, second);
                break;
            case 5:
                result = calculatorService.fibonacci(first);

        }
        model.addAttribute("result", result);
        return new ModelAndView("index");
    }

    @PostMapping("/calculate")
    public ModelAndView postOperation(Model model) {
        return new ModelAndView();
    }
}
