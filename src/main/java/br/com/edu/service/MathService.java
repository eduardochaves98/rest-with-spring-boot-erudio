package br.com.edu.service;

import org.springframework.stereotype.Service;

import static br.com.edu.business.MathBusiness.convertToDouble;
import static br.com.edu.business.MathBusiness.isNumeric;

@Service
public class MathService {

    public Double sum(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        if (numberTwo.equals("0")) throw new UnsupportedOperationException("Division by zero is not allowed");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public Double average(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String number) {
        if (!isNumeric(number)) throw new UnsupportedOperationException("Please set a numeric value");
        return Math.sqrt(convertToDouble(number));
    }
}
