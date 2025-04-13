package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.vp */
/* loaded from: classes3.dex */
public final class C5933vp {
    @Nullable
    /* renamed from: a */
    public static C5600pp m29248a(@NonNull InterfaceC6256u interfaceC6256u) {
        List<C5600pp> mo30563b = interfaceC6256u.mo30563b();
        if (mo30563b == null) {
            return null;
        }
        for (C5600pp c5600pp : mo30563b) {
            if ("ad".equals(c5600pp.m27361c())) {
                return c5600pp;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static ArrayList m29249b(@NonNull InterfaceC6256u interfaceC6256u) {
        ArrayList arrayList = new ArrayList();
        List<C5600pp> mo30563b = interfaceC6256u.mo30563b();
        if (mo30563b != null) {
            for (C5600pp c5600pp : mo30563b) {
                if ("ad".equals(c5600pp.m27361c())) {
                    arrayList.add(c5600pp);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: c */
    public static C5600pp m29250c(@NonNull InterfaceC6256u interfaceC6256u) {
        List<C5600pp> mo30563b = interfaceC6256u.mo30563b();
        if (mo30563b == null) {
            return null;
        }
        for (C5600pp c5600pp : mo30563b) {
            if ("close_dialog".equals(c5600pp.m27361c())) {
                return c5600pp;
            }
        }
        return null;
    }
}
