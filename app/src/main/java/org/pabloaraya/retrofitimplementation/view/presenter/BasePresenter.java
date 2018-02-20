package org.pabloaraya.retrofitimplementation.view.presenter;

/**
 * Created by pablo on 2/13/18.
 */

public abstract class BasePresenter<V extends BasePresenter.View> {

    private V view;

    protected V getView() {
        return view;
    }

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        this.view = null;
    }

    public interface View {

        void showLoading();

        void hideLoading();

        void showError();
    }
}
