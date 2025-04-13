package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel;
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

/* compiled from: VideoAppealListItemModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoAppealListItemModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class VideoAppealListItemModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30029k;

    /* renamed from: o */
    @EpoxyAttribute
    public long f30033o;

    /* renamed from: s */
    @EpoxyAttribute
    public Listener f30037s;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f30030l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f30031m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f30032n = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f30034p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @NotNull
    public String f30035q = "";

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public String f30036r = "";

    /* compiled from: VideoAppealListItemModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoAppealListItemModel$Companion;", "", "", "CATEGORY_CHANGED", "I", "HOSTING_ICON_CHANGED", "IMAGE_CHANGED", "NAME_CHANGED", "RELEASE_TITLE_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: VideoAppealListItemModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoAppealListItemModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14935a(long j2);

        /* renamed from: d */
        void mo14936d(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30030l.length() > 0 ? this.f30030l : view2.getContext().getString(C2507R.string.unnamed));
        ((TextView) view2.findViewById(C2507R.id.category)).setText(this.f30031m);
        TextView textView = (TextView) view2.findViewById(C2507R.id.timestamp);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f30033o));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.timestamp);
        Intrinsics.m32178g(textView2, "view.timestamp");
        ViewsKt.m16379l(textView2, this.f30033o > 0);
        TextView textView3 = (TextView) view2.findViewById(C2507R.id.dot);
        Intrinsics.m32178g(textView3, "view.dot");
        ViewsKt.m16379l(textView3, this.f30033o > 0);
        ((TextView) view2.findViewById(C2507R.id.release_title)).setText(this.f30034p);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f30035q);
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.hostingIcon);
        Intrinsics.m32178g(imageView, "view.hostingIcon");
        ViewsKt.m16375h(imageView, this.f30036r);
        Button button = (Button) view2.findViewById(C2507R.id.btn_delete);
        Intrinsics.m32178g(button, "view.btn_delete");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                VideoAppealListItemModel videoAppealListItemModel = VideoAppealListItemModel.this;
                VideoAppealListItemModel.Listener listener = videoAppealListItemModel.f30037s;
                if (listener != null) {
                    listener.mo14935a(videoAppealListItemModel.f30029k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoAppealListItemModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                VideoAppealListItemModel videoAppealListItemModel = VideoAppealListItemModel.this;
                VideoAppealListItemModel.Listener listener = videoAppealListItemModel.f30037s;
                if (listener != null) {
                    listener.mo14936d(videoAppealListItemModel.f30029k);
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
        if (epoxyModel instanceof VideoAppealListItemModel) {
            VideoAppealListItemModel videoAppealListItemModel = (VideoAppealListItemModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30030l, videoAppealListItemModel.f30030l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f30031m, videoAppealListItemModel.f30031m)) {
                m12276k.add(2);
            }
            if (this.f30033o != videoAppealListItemModel.f30033o) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f30034p, videoAppealListItemModel.f30034p)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f30035q, videoAppealListItemModel.f30035q)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f30036r, videoAppealListItemModel.f30036r)) {
                m12276k.add(6);
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
        if (C2052a.m12291z(view, "view", list, "payloads", 1)) {
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f30030l.length() > 0 ? this.f30030l : view.getContext().getString(C2507R.string.unnamed));
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.category)).setText(this.f30031m);
        }
        if (list.contains(3)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.timestamp);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView.setText(time.m16361g(context, this.f30033o));
            TextView textView2 = (TextView) view.findViewById(C2507R.id.timestamp);
            Intrinsics.m32178g(textView2, "view.timestamp");
            ViewsKt.m16379l(textView2, this.f30033o > 0);
        }
        if (list.contains(4)) {
            ((TextView) view.findViewById(C2507R.id.release_title)).setText(this.f30034p);
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f30035q);
        }
        if (list.contains(6)) {
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.hostingIcon);
            Intrinsics.m32178g(imageView, "view.hostingIcon");
            ViewsKt.m16375h(imageView, this.f30036r);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
        ((Button) view.findViewById(C2507R.id.btn_delete)).setOnClickListener(null);
    }
}
