package com.example.r42;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;
import com.amazonaws.util.EC2MetadataUtils;

@RestController
public class SuchController {

	@Value("${suchname}") private String suchName;

	@RequestMapping("/hello")
	public String suchHello(){
		return "hello " + suchName + " From " +  EC2MetadataUtils.getAvailabilityZone() + new Timestamp(System.currentTimeMillis());
	}
}
