package org.pabloaraya.retrofitimplementation.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.pabloaraya.retrofitimplementation.R;
import org.pabloaraya.retrofitimplementation.data.repository.FeatureRepository;
import org.pabloaraya.retrofitimplementation.data.repository.datasource.factory.FeatureDataSourceFactory;
import org.pabloaraya.retrofitimplementation.view.presenter.FeaturePresenter;
import org.pabloaraya.retrofitimplementation.view.presenter.contract.FeatureContract;

/**
 * Created by pablo on 2/13/18.
 */

public class MainActivity extends BaseActivity<FeaturePresenter> implements FeatureContract.View {

    private ImageView imageView;
    private EditText editText;
    private Button button;

    @Override
    protected FeaturePresenter onPreparePresenter() {
        FeatureDataSourceFactory featureDataSourceFactory = new FeatureDataSourceFactory();
        FeatureRepository featureRepository = new FeatureRepository(featureDataSourceFactory);
        return new FeaturePresenter(featureRepository);
    }

    @Override
    protected void onPresenter(FeaturePresenter presenter) {
        presenter.attachView(this);
    }

    @Override
    protected void onView(View view) {
        imageView = view.findViewById(R.id.imageViewTerm);
        editText = view.findViewById(R.id.editTextTerm);
        button = view.findViewById(R.id.buttonSearch);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void changeImage(String image) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }
}
