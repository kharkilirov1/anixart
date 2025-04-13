package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.impl.C5069fa;
import com.yandex.mobile.ads.impl.C5474n6;
import com.yandex.mobile.ads.impl.e60;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.g90;
import com.yandex.mobile.ads.impl.i90;
import com.yandex.mobile.ads.impl.ke0;
import com.yandex.mobile.ads.impl.se0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/mobile/ads/core/initializer/MobileAdsInitializeProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "mobileads_externalRelease"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.m32179h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        Intrinsics.m32179h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.m32179h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        if (C5474n6.m26806a(context)) {
            se0.InterfaceC5743a m28235a = se0.m28235a(context, BuildConfigFieldProvider.isInternalOrAutotestBuild());
            if (m28235a instanceof se0.InterfaceC5743a.b) {
                e60.m24034a(f60.m24321a((se0.InterfaceC5743a.b) m28235a), new Object[0]);
            } else if (m28235a instanceof se0.InterfaceC5743a.a) {
                e60.m24036b(C0000a.m16m("Yandex Mobile Ads ", BuildConfigFieldProvider.getVersion(), " integrated successfully"), new Object[0]);
            }
            new ke0(BuildConfigFieldProvider.isInternalOrAutotestBuild()).m27911a();
        }
        i90 i90Var = new i90();
        Boolean m25463a = i90.m25463a(context);
        if (m25463a != null) {
            MobileAds.setAgeRestrictedUser(m25463a.booleanValue());
        }
        new C5069fa(new g90(), i90Var).m24378a(context);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.m32179h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.m32179h(uri, "uri");
        return 0;
    }
}
