package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.core.location.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0242d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f3452b;

    /* renamed from: c */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f3453c;

    /* renamed from: d */
    public final /* synthetic */ Executor f3454d;

    public /* synthetic */ RunnableC0242d(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
        this.f3452b = i2;
        this.f3453c = preRGnssStatusTransport;
        this.f3454d = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3452b) {
            case 0:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = this.f3453c;
                if (preRGnssStatusTransport.f3439b == this.f3454d) {
                    Objects.requireNonNull(preRGnssStatusTransport.f3438a);
                    break;
                }
                break;
            default:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport2 = this.f3453c;
                if (preRGnssStatusTransport2.f3439b == this.f3454d) {
                    Objects.requireNonNull(preRGnssStatusTransport2.f3438a);
                    break;
                }
                break;
        }
    }
}
