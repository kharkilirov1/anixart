package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4824au;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ju */
/* loaded from: classes3.dex */
final class C5302ju {
    /* renamed from: a */
    public static PopupMenu m25953a(@NonNull Context context, @NonNull ImageView imageView, @NonNull List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < list.size(); i2++) {
            menu.add(0, i2, 0, ((C4824au.a) list.get(i2)).m22624a());
        }
        return popupMenu;
    }
}
