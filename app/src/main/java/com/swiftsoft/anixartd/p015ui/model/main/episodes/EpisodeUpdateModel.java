package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Time;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: EpisodeUpdateModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeUpdateModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class EpisodeUpdateModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29698k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29699l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29700m = "";

    /* renamed from: n */
    @EpoxyAttribute
    public long f29701n;

    /* compiled from: EpisodeUpdateModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeUpdateModel$Companion;", "", "", "DATE_CHANGED", "I", "NAME_CHANGED", "SOURCE_CHANGED", "TYPE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        String str = this.f29698k;
        String str2 = !(str == null || str.length() == 0) ? this.f29698k : "неизвестная серия";
        String str3 = this.f29699l;
        String str4 = this.f29700m;
        long j2 = this.f29701n;
        TextView textView = (TextView) view2.findViewById(C2507R.id.message);
        StringBuilder m29z = C0000a.m29z("<b>", str2, "</b>, вариант <b>", str3, "</b>, источник <b>");
        m29z.append(str4);
        m29z.append("<b>");
        textView.setText(Html.fromHtml(m29z.toString()));
        ((TextView) view2.findViewById(C2507R.id.date)).setText(j2 != 0 ? Time.f30247a.m16355a(j2) : "время не указано");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof EpisodeUpdateModel) {
            EpisodeUpdateModel episodeUpdateModel = (EpisodeUpdateModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29698k, episodeUpdateModel.f29698k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29699l, episodeUpdateModel.f29699l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29700m, episodeUpdateModel.f29700m)) {
                m12276k.add(2);
            }
            if (this.f29701n != episodeUpdateModel.f29701n) {
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
    public void mo4519b2(@NotNull View view, @NotNull List<Object> payloads) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(payloads, "payloads");
        String str = this.f29698k;
        String str2 = !(str == null || str.length() == 0) ? this.f29698k : "неизвестная серия";
        if (payloads.contains(0)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.message);
            StringBuilder m28y = C0000a.m28y("<b>", str2, "</b>, вариант <b>");
            m28y.append(this.f29699l);
            m28y.append("</b>, источник <b>");
            m28y.append(this.f29700m);
            m28y.append("<b>");
            textView.setText(Html.fromHtml(m28y.toString()));
        }
        if (payloads.contains(1)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.message);
            StringBuilder m28y2 = C0000a.m28y("<b>", str2, "</b>, вариант <b>");
            m28y2.append(this.f29699l);
            m28y2.append("</b>, источник <b>");
            m28y2.append(this.f29700m);
            m28y2.append("<b>");
            textView2.setText(Html.fromHtml(m28y2.toString()));
        }
        if (payloads.contains(2)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.message);
            StringBuilder m28y3 = C0000a.m28y("<b>", str2, "</b>, вариант <b>");
            m28y3.append(this.f29699l);
            m28y3.append("</b>, источник <b>");
            m28y3.append(this.f29700m);
            m28y3.append("<b>");
            textView3.setText(Html.fromHtml(m28y3.toString()));
        }
        if (payloads.contains(3)) {
            TextView textView4 = (TextView) view.findViewById(C2507R.id.date);
            long j2 = this.f29701n;
            textView4.setText(j2 != 0 ? Time.f30247a.m16355a(j2) : "время не указано");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
