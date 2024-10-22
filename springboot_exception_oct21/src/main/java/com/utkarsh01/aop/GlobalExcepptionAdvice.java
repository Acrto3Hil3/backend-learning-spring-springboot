package com.utkarsh01.aop;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExcepptionAdvice {
	
	@ExceptionHandler(value = RuntimeException.class)
	public String handleRuntimeException(RuntimeException ex,Model model) {
		log.info("Welcome to RuntimeException..");
		model.addAttribute("ki", "Runtime exception creted succefully");
		model.addAttribute("errorMsgKey", ex.getMessage());
		return "error";
	}
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(NullPointerException ex,Model model) {
		log.info("Welcome to NullPointerException..");
		model.addAttribute("ki1", "NullPointer exception creted succefully");
		model.addAttribute("errorMsgKey", ex.getMessage());
		return "error";
	}
	@ExceptionHandler(value = NumberFormatException.class)
	public String handleNumberFormatException(NumberFormatException ex,Model model) {
		log.info("Welcome to NumberFormatException..");
		model.addAttribute("ki2", "NumberFormat exception creted succefully");
		model.addAttribute("errorMsgKey", ex.getMessage());
		return "error";
	}
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ex,Model model) {
		log.info("Welcome to Exception..");
		model.addAttribute("ki3","Parent exception creted succefully");
		model.addAttribute("errorMsgKey", ex.getMessage());
		return "error";
	}
}
