package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.ByteStreamsKt;
import kotlin.p033io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mk1 implements InterfaceC6081yl {

    /* renamed from: a */
    private final Context f52699a;

    /* renamed from: b */
    private final Context f52700b;

    public mk1(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f52699a = context.getApplicationContext();
        this.f52700b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6081yl
    @NotNull
    /* renamed from: a */
    public final byte[][] mo26689a() {
        try {
            InputStream it = this.f52700b.getResources().openRawResource(C4632R.raw.yandexinternalca);
            try {
                Intrinsics.m32178g(it, "it");
                byte[] m32137a = ByteStreamsKt.m32137a(it);
                CloseableKt.m32138a(it, null);
                try {
                    it = this.f52699a.getResources().openRawResource(C4632R.raw.bundled_cert);
                    try {
                        Intrinsics.m32178g(it, "it");
                        byte[] m32137a2 = ByteStreamsKt.m32137a(it);
                        CloseableKt.m32138a(it, null);
                        Object[] result = Arrays.copyOf(new byte[][]{m32137a2}, 2);
                        System.arraycopy(new byte[][]{m32137a}, 0, result, 1, 1);
                        Intrinsics.m32178g(result, "result");
                        return (byte[][]) result;
                    } finally {
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Failed to create cert", e2);
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (IOException e3) {
            throw new IllegalStateException("Failed to create cert", e3);
        }
    }
}
