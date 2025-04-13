package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6218k;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;

/* loaded from: classes3.dex */
public final class a31 {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f48299a;

    /* renamed from: b */
    @NonNull
    private final nh0 f48300b;

    /* renamed from: c */
    @NonNull
    private final w10 f48301c;

    /* renamed from: d */
    @NonNull
    private final C6218k f48302d;

    /* renamed from: e */
    @NonNull
    private final dk0 f48303e;

    /* renamed from: f */
    @NonNull
    private final f31 f48304f = new f31();

    public a31(@NonNull C5101g2 c5101g2, @NonNull nh0 nh0Var, @NonNull C6218k c6218k, @NonNull C6264w c6264w, @NonNull dk0 dk0Var) {
        this.f48299a = c5101g2;
        this.f48300b = nh0Var;
        this.f48302d = c6218k;
        this.f48303e = dk0Var;
        this.f48301c = c6264w.m30753d();
    }

    /* renamed from: a */
    public final void m22371a(@NonNull View view, @NonNull r21 r21Var) {
        List<u21> m27825b = r21Var.m27825b();
        if (m27825b.isEmpty()) {
            return;
        }
        PopupMenu m24303a = this.f48304f.m24303a(view, this.f48301c, m27825b);
        m24303a.setOnMenuItemClickListener(new z21(new s71(new C4957d6(view.getContext(), this.f48299a)), this.f48300b, m27825b, this.f48302d, this.f48303e));
        m24303a.show();
    }
}
