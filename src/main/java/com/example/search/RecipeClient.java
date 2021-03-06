package com.example.search;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "recipe", url = "http://192.168.0.29:8080")
@FeignClient(name = "recipe", url = "https://p31ybo8hml.execute-api.ap-northeast-2.amazonaws.com/v1/mypage")
public interface RecipeClient {
	@GetMapping("/recipes/{recipeId}")
	String getRecipeDetail(@PathVariable("recipeId") long recipeId);
}
