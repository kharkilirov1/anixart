package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class NavigationBarMenu extends MenuBuilder {

    /* renamed from: A */
    public final int f18428A;

    /* renamed from: z */
    @NonNull
    public final Class<?> f18429z;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i2) {
        super(context);
        this.f18429z = cls;
        this.f18428A = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    /* renamed from: a */
    public MenuItem mo599a(int i2, int i3, int i4, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.f18428A) {
            m598B();
            MenuItem mo599a = super.mo599a(i2, i3, i4, charSequence);
            ((MenuItemImpl) mo599a).m633k(true);
            m597A();
            return mo599a;
        }
        String simpleName = this.f18429z.getSimpleName();
        StringBuilder m28y = C0000a.m28y("Maximum number of items supported by ", simpleName, " is ");
        m28y.append(this.f18428A);
        m28y.append(". Limit can be checked with ");
        m28y.append(simpleName);
        m28y.append("#getMaxItemCount()");
        throw new IllegalArgumentException(m28y.toString());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i2, int i3, int i4, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f18429z.getSimpleName() + " does not support submenus");
    }
}
