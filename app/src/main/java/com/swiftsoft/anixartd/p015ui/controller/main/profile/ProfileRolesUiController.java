package com.swiftsoft.anixartd.p015ui.controller.main.profile;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Role;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileRolesUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileRolesUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Role;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileRolesUiController$Listener;", "()V", "buildModels", "", "interesting", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileRolesUiController extends Typed2EpoxyController<List<? extends Role>, Listener> {

    /* compiled from: ProfileRolesUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileRolesUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileRoleModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileRoleModel.Listener {
    }

    public ProfileRolesUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Role> list, Listener listener) {
        buildModels2((List<Role>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<Role> interesting, @NotNull Listener listener) {
        Intrinsics.m32179h(interesting, "interesting");
        Intrinsics.m32179h(listener, "listener");
        for (Role role : interesting) {
            ProfileRoleModel_ profileRoleModel_ = new ProfileRoleModel_();
            profileRoleModel_.mo16059b(role.getId());
            profileRoleModel_.mo16061z(role.getName());
            profileRoleModel_.mo16058O1(role.getColor());
            profileRoleModel_.mo16060g1(listener);
            add(profileRoleModel_);
        }
    }
}
