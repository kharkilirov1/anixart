package androidx.core.location;

import android.location.GpsStatus;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
class GpsStatusWrapper extends GnssStatusCompat {

    /* renamed from: a */
    public final GpsStatus f3429a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GpsStatusWrapper) {
            return this.f3429a.equals(((GpsStatusWrapper) obj).f3429a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3429a.hashCode();
    }
}
