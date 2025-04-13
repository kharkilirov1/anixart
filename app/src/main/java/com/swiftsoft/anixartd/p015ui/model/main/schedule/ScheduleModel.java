package com.swiftsoft.anixartd.p015ui.model.main.schedule;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScheduleModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/schedule/ScheduleModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ScheduleModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f30087k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f30088l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f30089m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Integer f30090n = 0;

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f30091o;

    /* compiled from: ScheduleModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/schedule/ScheduleModel$Companion;", "", "", "EPISODES_RELEASED_CHANGED", "I", "EPISODES_TOTAL_CHANGED", "IMAGE_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ScheduleModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/schedule/ScheduleModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo15205g(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        String str = this.f30087k;
        Integer num = this.f30089m;
        Integer num2 = this.f30090n;
        if (str == null || str.length() == 0) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText("Без названия");
        } else {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str);
        }
        if (num != null && num2 != null && Intrinsics.m32174c(num, num2)) {
            TextView textView = (TextView) C2052a.m12272g(num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            Intrinsics.m32178g(textView, "view.episodes");
            ViewsKt.m16378k(textView);
        } else if (num != null && num2 != null) {
            C2052a.m12286u(num, " из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView2 = (TextView) view2.findViewById(C2507R.id.episodes);
            Intrinsics.m32178g(textView2, "view.episodes");
            ViewsKt.m16378k(textView2);
        } else if (num != null && num2 == null) {
            TextView textView3 = (TextView) C2052a.m12272g(num, " из ? эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            Intrinsics.m32178g(textView3, "view.episodes");
            ViewsKt.m16378k(textView3);
        } else if (num != null || num2 == null) {
            TextView textView4 = (TextView) view2.findViewById(C2507R.id.episodes);
            Intrinsics.m32178g(textView4, "view.episodes");
            ViewsKt.m16372e(textView4);
        } else {
            C2052a.m12287v("? из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView5 = (TextView) view2.findViewById(C2507R.id.episodes);
            Intrinsics.m32178g(textView5, "view.episodes");
            ViewsKt.m16378k(textView5);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f30088l);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.schedule.ScheduleModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ScheduleModel scheduleModel = ScheduleModel.this;
                ScheduleModel.Listener listener = scheduleModel.f30091o;
                if (listener != null) {
                    listener.mo15205g(scheduleModel.f6925b);
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
        if (epoxyModel instanceof ScheduleModel) {
            ScheduleModel scheduleModel = (ScheduleModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30087k, scheduleModel.f30087k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f30089m, scheduleModel.f30089m)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f30090n, scheduleModel.f30090n)) {
                m12276k.add(2);
            }
            if ((epoxyModel instanceof ReleaseModel) && !Intrinsics.m32174c(this.f30088l, scheduleModel.f30088l)) {
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
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f30087k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30089m);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f30090n, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30089m);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f30090n, textView2);
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f30088l);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
