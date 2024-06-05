package people.peopleman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import people.peopleman.repository.MemberRepository;
import people.peopleman.repository.MemberRepositoryImpl;


@Controller
public class MemberController {

    MemberRepository memberRepository = new MemberRepository();

    @GetMapping("join")
    public String join (){
        return "join";
    }

    @PostMapping("input")
    public void input(String name){
        memberRepository.save(name);
    }

}
