package domain;

public interface IAddWordInteractor {
    TranslatePrint getTranslate(String text);

    void addWord(String word, String translate);
}
