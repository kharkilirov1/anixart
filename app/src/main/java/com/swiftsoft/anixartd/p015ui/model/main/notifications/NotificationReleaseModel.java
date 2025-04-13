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
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel;
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

/* compiled from: NotificationReleaseModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class NotificationReleaseModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29794k;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29795l;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29796m;

    /* renamed from: n */
    @EpoxyAttribute
    public long f29797n;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29798o;

    /* renamed from: p */
    @EpoxyAttribute
    public Listener f29799p;

    /* compiled from: NotificationReleaseModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseModel$Companion;", "", "", "IMAGE_CHANGED", "I", "IS_NEW_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: NotificationReleaseModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
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
        ViewsKt.m16368a(appCompatImageView, this.f29796m);
        TextView textView = (TextView) view2.findViewById(C2507R.id.message);
        String string = context.getString(C2507R.string.release_notification_text);
        Intrinsics.m32178g(string, "context.getString(R.stri…elease_notification_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.f29795l}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.date);
        long j2 = this.f29797n;
        textView2.setText(j2 != 0 ? Time.f30247a.m16361g(context, j2) : "время не указано");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.is_new);
        Intrinsics.m32178g(appCompatImageView2, "view.is_new");
        ViewsKt.m16379l(appCompatImageView2, this.f29798o);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                NotificationReleaseModel notificationReleaseModel = NotificationReleaseModel.this;
                NotificationReleaseModel.Listener listener = notificationReleaseModel.f29799p;
                if (listener != null) {
                    listener.mo14717g(notificationReleaseModel.f29794k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 11));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof NotificationReleaseModel) {
            NotificationReleaseModel notificationReleaseModel = (NotificationReleaseModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29796m, notificationReleaseModel.f29796m)) {
                m12276k.add(0);
            }
            if (this.f29797n != notificationReleaseModel.f29797n) {
                m12276k.add(1);
            }
            if (this.f29798o != notificationReleaseModel.f29798o) {
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
            ViewsKt.m16368a(appCompatImageView, this.f29796m);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.date);
            if (this.f29797n != 0) {
                Time time = Time.f30247a;
                Intrinsics.m32178g(context, "context");
                str = time.m16361g(context, this.f29797n);
            } else {
                str = "время не указано";
            }
            textView.setText(str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.is_new);
            Intrinsics.m32178g(appCompatImageView2, "view.is_new");
            ViewsKt.m16379l(appCompatImageView2, this.f29798o);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
