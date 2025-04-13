package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Category;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModel;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RelatedCompactModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedCompactModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class RelatedCompactModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29980k;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29981l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29982m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29983n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29984o = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public Category f29985p;

    /* renamed from: q */
    @EpoxyAttribute
    public boolean f29986q;

    /* renamed from: r */
    @EpoxyAttribute
    public Listener f29987r;

    /* compiled from: RelatedCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedCompactModel$Companion;", "", "", "CATEGORY_CHANGED", "I", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "TITLE_CHANGED", "YEAR_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: RelatedCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedCompactModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo15032g(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        long j2 = this.f29980k;
        String str = this.f29981l;
        String str2 = this.f29982m;
        Double d = this.f29983n;
        view2.setEnabled(j2 != this.f6925b);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.inactive);
        Intrinsics.m32178g(linearLayout, "view.inactive");
        ViewsKt.m16380m(linearLayout, j2 == this.f6925b);
        if (str != null) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str);
        }
        if (str2 == null || str2.length() == 0) {
            TextView textView = (TextView) view2.findViewById(C2507R.id.year);
            TextView textView2 = (TextView) C2052a.m12271f(textView, "view.year", textView, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16372e(textView2);
        } else {
            TextView textView3 = (TextView) view2.findViewById(C2507R.id.year);
            TextView textView4 = (TextView) C2052a.m12265C(textView3, "view.year", textView3, view2, C2507R.id.dot);
            ((TextView) C2052a.m12265C(textView4, "view.dot", textView4, view2, C2507R.id.year)).setText(str2 + " год");
        }
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout2, "view.rating_layout");
        ViewsKt.m16379l(linearLayout2, this.f29986q);
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29984o);
        TextView textView5 = (TextView) view2.findViewById(C2507R.id.category);
        Intrinsics.m32178g(textView5, "view.category");
        ViewsKt.m16379l(textView5, this.f29985p != null);
        Category category = this.f29985p;
        if (category != null) {
            ((TextView) view2.findViewById(C2507R.id.category)).setText(category.getName());
        }
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.RelatedCompactModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                RelatedCompactModel relatedCompactModel = RelatedCompactModel.this;
                RelatedCompactModel.Listener listener = relatedCompactModel.f29987r;
                if (listener != null) {
                    listener.mo15032g(relatedCompactModel.f6925b);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof RelatedModel) {
            RelatedModel relatedModel = (RelatedModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29981l, relatedModel.f29997l)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29982m, relatedModel.f30004s)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32172a(this.f29983n, relatedModel.f30000o)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f29984o, relatedModel.f30002q)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29985p, relatedModel.f30003r)) {
                m12276k.add(4);
            }
            if (this.f29986q != relatedModel.f30010y) {
                m12276k.add(5);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_related_compact;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        Double d;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29981l);
        }
        if (list.contains(1)) {
            String str = this.f29982m;
            if (str == null || str.length() == 0) {
                ((TextView) view.findViewById(C2507R.id.year)).setText(this.f29982m + " год");
            }
        }
        if (list.contains(2) && (d = this.f29983n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29984o);
        }
        if (list.contains(4)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.category);
            Intrinsics.m32178g(textView, "view.category");
            ViewsKt.m16379l(textView, this.f29985p != null);
            Category category = this.f29985p;
            if (category != null) {
                ((TextView) view.findViewById(C2507R.id.category)).setText(category.getName());
            }
        }
        if (list.contains(5)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f29986q);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
