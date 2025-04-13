package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3256E;
import com.yandex.metrica.push.common.CoreConstants;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Wc */
/* loaded from: classes2.dex */
public class C3718Wc {

    /* renamed from: a */
    @NonNull
    public final C3668Uc f44376a;

    /* renamed from: b */
    @NonNull
    public final C4027id f44377b;

    /* renamed from: com.yandex.metrica.impl.ob.Wc$a */
    public enum a {
        UNKNOWN(CoreConstants.Transport.UNKNOWN),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");


        /* renamed from: a */
        private final String f44383a;

        a(String str) {
            this.f44383a = str;
        }

        @NonNull
        /* renamed from: a */
        public String m19356a() {
            return this.f44383a;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f44383a;
        }

        @NonNull
        /* renamed from: a */
        public static a m19355a(@Nullable String str) {
            a aVar = UNKNOWN;
            a[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                a aVar2 = values[i2];
                if (aVar2.f44383a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        @NonNull
        /* renamed from: a */
        public static a m19354a(@Nullable C3256E.a aVar) {
            a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int ordinal = aVar.ordinal();
            if (ordinal != 1) {
                return ordinal != 2 ? aVar2 : VISIBLE;
            }
            return BACKGROUND;
        }
    }

    public C3718Wc(@NonNull C3668Uc c3668Uc, @NonNull C4027id c4027id) {
        this.f44376a = c3668Uc;
        this.f44377b = c4027id;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LocationCollectionConfig{arguments=");
        m24u.append(this.f44376a);
        m24u.append(", preconditions=");
        m24u.append(this.f44377b);
        m24u.append('}');
        return m24u.toString();
    }
}
