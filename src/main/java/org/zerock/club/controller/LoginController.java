package org.zerock.club.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.club.security.dto.ClubAuthMemberDTO;
import org.zerock.club.security.service.ClubUserDetailsService;

@Log4j2
@Controller
@RequiredArgsConstructor
public class LoginController {

//    private final ClubUserDetailsService clubUserDetailsService;
//    private final PasswordEncoder passwordEncoder;

//    @PostMapping("/login")
//    public String loginForm (String username, String password) {
//        String resultUrl = "";
//       log.info("custom login...........................");
//        ClubAuthMemberDTO clubAuthMemberDTO = (ClubAuthMemberDTO)
//                clubUserDetailsService.loadUserByUsername(username);
//        log.info("clubAuthMemberDTO: " + clubAuthMemberDTO);
//        boolean passwordResult = passwordEncoder.matches(
//                password, clubAuthMemberDTO.getPassword());
//        if(passwordResult){
//            resultUrl = "redirect:/";
//        }else{
//            resultUrl = "redirect:/sample/login";
//        }
//        return resultUrl;
//    }

}
