package androidx.core.content;

import android.content.LocusId;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class LocusIdCompat {

    /* renamed from: a */
    public final String f3297a;

    /* renamed from: b */
    public final LocusId f3298b;

    @RequiresApi
    public static class Api29Impl {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f3297a;
        return str == null ? locusIdCompat.f3297a == null : str.equals(locusIdCompat.f3297a);
    }

    public int hashCode() {
        String str = this.f3297a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("LocusIdCompat[");
        m24u.append(this.f3297a.length() + "_chars");
        m24u.append("]");
        return m24u.toString();
    }
}
