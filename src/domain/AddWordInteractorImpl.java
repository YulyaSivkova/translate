package domain;

import domain.mapper.TranslateMapper;
import entity.DataBaseRepositoryImp;
import entity.IDataBaseRepository;
import entity.ITranslateApiService;


public class AddWordInteractorImpl implements IAddWordInteractor {
    ITranslateApiService apiService;
    IDataBaseRepository dataBaseRepository;
    TranslateMapper mapper;

    public AddWordInteractorImpl(ITranslateApiService apiService) {
        this.apiService = apiService;
        mapper = new TranslateMapper();
        dataBaseRepository = new DataBaseRepositoryImp();
    }

    @Override
    public TranslatePrint getTranslate(String text) {
        return mapper.map(apiService.getTranslate(text));
    }

    @Override
    public void addWord(String word, String translate) {
        dataBaseRepository.saveWord(word, translate);
    }
}
