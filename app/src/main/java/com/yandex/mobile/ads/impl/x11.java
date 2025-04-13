package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.parser.offset.C6271a;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class x11 {

    /* renamed from: b */
    private static final HashSet f56328b = new HashSet(Arrays.asList(f61.f50129b, f61.f50128a));

    /* renamed from: a */
    @NonNull
    private final C6271a f56329a = new C6271a(f56328b);

    @Nullable
    /* renamed from: a */
    public final f50 m29627a(@NonNull C5083fl c5083fl) {
        int m24614d = c5083fl.m24614d();
        y11 m24617g = c5083fl.m24617g();
        if (m24617g == null) {
            return null;
        }
        VastTimeOffset m30767a = this.f56329a.m30767a(m24617g.m29844a());
        if (m30767a == null) {
            return null;
        }
        float m30766d = m30767a.m30766d();
        if (VastTimeOffset.EnumC6270b.f57987b.equals(m30767a.m30765c())) {
            m30766d = (long) ((m30766d / 100.0f) * m24614d);
        }
        return new f50((long) m30766d);
    }
}
