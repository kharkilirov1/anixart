package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.u10;
import okhttp3.internal.p038ws.RealWebSocket;

/* loaded from: classes3.dex */
public final class vm0 {

    /* renamed from: c */
    @NonNull
    private static final Object f55836c = new Object();

    /* renamed from: d */
    private static volatile vm0 f55837d;

    /* renamed from: a */
    @NonNull
    private final u10 f55838a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5930c f55839b;

    /* renamed from: com.yandex.mobile.ads.impl.vm0$a */
    public class C5928a extends LruCache<String, Bitmap> {
        public C5928a(int i2) {
            super(i2);
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2 != null ? bitmap2.getByteCount() / RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE : super.sizeOf(str, null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vm0$b */
    public static class C5929b implements u10.InterfaceC5834b {

        /* renamed from: a */
        @NonNull
        private final LruCache<String, Bitmap> f55840a;

        public C5929b(@NonNull LruCache<String, Bitmap> lruCache) {
            this.f55840a = lruCache;
        }

        @Override // com.yandex.mobile.ads.impl.u10.InterfaceC5834b
        /* renamed from: a */
        public final Bitmap mo28829a(String str) {
            return this.f55840a.get(str);
        }

        @Override // com.yandex.mobile.ads.impl.u10.InterfaceC5834b
        /* renamed from: a */
        public final void mo28830a(String str, Bitmap bitmap) {
            this.f55840a.put(str, bitmap);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vm0$c */
    public interface InterfaceC5930c {
        @Nullable
        /* renamed from: a */
        Bitmap mo23080a(@NonNull String str);

        /* renamed from: a */
        void mo23081a(@NonNull String str, @NonNull Bitmap bitmap);
    }

    private vm0(@NonNull Context context) {
        LruCache m29237a = m29237a(context);
        kw0 m29238b = m29238b(context);
        C5929b c5929b = new C5929b(m29237a);
        p10 p10Var = new p10();
        this.f55839b = new c91(m29237a, p10Var);
        this.f55838a = new s11(m29238b, c5929b, p10Var);
    }

    @NonNull
    /* renamed from: c */
    public static vm0 m29239c(@NonNull Context context) {
        if (f55837d == null) {
            synchronized (f55836c) {
                if (f55837d == null) {
                    f55837d = new vm0(context);
                }
            }
        }
        return f55837d;
    }

    @NonNull
    /* renamed from: a */
    public final u10 m29240a() {
        return this.f55838a;
    }

    @NonNull
    /* renamed from: b */
    public final InterfaceC5930c m29241b() {
        return this.f55839b;
    }

    @NonNull
    /* renamed from: a */
    private static LruCache m29237a(Context context) {
        int i2;
        try {
            i2 = Math.min(((int) (Runtime.getRuntime().maxMemory() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) / 8, ((int) (((r5.widthPixels * r5.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024.0f)) * 3);
        } catch (IllegalArgumentException e2) {
            n60.m26808a(e2, "Unable to calculate available memory space, defaulting to minimum", new Object[0]);
            i2 = 5120;
        }
        return new C5928a(Math.max(i2, 5120));
    }

    @NonNull
    /* renamed from: b */
    private static kw0 m29238b(@NonNull Context context) {
        kw0 m26541a = lw0.m26541a(context, 4);
        m26541a.m26290a();
        return m26541a;
    }
}
