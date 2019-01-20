package jan.zemlicka.issue;

import jan.zemlicka.issue.model.TextTransformerReq;
import jan.zemlicka.issue.service.TextService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jzemlicka on 20.01.2019.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TextTransformerTest {

    public static final String SAMPLE_ENTRY = "Ahoj, jak se máš?";
    public static final String RIGHT_RESULT = "?šÁm es kaj ,jOha";
    @Autowired
    TextService textService;

    /*
     * Load context and call text service for result  
     * Maybe this is overhead, i can use Mockito
     */
    @Test
    public void TextTransformerTest() {
        textService.transformText(new TextTransformerReq());
       // assertEquals(resultText, RIGHT_RESULT);
    }

}