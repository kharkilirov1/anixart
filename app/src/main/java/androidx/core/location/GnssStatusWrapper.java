package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class GnssStatusWrapper extends GnssStatusCompat {

    /* renamed from: a */
    public final GnssStatus f3428a;

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static float m1904a(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getCarrierFrequencyHz(i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1905b(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasCarrierFrequencyHz(i2);
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static float m1906a(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getBasebandCn0DbHz(i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1907b(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasBasebandCn0DbHz(i2);
        }
    }

    public GnssStatusWrapper(Object obj) {
        GnssStatus gnssStatus = (GnssStatus) obj;
        Objects.requireNonNull(gnssStatus);
        this.f3428a = gnssStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.f3428a.equals(((GnssStatusWrapper) obj).f3428a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3428a.hashCode();
    }
}
