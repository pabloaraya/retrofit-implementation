package org.pabloaraya.retrofitimplementation.view.presenter;

import org.pabloaraya.retrofitimplementation.data.repository.Repository;
import org.pabloaraya.retrofitimplementation.view.presenter.contract.FeatureContract;

/**
 * Created by pablo on 2/13/18.
 */

public class FeaturePresenter extends BasePresenter<FeatureContract.View> implements FeatureContract.Presenter {

    private Repository repository;

    public FeaturePresenter(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void searchByTerm(String term) {
        getView().showLoading();
        repository.getTrackEntityListByTerm(term);
    }
}
