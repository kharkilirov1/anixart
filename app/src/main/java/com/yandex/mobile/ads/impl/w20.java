package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.aa1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class w20 {

    /* renamed from: b */
    @NonNull
    private static final List<aa1.EnumC4801a> f55996b = new C5954a();

    /* renamed from: a */
    @NonNull
    private final x20 f55997a = new x20();

    /* renamed from: com.yandex.mobile.ads.impl.w20$a */
    public class C5954a extends ArrayList<aa1.EnumC4801a> {
        public C5954a() {
            add(aa1.EnumC4801a.f48453b);
            add(aa1.EnumC4801a.f48454c);
            add(aa1.EnumC4801a.f48459h);
        }
    }

    /* renamed from: a */
    public final void m29366a(@NonNull FrameLayout frameLayout) {
        this.f55997a.m29657a(frameLayout);
    }

    /* renamed from: a */
    public final void m29367a(@NonNull aa1 aa1Var, @NonNull FrameLayout frameLayout) {
        this.f55997a.m29658a(frameLayout, aa1Var, !((ArrayList) f55996b).contains(aa1Var.m22447e()));
    }
}
