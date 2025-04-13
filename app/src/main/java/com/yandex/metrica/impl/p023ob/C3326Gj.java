package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.Gj */
/* loaded from: classes2.dex */
class C3326Gj {

    /* renamed from: a */
    @NonNull
    private final Context f43013a;

    /* renamed from: b */
    @NonNull
    private final C3432L0 f43014b;

    /* renamed from: c */
    @NonNull
    private final C3603Rm f43015c;

    @VisibleForTesting
    public C3326Gj(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull C3603Rm c3603Rm) {
        this.f43013a = context;
        this.f43014b = c3432l0;
        this.f43015c = c3603Rm;
    }

    @Nullable
    /* renamed from: a */
    public String m18173a() {
        return C3681V0.m19260a(this.f43014b.m18469a(this.f43013a, "uuid.dat"));
    }

    @Nullable
    /* renamed from: a */
    public String m18174a(@Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f43015c.m19056a();
            }
            File m18469a = this.f43014b.m18469a(this.f43013a, "uuid.dat");
            if (m18469a != null) {
                C3681V0.m19263a(str, "uuid.dat", new FileOutputStream(m18469a));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
