package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tl1 extends AbstractC5566p5 {

    /* renamed from: k */
    private static final Pattern f55141k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final C5670r5 f55142a;

    /* renamed from: b */
    private final C5620q5 f55143b;

    /* renamed from: d */
    private xl1 f55145d;

    /* renamed from: e */
    private AbstractC5843u5 f55146e;

    /* renamed from: i */
    private boolean f55150i;

    /* renamed from: j */
    private boolean f55151j;

    /* renamed from: c */
    private final ArrayList f55144c = new ArrayList();

    /* renamed from: f */
    private boolean f55147f = false;

    /* renamed from: g */
    private boolean f55148g = false;

    /* renamed from: h */
    private final String f55149h = UUID.randomUUID().toString();

    public tl1(C5620q5 c5620q5, C5670r5 c5670r5) {
        AbstractC5843u5 yl1Var;
        this.f55143b = c5620q5;
        this.f55142a = c5670r5;
        m28674b(null);
        if (c5670r5.m27835a() == EnumC5727s5.f54503b || c5670r5.m27835a() == EnumC5727s5.f54505d) {
            yl1Var = new yl1(c5670r5.m27842h());
        } else {
            yl1Var = new cm1(c5670r5.m27839e(), c5670r5.m27838d());
        }
        this.f55146e = yl1Var;
        this.f55146e.mo23315a();
        ul1.m29042a().m29043a(this);
        this.f55146e.m28888a(c5620q5);
    }

    /* renamed from: b */
    private void m28674b(View view) {
        this.f55145d = new xl1(view);
    }

    /* renamed from: a */
    public final void m28675a(@NonNull JSONObject jSONObject) {
        if (this.f55151j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        wm1.m29512b(this.f55146e.m28896e(), jSONObject);
        this.f55151j = true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5566p5
    /* renamed from: b */
    public final void mo27168b() {
        if (this.f55147f) {
            return;
        }
        this.f55147f = true;
        ul1.m29042a().m29045b(this);
        wm1.m29504a(this.f55146e.m28896e(), cn1.m23491a().m23496d());
        this.f55146e.mo23316a(this, this.f55142a);
    }

    /* renamed from: c */
    public final ArrayList m28676c() {
        return this.f55144c;
    }

    /* renamed from: d */
    public final void m28677d() {
        if (this.f55150i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        wm1.m29510b(this.f55146e.m28896e());
        this.f55150i = true;
    }

    /* renamed from: e */
    public final View m28678e() {
        return this.f55145d.get();
    }

    /* renamed from: f */
    public final boolean m28679f() {
        return this.f55147f && !this.f55148g;
    }

    /* renamed from: g */
    public final boolean m28680g() {
        return this.f55147f;
    }

    /* renamed from: h */
    public final String m28681h() {
        return this.f55149h;
    }

    /* renamed from: i */
    public final AbstractC5843u5 m28682i() {
        return this.f55146e;
    }

    /* renamed from: j */
    public final boolean m28683j() {
        return this.f55148g;
    }

    /* renamed from: k */
    public final boolean m28684k() {
        return this.f55143b.m27626b();
    }

    /* renamed from: l */
    public final boolean m28685l() {
        return this.f55143b.m27627c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5566p5
    /* renamed from: a */
    public final void mo27167a(View view, EnumC6043xv enumC6043xv, @Nullable String str) {
        lm1 lm1Var;
        if (this.f55148g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f55141k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f55144c.iterator();
        while (true) {
            if (!it.hasNext()) {
                lm1Var = null;
                break;
            } else {
                lm1Var = (lm1) it.next();
                if (lm1Var.m26499a().get() == view) {
                    break;
                }
            }
        }
        if (lm1Var == null) {
            this.f55144c.add(new lm1(view, enumC6043xv, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5566p5
    /* renamed from: a */
    public final void mo27165a() {
        if (this.f55148g) {
            return;
        }
        this.f55145d.clear();
        if (!this.f55148g) {
            this.f55144c.clear();
        }
        this.f55148g = true;
        wm1.m29503a(this.f55146e.m28896e());
        ul1.m29042a().m29047c(this);
        this.f55146e.mo23317b();
        this.f55146e = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5566p5
    /* renamed from: a */
    public final void mo27166a(View view) {
        if (this.f55148g || m28678e() == view) {
            return;
        }
        m28674b(view);
        this.f55146e.m28897f();
        Collection<tl1> m29044b = ul1.m29042a().m29044b();
        if (m29044b == null || m29044b.isEmpty()) {
            return;
        }
        for (tl1 tl1Var : m29044b) {
            if (tl1Var != this && tl1Var.m28678e() == view) {
                tl1Var.f55145d.clear();
            }
        }
    }
}
