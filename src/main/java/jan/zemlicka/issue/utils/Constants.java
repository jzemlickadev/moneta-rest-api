package jan.zemlicka.issue.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.util.Strings;

/**
 * Created by jzemlicka on 19.01.2019.
 */
public final class Constants {

    public static final String EMPTY_STRING = StringUtils.EMPTY;
    public static final String UPPER_CASE_PATTERN = "a|e|i|o|u";
    public static final String SPACE_PATTERN = "\\s+";
    public static final String SPACE = " ";
    public static final String NORMALIZE_PATTERN = "\\p{InCombiningDiacriticalMarks}+";

    private Constants() {
        throw new AssertionError();
    }
}
 
