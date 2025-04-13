package com.yandex.mobile.ads.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.SizeInfo;
import java.io.Serializable;

/* renamed from: com.yandex.mobile.ads.banner.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4638f implements Serializable {
    private static final long serialVersionUID = -7571518881522543353L;

    /* renamed from: a */
    @NonNull
    private final SizeInfo f47642a;

    public AbstractC4638f(int i2, int i3, @NonNull int i4) {
        this.f47642a = new SizeInfo(i2, i3, i4);
    }

    @NonNull
    /* renamed from: a */
    public final SizeInfo m21785a() {
        return this.f47642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47642a.equals(((AbstractC4638f) obj).f47642a);
    }

    public int getHeight() {
        return this.f47642a.m21915c();
    }

    public int getHeightInPixels(@NonNull Context context) {
        return this.f47642a.m21914b(context);
    }

    public int getWidth() {
        return this.f47642a.m21919e();
    }

    public int getWidthInPixels(@NonNull Context context) {
        return this.f47642a.m21918d(context);
    }

    public int hashCode() {
        return this.f47642a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f47642a.toString();
    }

    public int getHeight(@NonNull Context context) {
        return this.f47642a.m21913a(context);
    }

    public int getWidth(@NonNull Context context) {
        return this.f47642a.m21916c(context);
    }
}
