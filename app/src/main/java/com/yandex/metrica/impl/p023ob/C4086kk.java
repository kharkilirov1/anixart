package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3700Vj;
import java.util.concurrent.TimeUnit;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.kk */
/* loaded from: classes2.dex */
public class C4086kk {

    /* renamed from: a */
    @NonNull
    private C3479Mm f45839a;

    public C4086kk() {
        this(new C3479Mm());
    }

    /* renamed from: a */
    public void m20305a(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long l2 = null;
        if (timeStamp > 0) {
            C3479Mm c3479Mm = this.f45839a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long m18601c = c3479Mm.m18601c(timeStamp, timeUnit);
            if (m18601c > 0 && m18601c < TimeUnit.HOURS.toSeconds(1L)) {
                l2 = Long.valueOf(m18601c);
            }
            if (l2 == null) {
                long m18599a = this.f45839a.m18599a(timeStamp, timeUnit);
                if (m18599a > 0 && m18599a < TimeUnit.HOURS.toSeconds(1L)) {
                    l2 = Long.valueOf(m18599a);
                }
            }
        }
        aVar.m19332a(l2).m19334a(cellInfo.isRegistered());
    }

    @VisibleForTesting
    public C4086kk(@NonNull C3479Mm c3479Mm) {
        this.f45839a = c3479Mm;
    }
}
