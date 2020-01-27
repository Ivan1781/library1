package application.control;

import application.Entities.Author;
import application.dao.AutDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.stereotype.Controller

public class Controller {

    @GetMapping("/index/{id}")
    public String showById(Model model, @PathVariable("id")int id) throws Exception {
        AutDao autDao = new AutDao();
        List<Author> authors = autDao.getAll();
        model.addAttribute("firstAuthor", authors.get(id));
        return "index";
    }
    @GetMapping("/authors")
    public String showAvailable(Model model) throws Exception {
        AutDao autDao = new AutDao();
        List<Author> authors = autDao.getAll();
        model.addAttribute("allAvailable", authors);
        return "authors";
    }
}
