package cn.edu.hlju.eec.utils;

import com.google.gson.Gson;

/**
 * @author zjxu97 at 2020-05-27 01:21
 */
public class GsonUtil {
    private static Gson gson = new Gson();

    public static Gson getInstance() {
        return gson;
    }
}
