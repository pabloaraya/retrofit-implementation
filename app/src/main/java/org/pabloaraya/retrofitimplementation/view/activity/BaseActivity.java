package org.pabloaraya.retrofitimplementation.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by pablo on 2/13/18.
 */

public abstract class BaseActivity<P> extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        onView(findViewById(getLayoutId()));
        onPresenter(onPreparePresenter());
    }

    protected P getPresenter() {
        return onPreparePresenter();
    }

    protected abstract int getLayoutId();
    protected abstract void onView(View view);
    protected abstract P onPreparePresenter();
    protected abstract void onPresenter(P presenter);
}
