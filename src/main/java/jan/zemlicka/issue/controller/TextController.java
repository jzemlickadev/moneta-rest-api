package jan.zemlicka.issue.controller;

import jan.zemlicka.issue.model.SampleEntry;
import jan.zemlicka.issue.service.TextService;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String transformText(@RequestBody @NotNull SampleEntry sampleEntry) {
        return textService.transformText(sampleEntry.getText());
    }


}