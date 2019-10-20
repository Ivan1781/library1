package application.control;

import application.Entities.Author;
import application.dao.AutDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {

    @GetMapping("/index")
    public String homepage(Model model) throws Exception {
        AutDao autDao = new AutDao();

        Author author = autDao.getById(9);
        model.addAttribute("firstAuthor", author);
        return "index";
    }
}
