package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class jh0 implements hh0 {

    /* renamed from: a */
    @NonNull
    private final oy0 f51611a = new oy0();

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: a */
    public final TextView mo24705a(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("body");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: b */
    public final MediaView mo24706b(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("media");
        Objects.requireNonNull(oy0Var);
        return (MediaView) oy0.m27130a(MediaView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: c */
    public final TextView mo24707c(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("price");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: d */
    public final TextView mo24708d(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("call_to_action");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: e */
    public final TextView mo24709e(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("warning");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: f */
    public final ImageView mo24710f(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("favicon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: g */
    public final TextView mo24711g(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("age");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: h */
    public final View mo24712h(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("rating");
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: i */
    public final TextView mo24713i(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("title");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: j */
    public final ImageView mo24714j(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("feedback");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: k */
    public final TextView mo24715k(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("sponsored");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: l */
    public final TextView mo24716l(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("domain");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: m */
    public final ImageView mo24717m(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("icon");
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: n */
    public final TextView mo24718n(@NonNull View view) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag("review_count");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: a */
    public final View mo24704a(@NonNull View view, @NonNull String str) {
        oy0 oy0Var = this.f51611a;
        View findViewWithTag = view.findViewWithTag(str);
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, findViewWithTag);
    }
}
