package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Ik */
/* loaded from: classes2.dex */
class C3377Ik {

    /* renamed from: a */
    @NonNull
    private final C3277Ek f43139a;

    /* renamed from: b */
    @NonNull
    private final C3227Ck f43140b;

    public C3377Ik(@NonNull Context context) {
        this(new C3277Ek(context), new C3227Ck());
    }

    @NonNull
    /* renamed from: a */
    public EnumC4451yl m18336a(@NonNull Activity activity, @Nullable C3378Il c3378Il) {
        if (c3378Il == null) {
            return EnumC4451yl.NULL_UI_ACCESS_CONFIG;
        }
        if (!c3378Il.f43141a) {
            return EnumC4451yl.UI_PARING_FEATURE_DISABLED;
        }
        C3854bm c3854bm = c3378Il.f43145e;
        return c3854bm == null ? EnumC4451yl.NULL_UI_PARSING_CONFIG : this.f43139a.m21162a(activity, c3854bm) ? EnumC4451yl.FORBIDDEN_FOR_APP : this.f43140b.m21162a(activity, c3378Il.f43145e) ? EnumC4451yl.FORBIDDEN_FOR_ACTIVITY : EnumC4451yl.OK;
    }

    @VisibleForTesting
    public C3377Ik(@NonNull C3277Ek c3277Ek, @NonNull C3227Ck c3227Ck) {
        this.f43139a = c3277Ek;
        this.f43140b = c3227Ck;
    }
}
