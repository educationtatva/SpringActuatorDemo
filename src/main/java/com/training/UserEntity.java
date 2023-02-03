package com.training;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class UserEntity {
	String id ="1";
	String name="Anil Bajpai";
	String userName ="@anil";
	String email = "anil@ab.com";
	String pincode ="112233";
}
