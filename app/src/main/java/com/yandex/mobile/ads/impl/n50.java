package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class n50 {

    /* renamed from: a */
    @NonNull
    private final Context f52846a;

    /* renamed from: b */
    @NonNull
    private final h30 f52847b = new h30();

    public n50(@NonNull Context context) {
        this.f52846a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public final m50 m26797a(@NonNull C5519o1 c5519o1, @NonNull List<pb1> list) {
        InstreamAdBreakPosition m25039a;
        String m26980c = c5519o1.m26980c();
        if (m26980c == null || (m25039a = this.f52847b.m25039a(c5519o1.m26983f())) == null) {
            return null;
        }
        long m24763a = g10.m24763a();
        ArrayList m26105a = new kc1(this.f52846a, new r50(m25039a, m24763a)).m26105a(list);
        if (m26105a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m26105a.iterator();
        while (it.hasNext()) {
            arrayList.add((VideoAd) ((hc1) it.next()).m25118c());
        }
        return new m50(m26105a, m26980c, c5519o1, m25039a, m24763a);
    }
}
