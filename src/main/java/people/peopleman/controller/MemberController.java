package people.peopleman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import people.peopleman.repository.MemberRepository;


@Controller
public class MemberController {

    MemberRepository memberRepository = new MemberRepository();

    @GetMapping("join")
    public String join (){
        return "join";
    }

    @PostMapping("input")
    public String input(String name){
        memberRepository.save(name);
        return "redirect:/";
    }

    @GetMapping("search")
    public String search (Model model){

        model.addAttribute("members", memberRepository.memberList());

        return "memberList";
    }




}
