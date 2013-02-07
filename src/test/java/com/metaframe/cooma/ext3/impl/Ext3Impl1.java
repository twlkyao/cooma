package com.metaframe.cooma.ext3.impl;

import com.metaframe.cooma.Config;
import com.metaframe.cooma.ext3.WrappedExt;
import com.metaframe.cooma.ext5.NoAdaptiveMethodExt;

/**
 * @author Jerry Lee(oldratlee<at>gmail<dot>com)
 */
public class Ext3Impl1 implements WrappedExt {
    public String echo(Config config, String s) {
        return "Ext3Impl1-echo";
    }

    public String yell(Config config, String s) {
        return "Ext3Impl1-yell";
    }

    public String bang(Config config, int i) {
        return "impl1";
    }
}