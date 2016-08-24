package cn.huangx.mvpsample3;


import cn.huangx.mvpsample3.model.FakeUserModel;
import cn.huangx.mvpsample3.model.IUserModel;

/**
 * Created by huangx on 2016/8/24.
 */
public class ModelManager {
    public static IUserModel provideUserModel() {
        return new FakeUserModel();
    }
}
