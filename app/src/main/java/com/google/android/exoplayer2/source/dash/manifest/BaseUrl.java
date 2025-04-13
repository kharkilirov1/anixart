package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class BaseUrl {

    /* renamed from: a */
    public final String f12923a;

    /* renamed from: b */
    public final String f12924b;

    /* renamed from: c */
    public final int f12925c;

    /* renamed from: d */
    public final int f12926d;

    public BaseUrl(String str) {
        this.f12923a = str;
        this.f12924b = str;
        this.f12925c = 1;
        this.f12926d = 1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUrl)) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) obj;
        return this.f12925c == baseUrl.f12925c && this.f12926d == baseUrl.f12926d && Objects.m11173a(this.f12923a, baseUrl.f12923a) && Objects.m11173a(this.f12924b, baseUrl.f12924b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12923a, this.f12924b, Integer.valueOf(this.f12925c), Integer.valueOf(this.f12926d)});
    }

    public BaseUrl(String str, String str2, int i2, int i3) {
        this.f12923a = str;
        this.f12924b = str2;
        this.f12925c = i2;
        this.f12926d = i3;
    }
}
