package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    //input-output-input(前に入力した値を表示）

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        if (previous != null && !previous.isEmpty()) { //追加　cuz リンクを押した後に、input.html戻った時に、前回入力された値は「abc」 というのがでていない、
            model.addAttribute("previous", previous); //追加
        }

        return "input";
}
}