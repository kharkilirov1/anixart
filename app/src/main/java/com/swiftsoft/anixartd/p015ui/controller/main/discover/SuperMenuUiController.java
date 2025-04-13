package com.swiftsoft.anixartd.p015ui.controller.main.discover;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.SuperMenu;
import com.swiftsoft.anixartd.p015ui.model.main.discover.SuperMenuModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.SuperMenuModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SuperMenuUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/SuperMenuUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/SuperMenu;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/SuperMenuUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SuperMenuUiController extends Typed2EpoxyController<List<? extends SuperMenu>, Listener> {

    /* compiled from: SuperMenuUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/SuperMenuUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/discover/SuperMenuModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends SuperMenuModel.Listener {
    }

    public SuperMenuUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends SuperMenu> list, Listener listener) {
        buildModels2((List<SuperMenu>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<SuperMenu> releases, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        for (SuperMenu superMenu : releases) {
            SuperMenuModel_ superMenuModel_ = new SuperMenuModel_();
            superMenuModel_.m15950u2(superMenu.getId());
            long id2 = superMenu.getId();
            superMenuModel_.m4524l2();
            superMenuModel_.f29648k = id2;
            superMenuModel_.m15951v2(superMenu.getTitle());
            int color = superMenu.getColor();
            superMenuModel_.m4524l2();
            superMenuModel_.f29650m = color;
            int backgroundColor = superMenu.getBackgroundColor();
            superMenuModel_.m4524l2();
            superMenuModel_.f29651n = backgroundColor;
            int icon = superMenu.getIcon();
            superMenuModel_.m4524l2();
            superMenuModel_.f29652o = icon;
            boolean newDot = superMenu.getNewDot();
            superMenuModel_.m4524l2();
            superMenuModel_.f29653p = newDot;
            superMenuModel_.m4524l2();
            superMenuModel_.f29654q = listener;
            add(superMenuModel_);
        }
    }
}
