package jan.zemlicka.issue.controller;

import jan.zemlicka.issue.model.TextTransformerReq;
import jan.zemlicka.issue.model.TextTransformerRes;
import jan.zemlicka.issue.service.TextService;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jzemlicka on 20.01.2019.
 */

@RestController
@RequestMapping("/api")
public class TextController {

    @Autowired
    TextService textService;

    @RequestMapping(value = "/transformText", method = RequestMethod.POST)
    
    public @ResponseBody TextTransformerRes transformText(@RequestBody @NotNull TextTransformerReq textTransformerReq) {
        return textService.transformText(textTransformerReq);
    }


}