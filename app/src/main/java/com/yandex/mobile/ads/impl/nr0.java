package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4824au;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.nativeads.C6218k;
import java.util.List;

/* loaded from: classes3.dex */
final class nr0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    @NonNull
    private final wv0 f53082a;

    /* renamed from: b */
    @NonNull
    private final C4957d6 f53083b;

    /* renamed from: c */
    @NonNull
    private final List<C4824au.a> f53084c;

    /* renamed from: d */
    @NonNull
    private final C6218k f53085d;

    public nr0(@NonNull C4957d6 c4957d6, @NonNull List<C4824au.a> list, @NonNull wv0 wv0Var, @NonNull C6218k c6218k) {
        this.f53084c = list;
        this.f53083b = c4957d6;
        this.f53082a = wv0Var;
        this.f53085d = c6218k;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f53084c.size()) {
            return true;
        }
        this.f53083b.m23816a(this.f53084c.get(itemId).m22625b());
        ((C6123zh) this.f53082a).m30189a(sv0.EnumC5764b.f54815C);
        this.f53085d.mo26794a();
        return true;
    }
}
