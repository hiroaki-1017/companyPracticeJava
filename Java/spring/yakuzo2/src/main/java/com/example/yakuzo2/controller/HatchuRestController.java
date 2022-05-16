package com.example.yakuzo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yakuzo2.data.HatchuData;
import com.example.yakuzo2.repository.HatchuRepository;
import com.example.yakuzo2.repository.YakuhinRepository;

@RestController
public class HatchuRestController {

	@Autowired
	HatchuRepository hr;

	@Autowired
	YakuhinRepository yr;

	@PostMapping("/hatchugetpages")
	public int getPages(HatchuData hd,Model model) {
		//System.out.println(model.toString());

		return hr.getPages(hd);
	}

	@PostMapping("/t-sansho-getpage")
	public int t_sansho_getPages(HatchuData hd,Model model){
		return hr.t_sansho_getPages(hd);
	}

	@PostMapping("/y-sansho-getpage")
	public int y_sansho_getPages(HatchuData hd,Model model){
		//System.out.println("取引先参照：" + model.toString());
		return yr.y_sansho_getPages(hd);
	}

}