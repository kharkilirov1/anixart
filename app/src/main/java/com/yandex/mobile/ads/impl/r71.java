package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r71 {

    /* renamed from: a */
    @NonNull
    private final C5999x f54219a = new C5999x();

    /* renamed from: b */
    @NonNull
    private final InterfaceC5830u f54220b = C5895v.m29150a();

    /* renamed from: c */
    @Nullable
    private InterfaceC5677a f54221c;

    /* renamed from: d */
    @Nullable
    private InterfaceC4996e0 f54222d;

    /* renamed from: e */
    @Nullable
    private zi0 f54223e;

    /* renamed from: com.yandex.mobile.ads.impl.r71$a */
    public interface InterfaceC5677a {
        /* renamed from: a */
        void mo27860a();

        /* renamed from: b */
        void mo27861b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.r71$b */
    public class C5678b implements InterfaceC4996e0 {

        /* renamed from: a */
        private final WeakReference<Context> f54224a;

        public C5678b(Context context) {
            this.f54224a = new WeakReference<>(context);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4996e0
        /* renamed from: a */
        public final void mo23985a(@NonNull Activity activity) {
            Context context = this.f54224a.get();
            if (context == null || !context.equals(activity) || r71.this.f54221c == null) {
                return;
            }
            r71.this.f54221c.mo27861b();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4996e0
        /* renamed from: b */
        public final void mo23986b(@NonNull Activity activity) {
            Context context = this.f54224a.get();
            if (context == null || !context.equals(activity) || r71.this.f54221c == null) {
                return;
            }
            r71.this.f54221c.mo27860a();
        }
    }

    /* renamed from: a */
    public final void m27859a(@NonNull View view, @NonNull InterfaceC5677a interfaceC5677a) {
        this.f54221c = interfaceC5677a;
        Context context = view.getContext();
        InterfaceC4996e0 interfaceC4996e0 = this.f54222d;
        if (interfaceC4996e0 != null) {
            this.f54220b.mo28807a(context, interfaceC4996e0);
        }
        zi0 zi0Var = this.f54223e;
        if (zi0Var != null) {
            zi0Var.m30192a();
        }
        C5999x c5999x = this.f54219a;
        Context context2 = view.getContext();
        Objects.requireNonNull(c5999x);
        int i2 = 0;
        while (context2 instanceof ContextWrapper) {
            int i3 = i2 + 1;
            if (i2 >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
            i2 = i3;
        }
        context2 = null;
        if (context2 != null) {
            this.f54222d = new C5678b(context2);
            this.f54223e = new zi0(view, this.f54221c);
            this.f54220b.mo28809b(context2, this.f54222d);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f54223e);
        }
    }

    /* renamed from: a */
    public final void m27858a(@NonNull Context context) {
        this.f54221c = null;
        InterfaceC4996e0 interfaceC4996e0 = this.f54222d;
        if (interfaceC4996e0 != null) {
            this.f54220b.mo28807a(context, interfaceC4996e0);
        }
        zi0 zi0Var = this.f54223e;
        if (zi0Var != null) {
            zi0Var.m30192a();
        }
    }
}
