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
        if (StringUtils.isBlank(arg)) {
            return Constants.EMPTY_STRING;
        }
        String mergeSpaceText = normalizeSpace(arg);
        StringBuilder cachedTextBuilder = reverseAndLowerCaseText(mergeSpaceText);
        return changeUpperCase(cachedTextBuilder, getPositionsForUpperCase(mergeSpaceText));
    }

    private String normalizeSpace(String arg) {
        // StringUtils.normalizeSpace(arg); - Remove first space
        return arg.replaceAll(Constants.SPACE_PATTERN, Constants.SPACE);
    }

    private StringBuilder reverseAndLowerCaseText(String arg) {
        return new StringBuilder(arg.toLowerCase()).reverse();
    }

    private String changeUpperCase(StringBuilder stringBuilder, List<Integer> indexes) {
        indexes.forEach(position ->
                stringBuilder.setCharAt(position, Character.toUpperCase(stringBuilder.charAt(position)))
        );
        return stringBuilder.toString();
    }

    private List<Integer> getPositionsForUpperCase(String arg) {
        // normalize tex for example a = á.
        String normalizedText = removeAccent(arg);
        List<Integer> positions = new ArrayList<>();
        Matcher matcher = Pattern.compile(Constants.UPPER_CASE_PATTERN).matcher(normalizedText);
        while (matcher.find()) {
            positions.add(matcher.start());
        }
        return positions;
    }

    private String removeAccent(final String arg) {
        return Normalizer.normalize(arg, Normalizer.Form.NFD)
                .replaceAll(Constants.NORMALIZE_PATTERN, Constants.EMPTY_STRING);
    }
}
