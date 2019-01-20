package jan.zemlicka.issue.service;

import jan.zemlicka.issue.model.TextTransformerReq;
import jan.zemlicka.issue.model.TextTransformerRes;

/**
 * Created by jzemlicka on 19.01.2019.
 */


public interface TextService {
    TextTransformerRes transformText(TextTransformerReq entry);
}
