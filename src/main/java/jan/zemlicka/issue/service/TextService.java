package jan.zemlicka.issue.service;

import jan.zemlicka.issue.model.TextTransformerReq;
import jan.zemlicka.issue.model.TextTransformerRes;

/**
 * Created by jzemlicka on 19.01.2019.
 */

public interface TextService {

    /**
     * Transform text according task 
     *
     * @param entry is TextTransformerReq DTO for rest json input  
     * @return TextTransformerRes DTO with String output where is transformed text
     */
    TextTransformerRes transformText(TextTransformerReq entry);
}
