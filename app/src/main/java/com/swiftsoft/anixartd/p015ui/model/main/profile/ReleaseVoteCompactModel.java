package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVoteCompactModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseVoteCompactModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseVoteCompactModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29845k;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29847m;

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f29849o;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29846l = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public String f29848n = "";

    /* compiled from: ReleaseVoteCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseVoteCompactModel$Companion;", "", "", "IMAGE_CHANGED", "I", "TITLE_CHANGED", "VOTED_AT_CHANGED", "VOTE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseVoteCompactModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseVoteCompactModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void m16072g(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29845k);
        TextView textView = (TextView) view2.findViewById(C2507R.id.votedAt);
        Time time = Time.f30247a;
        Context context2 = view2.getContext();
        Intrinsics.m32178g(context2, "view.context");
        textView.setText(time.m16361g(context2, this.f29847m));
        Integer num = this.f29846l;
        if (num != null) {
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT == 28) {
                RatingBar ratingBar = (RatingBar) view2.findViewById(C2507R.id.rating_bar);
                Intrinsics.m32178g(ratingBar, "view.rating_bar");
                ViewsKt.m16372e(ratingBar);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_bar_text);
                Intrinsics.m32178g(linearLayout, "view.rating_bar_text");
                ViewsKt.m16378k(linearLayout);
            }
            ((RatingBar) view2.findViewById(C2507R.id.rating_bar)).setRating(intValue);
            TextView textView2 = (TextView) view2.findViewById(C2507R.id.rating_text);
            String string = context.getString(C2507R.string.rating_text);
            Intrinsics.m32178g(string, "context.getString(R.string.rating_text)");
            C2052a.m12290y(new Object[]{Integer.valueOf(intValue)}, 1, string, "format(format, *args)", textView2);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29848n);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.ReleaseVoteCompactModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVoteCompactModel releaseVoteCompactModel = ReleaseVoteCompactModel.this;
                ReleaseVoteCompactModel.Listener listener = releaseVoteCompactModel.f29849o;
                if (listener != null) {
                    listener.m16072g(releaseVoteCompactModel.f6925b);
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
        if (epoxyModel instanceof ReleaseVoteCompactModel) {
            ReleaseVoteCompactModel releaseVoteCompactModel = (ReleaseVoteCompactModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29845k, releaseVoteCompactModel.f29845k)) {
                m12276k.add(0);
            }
            if (this.f29847m != releaseVoteCompactModel.f29847m) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29846l, releaseVoteCompactModel.f29846l)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f29848n, releaseVoteCompactModel.f29848n)) {
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
        Integer num;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29845k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.votedAt);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView.setText(time.m16361g(context, this.f29847m));
        }
        if (list.contains(2) && (num = this.f29846l) != null) {
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT == 28) {
                RatingBar ratingBar = (RatingBar) view.findViewById(C2507R.id.rating_bar);
                Intrinsics.m32178g(ratingBar, "view.rating_bar");
                ViewsKt.m16372e(ratingBar);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_bar_text);
                Intrinsics.m32178g(linearLayout, "view.rating_bar_text");
                ViewsKt.m16378k(linearLayout);
            }
            ((RatingBar) view.findViewById(C2507R.id.rating_bar)).setRating(intValue);
            TextView textView2 = (TextView) view.findViewById(C2507R.id.rating_text);
            String string = m12267b.getString(C2507R.string.rating_text);
            Intrinsics.m32178g(string, "context.getString(R.string.rating_text)");
            C2052a.m12290y(new Object[]{Integer.valueOf(intValue)}, 1, string, "format(format, *args)", textView2);
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29848n);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
