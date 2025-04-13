package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class li1 {

    /* renamed from: a */
    public static final String f52422a;

    /* renamed from: b */
    public static final String f52423b;

    static {
        Locale locale = Locale.US;
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onCollapse", "config", "AdPerformActionsJSI").replace("JSON.stringify()", "");
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onExpand", "config", "AdPerformActionsJSI").replace("JSON.stringify()", "");
        f52423b = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "getBannerInfo", "AdPerformActionsJSI");
        f52422a = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI");
    }
}
