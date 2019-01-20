package jan.zemlicka.issue.service;

import jan.zemlicka.issue.utils.Constants;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by jzemlicka on 19.01.2019.
 */


@Service
public class TextServiceImpl implements TextService {

    @Override
    public String transformText(String arg) {
        if (StringUtils.isEmpty(arg)) {
            return Constants.EMPTY_STRING;
        }
        String mergeSpaceText = mergeSpace(arg);
        String cachedText = reverseText(mergeSpaceText);
        return changeUpperCase(cachedText, getPositions4UpperCase(mergeSpaceText));
    }
    
    private String mergeSpace(String arg) {
        // StringUtils.normalizeSpace(arg); - Remove first space
        return arg.replaceAll(Constants.SPACE_PATTERN, Constants.SPACE);
    }

    private String reverseText(String arg) {
        return new StringBuilder(arg).reverse().toString();
    }

    private String changeUpperCase(String arg, List<Integer> indexes) {
        StringBuilder stringBuilder = new StringBuilder(arg.toLowerCase());
        indexes.forEach(position ->
                stringBuilder.setCharAt(position, Character.toUpperCase(stringBuilder.charAt(position)))
        );
        return stringBuilder.toString();
    }

    private List<Integer> getPositions4UpperCase(String arg) {
        // normalize tex for example a = á.
        arg = Normalizer.normalize(arg, Normalizer.Form.NFD)
                .replaceAll(Constants.NORMALIZE_PATTERN, Constants.EMPTY_STRING);
        List<Integer> positions = new ArrayList<>();
        Matcher matcher = Pattern.compile(Constants.UPPER_CASE_PATTERN).matcher(arg);
        while (matcher.find()) {
            positions.add(matcher.start());
        }
        return positions;
    }
}
