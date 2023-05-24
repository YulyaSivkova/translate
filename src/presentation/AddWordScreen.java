package presentation;

import domain.TranslatePrint;

public class AddWordScreen implements IAddWord.View {
    String word;
    String translate;
    IAddWord.Presenter presenter = new AddWordPresenter();

    public void onStart() {
        presenter.attacheView(this);
    }

    public void onTextChange(String text) {
        presenter.onTextChange(text);
        Utils.convertWord(text);
    }

    public void onAddBtnClick() {
        presenter.addWord(word, translate);
        Utils.convertWord(word);
    }

    @Override
    public void showTranslate(TranslatePrint translatePrint) {
        System.out.println(translatePrint);
    }
}
