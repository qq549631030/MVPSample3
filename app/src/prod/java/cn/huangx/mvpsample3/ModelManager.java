package cn.huangx.mvpsample3;

import cn.huangx.mvpsample3.model.IUserModel;
import cn.huangx.mvpsample3.model.UserModel;

/**
 * Created by huangx on 2016/8/24.
 */
public class ModelManager {
    public static IUserModel provideUserModel() {
        return new UserModel();
    }
}
