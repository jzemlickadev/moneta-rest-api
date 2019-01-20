package jan.zemlicka.issue.model;

/**
 * Created by jzemlicka on 19.01.2019.
 */
public class TextTransformerReq {

    public TextTransformerReq(final String input) {
        this.input = input;
    }

    private String input;
    
    public String getInput() {
        return input;
    }

    public void setInput(final String input) {
        this.input = input;
    }
}
