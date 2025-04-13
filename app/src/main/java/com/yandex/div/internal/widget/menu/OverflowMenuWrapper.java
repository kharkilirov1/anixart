package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;

/* loaded from: classes2.dex */
public class OverflowMenuWrapper {

    /* renamed from: a */
    public int f34091a = 83;

    /* renamed from: b */
    @Nullable
    public Listener f34092b;

    public interface Listener {

        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            /* renamed from: a */
            public void mo16972a(@NonNull PopupMenu popupMenu) {
            }

            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            /* renamed from: b */
            public void mo17446b() {
            }
        }

        /* renamed from: a */
        void mo16972a(@NonNull PopupMenu popupMenu);

        /* renamed from: b */
        void mo17446b();
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public View.OnClickListener m17445a() {
        return new ViewOnClickListenerC2744a(this, 19);
    }
}
