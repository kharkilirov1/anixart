package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6218k;
import java.util.List;

/* loaded from: classes3.dex */
public final class z21 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    @NonNull
    private final s71 f57018a;

    /* renamed from: b */
    @NonNull
    private final nh0 f57019b;

    /* renamed from: c */
    @NonNull
    private final List<u21> f57020c;

    /* renamed from: d */
    @NonNull
    private final C6218k f57021d;

    /* renamed from: e */
    @NonNull
    private final dk0 f57022e;

    public z21(@NonNull s71 s71Var, @NonNull nh0 nh0Var, @NonNull List<u21> list, @NonNull C6218k c6218k, @NonNull dk0 dk0Var) {
        this.f57018a = s71Var;
        this.f57019b = nh0Var;
        this.f57020c = list;
        this.f57021d = c6218k;
        this.f57022e = dk0Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f57020c.size()) {
            return true;
        }
        u21 u21Var = this.f57020c.get(itemId);
        a80 m28840a = u21Var.m28840a();
        ck0 m23899a = this.f57022e.m23899a(this.f57019b.m26912a(u21Var.m28841b(), "social_action"));
        this.f57021d.m30565a(m28840a);
        this.f57018a.m28077a(m28840a.m22403d());
        String m22404e = m28840a.m22404e();
        if (TextUtils.isEmpty(m22404e)) {
            return true;
        }
        m23899a.mo23301a(m22404e);
        return true;
    }
}
