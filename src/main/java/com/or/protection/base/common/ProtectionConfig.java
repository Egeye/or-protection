package com.or.protection.base.common;

import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;


public class ProtectionConfig extends JFinalConfig {
    // private static Logger log = Logger.getLogger(ProtectionConfig.class);

    @Override
    public void configConstant(Constants me) {
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode", false));
    }

    @Override
    public void configRoute(Routes me) {

    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
