package com.swiftsoft.anixartd.p015ui.model.common;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SectionHeaderModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SectionHeaderModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public int f29432k;

    /* renamed from: n */
    @EpoxyAttribute
    public boolean f29435n;

    /* renamed from: p */
    @EpoxyAttribute
    public Listener f29437p;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29433l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29434m = "";

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public Integer f29436o = 0;

    /* compiled from: SectionHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Companion;", "", "", "BADGE_TEXT_CHANGED", "I", "SHOW_BUTTON_CHANGED", "TITLE_RESOURCE_ID_CHANGED", "TITLE_TEXT_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: SectionHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo14776g(@Nullable Integer num);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        if (this.f29432k != 0) {
            ((TextView) view2.findViewById(C2507R.id.tvTitle)).setText(context.getString(this.f29432k));
        }
        String str = this.f29433l;
        if (!(str == null || str.length() == 0)) {
            ((TextView) view2.findViewById(C2507R.id.tvTitle)).setText(this.f29433l);
        }
        TextView bind$lambda$1 = (TextView) view2.findViewById(C2507R.id.tvBadge);
        Intrinsics.m32178g(bind$lambda$1, "bind$lambda$1");
        ViewsKt.m16379l(bind$lambda$1, this.f29434m.length() > 0);
        bind$lambda$1.setText(this.f29434m);
        TextView bind$lambda$2 = (TextView) view2.findViewById(C2507R.id.btn);
        Intrinsics.m32178g(bind$lambda$2, "bind$lambda$2");
        ViewsKt.m16379l(bind$lambda$2, this.f29435n);
        ViewsKt.m16377j(bind$lambda$2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel$bind$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                SectionHeaderModel sectionHeaderModel = SectionHeaderModel.this;
                SectionHeaderModel.Listener listener = sectionHeaderModel.f29437p;
                if (listener != null) {
                    listener.mo14776g(sectionHeaderModel.f29436o);
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
        if (epoxyModel instanceof SectionHeaderModel) {
            SectionHeaderModel sectionHeaderModel = (SectionHeaderModel) epoxyModel;
            if (this.f29432k != sectionHeaderModel.f29432k) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29433l, sectionHeaderModel.f29433l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29434m, sectionHeaderModel.f29434m)) {
                m12276k.add(2);
            }
            if (this.f29435n != sectionHeaderModel.f29435n) {
                m12276k.add(3);
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
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0) && this.f29432k != 0) {
            ((TextView) view.findViewById(C2507R.id.tvTitle)).setText(m12267b.getString(this.f29432k));
        }
        if (list.contains(1)) {
            String str = this.f29433l;
            if (!(str == null || str.length() == 0)) {
                ((TextView) view.findViewById(C2507R.id.tvTitle)).setText(this.f29433l);
            }
        }
        if (list.contains(2)) {
            TextView bind$lambda$0 = (TextView) view.findViewById(C2507R.id.tvBadge);
            Intrinsics.m32178g(bind$lambda$0, "bind$lambda$0");
            ViewsKt.m16379l(bind$lambda$0, this.f29434m.length() > 0);
            bind$lambda$0.setText(this.f29434m);
        }
        if (list.contains(3)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.btn);
            Intrinsics.m32178g(textView, "view.btn");
            ViewsKt.m16379l(textView, this.f29435n);
        }
    }
}
