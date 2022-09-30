package com.Final.Year.controllers;

import com.Final.Year.models.PostModel;
import com.Final.Year.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String getPosts(Model model) {
        model.addAttribute("post", postService.getAllPosts());
        return "posts";
    }

    @GetMapping("/posts/new")
    public String newPost(Model model) {
        PostModel post = new PostModel();
        model.addAttribute("post", post);
        return "post";
    }

    @PostMapping("/posts")
    public String saveProduct(@ModelAttribute("post") PostModel post, RedirectAttributes redirAttrs) {
        postService.savePost(post);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/posts";
    }

    @GetMapping("/posts/edit/{id}")
    public String editProduct(@PathVariable long id, Model model) {
        model.addAttribute("post", postService.getPost(id));
        return "posts";
    }

    @PostMapping("/posts/{id}")
    public String updateProduct(@PathVariable long id, @ModelAttribute("post") PostModel post, RedirectAttributes redirAttrs) {
        PostModel existingPost = postService.getPost(id);

        existingPost.setTitle(post.getTitle());
        existingPost.setDescription(post.getDescription());
        existingPost.setFarmer(post.getFarmer());
        existingPost.setProduct(post.getProduct());
        existingPost.setPrice(post.getPrice());
        existingPost.setLocation(post.getLocation());

        postService.updatePost(existingPost);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/posts";
    }

    @GetMapping("/posts/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        postService.deletePostById(id);
        return "redirect:/posts";
    }
}
