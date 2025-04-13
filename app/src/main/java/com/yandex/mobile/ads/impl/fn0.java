package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class fn0 implements hh0 {

    /* renamed from: a */
    private final int f50393a;

    /* renamed from: b */
    @NonNull
    private final oy0 f50394b = new oy0();

    public fn0(int i2) {
        this.f50393a = i2;
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: a */
    public final TextView mo24705a(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("body_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: b */
    public final MediaView mo24706b(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("media_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (MediaView) oy0.m27130a(MediaView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: c */
    public final TextView mo24707c(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("price_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: d */
    public final TextView mo24708d(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("call_to_action_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: e */
    public final TextView mo24709e(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("warning_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: f */
    public final ImageView mo24710f(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("favicon_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: g */
    public final TextView mo24711g(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("age_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: h */
    public final View mo24712h(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("rating_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: i */
    public final TextView mo24713i(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("title_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: j */
    public final ImageView mo24714j(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("feedback_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: k */
    public final TextView mo24715k(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("sponsored_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: l */
    public final TextView mo24716l(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("domain_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: m */
    public final ImageView mo24717m(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("icon_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (ImageView) oy0.m27130a(ImageView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: n */
    public final TextView mo24718n(@NonNull View view) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m26356a = l60.m26356a("review_count_");
        m26356a.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m26356a.toString());
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.hh0
    @Nullable
    /* renamed from: a */
    public final View mo24704a(@NonNull View view, @NonNull String str) {
        oy0 oy0Var = this.f50394b;
        StringBuilder m27x = C0000a.m27x(str, "_");
        m27x.append(this.f50393a);
        View findViewWithTag = view.findViewWithTag(m27x.toString());
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, findViewWithTag);
    }
}
