package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.dm */
/* loaded from: classes3.dex */
public interface InterfaceC4978dm extends InterfaceC4815am {

    /* renamed from: com.yandex.mobile.ads.impl.dm$a */
    public interface a {
        /* renamed from: a */
        InterfaceC4978dm mo22497a();
    }

    /* renamed from: a */
    long mo22487a(C5192hm c5192hm) throws IOException;

    /* renamed from: a */
    void mo22488a(v71 v71Var);

    /* renamed from: b */
    Map<String, List<String>> mo22489b();

    void close() throws IOException;

    @Nullable
    /* renamed from: d */
    Uri mo22490d();
}
