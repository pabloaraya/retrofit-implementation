package org.pabloaraya.retrofitimplementation.view.presenter.contract;

import org.pabloaraya.retrofitimplementation.view.presenter.BasePresenter;

/**
 * Created by pablo on 2/13/18.
 */

public interface FeatureContract {

    interface View extends BasePresenter.View {
        void changeImage(String image);
    }

    interface Presenter {
        void searchByTerm(String term);
    }
}
