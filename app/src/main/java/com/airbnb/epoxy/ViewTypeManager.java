package com.airbnb.epoxy;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ViewTypeManager {

    /* renamed from: b */
    public static final Map<Class, Integer> f7044b = new HashMap();

    /* renamed from: a */
    @Nullable
    public EpoxyModel<?> f7045a;

    /* renamed from: a */
    public static int m4627a(EpoxyModel<?> epoxyModel) {
        int mo4502f2 = epoxyModel.mo4502f2();
        if (mo4502f2 != 0) {
            return mo4502f2;
        }
        Class<?> cls = epoxyModel.getClass();
        Map<Class, Integer> map = f7044b;
        Integer num = (Integer) ((HashMap) map).get(cls);
        if (num == null) {
            num = Integer.valueOf((-((HashMap) map).size()) - 1);
            ((HashMap) map).put(cls, num);
        }
        return num.intValue();
    }
}
