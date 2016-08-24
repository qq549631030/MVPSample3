package cn.huangx.mvpsample3.presenter;

import cn.huangx.mvpsample3.base.Presenter;

/**
 * Created by huangxiang on 16/8/19.
 */
public interface PresenterFactory<T extends Presenter> {
    T create();
}
