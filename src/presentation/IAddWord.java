package presentation;

import domain.TranslatePrint;
import presentation.base.BaseView;

public interface IAddWord {
    interface Presenter {
        void attacheView(View view);

        void onTextChange(String text);

        void addWord(String word, String translate);
    }

    interface View extends BaseView {

        void showTranslate(TranslatePrint translatePrint);
    }
}
