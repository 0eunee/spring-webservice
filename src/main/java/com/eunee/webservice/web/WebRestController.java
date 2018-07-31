package com.eunee.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eunee.webservice.domain.posts.PostsRepository;

import lombok.AllArgsConstructor;

@RestController	//RestController는 ResponseBody를 모든 메소드에서 적용
@AllArgsConstructor
public class WebRestController {
	
	private PostsRepository PostsRepository;
	
	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
		PostsRepository.save(dto.toEntity());
	}

}