package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.x01;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class ec0 {

    /* renamed from: a */
    private final uq0 f49902a;

    /* renamed from: e */
    private final InterfaceC5019d f49906e;

    /* renamed from: f */
    private final cc0.C4914a f49907f;

    /* renamed from: g */
    private final InterfaceC4719f.a f49908g;

    /* renamed from: h */
    private final HashMap<C5018c, C5017b> f49909h;

    /* renamed from: i */
    private final HashSet f49910i;

    /* renamed from: k */
    private boolean f49912k;

    /* renamed from: l */
    @Nullable
    private v71 f49913l;

    /* renamed from: j */
    private x01 f49911j = new x01.C6001a();

    /* renamed from: c */
    private final IdentityHashMap<vb0, C5018c> f49904c = new IdentityHashMap<>();

    /* renamed from: d */
    private final HashMap f49905d = new HashMap();

    /* renamed from: b */
    private final ArrayList f49903b = new ArrayList();

    /* renamed from: com.yandex.mobile.ads.impl.ec0$b */
    public static final class C5017b {

        /* renamed from: a */
        public final bc0 f49918a;

        /* renamed from: b */
        public final bc0.InterfaceC4859c f49919b;

        /* renamed from: c */
        public final C5016a f49920c;

        public C5017b(y90 y90Var, bc0.InterfaceC4859c interfaceC4859c, C5016a c5016a) {
            this.f49918a = y90Var;
            this.f49919b = interfaceC4859c;
            this.f49920c = c5016a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ec0$c */
    public static final class C5018c implements dc0 {

        /* renamed from: a */
        public final y90 f49921a;

        /* renamed from: d */
        public int f49924d;

        /* renamed from: e */
        public boolean f49925e;

        /* renamed from: c */
        public final ArrayList f49923c = new ArrayList();

        /* renamed from: b */
        public final Object f49922b = new Object();

        public C5018c(bc0 bc0Var, boolean z) {
            this.f49921a = new y90(bc0Var, z);
        }

        @Override // com.yandex.mobile.ads.impl.dc0
        /* renamed from: a */
        public final Object mo23866a() {
            return this.f49922b;
        }

        @Override // com.yandex.mobile.ads.impl.dc0
        /* renamed from: b */
        public final k61 mo23867b() {
            return this.f49921a.m29876f();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ec0$d */
    public interface InterfaceC5019d {
    }

    public ec0(InterfaceC5019d interfaceC5019d, InterfaceC5569p8 interfaceC5569p8, Handler handler, uq0 uq0Var) {
        this.f49902a = uq0Var;
        this.f49906e = interfaceC5019d;
        cc0.C4914a c4914a = new cc0.C4914a();
        this.f49907f = c4914a;
        InterfaceC4719f.a aVar = new InterfaceC4719f.a();
        this.f49908g = aVar;
        this.f49909h = new HashMap<>();
        this.f49910i = new HashSet();
        c4914a.m23208a(handler, interfaceC5569p8);
        aVar.m22180a(handler, interfaceC5569p8);
    }

    /* renamed from: c */
    public final boolean m24107c() {
        return this.f49912k;
    }

    /* renamed from: d */
    public final k61 m24108d() {
        C5220ia.m25473a(this.f49903b.size() >= 0);
        this.f49911j = null;
        return m24098a();
    }

    /* renamed from: e */
    public final void m24109e() {
        for (C5017b c5017b : this.f49909h.values()) {
            try {
                c5017b.f49918a.mo22794a(c5017b.f49919b);
            } catch (RuntimeException e2) {
                d90.m23838a("MediaSourceList", "Failed to release child source.", e2);
            }
            c5017b.f49918a.mo22796a((cc0) c5017b.f49920c);
            c5017b.f49918a.mo22793a((InterfaceC4719f) c5017b.f49920c);
        }
        this.f49909h.clear();
        this.f49910i.clear();
        this.f49912k = false;
    }

    /* renamed from: com.yandex.mobile.ads.impl.ec0$a */
    public final class C5016a implements cc0, InterfaceC4719f {

        /* renamed from: a */
        private final C5018c f49914a;

        /* renamed from: b */
        private cc0.C4914a f49915b;

        /* renamed from: c */
        private InterfaceC4719f.a f49916c;

        public C5016a(C5018c c5018c) {
            this.f49915b = ec0.this.f49907f;
            this.f49916c = ec0.this.f49908g;
            this.f49914a = c5018c;
        }

        /* renamed from: e */
        private boolean m24110e(int i2, @Nullable bc0.C4858b c4858b) {
            bc0.C4858b c4858b2 = null;
            if (c4858b != null) {
                C5018c c5018c = this.f49914a;
                int i3 = 0;
                while (true) {
                    if (i3 >= c5018c.f49923c.size()) {
                        break;
                    }
                    if (((bc0.C4858b) c5018c.f49923c.get(i3)).f56452d == c4858b.f56452d) {
                        c4858b2 = c4858b.m22800b(AbstractC4995e.m23966a(c5018c.f49922b, c4858b.f56449a));
                        break;
                    }
                    i3++;
                }
                if (c4858b2 == null) {
                    return false;
                }
            }
            int i4 = i2 + this.f49914a.f49924d;
            cc0.C4914a c4914a = this.f49915b;
            if (c4914a.f49200a != i4 || !s91.m28112a(c4914a.f49201b, c4858b2)) {
                this.f49915b = ec0.this.f49907f.m23206a(i4, c4858b2);
            }
            InterfaceC4719f.a aVar = this.f49916c;
            if (aVar.f48020a == i4 && s91.m28112a(aVar.f48021b, c4858b2)) {
                return true;
            }
            this.f49916c = ec0.this.f49908g.m22177a(i4, c4858b2);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23190a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m24110e(i2, c4858b)) {
                this.f49915b.m23213a(j80Var, rb0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: b */
        public final void mo23193b(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m24110e(i2, c4858b)) {
                this.f49915b.m23217b(j80Var, rb0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: c */
        public final void mo23194c(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m24110e(i2, c4858b)) {
                this.f49915b.m23218c(j80Var, rb0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: d */
        public final void mo22164d(int i2, @Nullable bc0.C4858b c4858b) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22182b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23191a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z) {
            if (m24110e(i2, c4858b)) {
                this.f49915b.m23214a(j80Var, rb0Var, iOException, z);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: b */
        public final void mo22162b(int i2, @Nullable bc0.C4858b c4858b) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22184d();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: c */
        public final void mo22163c(int i2, @Nullable bc0.C4858b c4858b) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22178a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23192a(int i2, @Nullable bc0.C4858b c4858b, rb0 rb0Var) {
            if (m24110e(i2, c4858b)) {
                this.f49915b.m23215a(rb0Var);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22160a(int i2, @Nullable bc0.C4858b c4858b, int i3) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22179a(i3);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22161a(int i2, @Nullable bc0.C4858b c4858b, Exception exc) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22181a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22159a(int i2, @Nullable bc0.C4858b c4858b) {
            if (m24110e(i2, c4858b)) {
                this.f49916c.m22183c();
            }
        }
    }

    /* renamed from: a */
    public final k61 m24102a(List<C5018c> list, x01 x01Var) {
        for (int size = this.f49903b.size() - 1; size >= 0; size--) {
            C5018c c5018c = (C5018c) this.f49903b.remove(size);
            this.f49905d.remove(c5018c.f49922b);
            int i2 = -c5018c.f49921a.m29876f().mo25935b();
            for (int i3 = size; i3 < this.f49903b.size(); i3++) {
                ((C5018c) this.f49903b.get(i3)).f49924d += i2;
            }
            c5018c.f49925e = true;
            if (this.f49912k && c5018c.f49923c.isEmpty()) {
                C5017b remove = this.f49909h.remove(c5018c);
                Objects.requireNonNull(remove);
                remove.f49918a.mo22794a(remove.f49919b);
                remove.f49918a.mo22796a((cc0) remove.f49920c);
                remove.f49918a.mo22793a((InterfaceC4719f) remove.f49920c);
                this.f49910i.remove(c5018c);
            }
        }
        return m24100a(this.f49903b.size(), list, x01Var);
    }

    /* renamed from: b */
    public final int m24106b() {
        return this.f49903b.size();
    }

    /* renamed from: a */
    public final k61 m24100a(int i2, List<C5018c> list, x01 x01Var) {
        if (!list.isEmpty()) {
            this.f49911j = x01Var;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                C5018c c5018c = list.get(i3 - i2);
                if (i3 > 0) {
                    C5018c c5018c2 = (C5018c) this.f49903b.get(i3 - 1);
                    c5018c.f49924d = c5018c2.f49921a.m29876f().mo25935b() + c5018c2.f49924d;
                    c5018c.f49925e = false;
                    c5018c.f49923c.clear();
                } else {
                    c5018c.f49924d = 0;
                    c5018c.f49925e = false;
                    c5018c.f49923c.clear();
                }
                int mo25935b = c5018c.f49921a.m29876f().mo25935b();
                for (int i4 = i3; i4 < this.f49903b.size(); i4++) {
                    ((C5018c) this.f49903b.get(i4)).f49924d += mo25935b;
                }
                this.f49903b.add(i3, c5018c);
                this.f49905d.put(c5018c.f49922b, c5018c);
                if (this.f49912k) {
                    m24095a(c5018c);
                    if (this.f49904c.isEmpty()) {
                        this.f49910i.add(c5018c);
                    } else {
                        C5017b c5017b = this.f49909h.get(c5018c);
                        if (c5017b != null) {
                            c5017b.f49918a.mo22798b(c5017b.f49919b);
                        }
                    }
                }
            }
        }
        return m24098a();
    }

    /* renamed from: a */
    public final k61 m24099a(int i2, int i3, x01 x01Var) {
        C5220ia.m25473a(i2 >= 0 && i2 <= i3 && i3 <= this.f49903b.size());
        this.f49911j = x01Var;
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C5018c c5018c = (C5018c) this.f49903b.remove(i4);
            this.f49905d.remove(c5018c.f49922b);
            int i5 = -c5018c.f49921a.m29876f().mo25935b();
            for (int i6 = i4; i6 < this.f49903b.size(); i6++) {
                ((C5018c) this.f49903b.get(i6)).f49924d += i5;
            }
            c5018c.f49925e = true;
            if (this.f49912k && c5018c.f49923c.isEmpty()) {
                C5017b remove = this.f49909h.remove(c5018c);
                Objects.requireNonNull(remove);
                remove.f49918a.mo22794a(remove.f49919b);
                remove.f49918a.mo22796a((cc0) remove.f49920c);
                remove.f49918a.mo22793a((InterfaceC4719f) remove.f49920c);
                this.f49910i.remove(c5018c);
            }
        }
        return m24098a();
    }

    /* renamed from: a */
    public final k61 m24101a(x01 x01Var) {
        int size = this.f49903b.size();
        if (x01Var.mo29614a() != size) {
            x01Var = x01Var.mo29621d().mo29617b(size);
        }
        this.f49911j = x01Var;
        return m24098a();
    }

    /* renamed from: a */
    public final void m24104a(@Nullable v71 v71Var) {
        C5220ia.m25476b(!this.f49912k);
        this.f49913l = v71Var;
        for (int i2 = 0; i2 < this.f49903b.size(); i2++) {
            C5018c c5018c = (C5018c) this.f49903b.get(i2);
            m24095a(c5018c);
            this.f49910i.add(c5018c);
        }
        this.f49912k = true;
    }

    /* renamed from: a */
    public final x90 m24103a(bc0.C4858b c4858b, InterfaceC5476n8 interfaceC5476n8, long j2) {
        Object m23968d = AbstractC4995e.m23968d(c4858b.f56449a);
        bc0.C4858b m22800b = c4858b.m22800b(AbstractC4995e.m23967c(c4858b.f56449a));
        C5018c c5018c = (C5018c) this.f49905d.get(m23968d);
        Objects.requireNonNull(c5018c);
        this.f49910i.add(c5018c);
        C5017b c5017b = this.f49909h.get(c5018c);
        if (c5017b != null) {
            c5017b.f49918a.mo22799c(c5017b.f49919b);
        }
        c5018c.f49923c.add(m22800b);
        x90 mo22790a = c5018c.f49921a.mo22790a(m22800b, interfaceC5476n8, j2);
        this.f49904c.put(mo22790a, c5018c);
        Iterator it = this.f49910i.iterator();
        while (it.hasNext()) {
            C5018c c5018c2 = (C5018c) it.next();
            if (c5018c2.f49923c.isEmpty()) {
                C5017b c5017b2 = this.f49909h.get(c5018c2);
                if (c5017b2 != null) {
                    c5017b2.f49918a.mo22798b(c5017b2.f49919b);
                }
                it.remove();
            }
        }
        return mo22790a;
    }

    /* renamed from: a */
    public final void m24105a(vb0 vb0Var) {
        C5018c remove = this.f49904c.remove(vb0Var);
        Objects.requireNonNull(remove);
        remove.f49921a.mo22797a(vb0Var);
        remove.f49923c.remove(((x90) vb0Var).f56404b);
        if (!this.f49904c.isEmpty()) {
            Iterator it = this.f49910i.iterator();
            while (it.hasNext()) {
                C5018c c5018c = (C5018c) it.next();
                if (c5018c.f49923c.isEmpty()) {
                    C5017b c5017b = this.f49909h.get(c5018c);
                    if (c5017b != null) {
                        c5017b.f49918a.mo22798b(c5017b.f49919b);
                    }
                    it.remove();
                }
            }
        }
        if (remove.f49925e && remove.f49923c.isEmpty()) {
            C5017b remove2 = this.f49909h.remove(remove);
            Objects.requireNonNull(remove2);
            remove2.f49918a.mo22794a(remove2.f49919b);
            remove2.f49918a.mo22796a((cc0) remove2.f49920c);
            remove2.f49918a.mo22793a((InterfaceC4719f) remove2.f49920c);
            this.f49910i.remove(remove);
        }
    }

    /* renamed from: a */
    public final k61 m24098a() {
        if (this.f49903b.isEmpty()) {
            return k61.f51847a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f49903b.size(); i3++) {
            C5018c c5018c = (C5018c) this.f49903b.get(i3);
            c5018c.f49924d = i2;
            i2 += c5018c.f49921a.m29876f().mo25935b();
        }
        return new jr0(this.f49903b, this.f49911j);
    }

    /* renamed from: a */
    private void m24095a(C5018c c5018c) {
        y90 y90Var = c5018c.f49921a;
        bc0.InterfaceC4859c interfaceC4859c = new bc0.InterfaceC4859c() { // from class: com.yandex.mobile.ads.impl.do1
            @Override // com.yandex.mobile.ads.impl.bc0.InterfaceC4859c
            /* renamed from: a */
            public final void mo22801a(bc0 bc0Var, k61 k61Var) {
                ec0.this.m24094a(bc0Var, k61Var);
            }
        };
        C5016a c5016a = new C5016a(c5018c);
        this.f49909h.put(c5018c, new C5017b(y90Var, interfaceC4859c, c5016a));
        y90Var.mo22792a(s91.m28121b((Handler.Callback) null), (cc0) c5016a);
        y90Var.mo22791a(s91.m28121b((Handler.Callback) null), (InterfaceC4719f) c5016a);
        y90Var.mo22795a(interfaceC4859c, this.f49913l, this.f49902a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24094a(bc0 bc0Var, k61 k61Var) {
        ((C5354ks) this.f49906e).m26240h();
    }
}
