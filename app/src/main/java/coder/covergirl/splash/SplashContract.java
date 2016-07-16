package coder.covergirl.splash;

import coder.covergirl.BasePresenter;
import coder.covergirl.BaseView;

/**
 * Created by oracleen on 2016/6/28.
 */
public interface SplashContract {

    interface View extends BaseView<Presenter> {
        void showGirl(String girlUrl);

        void showGirl();
    }

    interface Presenter extends BasePresenter {

    }

}
