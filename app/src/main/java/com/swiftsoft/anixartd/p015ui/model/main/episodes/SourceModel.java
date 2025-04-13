package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SourceModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/SourceModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SourceModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29705k;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29707m;

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f29709o;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29706l = "";

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Long f29708n = 0L;

    /* compiled from: SourceModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/SourceModel$Companion;", "", "", "EPISODES_COUNT_CHANGED", "I", "LAST_UPDATE_CHANGED", "NAME_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: SourceModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/SourceModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: f */
        void mo14589f(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.primaryText)).setText(this.f29706l);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.mark_new);
        Intrinsics.m32178g(relativeLayout, "view.mark_new");
        long j2 = this.f29705k;
        Long l2 = this.f29708n;
        ViewsKt.m16379l(relativeLayout, l2 != null && j2 == l2.longValue());
        TextView textView = (TextView) view2.findViewById(C2507R.id.episodesCountText);
        String string = context.getString(C2507R.string.episodes_count_shorten);
        Intrinsics.m32178g(string, "context.getString(R.string.episodes_count_shorten)");
        C2052a.m12290y(new Object[]{Long.valueOf(this.f29707m)}, 1, string, "format(format, *args)", textView);
        ViewsKt.m16379l(textView, this.f29707m > 0);
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.dot);
        Intrinsics.m32178g(textView2, "view.dot");
        ViewsKt.m16379l(textView2, this.f29707m > 0);
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 9));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof SourceModel) {
            SourceModel sourceModel = (SourceModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29706l, sourceModel.f29706l)) {
                m12276k.add(0);
            }
            if (this.f29707m != sourceModel.f29707m) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29708n, sourceModel.f29708n)) {
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
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        boolean z = false;
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.primaryText)).setText(this.f29706l);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodesCountText);
            String string = m12267b.getString(C2507R.string.episodes_count_shorten);
            Intrinsics.m32178g(string, "context.getString(R.string.episodes_count_shorten)");
            C2052a.m12290y(new Object[]{Long.valueOf(this.f29707m)}, 1, string, "format(format, *args)", textView);
            ViewsKt.m16379l(textView, this.f29707m > 0);
            TextView textView2 = (TextView) view.findViewById(C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16379l(textView2, this.f29707m > 0);
        }
        if (list.contains(2)) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.mark_new);
            Intrinsics.m32178g(relativeLayout, "view.mark_new");
            long j2 = this.f29705k;
            Long l2 = this.f29708n;
            if (l2 != null && j2 == l2.longValue()) {
                z = true;
            }
            ViewsKt.m16379l(relativeLayout, z);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
