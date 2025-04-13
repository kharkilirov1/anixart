package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
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

/* compiled from: VideoListItemModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class VideoListItemModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30048k;

    /* renamed from: o */
    @EpoxyAttribute
    public long f30052o;

    /* renamed from: s */
    @EpoxyAttribute
    public Listener f30056s;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f30049l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f30050m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f30051n = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f30053p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @NotNull
    public String f30054q = "";

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public String f30055r = "";

    /* compiled from: VideoListItemModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel$Companion;", "", "", "CATEGORY_CHANGED", "I", "HOSTING_ICON_CHANGED", "IMAGE_CHANGED", "NAME_CHANGED", "NICKNAME_CHANGED", "RELEASE_TITLE_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: VideoListItemModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: b */
        void mo14954b(long j2);

        /* renamed from: e */
        void mo14955e(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        boolean z = true;
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30049l.length() > 0 ? this.f30049l : view2.getContext().getString(C2507R.string.unnamed));
        ((TextView) view2.findViewById(C2507R.id.category)).setText(this.f30050m);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f30051n);
        TextView textView = (TextView) view2.findViewById(C2507R.id.timestamp);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f30052o));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.timestamp);
        Intrinsics.m32178g(textView2, "view.timestamp");
        ViewsKt.m16379l(textView2, this.f30052o > 0);
        TextView textView3 = (TextView) view2.findViewById(C2507R.id.dot);
        Intrinsics.m32178g(textView3, "view.dot");
        ViewsKt.m16379l(textView3, this.f30052o > 0);
        ((TextView) view2.findViewById(C2507R.id.release_title)).setText(this.f30053p);
        TextView textView4 = (TextView) view2.findViewById(C2507R.id.release_title);
        Intrinsics.m32178g(textView4, "view.release_title");
        String str = this.f30053p;
        if (str != null && str.length() != 0) {
            z = false;
        }
        ViewsKt.m16373f(textView4, z, false, null, 6);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f30054q);
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.hostingIcon);
        Intrinsics.m32178g(imageView, "view.hostingIcon");
        ViewsKt.m16375h(imageView, this.f30055r);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                VideoListItemModel.this.m16222v2().mo14955e(VideoListItemModel.this.f30048k);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 16));
        ImageView imageView2 = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView2, "view.more");
        ViewsKt.m16377j(imageView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                VideoListItemModel.this.m16222v2().mo14954b(VideoListItemModel.this.f30048k);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof VideoListItemModel) {
            VideoListItemModel videoListItemModel = (VideoListItemModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30049l, videoListItemModel.f30049l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f30050m, videoListItemModel.f30050m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f30051n, videoListItemModel.f30051n)) {
                m12276k.add(3);
            }
            if (this.f30052o != videoListItemModel.f30052o) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f30053p, videoListItemModel.f30053p)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f30054q, videoListItemModel.f30054q)) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f30055r, videoListItemModel.f30055r)) {
                m12276k.add(7);
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
        boolean z = true;
        if (C2052a.m12291z(view, "view", list, "payloads", 1)) {
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f30049l.length() > 0 ? this.f30049l : view.getContext().getString(C2507R.string.unnamed));
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.category)).setText(this.f30050m);
        }
        if (list.contains(3)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f30051n);
        }
        if (list.contains(4)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.timestamp);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView.setText(time.m16361g(context, this.f30052o));
            TextView textView2 = (TextView) view.findViewById(C2507R.id.timestamp);
            Intrinsics.m32178g(textView2, "view.timestamp");
            ViewsKt.m16379l(textView2, this.f30052o > 0);
        }
        if (list.contains(5)) {
            ((TextView) view.findViewById(C2507R.id.release_title)).setText(this.f30053p);
            TextView textView3 = (TextView) view.findViewById(C2507R.id.release_title);
            Intrinsics.m32178g(textView3, "view.release_title");
            String str = this.f30053p;
            if (str != null && str.length() != 0) {
                z = false;
            }
            ViewsKt.m16373f(textView3, z, false, null, 6);
        }
        if (list.contains(6)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f30054q);
        }
        if (list.contains(7)) {
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.hostingIcon);
            Intrinsics.m32178g(imageView, "view.hostingIcon");
            ViewsKt.m16375h(imageView, this.f30055r);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16222v2() {
        Listener listener = this.f30056s;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        ((ImageView) view.findViewById(C2507R.id.more)).setOnClickListener(null);
    }
}
