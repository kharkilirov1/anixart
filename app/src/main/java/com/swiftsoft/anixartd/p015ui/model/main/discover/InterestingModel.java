package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: InterestingModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/InterestingModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class InterestingModel extends EpoxyModel<View> {

    /* renamed from: n */
    @EpoxyAttribute
    public int f29633n;

    /* renamed from: p */
    @EpoxyAttribute
    public Listener f29635p;

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29630k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29631l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29632m = "";

    /* renamed from: o */
    @EpoxyAttribute
    @NotNull
    public String f29634o = "";

    /* compiled from: InterestingModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/InterestingModel$Companion;", "", "", "DESCRIPTION_CHANGED", "I", "IMAGE_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: InterestingModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/InterestingModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: q0 */
        void mo14552q0(long j2, int i2, @NotNull String str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29630k);
        ((TextView) view2.findViewById(C2507R.id.description)).setText(this.f29631l);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f29632m);
        if (StringsKt.m33879E(this.f29630k) && StringsKt.m33879E(this.f29631l)) {
            ((RelativeLayout) view2.findViewById(C2507R.id.background_cover)).setBackgroundResource(0);
        } else {
            ((RelativeLayout) view2.findViewById(C2507R.id.background_cover)).setBackgroundResource(C2507R.drawable.background_cover);
        }
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.discover.InterestingModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                InterestingModel interestingModel = InterestingModel.this;
                InterestingModel.Listener listener = interestingModel.f29635p;
                if (listener != null) {
                    listener.mo14552q0(interestingModel.f6925b, interestingModel.f29633n, interestingModel.f29634o);
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
        if (epoxyModel instanceof InterestingModel) {
            InterestingModel interestingModel = (InterestingModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29630k, interestingModel.f29630k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29631l, interestingModel.f29631l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29632m, interestingModel.f29632m)) {
                m12276k.add(2);
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
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29630k);
            if (StringsKt.m33879E(this.f29630k) && StringsKt.m33879E(this.f29631l)) {
                ((RelativeLayout) view.findViewById(C2507R.id.background_cover)).setBackgroundResource(0);
            } else {
                ((RelativeLayout) view.findViewById(C2507R.id.background_cover)).setBackgroundResource(C2507R.drawable.background_cover);
            }
        }
        if (list.contains(1)) {
            ((TextView) view.findViewById(C2507R.id.description)).setText(this.f29631l);
            if (StringsKt.m33879E(this.f29630k) && StringsKt.m33879E(this.f29631l)) {
                ((RelativeLayout) view.findViewById(C2507R.id.background_cover)).setBackgroundResource(0);
            } else {
                ((RelativeLayout) view.findViewById(C2507R.id.background_cover)).setBackgroundResource(C2507R.drawable.background_cover);
            }
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f29632m);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
