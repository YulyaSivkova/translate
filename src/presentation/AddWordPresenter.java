package presentation;

import domain.AddWordInteractorImpl;
import domain.IAddWordInteractor;
import domain.TranslatePrint;
import entity.YandexTranslateApi;
import org.jetbrains.annotations.Nullable;
import presentation.base.BasePresentor;

public class AddWordPresenter extends BasePresentor implements IAddWord.Presenter {
    @Nullable
    IAddWord.View attacheView;
    IAddWordInteractor interactor;

    public AddWordPresenter() {
        interactor = new AddWordInteractorImpl(new YandexTranslateApi());
    }

    @Override
    public void attacheView(IAddWord.View view) {
        this.attacheView = view;
    }

    @Override
    public void onTextChange(String text) {
        TranslatePrint translatePrint = interactor.getTranslate(text);
        attacheView.showTranslate(translatePrint);
    }

    @Override
    public void addWord(String word, String translate) {
        interactor.addWord(word, translate);
    }
}
