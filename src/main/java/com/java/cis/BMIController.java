package com.java.cis;


import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class BMIController {

    @PostMapping("/bmi")
    public ModelAndView calculateBMI(@RequestParam("height") double height,
                                     @RequestParam("weight") double weight) {
        double bmi = calculateBMIValue(height, weight);
        ModelAndView modelAndView = new ModelAndView("bmiResult");
        modelAndView.addObject("bmi", bmi);
        return modelAndView;
    }

    private double calculateBMIValue(double height, double weight) {
        return (weight / (height * height)) * 703;
    }
}

