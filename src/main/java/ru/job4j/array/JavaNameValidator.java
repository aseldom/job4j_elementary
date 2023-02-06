package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean res = !name.isEmpty();
        for (int code = 0; code < name.length(); code++) {
            int charCode = name.codePointAt(code);
            if (code == 0) {
                res = isLowerLatinLetter(charCode);
            } else {
                res = isSpecialSymbol(charCode) || isUpperLatinLetter(charCode) || isLowerLatinLetter(charCode)
                      || isDigit(charCode);
            }
            if (!res) {
                break;
            }
        }
        return res;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return isLowerCase(code);
    }
}