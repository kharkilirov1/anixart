package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface Types {
    }

    /* renamed from: m */
    public abstract int mo8228m();

    /* renamed from: n */
    public abstract long mo8229n();

    /* renamed from: o */
    public abstract long mo8230o();

    @NonNull
    /* renamed from: p */
    public abstract String mo8231p();

    @NonNull
    public final String toString() {
        long mo8230o = mo8230o();
        int mo8228m = mo8228m();
        long mo8229n = mo8229n();
        String mo8231p = mo8231p();
        StringBuilder sb = new StringBuilder(mo8231p.length() + 53);
        sb.append(mo8230o);
        sb.append("\t");
        sb.append(mo8228m);
        sb.append("\t");
        sb.append(mo8229n);
        sb.append(mo8231p);
        return sb.toString();
    }
}
