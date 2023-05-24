package domain.mapper;

import domain.TranslatePrint;
import entity.TranslateResult;

public class TranslateMapper extends IMapper<TranslateResult, TranslatePrint> {

    @Override
    public TranslatePrint mapImpl(TranslateResult translateResult) {
        return new TranslatePrint(translateResult.getWord(), translateResult.getTranslate());
    }
}
