package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.oi */
/* loaded from: classes2.dex */
public class C4188oi {

    /* renamed from: a */
    @NonNull
    public final List<Pair<String, a>> f46086a;

    /* renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        public final String f46087a;

        public a(@NonNull String str) {
            this.f46087a = str;
        }

        public String toString() {
            return this.f46087a;
        }
    }

    public C4188oi(@NonNull List<Pair<String, a>> list) {
        this.f46086a = list;
    }

    public String toString() {
        return C0576a.m4119r(C0000a.m24u("AttributionConfig{deeplinkConditions="), this.f46086a, '}');
    }
}
