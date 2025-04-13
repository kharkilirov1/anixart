package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.C6153e;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class x30 {

    /* renamed from: a */
    @NonNull
    private final C6153e f56354a;

    /* renamed from: com.yandex.mobile.ads.impl.x30$a */
    public static class C6005a implements Comparator<fr0> {
        private C6005a() {
        }

        @Override // java.util.Comparator
        public final int compare(fr0 fr0Var, fr0 fr0Var2) {
            fr0 fr0Var3 = fr0Var;
            fr0 fr0Var4 = fr0Var2;
            if (fr0Var3.equals(fr0Var4)) {
                return 0;
            }
            String type = fr0Var3.m24725a().getType();
            String type2 = fr0Var4.m24725a().getType();
            return (!type.equals(InstreamAdBreakType.PREROLL) && (type2.equals(InstreamAdBreakType.PREROLL) || type.equals(InstreamAdBreakType.POSTROLL) || (!type2.equals(InstreamAdBreakType.POSTROLL) && fr0Var3.m24726b() >= fr0Var4.m24726b()))) ? 1 : -1;
        }

        public /* synthetic */ C6005a(int i2) {
            this();
        }
    }

    public x30(@NonNull C6153e c6153e) {
        this.f56354a = c6153e;
    }

    @NonNull
    /* renamed from: a */
    public final w30 m29661a(@NonNull List<m50> list) {
        m50 m50Var;
        m50 m50Var2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (m50 m50Var3 : list) {
            if (InstreamAdBreakType.MIDROLL.equals(m50Var3.getType())) {
                arrayList2.add(m50Var3);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            m50 m50Var4 = (m50) it.next();
            InstreamAdBreakPosition adBreakPosition = m50Var4.getAdBreakPosition();
            long value = adBreakPosition.getValue();
            if (InstreamAdBreakPosition.Type.PERCENTS.equals(adBreakPosition.getPositionType())) {
                value = (long) ((value / 100.0f) * this.f56354a.m30394b());
            }
            arrayList.add(new fr0(m50Var4, value));
        }
        Collections.sort(arrayList, new C6005a(0));
        Iterator<m50> it2 = list.iterator();
        while (true) {
            m50Var = null;
            if (!it2.hasNext()) {
                m50Var2 = null;
                break;
            }
            m50Var2 = it2.next();
            if (InstreamAdBreakType.PREROLL.equals(m50Var2.getType())) {
                break;
            }
        }
        Iterator<m50> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            m50 next = it3.next();
            if (InstreamAdBreakType.POSTROLL.equals(next.getType())) {
                m50Var = next;
                break;
            }
        }
        return new w30(arrayList, m50Var2, m50Var);
    }
}
