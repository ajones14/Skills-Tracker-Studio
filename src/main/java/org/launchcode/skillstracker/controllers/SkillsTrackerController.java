package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTrackerController {

    public String createMessage(String name, String firstFav, String secFav, String thirdFav) {
        return "<html><body>" +
                name + "<br>" +
                "1. " + firstFav +
                "<br>2. " + secFav +
                "<br>3. " + thirdFav +
                "</body></html>";
    }

    @PostMapping("aform")
    public String formReturn(@RequestParam String name, @RequestParam String firstFav,
                             @RequestParam String secFav, @RequestParam String thirdFav) {
        return this.createMessage(name, firstFav, secFav, thirdFav);
    }

    @GetMapping
    public String skillsGreeting() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='aform'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label>My favorite language:</label><br>" +
                "<select name='firstFav'><option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option></select><br>" +
                "<label>My second favorite language:</label><br>" +
                "<select name='secFav'><option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option></select><br>" +
                "<label>My third favorite language:</label><br>" +
                "<select name='thirdFav'><option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option></select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
