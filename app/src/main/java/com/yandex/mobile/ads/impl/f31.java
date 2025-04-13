package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f31 {

    /* renamed from: a */
    @NonNull
    private mr0 f50111a = new mr0();

    @NonNull
    /* renamed from: a */
    public final PopupMenu m24303a(@NonNull View view, @NonNull w10 w10Var, @NonNull List<u21> list) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, 5);
        Objects.requireNonNull(this.f50111a);
        mr0.m26759a(popupMenu);
        Menu menu = popupMenu.getMenu();
        Context context = view.getContext();
        for (int i2 = 0; i2 < list.size(); i2++) {
            w21 m28842c = list.get(i2).m28842c();
            menu.add(0, i2, i2, m28842c.m29369b()).setIcon(new BitmapDrawable(context.getResources(), w10Var.mo24878a(m28842c.m29368a())));
        }
        return popupMenu;
    }
}
