package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class ArticlesWebController {

    @RequestMapping(value = "/articlesWeb", method = GET)
    public String list() {
        return "articlesWeb list";
    }

    @RequestMapping(value = "/articlesWeb/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "articlesWeb detail " + id;
    }

    @RequestMapping(value = "/articlesWeb", method = POST)
    public String create() {
        return "create articlesWeb";
    }

    @RequestMapping(value = "/articlesWeb/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify articlesWeb " + id;
    }

    @RequestMapping(value = "/articlesWeb/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete articlesWeb " + id;
    }
}