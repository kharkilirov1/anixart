package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionCompactModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCompactModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CollectionCompactModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29473k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29474l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29475m = "";

    /* renamed from: n */
    @EpoxyAttribute
    public long f29476n;

    /* renamed from: o */
    @EpoxyAttribute
    public int f29477o;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29478p;

    /* renamed from: q */
    @EpoxyAttribute
    public boolean f29479q;

    /* renamed from: r */
    @EpoxyAttribute
    public Listener f29480r;

    /* compiled from: CollectionCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCompactModel$Companion;", "", "", "COMMENT_COUNT_CHANGED", "I", "FAVORITE_CHANGED", "FAVORITE_COUNT_CHANGED", "IMAGE_CHANGED", "PRIVATE_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CollectionCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCompactModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: d0 */
        void mo14548d0(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29473k);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f29475m);
        ((TextView) view2.findViewById(C2507R.id.comment_count)).setText(DigitsKt.m16325f(this.f29476n));
        ((TextView) view2.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29477o));
        boolean z = this.f29479q;
        if (z) {
            ((TextView) view2.findViewById(C2507R.id.fav_count)).setTextColor(view2.getResources().getColor(C2507R.color.yellow));
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.fav_icon);
            appCompatImageView2.setImageDrawable(appCompatImageView2.getResources().getDrawable(C2507R.drawable.ic_favorite));
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(appCompatImageView2.getResources().getColor(C2507R.color.yellow)));
        } else if (!z) {
            int m16370c = ViewsKt.m16370c(view2, C2507R.attr.secondaryTextColor);
            ((TextView) view2.findViewById(C2507R.id.fav_count)).setTextColor(m16370c);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.fav_icon);
            appCompatImageView3.setImageDrawable(appCompatImageView3.getResources().getDrawable(C2507R.drawable.ic_favorite_border));
            appCompatImageView3.setImageTintList(ColorStateList.valueOf(m16370c));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.privateCollection);
        Intrinsics.m32178g(relativeLayout, "view.privateCollection");
        ViewsKt.m16379l(relativeLayout, this.f29478p);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.collections.CollectionCompactModel$bind$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionCompactModel collectionCompactModel = CollectionCompactModel.this;
                CollectionCompactModel.Listener listener = collectionCompactModel.f29480r;
                if (listener != null) {
                    listener.mo14548d0(collectionCompactModel.f6925b);
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
        if (epoxyModel instanceof CollectionCompactModel) {
            CollectionCompactModel collectionCompactModel = (CollectionCompactModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29473k, collectionCompactModel.f29473k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29475m, collectionCompactModel.f29475m)) {
                m12276k.add(1);
            }
            if (this.f29476n != collectionCompactModel.f29476n) {
                m12276k.add(2);
            }
            if (this.f29477o != collectionCompactModel.f29477o) {
                m12276k.add(3);
            }
            if (this.f29478p != collectionCompactModel.f29479q) {
                m12276k.add(4);
            }
            if (this.f29479q != collectionCompactModel.f29479q) {
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
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29473k);
        }
        if (list.contains(1)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f29475m);
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.comment_count)).setText(DigitsKt.m16325f(this.f29476n));
        }
        if (list.contains(3)) {
            ((TextView) view.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29477o));
        }
        if (list.contains(4)) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.privateCollection);
            Intrinsics.m32178g(relativeLayout, "view.privateCollection");
            ViewsKt.m16379l(relativeLayout, this.f29478p);
        }
        if (list.contains(5)) {
            boolean z = this.f29479q;
            if (z) {
                ((TextView) view.findViewById(C2507R.id.fav_count)).setTextColor(view.getResources().getColor(C2507R.color.yellow));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.fav_icon);
                appCompatImageView2.setImageDrawable(appCompatImageView2.getResources().getDrawable(C2507R.drawable.ic_favorite));
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(appCompatImageView2.getResources().getColor(C2507R.color.yellow)));
                return;
            }
            if (z) {
                return;
            }
            int m16370c = ViewsKt.m16370c(view, C2507R.attr.secondaryTextColor);
            ((TextView) view.findViewById(C2507R.id.fav_count)).setTextColor(m16370c);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.fav_icon);
            appCompatImageView3.setImageDrawable(appCompatImageView3.getResources().getDrawable(C2507R.drawable.ic_favorite_border));
            appCompatImageView3.setImageTintList(ColorStateList.valueOf(m16370c));
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
