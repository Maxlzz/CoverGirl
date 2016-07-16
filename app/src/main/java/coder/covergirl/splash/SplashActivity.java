package coder.covergirl.splash;

import android.view.View;

import coder.mylibrary.base.AppActivity;
import coder.mylibrary.base.BaseFragment;
import coder.covergirl.R;

public class SplashActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return SplashFragment.getInstance();
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.splash_fragment;
    }

    @Override
    public void onClick(View v) {

    }
}
