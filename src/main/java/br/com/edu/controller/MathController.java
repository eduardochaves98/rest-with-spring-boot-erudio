package br.com.edu.controller;


import br.com.edu.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    MathService mathService;

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {
        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {
        return mathService.subtraction(numberOne, numberTwo);
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {
       return mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {
       return mathService.division(numberOne, numberTwo);
    }
    @RequestMapping("/average/{numberOne}/{numberTwo}")
    public Double average(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {
        return mathService.average(numberOne, numberTwo);
    }

    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number) {
        return mathService.squareRoot(number);
    }


}
