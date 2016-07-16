package coder.covergirl.home;

import java.util.List;

import coder.covergirl.BasePresenter;
import coder.covergirl.BaseView;
import coder.covergirl.data.bean.GirlsBean;

public interface GirlsContract {

    interface View extends BaseView {
        void refresh(List<GirlsBean.ResultsEntity> datas);

        void load(List<GirlsBean.ResultsEntity> datas);

        void showError();

        void showNormal();
    }

    interface Presenter extends BasePresenter {
        void getGirls(int page, int size, boolean isRefresh);
    }
}
