package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;
import java.io.IOException;
import okhttp3.internal.p038ws.WebSocketProtocol;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.es */
/* loaded from: classes3.dex */
public final class C5043es extends kq0 {

    /* renamed from: c */
    public final int f50041c;

    /* renamed from: d */
    @Nullable
    public final String f50042d;

    /* renamed from: e */
    public final int f50043e;

    /* renamed from: f */
    @Nullable
    public final C5606pv f50044f;

    /* renamed from: g */
    public final int f50045g;

    /* renamed from: h */
    @Nullable
    public final xb0 f50046h;

    /* renamed from: i */
    public final boolean f50047i;

    static {
        dn1 dn1Var = dn1.f49709t;
    }

    private C5043es(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    /* renamed from: a */
    public static C5043es m24245a(IOException iOException, int i2) {
        return new C5043es(0, iOException, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ C5043es m24249b(Bundle bundle) {
        return new C5043es(bundle);
    }

    private C5043es(int i2, @Nullable Throwable th, @Nullable String str, int i3, @Nullable String str2, int i4, @Nullable C5606pv c5606pv, int i5, boolean z) {
        this(m24248a(i2, str, str2, i4, c5606pv, i5), th, i3, i2, str2, i4, c5606pv, i5, null, SystemClock.elapsedRealtime(), z);
    }

    /* renamed from: a */
    public static C5043es m24246a(Exception exc, String str, int i2, @Nullable C5606pv c5606pv, int i3, boolean z, int i4) {
        return new C5043es(1, exc, null, i4, str, i2, c5606pv, c5606pv == null ? 4 : i3, z);
    }

    /* renamed from: a */
    public static C5043es m24247a(RuntimeException runtimeException, int i2) {
        return new C5043es(2, runtimeException, i2);
    }

    private C5043es(Bundle bundle) {
        super(bundle);
        this.f50041c = bundle.getInt(kq0.m26175a(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 2);
        this.f50042d = bundle.getString(kq0.m26175a(1002));
        this.f50043e = bundle.getInt(kq0.m26175a(1003), -1);
        Bundle bundle2 = bundle.getBundle(kq0.m26175a(1004));
        this.f50044f = bundle2 == null ? null : C5606pv.f53802H.fromBundle(bundle2);
        this.f50045g = bundle.getInt(kq0.m26175a(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 4);
        this.f50047i = bundle.getBoolean(kq0.m26175a(1006), false);
        this.f50046h = null;
    }

    /* renamed from: a */
    public static C5043es m24244a() {
        return new C5043es(3, null, "Video load error occurred", WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null, -1, null, 4, false);
    }

    @CheckResult
    /* renamed from: a */
    public final C5043es m24250a(@Nullable bc0.C4858b c4858b) {
        String message = getMessage();
        int i2 = s91.f54530a;
        return new C5043es(message, getCause(), this.f52056a, this.f50041c, this.f50042d, this.f50043e, this.f50044f, this.f50045g, c4858b, this.f52057b, this.f50047i);
    }

    /* renamed from: a */
    private static String m24248a(int i2, @Nullable String str, @Nullable String str2, int i3, @Nullable C5606pv c5606pv, int i4) {
        String str3;
        String str4;
        if (i2 == 0) {
            str3 = "Source error";
        } else if (i2 != 1) {
            str3 = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(c5606pv);
            sb.append(", format_supported=");
            int i5 = s91.f54530a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            sb.append(str4);
            str3 = sb.toString();
        }
        return !TextUtils.isEmpty(str) ? C0000a.m16m(str3, ": ", str) : str3;
    }

    private C5043es(String str, @Nullable Throwable th, int i2, int i3, @Nullable String str2, int i4, @Nullable C5606pv c5606pv, int i5, @Nullable bc0.C4858b c4858b, long j2, boolean z) {
        super(str, th, i2, j2);
        C5220ia.m25473a(!z || i3 == 1);
        C5220ia.m25473a(th != null || i3 == 3);
        this.f50041c = i3;
        this.f50042d = str2;
        this.f50043e = i4;
        this.f50044f = c5606pv;
        this.f50045g = i5;
        this.f50046h = c4858b;
        this.f50047i = z;
    }
}
