package coder.covergirl.splash;

import coder.covergirl.app.MyApplication;
import coder.covergirl.data.bean.GirlsBean;
import coder.covergirl.data.source.GirlsDataSource;
import coder.covergirl.data.source.GirlsResponsitory;

public class SplashPresenter implements SplashContract.Presenter {

    private SplashContract.View mView;
    private GirlsResponsitory mResponsitory;

    public SplashPresenter(SplashContract.View view) {
        mView = view;
        mResponsitory = new GirlsResponsitory();
    }

    @Override
    public void start() {
        mResponsitory.getGirl(new GirlsDataSource.LoadGirlsCallback() {

            @Override
            public void onGirlsLoaded(GirlsBean girlsBean) {
                mView.showGirl(girlsBean.getResults().get(0).getUrl());
                MyApplication.currentGirl = girlsBean.getResults().get(0).getUrl();
            }

            @Override
            public void onDataNotAvailable() {
                mView.showGirl();
            }

        });
    }
}
