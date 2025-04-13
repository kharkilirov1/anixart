package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Zd */
/* loaded from: classes2.dex */
public final class C3794Zd {

    /* renamed from: a */
    private boolean f44646a = true;

    /* renamed from: b */
    private final Context f44647b;

    /* renamed from: c */
    private final C3769Yd f44648c;

    /* renamed from: d */
    private final C3744Xd f44649d;

    @VisibleForTesting
    public C3794Zd(@NotNull Context context, @NotNull C3769Yd c3769Yd, @NotNull C3744Xd c3744Xd) {
        this.f44647b = context;
        this.f44648c = c3769Yd;
        this.f44649d = c3744Xd;
    }

    /* renamed from: a */
    public void m19509a(@NotNull C3575Qi c3575Qi) {
        Boolean bool = c3575Qi.m18848f().f46425y;
        this.f44646a = bool != null ? bool.booleanValue() : true;
    }

    @Nullable
    /* renamed from: a */
    public final HttpsURLConnection m19508a(@NotNull String str) throws IOException {
        Objects.requireNonNull(this.f44648c);
        URLConnection openConnection = new URL(str).openConnection();
        if (!(openConnection instanceof HttpsURLConnection)) {
            openConnection = null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        if (httpsURLConnection == null) {
            return null;
        }
        if (this.f44646a) {
            Objects.requireNonNull(this.f44649d);
        }
        return httpsURLConnection;
    }
}
