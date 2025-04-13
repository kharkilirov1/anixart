package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VideoSectionModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoSectionModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class VideoSectionModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f30059k = "";

    /* compiled from: VideoSectionModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoSectionModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30059k);
        TextView bind$lambda$0 = (TextView) view2.findViewById(C2507R.id.show_all);
        Intrinsics.m32178g(bind$lambda$0, "bind$lambda$0");
        ViewsKt.m16379l(bind$lambda$0, false);
        ViewsKt.m16377j(bind$lambda$0, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoSectionModel$bind$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                Objects.requireNonNull(VideoSectionModel.this);
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((TextView) view.findViewById(C2507R.id.show_all)).setOnClickListener(null);
    }
}
