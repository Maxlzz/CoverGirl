package coder.covergirl.data.source.remote;

import coder.covergirl.data.bean.GirlsBean;
import coder.covergirl.data.source.GirlsDataSource;
import coder.covergirl.http.GirlsRetrofit;
import coder.covergirl.http.GirlsService;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by oracleen on 2016/6/29.
 */
public class RemoteGirlsDataSource implements GirlsDataSource {

    @Override
    public void getGirls(int page, int size, final LoadGirlsCallback callback) {
        GirlsRetrofit.getRetrofit()
                .create(GirlsService.class)
                .getGirls("福利", size, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GirlsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onDataNotAvailable();
                    }

                    @Override
                    public void onNext(GirlsBean girlsBean) {
                        callback.onGirlsLoaded(girlsBean);
                    }
                });
    }

    @Override
    public void getGirl(final LoadGirlsCallback callback) {
        getGirls(1, 1, callback);
    }
}
