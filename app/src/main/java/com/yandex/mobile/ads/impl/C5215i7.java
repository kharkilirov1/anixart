package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.i7 */
/* loaded from: classes3.dex */
final class C5215i7 {

    /* renamed from: a */
    @NonNull
    private final C5475n7 f51229a = new C5475n7();

    /* renamed from: b */
    @NonNull
    private final i70 f51230b = new i70();

    /* renamed from: com.yandex.mobile.ads.impl.i7$a */
    public static class a implements View.OnClickListener {

        /* renamed from: a */
        @NonNull
        private final Dialog f51231a;

        /* renamed from: b */
        @NonNull
        private final i70 f51232b;

        public a(@NonNull Dialog dialog, @NonNull i70 i70Var) {
            this.f51231a = dialog;
            this.f51232b = i70Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            Objects.requireNonNull(this.f51232b);
            i70.m25455a(view);
            this.f51231a.dismiss();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i7$b */
    public static class b implements View.OnTouchListener {

        /* renamed from: a */
        private float f51233a;

        /* renamed from: b */
        @NonNull
        private final View f51234b;

        /* renamed from: c */
        @NonNull
        private final Dialog f51235c;

        /* renamed from: d */
        @NonNull
        private final i70 f51236d;

        public b(@NonNull ViewGroup viewGroup, @NonNull Dialog dialog, @NonNull i70 i70Var) {
            this.f51234b = viewGroup;
            this.f51235c = dialog;
            this.f51236d = i70Var;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint
        public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f51233a = rawY;
                return true;
            }
            if (action == 1) {
                if (rawY > this.f51233a) {
                    Objects.requireNonNull(this.f51236d);
                    i70.m25455a(view);
                    this.f51235c.dismiss();
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            float f2 = this.f51233a;
            if (rawY > f2) {
                this.f51234b.setTranslationY(rawY - f2);
            } else {
                this.f51234b.setTranslationY(0.0f);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void m25454a(@NonNull ViewGroup viewGroup, @NonNull Dialog dialog) {
        Objects.requireNonNull(this.f51229a);
        View findViewById = viewGroup.findViewById(C4632R.id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new b(viewGroup, dialog, this.f51230b));
        }
        Objects.requireNonNull(this.f51229a);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C4632R.id.adtune_background_view);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new a(dialog, this.f51230b));
        }
    }
}
