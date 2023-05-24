package entity;

public class TranslateResult {
    private int id;
    private String word;
    private String translate;
    private String language;

    public TranslateResult(int id, String word, String translate, String language) {
        this.id = id;
        this.word = word;
        this.translate = translate;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
