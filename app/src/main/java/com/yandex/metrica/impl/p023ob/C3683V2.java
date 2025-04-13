package com.yandex.metrica.impl.p023ob;

import android.app.WallpaperManager;

/* renamed from: com.yandex.metrica.impl.ob.V2 */
/* loaded from: classes2.dex */
final class C3683V2<T, R> implements InterfaceC3728Wm<WallpaperManager, Integer> {

    /* renamed from: a */
    public final /* synthetic */ int f44199a;

    public C3683V2(int i2) {
        this.f44199a = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3728Wm
    /* renamed from: a */
    public Integer mo18117a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.f44199a));
    }
}
