package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationEpisodeModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationEpisodeModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class NotificationEpisodeModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29764k;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29765l;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29766m;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public String f29767n;

    /* renamed from: o */
    @EpoxyAttribute
    public String f29768o;

    /* renamed from: p */
    @EpoxyAttribute
    public String f29769p;

    /* renamed from: q */
    @EpoxyAttribute
    public long f29770q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29771r;

    /* renamed from: s */
    @EpoxyAttribute
    public Listener f29772s;

    /* compiled from: NotificationEpisodeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationEpisodeModel$Companion;", "", "", "IMAGE_CHANGED", "I", "IS_NEW_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: NotificationEpisodeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationEpisodeModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo14717g(long j2);

        /* renamed from: k */
        void mo14718k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16368a(appCompatImageView, this.f29766m);
        TextView textView = (TextView) view2.findViewById(C2507R.id.message);
        String string = context.getString(C2507R.string.episode_notification_text);
        Intrinsics.m32178g(string, "context.getString(R.stri…pisode_notification_text)");
        Object[] objArr = new Object[4];
        String str = this.f29767n;
        if (str == null) {
            str = "нет названия";
        }
        objArr[0] = str;
        objArr[1] = this.f29765l;
        String str2 = this.f29768o;
        if (str2 == null) {
            Intrinsics.m32189r("typeName");
            throw null;
        }
        objArr[2] = str2;
        String str3 = this.f29769p;
        if (str3 == null) {
            Intrinsics.m32189r("sourceName");
            throw null;
        }
        objArr[3] = str3;
        String format = String.format(string, Arrays.copyOf(objArr, 4));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.date);
        long j2 = this.f29770q;
        textView2.setText(j2 != 0 ? Time.f30247a.m16361g(context, j2) : "время не указано");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.is_new);
        Intrinsics.m32178g(appCompatImageView2, "view.is_new");
        ViewsKt.m16379l(appCompatImageView2, this.f29771r);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.NotificationEpisodeModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                NotificationEpisodeModel notificationEpisodeModel = NotificationEpisodeModel.this;
                NotificationEpisodeModel.Listener listener = notificationEpisodeModel.f29772s;
                if (listener != null) {
                    listener.mo14717g(notificationEpisodeModel.f29764k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 8));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof NotificationEpisodeModel) {
            NotificationEpisodeModel notificationEpisodeModel = (NotificationEpisodeModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29766m, notificationEpisodeModel.f29766m)) {
                m12276k.add(0);
            }
            if (this.f29770q != notificationEpisodeModel.f29770q) {
                m12276k.add(1);
            }
            if (this.f29771r != notificationEpisodeModel.f29771r) {
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
        String str;
        Context context = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16368a(appCompatImageView, this.f29766m);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.date);
            if (this.f29770q != 0) {
                Time time = Time.f30247a;
                Intrinsics.m32178g(context, "context");
                str = time.m16361g(context, this.f29770q);
            } else {
                str = "время не указано";
            }
            textView.setText(str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.is_new);
            Intrinsics.m32178g(appCompatImageView2, "view.is_new");
            ViewsKt.m16379l(appCompatImageView2, this.f29771r);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
