package com.swiftsoft.anixartd.p015ui.controller.main.profile;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.ProfileWatchDynamics;
import com.swiftsoft.anixartd.p015ui.model.common.NoDataModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029i.C6284a;

/* compiled from: ProfileWatchDynamicsUiController.kt */
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileWatchDynamicsUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ProfileWatchDynamics;", "", "()V", "buildModels", "", "profileWatchDynamics", "watchDynamicsMaxCount", "(Ljava/util/List;Ljava/lang/Integer;)V", "isEmpty", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileWatchDynamicsUiController extends Typed2EpoxyController<List<? extends ProfileWatchDynamics>, Integer> {
    public ProfileWatchDynamicsUiController() {
        setDebugLoggingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ProfileWatchDynamics> list, Integer num) {
        buildModels2((List<ProfileWatchDynamics>) list, num);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<ProfileWatchDynamics> profileWatchDynamics, @Nullable Integer watchDynamicsMaxCount) {
        Intrinsics.m32179h(profileWatchDynamics, "profileWatchDynamics");
        if (!(!profileWatchDynamics.isEmpty()) || watchDynamicsMaxCount == null) {
            NoDataModel_ noDataModel_ = new NoDataModel_();
            noDataModel_.mo15730a("empty");
            noDataModel_.mo15731d(C6284a.f58036p);
            add(noDataModel_);
            return;
        }
        for (ProfileWatchDynamics profileWatchDynamics2 : profileWatchDynamics) {
            WatchDynamicsModel_ watchDynamicsModel_ = new WatchDynamicsModel_();
            watchDynamicsModel_.mo16082b(profileWatchDynamics2.getId());
            watchDynamicsModel_.mo16083u0(profileWatchDynamics2.getCount());
            watchDynamicsModel_.mo16080G1(watchDynamicsMaxCount.intValue());
            watchDynamicsModel_.mo16081P(profileWatchDynamics2.getTimestamp());
            add(watchDynamicsModel_);
        }
    }
}
