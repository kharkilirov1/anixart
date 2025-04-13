package com.yandex.div.core;

import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivVisibilityAction;

@PublicApi
/* loaded from: classes2.dex */
public interface Div2Logger {

    /* renamed from: a */
    public static final Div2Logger f30878a = new Div2Logger() { // from class: com.yandex.div.core.Div2Logger.1
        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: a */
        public /* synthetic */ void mo16566a(Div2View div2View) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: b */
        public /* synthetic */ void mo16567b(Div2View div2View, View view, DivVisibilityAction divVisibilityAction) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: c */
        public /* synthetic */ void mo16568c(Div2View div2View, int i2) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: d */
        public /* synthetic */ void mo16569d(Div2View div2View, int i2, DivAction divAction) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: e */
        public /* synthetic */ void mo16570e(Div2View div2View, DivAction divAction) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: f */
        public /* synthetic */ void mo16571f(Div2View div2View) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: g */
        public /* synthetic */ void mo16572g(Div2View div2View, View view, DivAction divAction) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: h */
        public /* synthetic */ void mo16573h(Div2View div2View, View view, DivAction divAction) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: i */
        public /* synthetic */ void mo16574i(Div2View div2View, DivPager divPager, int i2, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: j */
        public void mo16575j(Div2View div2View, View view, DivAction divAction, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: k */
        public void mo16576k(Div2View div2View, int i2, String str, DivAction divAction) {
            Expression<Uri> expression = divAction.f34556f;
            if (expression != null) {
                expression.mo17535b(div2View.getExpressionResolver());
            }
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: l */
        public void mo16577l(Div2View div2View, View view, DivAction divAction, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: m */
        public /* synthetic */ void mo16578m(Div2View div2View, View view, Float f2) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: n */
        public void mo16579n(Div2View div2View, View view, DivVisibilityAction divVisibilityAction, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: o */
        public /* synthetic */ void mo16580o(Div2View div2View, DivGallery divGallery, int i2, int i3, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: p */
        public void mo16581p(Div2View div2View, View view, DivAction divAction, String str) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: q */
        public /* synthetic */ void mo16582q(Div2View div2View, View view, DivAction divAction, Boolean bool) {
        }

        @Override // com.yandex.div.core.Div2Logger
        /* renamed from: r */
        public /* synthetic */ void mo16583r(Div2View div2View, View view, DivAction divAction) {
        }
    };

    /* renamed from: a */
    void mo16566a(Div2View div2View);

    /* renamed from: b */
    void mo16567b(Div2View div2View, View view, DivVisibilityAction divVisibilityAction);

    /* renamed from: c */
    void mo16568c(Div2View div2View, int i2);

    /* renamed from: d */
    void mo16569d(@NonNull Div2View div2View, int i2, @NonNull DivAction divAction);

    /* renamed from: e */
    void mo16570e(Div2View div2View, DivAction divAction);

    /* renamed from: f */
    void mo16571f(Div2View div2View);

    /* renamed from: g */
    void mo16572g(Div2View div2View, View view, DivAction divAction);

    /* renamed from: h */
    void mo16573h(Div2View div2View, View view, DivAction divAction);

    /* renamed from: i */
    void mo16574i(Div2View div2View, DivPager divPager, int i2, @ScrollDirection String str);

    /* renamed from: j */
    void mo16575j(Div2View div2View, View view, DivAction divAction, String str);

    /* renamed from: k */
    void mo16576k(Div2View div2View, int i2, @Nullable String str, DivAction divAction);

    /* renamed from: l */
    void mo16577l(Div2View div2View, View view, DivAction divAction, String str);

    /* renamed from: m */
    void mo16578m(Div2View div2View, View view, @Nullable Float f2);

    /* renamed from: n */
    void mo16579n(Div2View div2View, View view, DivVisibilityAction divVisibilityAction, String str);

    /* renamed from: o */
    void mo16580o(Div2View div2View, DivGallery divGallery, int i2, int i3, @ScrollDirection String str);

    /* renamed from: p */
    void mo16581p(Div2View div2View, View view, DivAction divAction, String str);

    /* renamed from: q */
    void mo16582q(Div2View div2View, View view, DivAction divAction, Boolean bool);

    /* renamed from: r */
    void mo16583r(Div2View div2View, View view, DivAction divAction);
}
