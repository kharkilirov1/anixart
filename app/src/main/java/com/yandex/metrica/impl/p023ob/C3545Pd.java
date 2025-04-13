package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3901dh;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Pd */
/* loaded from: classes2.dex */
public class C3545Pd extends C3901dh {

    /* renamed from: m */
    @Nullable
    private final C3668Uc f43641m;

    /* renamed from: com.yandex.metrica.impl.ob.Pd$b */
    public static class b {

        /* renamed from: a */
        public final C3575Qi f43642a;

        /* renamed from: b */
        public final C3668Uc f43643b;

        public b(C3575Qi c3575Qi, C3668Uc c3668Uc) {
            this.f43642a = c3575Qi;
            this.f43643b = c3668Uc;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pd$c */
    public static class c implements C3901dh.d<C3545Pd, b> {

        /* renamed from: a */
        @NonNull
        private final Context f43644a;

        /* renamed from: b */
        @NonNull
        private final C3849bh f43645b;

        public c(@NonNull Context context, @NonNull C3849bh c3849bh) {
            this.f43644a = context;
            this.f43645b = c3849bh;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3901dh.d
        @NonNull
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C3545Pd mo18753a(b bVar) {
            C3545Pd c3545Pd = new C3545Pd(bVar.f43643b);
            C3849bh c3849bh = this.f43645b;
            Context context = this.f43644a;
            Objects.requireNonNull(c3849bh);
            c3545Pd.m19743b(C3658U2.m19198a(context, context.getPackageName()));
            C3849bh c3849bh2 = this.f43645b;
            Context context2 = this.f43644a;
            Objects.requireNonNull(c3849bh2);
            c3545Pd.m19741a(String.valueOf(C3658U2.m19216b(context2, context2.getPackageName())));
            c3545Pd.m19736a(bVar.f43642a);
            c3545Pd.m19737a(C3858c0.m19667a());
            c3545Pd.m19740a(C3532P0.m18696i().m18713p().m21177a());
            c3545Pd.m19749e(this.f43644a.getPackageName());
            c3545Pd.m19738a(C3532P0.m18696i().m18717t().m19805a(this.f43644a));
            c3545Pd.m19739a(C3532P0.m18696i().m18700b().m20055a());
            return c3545Pd;
        }
    }

    @Nullable
    /* renamed from: A */
    public C3668Uc m18751A() {
        return this.f43641m;
    }

    @Nullable
    /* renamed from: B */
    public List<String> m18752B() {
        return m19767w().m18867y();
    }

    private C3545Pd(@Nullable C3668Uc c3668Uc) {
        this.f43641m = c3668Uc;
    }
}
