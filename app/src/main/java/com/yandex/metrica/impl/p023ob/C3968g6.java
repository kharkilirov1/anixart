package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.g6 */
/* loaded from: classes2.dex */
public class C3968g6 {

    /* renamed from: a */
    private final int f45176a;

    /* renamed from: b */
    @NonNull
    private final C4072k6 f45177b;

    /* renamed from: c */
    @Nullable
    private C3994h6 f45178c;

    public C3968g6(@NonNull Context context, @NonNull C3862c4 c3862c4, int i2) {
        this(new C4072k6(context, c3862c4), i2);
    }

    /* renamed from: b */
    private void m19947b() {
        this.f45177b.m20231a(this.f45178c);
    }

    @NonNull
    /* renamed from: a */
    public EnumC3482N0 m19948a(@NonNull String str) {
        if (this.f45178c == null) {
            C3994h6 m20230a = this.f45177b.m20230a();
            this.f45178c = m20230a;
            int m20004d = m20230a.m20004d();
            int i2 = this.f45176a;
            if (m20004d != i2) {
                this.f45178c.m20002b(i2);
                m19947b();
            }
        }
        int hashCode = str.hashCode();
        if (this.f45178c.m20001b().contains(Integer.valueOf(hashCode))) {
            return EnumC3482N0.NON_FIRST_OCCURENCE;
        }
        EnumC3482N0 enumC3482N0 = this.f45178c.m20005e() ? EnumC3482N0.FIRST_OCCURRENCE : EnumC3482N0.UNKNOWN;
        if (this.f45178c.m20003c() < 1000) {
            this.f45178c.m19999a(hashCode);
        } else {
            this.f45178c.m20000a(false);
        }
        m19947b();
        return enumC3482N0;
    }

    @VisibleForTesting
    public C3968g6(@NonNull C4072k6 c4072k6, int i2) {
        this.f45176a = i2;
        this.f45177b = c4072k6;
    }

    /* renamed from: a */
    public void m19949a() {
        if (this.f45178c == null) {
            C3994h6 m20230a = this.f45177b.m20230a();
            this.f45178c = m20230a;
            int m20004d = m20230a.m20004d();
            int i2 = this.f45176a;
            if (m20004d != i2) {
                this.f45178c.m20002b(i2);
                m19947b();
            }
        }
        this.f45178c.m19998a();
        this.f45178c.m20000a(true);
        m19947b();
    }
}
