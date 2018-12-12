package com.debuggor.mockinterview.interview.controller;

import com.debuggor.mockinterview.common.constant.MockConstant;
import com.debuggor.mockinterview.interview.bean.Interviewer;
import com.debuggor.mockinterview.interview.service.InterviewerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 面试官controller
 */
@Controller
@RequestMapping("/interviewer")
public class InterviewerController {

    Logger logger = LoggerFactory.getLogger(InterviewerController.class);

    @Autowired
    private InterviewerService interviewerService;

    @RequestMapping("/login")
    public String tologin() {
        return "front/user/interviewer/login";
    }

    /**
     * 面试官登录
     *
     * @return
     */
    @RequestMapping("/loginAction")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model, HttpSession session,
                        HttpServletRequest request) {
        String result = interviewerService.login(email, password);
        if (!MockConstant.LOGIN_SUCCESS.equals(result)) {
            model.addAttribute("msg", result);
            return "front/user/interviewer/login";
        }
        Interviewer interviewer = interviewerService.getInterviewerByEmail(email);
        String requestLocalAddr = request.getLocalAddr();
        logger.info(interviewer.getUsername() + "于" + new Date() + "在" + requestLocalAddr + "登录！");
        session.setAttribute("interviewer", interviewer);
        return "redirect:/";
    }

    @RequestMapping("/register")
    public String toRegister() {
        return "front/user/interviewer/register";
    }

    @RequestMapping("/registerAction")
    public String register(Interviewer interviewer, Model model) {

        return "";
    }
}
