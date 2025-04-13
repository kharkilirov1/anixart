package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3901dh;
import com.yandex.metrica.impl.p023ob.C3979gh;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.X4 */
/* loaded from: classes2.dex */
public class C3735X4 extends C3979gh {

    /* renamed from: o */
    @Nullable
    private List<String> f44461o;

    /* renamed from: p */
    @NonNull
    private String f44462p;

    /* renamed from: q */
    private Boolean f44463q;

    @NonNull
    /* renamed from: C */
    public String m19383C() {
        return this.f44462p;
    }

    @Nullable
    /* renamed from: D */
    public List<String> m19384D() {
        return this.f44461o;
    }

    @Nullable
    /* renamed from: E */
    public Boolean m19385E() {
        return this.f44463q;
    }

    /* renamed from: a */
    public void m19387a(@Nullable List<String> list) {
        this.f44461o = list;
    }

    /* renamed from: h */
    public void m19388h(@NonNull String str) {
        this.f44462p = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3979gh
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DiagnosticRequestConfig{mDiagnosticHosts=");
        m24u.append(this.f44461o);
        m24u.append(", mApiKey='");
        C0576a.m4100A(m24u, this.f44462p, '\'', ", statisticsSending=");
        m24u.append(this.f44463q);
        m24u.append('}');
        return m24u.toString();
    }

    /* renamed from: a */
    public void m19386a(Boolean bool) {
        this.f44463q = bool;
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$a */
    public static final class a extends C3901dh.a<C3734X3.a, a> {

        /* renamed from: d */
        @NonNull
        public final String f44464d;

        /* renamed from: e */
        public final boolean f44465e;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @Nullable Boolean bool) {
            super(str, str2, str3);
            this.f44464d = str4;
            this.f44465e = ((Boolean) C4452ym.m21236a(bool, Boolean.TRUE)).booleanValue();
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        @NonNull
        /* renamed from: a */
        public Object mo19381a(@NonNull Object obj) {
            C3734X3.a aVar = (C3734X3.a) obj;
            String str = aVar.f44444a;
            String str2 = this.f44963a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f44445b;
            String str4 = this.f44964b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f44446c;
            String str6 = this.f44965c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f44447d;
            String str8 = this.f44464d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f44455l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f44465e) : bool);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        /* renamed from: b */
        public boolean mo19382b(@NonNull Object obj) {
            String str;
            String str2;
            String str3;
            C3734X3.a aVar = (C3734X3.a) obj;
            String str4 = aVar.f44444a;
            return (str4 == null || str4.equals(this.f44963a)) && ((str = aVar.f44445b) == null || str.equals(this.f44964b)) && (((str2 = aVar.f44446c) == null || str2.equals(this.f44965c)) && ((str3 = aVar.f44447d) == null || str3.equals(this.f44464d)));
        }

        public a(@NonNull C3734X3.a aVar) {
            this(aVar.f44444a, aVar.f44445b, aVar.f44446c, aVar.f44447d, aVar.f44455l);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$b */
    public static class b extends C3979gh.a<C3735X4, a> {
        public b(@NonNull Context context, @NonNull String str) {
            super(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.p023ob.C3901dh.d
        @NonNull
        /* renamed from: a */
        public C3901dh mo18753a(@NonNull Object obj) {
            C3901dh.c cVar = (C3901dh.c) obj;
            C3735X4 m19972a = m19972a(cVar);
            m19972a.m19387a(cVar.f44968a.m18854l());
            m19972a.m19388h(((a) cVar.f44969b).f44464d);
            m19972a.m19386a(Boolean.valueOf(((a) cVar.f44969b).f44465e));
            return m19972a;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3901dh.b
        @NonNull
        /* renamed from: a */
        public C3901dh mo19389a() {
            return new C3735X4();
        }
    }
}
