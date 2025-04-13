package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.tw0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class u10 {

    /* renamed from: a */
    private final kw0 f55326a;

    /* renamed from: b */
    private final InterfaceC5834b f55327b;

    /* renamed from: c */
    private final HashMap<String, C5833a> f55328c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C5833a> f55329d = new HashMap<>();

    /* renamed from: e */
    private final Handler f55330e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private Runnable f55331f;

    /* renamed from: com.yandex.mobile.ads.impl.u10$a */
    public static class C5833a {

        /* renamed from: a */
        private final zv0<?> f55332a;

        /* renamed from: b */
        private Bitmap f55333b;

        /* renamed from: c */
        private qh1 f55334c;

        /* renamed from: d */
        private final ArrayList f55335d;

        public C5833a(x10 x10Var, C5835c c5835c) {
            ArrayList arrayList = new ArrayList();
            this.f55335d = arrayList;
            this.f55332a = x10Var;
            arrayList.add(c5835c);
        }

        /* renamed from: b */
        public final boolean m28828b(C5835c c5835c) {
            this.f55335d.remove(c5835c);
            if (this.f55335d.size() != 0) {
                return false;
            }
            this.f55332a.mo26796a();
            return true;
        }

        /* renamed from: a */
        public final void m28826a(qh1 qh1Var) {
            this.f55334c = qh1Var;
        }

        /* renamed from: a */
        public final qh1 m28825a() {
            return this.f55334c;
        }

        /* renamed from: a */
        public final void m28827a(C5835c c5835c) {
            this.f55335d.add(c5835c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.u10$b */
    public interface InterfaceC5834b {
        @Nullable
        /* renamed from: a */
        Bitmap mo28829a(String str);

        /* renamed from: a */
        void mo28830a(String str, Bitmap bitmap);
    }

    /* renamed from: com.yandex.mobile.ads.impl.u10$d */
    public interface InterfaceC5836d extends tw0.InterfaceC5821a {
        /* renamed from: a */
        void mo25927a(C5835c c5835c, boolean z);
    }

    public u10(kw0 kw0Var, InterfaceC5834b interfaceC5834b) {
        this.f55326a = kw0Var;
        this.f55327b = interfaceC5834b;
    }

    /* renamed from: a */
    public String mo28039a(String str, ImageView.ScaleType scaleType) {
        throw null;
    }

    /* renamed from: a */
    public final C5835c m28818a(String str, InterfaceC5836d interfaceC5836d) {
        return m28819a(str, interfaceC5836d, 0, 0);
    }

    /* renamed from: a */
    public final C5835c m28819a(String str, InterfaceC5836d interfaceC5836d, int i2, int i3) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String mo28039a = mo28039a(str, scaleType);
            Bitmap mo28829a = this.f55327b.mo28829a(mo28039a);
            if (mo28829a != null) {
                C5835c c5835c = new C5835c(mo28829a, null, null);
                interfaceC5836d.mo25927a(c5835c, true);
                return c5835c;
            }
            C5835c c5835c2 = new C5835c(null, mo28039a, interfaceC5836d);
            interfaceC5836d.mo25927a(c5835c2, true);
            C5833a c5833a = this.f55328c.get(mo28039a);
            if (c5833a == null) {
                c5833a = this.f55329d.get(mo28039a);
            }
            if (c5833a != null) {
                c5833a.m28827a(c5835c2);
            } else {
                x10 x10Var = new x10(str, new r10(this, mo28039a), i2, i3, scaleType, Bitmap.Config.RGB_565, new s10(this, mo28039a));
                this.f55326a.m26292a(x10Var);
                this.f55328c.put(mo28039a, new C5833a(x10Var, c5835c2));
            }
            return c5835c2;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }

    /* renamed from: com.yandex.mobile.ads.impl.u10$c */
    public class C5835c {

        /* renamed from: a */
        private Bitmap f55336a;

        /* renamed from: b */
        private final InterfaceC5836d f55337b;

        /* renamed from: c */
        private final String f55338c;

        public C5835c(Bitmap bitmap, String str, InterfaceC5836d interfaceC5836d) {
            this.f55336a = bitmap;
            this.f55338c = str;
            this.f55337b = interfaceC5836d;
        }

        @MainThread
        /* renamed from: a */
        public final void m28833a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.f55337b == null) {
                return;
            }
            C5833a c5833a = (C5833a) u10.this.f55328c.get(this.f55338c);
            if (c5833a != null) {
                if (c5833a.m28828b(this)) {
                    u10.this.f55328c.remove(this.f55338c);
                    return;
                }
                return;
            }
            C5833a c5833a2 = (C5833a) u10.this.f55329d.get(this.f55338c);
            if (c5833a2 != null) {
                c5833a2.m28828b(this);
                if (c5833a2.f55335d.size() == 0) {
                    u10.this.f55329d.remove(this.f55338c);
                }
            }
        }

        /* renamed from: b */
        public final Bitmap m28834b() {
            return this.f55336a;
        }
    }

    /* renamed from: a */
    public final void m28820a(String str, Bitmap bitmap) {
        this.f55327b.mo28830a(str, bitmap);
        C5833a remove = this.f55328c.remove(str);
        if (remove != null) {
            remove.f55333b = bitmap;
            this.f55329d.put(str, remove);
            if (this.f55331f == null) {
                t10 t10Var = new t10(this);
                this.f55331f = t10Var;
                this.f55330e.postDelayed(t10Var, 100);
            }
        }
    }

    /* renamed from: a */
    public final void m28821a(String str, qh1 qh1Var) {
        C5833a remove = this.f55328c.remove(str);
        if (remove != null) {
            remove.m28826a(qh1Var);
            this.f55329d.put(str, remove);
            if (this.f55331f == null) {
                t10 t10Var = new t10(this);
                this.f55331f = t10Var;
                this.f55330e.postDelayed(t10Var, 100);
            }
        }
    }
}
