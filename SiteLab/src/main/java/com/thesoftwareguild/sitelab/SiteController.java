package com.thesoftwareguild.sitelab;

import java.io.IOException;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteController {

    public SiteController() {
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping(value ="/luckyEntry", method = RequestMethod.GET)
    public String displayLuckySevens() {
        return "luckyEntry";
    }

    @RequestMapping(value = "/factorizer", method = RequestMethod.GET)
    public String displayFactorizer() {
        return "factorizer";
    }

    @RequestMapping(value = "/intCalc", method = RequestMethod.GET)
    public String displayInterestCalculator() {
        return "intCalc";
    }
    
    @RequestMapping(value = "/tipEntry", method = RequestMethod.GET)
    public String displayTipCalculator() {
        return "tipEntry";
    }

    @RequestMapping(value = "/luckyResult", method = RequestMethod.POST)
    public String displayLuckySevensResult() {
        return "luckyResult";
    }
    
    @RequestMapping(value = "/factorizerOutput", method = RequestMethod.POST)
    public String displayFactorizerOutput() {
        return "factorizerOutput";
    }
    
    @RequestMapping(value = "/results", method = RequestMethod.POST)
    public String displayIntCalcResults() {
        return "results";
    }
    
    @RequestMapping(value = "/tipOutput", method = RequestMethod.POST)
    public String displayTipCalcResults() {
        return "tipOutput";
    }
    
}
