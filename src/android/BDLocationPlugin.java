package org.apache.cordova.location;

import com.akazam.android.kebaoxty.LocationBean;
import com.akazam.android.kebaoxty.common.ComParams;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

/**
 * Created by hhl on 2018/12/24.
 */
public class BDLocationPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        if (ComParams.H5_REQUEST_LOCATION.equals(action)) {
            LocationBean locationBean = new LocationBean();
            locationBean.setLat("31.269216");
            locationBean.setLng("120.738899");
            String result = new Gson().toJson(locationBean);
            callbackContext.success(result);
            callbackContext.error(result);
            return true;
        }
        return super.execute(action, args, callbackContext);
    }
}
